/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jcrapi;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpHeaders;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jcrapi.model.AuthStats;
import jcrapi.model.Battle;
import jcrapi.model.ChestCycle;
import jcrapi.model.Clan;
import jcrapi.model.ClanHistory;
import jcrapi.model.ClanTracking;
import jcrapi.model.ClanWar;
import jcrapi.model.ClanWarLog;
import jcrapi.model.ClanWeeklyHistory;
import jcrapi.model.Endpoints;
import jcrapi.model.FullTournament;
import jcrapi.model.InPreparationTournament;
import jcrapi.model.JoinableTournament;
import jcrapi.model.KnownTournament;
import jcrapi.model.OneKTournament;
import jcrapi.model.OpenTournament;
import jcrapi.model.PopularClan;
import jcrapi.model.PopularDeck;
import jcrapi.model.PopularPlayer;
import jcrapi.model.PopularTournament;
import jcrapi.model.Profile;
import jcrapi.model.SearchedTournament;
import jcrapi.model.TopClan;
import jcrapi.model.TopPlayer;
import jcrapi.model.Tournament;
import jcrapi.request.AuthStatsRequest;
import jcrapi.request.ClanBattlesRequest;
import jcrapi.request.ClanHistoryRequest;
import jcrapi.request.ClanRequest;
import jcrapi.request.ClanSearchRequest;
import jcrapi.request.ClanTrackingRequest;
import jcrapi.request.ClanWarLogRequest;
import jcrapi.request.ClanWarRequest;
import jcrapi.request.ClanWeeklyHistoryRequest;
import jcrapi.request.ClansRequest;
import jcrapi.request.FullTournamentsRequest;
import jcrapi.request.InPreparationTournamentsRequest;
import jcrapi.request.JoinableTournamentsRequest;
import jcrapi.request.KnownTournamentsRequest;
import jcrapi.request.OneKTournamentsRequest;
import jcrapi.request.OpenTournamentsRequest;
import jcrapi.request.PlayerBattlesRequest;
import jcrapi.request.PlayerChestsRequest;
import jcrapi.request.PopularClansRequest;
import jcrapi.request.PopularDecksRequest;
import jcrapi.request.PopularPlayersRequest;
import jcrapi.request.PopularTournamentsRequest;
import jcrapi.request.ProfileRequest;
import jcrapi.request.ProfilesRequest;
import jcrapi.request.Request;
import jcrapi.request.TopClansRequest;
import jcrapi.request.TopPlayersRequest;
import jcrapi.request.TournamentSearchRequest;
import jcrapi.request.TournamentsRequest;

/**
 * @author Michael Lieshoff
 */
class Client {

  private final String url;
  private final String developerKey;
  private final AuthMode authMode;

  private final CrawlerFactory crawlerFactory;

  Client(String url, String developerKey, AuthMode authMode, CrawlerFactory crawlerFactory) {
    checkString(url);
    Preconditions.checkNotNull(crawlerFactory);
    Preconditions.checkNotNull(authMode);
    this.url = url;
    this.developerKey = developerKey;
    this.crawlerFactory = crawlerFactory;
    this.authMode = authMode;
  }

  private void checkString(String url) {
    Preconditions.checkNotNull(url);
    Preconditions.checkArgument(url.length() > 0, url);
  }

  String getVersion() throws IOException {
    return get(createUrl("version"), null);
  }

  private String get(String url, Request request) throws IOException {
    return tryGet(url, request, 1);
  }

  private String tryGet(String url, Request request, int round) throws IOException {
    if (round > 10) {
      throw new IOException("tried " + round + " times to access " + url + " without succeeding!");
    }
    try {
      return getIntern(url, request);
    } catch (IOException e) {
      if (rateLimitsReached()) {
        handleRateLimit();
        return tryGet(url, request, ++round);
      }
      throw e;
    }
  }

  private String getIntern(String url, Request request) throws IOException {
    return createCrawler()
        .get(url, createAuthHeader(developerKey), request == null ? null : request.getQueryParameters());
  }

  private void handleRateLimit() {
    Response response = getLastResponse();
    if (response.getRateRetryAfter().isPresent()) {
      long start = System.currentTimeMillis();
      long limitResetInMillis = response.getRateRetryAfter().get() * 1000;
      long end = start + limitResetInMillis;
      for (long now = start; now < end; now = System.currentTimeMillis()) {
        try {
          Thread.sleep(100 + limitResetInMillis);
        } catch (InterruptedException e) {
          Thread.interrupted();
        }
      }
    }
  }

  private boolean rateLimitsReached() {
    Response response = getLastResponse();
    if (response != null) {
      return response.getRateRemaining().isPresent() && response.getRateRemaining().get() <= 0;
    }
    return false;
  }

