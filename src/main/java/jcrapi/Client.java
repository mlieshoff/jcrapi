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
import jcrapi.model.AuthStats;
import jcrapi.model.Battle;
import jcrapi.model.ChestCycle;
import jcrapi.model.Clan;
import jcrapi.model.ClanHistory;
import jcrapi.model.ClanSearch;
import jcrapi.model.ClanTracking;
import jcrapi.model.ClanWar;
import jcrapi.model.ClanWarLog;
import jcrapi.model.ClanWeeklyHistory;
import jcrapi.model.Endpoints;
import jcrapi.model.KnownTournament;
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
import jcrapi.request.KnownTournamentsRequest;
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
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpHeaders;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
                return tryGet(url, request, ++ round);
            }
            throw e;
        }
    }

    private String getIntern(String url, Request request) throws IOException {
        return createCrawler().get(url, createAuthHeader(developerKey), request == null ? null : request.getQueryParameters());
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

    @Deprecated
    Profile getProfile(String tag) throws IOException {
        return getProfile(ProfileRequest.builder(tag).build());
    }

    Profile getProfile(ProfileRequest profileRequest) throws IOException {
        Preconditions.checkNotNull(profileRequest, "profileRequest");
        String json = get(createUrl("player/" + profileRequest.getTag()), profileRequest);
        return new Gson().fromJson(json, Profile.class);
    }

    @Deprecated
    List<Profile> getProfiles(List<String> tags) throws IOException {
        return getProfiles(ProfilesRequest.builder(tags).build());
    }

    List<Profile> getProfiles(ProfilesRequest profilesRequest) throws IOException {
        Preconditions.checkNotNull(profilesRequest, "profilesRequest");
        String json = get(createUrl("player/" + StringUtils.join(profilesRequest.getTags(), ",")), profilesRequest);
        Type listType = new TypeToken<ArrayList<Profile>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    List<TopClan> getTopClans(String locationKey) throws IOException {
        return getTopClans(TopClansRequest.builder().locationKey(locationKey).build());
    }

    List<TopClan> getTopClans(TopClansRequest topClansRequest) throws IOException {
        String url = createUrl("top/clans");
        String locationKey = topClansRequest.getLocationKey();
        if (StringUtils.isNotBlank(locationKey)) {
            url += "/" + locationKey;
        }
        String json = get(url, topClansRequest);
        Type listType = new TypeToken<ArrayList<TopClan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    Clan getClan(String tag) throws IOException {
        return getClan(ClanRequest.builder(tag).build());
    }

    Clan getClan(ClanRequest clanRequest) throws IOException {
        Preconditions.checkNotNull(clanRequest);
        String json = get(createUrl("clan/" + clanRequest.getTag()), clanRequest);
        return new Gson().fromJson(json, Clan.class);
    }

    @Deprecated
    List<Clan> getClans(List<String> tags) throws IOException {
        return getClans(ClansRequest.builder(tags).build());
    }

    List<Clan> getClans(ClansRequest clansRequest) throws IOException {
        Preconditions.checkNotNull(clansRequest);
        String json = get(createUrl("clan/" + StringUtils.join(clansRequest.getTags(), ",")), clansRequest);
        Type listType = new TypeToken<ArrayList<Clan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    List<Clan> getClanSearch(ClanSearch clanSearch) throws IOException {
        Preconditions.checkNotNull(clanSearch);
        ClanSearchRequest.ClanSearchRequestBuilder builder = ClanSearchRequest.builder();
        if (StringUtils.isNotBlank(clanSearch.getName())) {
            builder.name(clanSearch.getName());
        }
        if (clanSearch.getScore() != null) {
            builder.score(clanSearch.getScore());
        }
        if (clanSearch.getMinMembers() != null) {
            builder.minMembers(clanSearch.getMinMembers());
        }
        if (clanSearch.getMaxMembers() != null) {
            builder.maxMembers(clanSearch.getMaxMembers());
        }
        return getClanSearch(builder.build());
    }

    List<Clan> getClanSearch(ClanSearchRequest clanSearchRequest) throws IOException {
        String json = get(createUrl("clan/search"), clanSearchRequest);
        Type listType = new TypeToken<ArrayList<Clan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    List<TopPlayer> getTopPlayers(String locationKey) throws IOException {
        return getTopPlayers(TopPlayersRequest.builder().locationKey(locationKey).build());
    }

    List<TopPlayer> getTopPlayers(TopPlayersRequest topPlayersRequest) throws IOException {
        String url = createUrl("top/players");
        String locationKey = topPlayersRequest.getLocationKey();
        if (StringUtils.isNotBlank(locationKey)) {
            url += "/" + locationKey;
        }
        String json = get(url, topPlayersRequest);
        Type listType = new TypeToken<ArrayList<TopPlayer>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    Tournament getTournaments(String tag) throws IOException {
        return getTournaments(TournamentsRequest.builder(tag).build());
    }

    Tournament getTournaments(TournamentsRequest tournamentsRequest) throws IOException {
        String json = get(createUrl("tournaments/" + tournamentsRequest.getTag()), tournamentsRequest);
        return new Gson().fromJson(json, Tournament.class);
    }

    Endpoints getEndpoints() throws IOException {
        String json = get(createUrl("endpoints"), null);
        return new Gson().fromJson(json, Endpoints.class);
    }

    @Deprecated
    List<PopularClan> getPopularClans() throws IOException {
        return getPopularClans(PopularClansRequest.builder().build());
    }

    List<PopularClan> getPopularClans(PopularClansRequest popularClansRequest) throws IOException {
        String json = get(createUrl("popular/clans"), popularClansRequest);
        Type listType = new TypeToken<ArrayList<PopularClan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    List<PopularPlayer> getPopularPlayers() throws IOException {
        return getPopularPlayers(PopularPlayersRequest.builder().build());
    }

    List<PopularPlayer> getPopularPlayers(PopularPlayersRequest popularPlayersRequest) throws IOException {
        String json = get(createUrl("popular/players"),  popularPlayersRequest);
        Type listType = new TypeToken<ArrayList<PopularPlayer>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    List<PopularTournament> getPopularTournaments() throws IOException {
        return getPopularTournaments(PopularTournamentsRequest.builder().build());
    }

    List<PopularTournament> getPopularTournaments(PopularTournamentsRequest popularTournamentsRequest) throws IOException {
        String json = get(createUrl("popular/tournaments"), popularTournamentsRequest);
        Type listType = new TypeToken<ArrayList<PopularTournament>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    List<Battle> getClanBattles(String tag) throws IOException {
        return getClanBattles(ClanBattlesRequest.builder(tag).build());
    }

    List<Battle> getClanBattles(ClanBattlesRequest clanBattlesRequest) throws IOException {
        String json = get(createUrl("clan/" + clanBattlesRequest.getTag() + "/battles"), clanBattlesRequest);
        Type listType = new TypeToken<ArrayList<Battle>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    ClanHistory getClanHistory(String tag) throws IOException {
        return getClanHistory(ClanHistoryRequest.builder(tag).build());
    }

    ClanHistory getClanHistory(ClanHistoryRequest clanHistoryRequest) throws IOException {
        String json = get(createUrl("clan/" + clanHistoryRequest.getTag() + "/history"), clanHistoryRequest);
        return new Gson().fromJson(json, ClanHistory.class);
    }

    ClanWeeklyHistory getClanWeeklyHistory(ClanWeeklyHistoryRequest clanWeeklyHistoryRequest) throws IOException {
        String json = get(createUrl("clan/" + clanWeeklyHistoryRequest.getTag() + "/history/weekly"), clanWeeklyHistoryRequest);
        return new Gson().fromJson(json, ClanWeeklyHistory.class);
    }

    List<OpenTournament> getOpenTournaments(OpenTournamentsRequest openTournamentsRequest) throws IOException {
        String json = get(createUrl("tournaments/open"), openTournamentsRequest);
        Type listType = new TypeToken<ArrayList<OpenTournament>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    List<KnownTournament> getKnownTournaments(KnownTournamentsRequest knownTournamentsRequest) throws IOException {
        String json = get(createUrl("tournaments/known"), knownTournamentsRequest);
        Type listType = new TypeToken<ArrayList<KnownTournament>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    List<SearchedTournament> getTournamentSearch(TournamentSearchRequest tournamentSearchRequest) throws IOException {
        String json = get(createUrl("tournaments/search"), tournamentSearchRequest);
        Type listType = new TypeToken<ArrayList<SearchedTournament>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    List<List<Battle>> getPlayerBattles(PlayerBattlesRequest playerBattlesRequest) throws IOException {
        String json = get(createUrl("player/" + StringUtils.join(playerBattlesRequest.getTags(), ",")
                + "/battles"), playerBattlesRequest);
        if (playerBattlesRequest.getTags().size() == 1) {
            List<List<Battle>> listOfBattles = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Battle>>(){}.getType();
            List<Battle> battles = new Gson().fromJson(json, listType);
            listOfBattles.add(battles);
            return listOfBattles;
        } else {
            Type listType = new TypeToken<List<List<Battle>>>(){}.getType();
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
            Type listType = new TypeToken<List<ChestCycle>>(){}.getType();
            return new Gson().fromJson(json, listType);
        }
    }

    List<PopularDeck> getPopularDecks(PopularDecksRequest popularDecksRequest) throws IOException {
        String json = get(createUrl("popular/decks"), popularDecksRequest);
        Type listType = new TypeToken<ArrayList<PopularDeck>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    ClanTracking getClanTracking(ClanTrackingRequest clanTrackingRequest) throws IOException {
        String json = get(createUrl("clan/" + clanTrackingRequest.getTag() + "/tracking"), clanTrackingRequest);
        return new Gson().fromJson(json, ClanTracking.class);
    }

    List<ClanWarLog> getClanWarLog(ClanWarLogRequest clanWarLogRequest) throws IOException {
        String json = get(createUrl("clan/" + clanWarLogRequest.getTag() + "/warlog"), clanWarLogRequest);
        Type listType = new TypeToken<List<ClanWarLog>>(){}.getType();
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

    Response getLastResponse() {
        return createCrawler().getLastResponse();
    }

}
