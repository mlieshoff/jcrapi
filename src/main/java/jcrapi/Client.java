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
import jcrapi.model.Constants;
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
import jcrapi.model.Status;
import jcrapi.model.TopClan;
import jcrapi.model.TopPlayer;
import jcrapi.model.TopWar;
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
import jcrapi.request.ConstantsRequest;
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
import jcrapi.request.TopWarsRequest;
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

  private final static Map<Class, Type> TYPES = ImmutableMap.<Class, Type>builder()
      .put(Battle.class, new TypeToken<List<Battle>>() {
      }.getType())
      .put(ChestCycle.class, new TypeToken<List<ChestCycle>>() {
      }.getType())
      .put(Clan.class, new TypeToken<List<Clan>>() {
      }.getType())
      .put(ClanWarLog.class, new TypeToken<List<ClanWarLog>>() {
      }.getType())
      .put(FullTournament.class, new TypeToken<List<FullTournament>>() {
      }.getType())
      .put(InPreparationTournament.class, new TypeToken<List<InPreparationTournament>>() {
      }.getType())
      .put(JoinableTournament.class, new TypeToken<List<JoinableTournament>>() {
      }.getType())
      .put(KnownTournament.class, new TypeToken<List<KnownTournament>>() {
      }.getType())
      .put(OneKTournament.class, new TypeToken<List<OneKTournament>>() {
      }.getType())
      .put(OpenTournament.class, new TypeToken<List<OpenTournament>>() {
      }.getType())
      .put(PopularClan.class, new TypeToken<List<PopularClan>>() {
      }.getType())
      .put(PopularDeck.class, new TypeToken<List<PopularDeck>>() {
      }.getType())
      .put(PopularPlayer.class, new TypeToken<List<PopularPlayer>>() {
      }.getType())
      .put(PopularTournament.class, new TypeToken<List<PopularTournament>>() {
      }.getType())
      .put(Profile.class, new TypeToken<List<Profile>>() {
      }.getType())
      .put(SearchedTournament.class, new TypeToken<List<SearchedTournament>>() {
      }.getType())
      .put(TopClan.class, new TypeToken<List<TopClan>>() {
      }.getType())
      .put(TopPlayer.class, new TypeToken<List<TopPlayer>>() {
      }.getType())
      .put(TopWar.class, new TypeToken<List<TopWar>>() {
      }.getType())
      .build();

  private static final Type BATTLE_LIST = new TypeToken<List<List<Battle>>>() {
  }.getType();

  private static final Gson GSON = new Gson();
  
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
    return GSON.fromJson(json, Profile.class);
  }

  List<Profile> getProfiles(ProfilesRequest profilesRequest) throws IOException {
    Preconditions.checkNotNull(profilesRequest, "profilesRequest");
    String json = get(createUrl("player/" + StringUtils.join(profilesRequest.getTags(), ",")), profilesRequest);
    return createList(Profile.class, json);
  }

  private <T> List<T> createList(Class<T> clazz, String json) {
    if (jsonIsObject(json)) {
      List<T> list = new ArrayList<>();
      list.add(GSON.fromJson(json, clazz));
      return list;
    } else {
      return (List<T>) GSON.fromJson(json, TYPES.get(clazz));
    }
  }

  List<TopClan> getTopClans(TopClansRequest topClansRequest) throws IOException {
    String url = createUrl("top/clans");
    String locationKey = topClansRequest.getLocationKey();
    if (StringUtils.isNotBlank(locationKey)) {
      url += "/" + locationKey;
    }
    String json = get(url, topClansRequest);
    return createList(TopClan.class, json);
  }

  Clan getClan(ClanRequest clanRequest) throws IOException {
    Preconditions.checkNotNull(clanRequest);
    String json = get(createUrl("clan/" + clanRequest.getTag()), clanRequest);
    return GSON.fromJson(json, Clan.class);
  }

  List<Clan> getClans(ClansRequest clansRequest) throws IOException {
    Preconditions.checkNotNull(clansRequest);
    String json = get(createUrl("clan/" + StringUtils.join(clansRequest.getTags(), ",")), clansRequest);
    return createList(Clan.class, json);
  }

  List<Clan> getClanSearch(ClanSearchRequest clanSearchRequest) throws IOException {
    String json = get(createUrl("clan/search"), clanSearchRequest);
    return createList(Clan.class, json);
  }

  List<TopPlayer> getTopPlayers(TopPlayersRequest topPlayersRequest) throws IOException {
    String url = createUrl("top/players");
    String locationKey = topPlayersRequest.getLocationKey();
    if (StringUtils.isNotBlank(locationKey)) {
      url += "/" + locationKey;
    }
    String json = get(url, topPlayersRequest);
    return createList(TopPlayer.class, json);
  }

  Tournament getTournaments(TournamentsRequest tournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/" + tournamentsRequest.getTag()), tournamentsRequest);
    return GSON.fromJson(json, Tournament.class);
  }

  Endpoints getEndpoints() throws IOException {
    String json = get(createUrl("endpoints"), null);
    return GSON.fromJson(json, Endpoints.class);
  }

  List<PopularClan> getPopularClans(PopularClansRequest popularClansRequest) throws IOException {
    String json = get(createUrl("popular/clans"), popularClansRequest);
    return createList(PopularClan.class, json);
  }

  List<PopularPlayer> getPopularPlayers(PopularPlayersRequest popularPlayersRequest) throws IOException {
    String json = get(createUrl("popular/players"), popularPlayersRequest);
    return createList(PopularPlayer.class, json);
  }

  List<PopularTournament> getPopularTournaments(PopularTournamentsRequest popularTournamentsRequest)
      throws IOException {
    String json = get(createUrl("popular/tournaments"), popularTournamentsRequest);
    return createList(PopularTournament.class, json);
  }

  List<Battle> getClanBattles(ClanBattlesRequest clanBattlesRequest) throws IOException {
    String json = get(createUrl("clan/" + clanBattlesRequest.getTag() + "/battles"), clanBattlesRequest);
    return createList(Battle.class, json);
  }

  ClanHistory getClanHistory(ClanHistoryRequest clanHistoryRequest) throws IOException {
    String json = get(createUrl("clan/" + clanHistoryRequest.getTag() + "/history"), clanHistoryRequest);
    return GSON.fromJson(json, ClanHistory.class);
  }

  ClanWeeklyHistory getClanWeeklyHistory(ClanWeeklyHistoryRequest clanWeeklyHistoryRequest) throws IOException {
    String
        json =
        get(createUrl("clan/" + clanWeeklyHistoryRequest.getTag() + "/history/weekly"), clanWeeklyHistoryRequest);
    return GSON.fromJson(json, ClanWeeklyHistory.class);
  }

  List<OpenTournament> getOpenTournaments(OpenTournamentsRequest openTournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/open"), openTournamentsRequest);
    return createList(OpenTournament.class, json);
  }

  List<KnownTournament> getKnownTournaments(KnownTournamentsRequest knownTournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/known"), knownTournamentsRequest);
    return createList(KnownTournament.class, json);
  }

  List<SearchedTournament> getTournamentSearch(TournamentSearchRequest tournamentSearchRequest) throws IOException {
    String json = get(createUrl("tournaments/search"), tournamentSearchRequest);
    return createList(SearchedTournament.class, json);
  }

  List<List<Battle>> getPlayerBattles(PlayerBattlesRequest playerBattlesRequest) throws IOException {
    String json = get(createUrl("player/" + StringUtils.join(playerBattlesRequest.getTags(), ",")
        + "/battles"), playerBattlesRequest);
    if (playerBattlesRequest.getTags().size() == 1) {
      List<List<Battle>> listOfBattles = new ArrayList<>();
      List<Battle> battles = GSON.fromJson(json, TYPES.get(Battle.class));
      listOfBattles.add(battles);
      return listOfBattles;
    } else {
      return GSON.fromJson(json, BATTLE_LIST);
    }
  }

  List<ChestCycle> getPlayerChests(PlayerChestsRequest playerChestsRequest) throws IOException {
    String json = get(createUrl("player/" + StringUtils.join(playerChestsRequest.getTags(), ",")
        + "/chests"), playerChestsRequest);
    return createList(ChestCycle.class, json);
  }

  List<PopularDeck> getPopularDecks(PopularDecksRequest popularDecksRequest) throws IOException {
    String json = get(createUrl("popular/decks"), popularDecksRequest);
    return createList(PopularDeck.class, json);
  }

  ClanTracking getClanTracking(ClanTrackingRequest clanTrackingRequest) throws IOException {
    String json = get(createUrl("clan/" + clanTrackingRequest.getTag() + "/tracking"), clanTrackingRequest);
    return GSON.fromJson(json, ClanTracking.class);
  }

  List<ClanWarLog> getClanWarLog(ClanWarLogRequest clanWarLogRequest) throws IOException {
    String json = get(createUrl("clan/" + clanWarLogRequest.getTag() + "/warlog"), clanWarLogRequest);
    return createList(ClanWarLog.class, json);
  }

  private boolean jsonIsObject(String json) {
    return json.startsWith("{");
  }

  ClanWar getClanWar(ClanWarRequest clanWarRequest) throws IOException {
    String json = get(createUrl("clan/" + clanWarRequest.getTag() + "/war"), clanWarRequest);
    return GSON.fromJson(json, ClanWar.class);
  }

  AuthStats getAuthStats(AuthStatsRequest authStatsRequest) throws IOException {
    String json = get(createUrl("auth/stats"), authStatsRequest);
    return GSON.fromJson(json, AuthStats.class);
  }

  List<OneKTournament> getOneKTournaments(OneKTournamentsRequest oneKTournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/1k"), oneKTournamentsRequest);
    return createList(OneKTournament.class, json);
  }

  List<FullTournament> getFullTournaments(FullTournamentsRequest fullTournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/full"), fullTournamentsRequest);
    return createList(FullTournament.class, json);
  }

  List<InPreparationTournament> getInPreparationTournaments(
      InPreparationTournamentsRequest inPreparationTournamentsRequest) throws IOException {
    String json = get(createUrl("tournaments/prep"), inPreparationTournamentsRequest);
    return createList(InPreparationTournament.class, json);
  }

  List<JoinableTournament> getJoinableTournaments(JoinableTournamentsRequest joinableTournamentsRequest)
      throws IOException {
    String json = get(createUrl("tournaments/joinable"), joinableTournamentsRequest);
    return createList(JoinableTournament.class, json);
  }

  Response getLastResponse() {
    return createCrawler().getLastResponse();
  }

  List<TopWar> getTopWars(TopWarsRequest topWarsRequest) throws IOException {
    String url = createUrl("top/war");
    String locationKey = topWarsRequest.getLocationKey();
    if (StringUtils.isNotBlank(locationKey)) {
      url += "/" + locationKey;
    }
    String json = get(url, topWarsRequest);
    return createList(TopWar.class, json);
  }

  Constants getConstants(ConstantsRequest constantsRequest) throws IOException {
    String json = get(createUrl("constants"), constantsRequest);
    return GSON.fromJson(json, Constants.class);
  }

  Status getStatus() throws IOException {
    String json = get(createUrl("status"), null);
    return GSON.fromJson(json, Status.class);
  }

  String getHealth() throws IOException {
    return get(createUrl("health"), null);
  }

}