  private Map<String, String> createAuthHeader(String developerKey) {
    String headerKey = "auth";
    String headerValue = developerKey;
    if (authMode == AuthMode.BEARER) {
      headerKey = HttpHeaders.AUTHORIZATION;
      headerValue = "Bearer " + developerKey;
    }
    return ImmutableMap.<String, String>builder().put(headerKey, headerValue).build();
  }

  private Crawler createCrawler() {
    return crawlerFactory.createCrawler();
  }

  private String createUrl(String part) {
    return url + part;
  }

  Profile getProfile(ProfileRequest profileRequest) throws IOException {
    Preconditions.checkNotNull(profileRequest, "profileRequest");
    String json = get(createUrl("player/" + profileRequest.getTag()), profileRequest);
    return new Gson().fromJson(json, Profile.class);
  }

  List<Profile> getProfiles(ProfilesRequest profilesRequest) throws IOException {
    Preconditions.checkNotNull(profilesRequest, "profilesRequest");
    String json = get(createUrl("player/" + StringUtils.join(profilesRequest.getTags(), ",")), profilesRequest);
    Type listType = new TypeToken<ArrayList<Profile>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<TopClan> getTopClans(TopClansRequest topClansRequest) throws IOException {
    String url = createUrl("top/clans");
    String locationKey = topClansRequest.getLocationKey();
    if (StringUtils.isNotBlank(locationKey)) {
      url += "/" + locationKey;
    }
    String json = get(url, topClansRequest);
    Type listType = new TypeToken<ArrayList<TopClan>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  Clan getClan(ClanRequest clanRequest) throws IOException {
    Preconditions.checkNotNull(clanRequest);
    String json = get(createUrl("clan/" + clanRequest.getTag()), clanRequest);
    return new Gson().fromJson(json, Clan.class);
  }

  List<Clan> getClans(ClansRequest clansRequest) throws IOException {
    Preconditions.checkNotNull(clansRequest);
    String json = get(createUrl("clan/" + StringUtils.join(clansRequest.getTags(), ",")), clansRequest);
    Type listType = new TypeToken<ArrayList<Clan>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<Clan> getClanSearch(ClanSearchRequest clanSearchRequest) throws IOException {
    String json = get(createUrl("clan/search"), clanSearchRequest);
    Type listType = new TypeToken<ArrayList<Clan>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<TopPlayer> getTopPlayers(TopPlayersRequest topPlayersRequest) throws IOException {
    String url = createUrl("top/players");
    String locationKey = topPlayersRequest.getLocationKey();
    if (StringUtils.isNotBlank(locationKey)) {
      url += "/" + locationKey;
    }
    String json = get(url, topPlayersRequest);
    Type listType = new TypeToken<ArrayList<TopPlayer>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  Tournament getTournaments(TournamentsRequest tournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/" + tournamentsRequest.getTag()), tournamentsRequest);
    return new Gson().fromJson(json, Tournament.class);
  }

  Endpoints getEndpoints() throws IOException {
    String json = get(createUrl("endpoints"), null);
    return new Gson().fromJson(json, Endpoints.class);
  }

  List<PopularClan> getPopularClans(PopularClansRequest popularClansRequest) throws IOException {
    String json = get(createUrl("popular/clans"), popularClansRequest);
    Type listType = new TypeToken<ArrayList<PopularClan>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<PopularPlayer> getPopularPlayers(PopularPlayersRequest popularPlayersRequest) throws IOException {
    String json = get(createUrl("popular/players"), popularPlayersRequest);
    Type listType = new TypeToken<ArrayList<PopularPlayer>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<PopularTournament> getPopularTournaments(PopularTournamentsRequest popularTournamentsRequest)
      throws IOException {
    String json = get(createUrl("popular/tournaments"), popularTournamentsRequest);
    Type listType = new TypeToken<ArrayList<PopularTournament>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<Battle> getClanBattles(ClanBattlesRequest clanBattlesRequest) throws IOException {
    String json = get(createUrl("clan/" + clanBattlesRequest.getTag() + "/battles"), clanBattlesRequest);
    Type listType = new TypeToken<ArrayList<Battle>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  ClanHistory getClanHistory(ClanHistoryRequest clanHistoryRequest) throws IOException {
    String json = get(createUrl("clan/" + clanHistoryRequest.getTag() + "/history"), clanHistoryRequest);
    return new Gson().fromJson(json, ClanHistory.class);
  }

  ClanWeeklyHistory getClanWeeklyHistory(ClanWeeklyHistoryRequest clanWeeklyHistoryRequest) throws IOException {
    String
        json =
        get(createUrl("clan/" + clanWeeklyHistoryRequest.getTag() + "/history/weekly"), clanWeeklyHistoryRequest);
    return new Gson().fromJson(json, ClanWeeklyHistory.class);
  }

  List<OpenTournament> getOpenTournaments(OpenTournamentsRequest openTournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/open"), openTournamentsRequest);
    Type listType = new TypeToken<ArrayList<OpenTournament>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<KnownTournament> getKnownTournaments(KnownTournamentsRequest knownTournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/known"), knownTournamentsRequest);
    Type listType = new TypeToken<ArrayList<KnownTournament>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<SearchedTournament> getTournamentSearch(TournamentSearchRequest tournamentSearchRequest) throws IOException {
    String json = get(createUrl("tournaments/search"), tournamentSearchRequest);
    Type listType = new TypeToken<ArrayList<SearchedTournament>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<List<Battle>> getPlayerBattles(PlayerBattlesRequest playerBattlesRequest) throws IOException {
    String json = get(createUrl("player/" + StringUtils.join(playerBattlesRequest.getTags(), ",")
        + "/battles"), playerBattlesRequest);
    if (playerBattlesRequest.getTags().size() == 1) {
      List<List<Battle>> listOfBattles = new ArrayList<>();
      Type listType = new TypeToken<ArrayList<Battle>>() {
      }.getType();
      List<Battle> battles = new Gson().fromJson(json, listType);
      listOfBattles.add(battles);
      return listOfBattles;
    } else {
      Type listType = new TypeToken<List<List<Battle>>>() {
      }.getType();
      return new Gson().fromJson(json, listType);
    }
  }

  List<ChestCycle> getPlayerChests(PlayerChestsRequest playerChestsRequest) throws IOException {
    String json = get(createUrl("player/" + StringUtils.join(playerChestsRequest.getTags(), ",")
        + "/chests"), playerChestsRequest);
    if (playerChestsRequest.getTags().size() == 1) {
      List<ChestCycle> list = new ArrayList<>();
      list.add(new Gson().fromJson(json, ChestCycle.class));
      return list;
    } else {
      Type listType = new TypeToken<List<ChestCycle>>() {
      }.getType();
      return new Gson().fromJson(json, listType);
    }
  }

  List<PopularDeck> getPopularDecks(PopularDecksRequest popularDecksRequest) throws IOException {
    String json = get(createUrl("popular/decks"), popularDecksRequest);
    Type listType = new TypeToken<ArrayList<PopularDeck>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  ClanTracking getClanTracking(ClanTrackingRequest clanTrackingRequest) throws IOException {
    String json = get(createUrl("clan/" + clanTrackingRequest.getTag() + "/tracking"), clanTrackingRequest);
    return new Gson().fromJson(json, ClanTracking.class);
  }

  List<ClanWarLog> getClanWarLog(ClanWarLogRequest clanWarLogRequest) throws IOException {
    String json = get(createUrl("clan/" + clanWarLogRequest.getTag() + "/warlog"), clanWarLogRequest);
    Type listType = new TypeToken<List<ClanWarLog>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  ClanWar getClanWar(ClanWarRequest clanWarRequest) throws IOException {
    String json = get(createUrl("clan/" + clanWarRequest.getTag() + "/war"), clanWarRequest);
    return new Gson().fromJson(json, ClanWar.class);
  }

  AuthStats getAuthStats(AuthStatsRequest authStatsRequest) throws IOException {
    String json = get(createUrl("auth/stats"), authStatsRequest);
    return new Gson().fromJson(json, AuthStats.class);
  }

  List<OneKTournament> getOneKTournaments(OneKTournamentsRequest oneKTournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/1k"), oneKTournamentsRequest);
    Type listType = new TypeToken<List<OneKTournament>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<FullTournament> getFullTournaments(FullTournamentsRequest fullTournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/full"), fullTournamentsRequest);
    Type listType = new TypeToken<List<FullTournament>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<InPreparationTournament> getInPreparationTournaments(
      InPreparationTournamentsRequest inPreparationTournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/prep"), inPreparationTournamentsRequest);
    Type listType = new TypeToken<List<InPreparationTournament>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  List<JoinableTournament> getJoinableTournaments(JoinableTournamentsRequest joinableTournamentsRequest)
      throws IOException {
    String json = get(createUrl("tournaments/joinable"), joinableTournamentsRequest);
    Type listType = new TypeToken<List<JoinableTournament>>() {
    }.getType();
    return new Gson().fromJson(json, listType);
  }

  Response getLastResponse() {
    return createCrawler().getLastResponse();
  }

}
