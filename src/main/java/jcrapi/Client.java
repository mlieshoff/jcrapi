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
import jcrapi.model.Battle;
import jcrapi.model.Clan;
import jcrapi.model.ClanHistory;
import jcrapi.model.ClanSearch;
import jcrapi.model.Endpoints;
import jcrapi.model.PopularClan;
import jcrapi.model.PopularPlayer;
import jcrapi.model.PopularTournament;
import jcrapi.model.Profile;
import jcrapi.model.TopClan;
import jcrapi.model.TopPlayer;
import jcrapi.model.Tournament;
import jcrapi.request.ClanBattlesRequest;
import jcrapi.request.ClanHistoryRequest;
import jcrapi.request.ClanRequest;
import jcrapi.request.ClanSearchRequest;
import jcrapi.request.ClansRequest;
import jcrapi.request.ProfileRequest;
import jcrapi.request.ProfilesRequest;
import jcrapi.request.TopClansRequest;
import jcrapi.request.TopPlayersRequest;
import jcrapi.request.TournamentsRequest;
import org.apache.commons.lang.StringUtils;

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

    private final CrawlerFactory crawlerFactory;

    Client(String url, String developerKey, CrawlerFactory crawlerFactory) {
        checkString(url);
        Preconditions.checkNotNull(crawlerFactory);
        this.url = url;
        this.developerKey = developerKey;
        this.crawlerFactory = crawlerFactory;
    }

    private void checkString(String url) {
        Preconditions.checkNotNull(url);
        Preconditions.checkArgument(url.length() > 0, url);
    }

    String getVersion() throws IOException {
        return createCrawler().get(createUrl("version"), createAuthHeader(developerKey));
    }

    private Map<String, String> createAuthHeader(String developerKey) {
        return ImmutableMap.<String, String>builder().put("auth", developerKey).build();
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
        String url = createUrl("player/" + profileRequest.getTag());
        String json = createCrawler().get(url, createAuthHeader(developerKey), profileRequest.getQueryParameters());
        return new Gson().fromJson(json, Profile.class);
    }

    @Deprecated
    List<Profile> getProfiles(List<String> tags) throws IOException {
        return getProfiles(ProfilesRequest.builder(tags).build());
    }

    List<Profile> getProfiles(ProfilesRequest profilesRequest) throws IOException {
        Preconditions.checkNotNull(profilesRequest, "profilesRequest");
        String url = createUrl("player/" + StringUtils.join(profilesRequest.getTags(), ","));
        String json = createCrawler().get(url, createAuthHeader(developerKey), profilesRequest.getQueryParameters());
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
        String json = createCrawler().get(url, createAuthHeader(developerKey), topClansRequest.getQueryParameters());
        Type listType = new TypeToken<ArrayList<TopClan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    Clan getClan(String tag) throws IOException {
        return getClan(ClanRequest.builder(tag).build());
    }

    Clan getClan(ClanRequest clanRequest) throws IOException {
        Preconditions.checkNotNull(clanRequest);
        String json = createCrawler().get(createUrl("clan/" + clanRequest.getTag()), createAuthHeader(developerKey),
                clanRequest.getQueryParameters());
        return new Gson().fromJson(json, Clan.class);
    }

    @Deprecated
    List<Clan> getClans(List<String> tags) throws IOException {
        return getClans(ClansRequest.builder(tags).build());
    }

    List<Clan> getClans(ClansRequest clansRequest) throws IOException {
        Preconditions.checkNotNull(clansRequest);
        String json = createCrawler().get(createUrl("clan/" + StringUtils.join(clansRequest.getTags(), ",")),
                createAuthHeader(developerKey));
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
        String json = createCrawler().get(
                createUrl("clan/search"),
                createAuthHeader(developerKey),
                clanSearchRequest.getQueryParameters()
        );
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
        String json = createCrawler().get(url, createAuthHeader(developerKey), topPlayersRequest.getQueryParameters());
        Type listType = new TypeToken<ArrayList<TopPlayer>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    Tournament getTournaments(String tag) throws IOException {
        return getTournaments(TournamentsRequest.builder(tag).build());
    }

    Tournament getTournaments(TournamentsRequest tournamentsRequest) throws IOException {
        String json = createCrawler().get(createUrl("tournaments/" + tournamentsRequest.getTag()),
                createAuthHeader(developerKey), tournamentsRequest.getQueryParameters());
        return new Gson().fromJson(json, Tournament.class);
    }

    Endpoints getEndpoints() throws IOException {
        String json = createCrawler().get(createUrl("endpoints"), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Endpoints.class);
    }

    List<PopularClan> getPopularClans() throws IOException {
        String json = createCrawler().get(createUrl("popular/clans"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<PopularClan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    List<PopularPlayer> getPopularPlayers() throws IOException {
        String json = createCrawler().get(createUrl("popular/players"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<PopularPlayer>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    List<PopularTournament> getPopularTournaments() throws IOException {
        String json = createCrawler().get(createUrl("popular/tournaments"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<PopularTournament>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    List<Battle> getClanBattles(String tag) throws IOException {
        return getClanBattles(ClanBattlesRequest.builder(tag).build());
    }

    List<Battle> getClanBattles(ClanBattlesRequest clanBattlesRequest) throws IOException {
        String json = createCrawler().get(createUrl("clan/" + clanBattlesRequest.getTag() + "/battles"),
                createAuthHeader(developerKey), clanBattlesRequest.getQueryParameters());
        Type listType = new TypeToken<ArrayList<Battle>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    ClanHistory getClanHistory(String tag) throws IOException {
        return getClanHistory(ClanHistoryRequest.builder(tag).build());
    }

    ClanHistory getClanHistory(ClanHistoryRequest clanHistoryRequest) throws IOException {
        String json = createCrawler().get(createUrl("clan/" + clanHistoryRequest.getTag() + "/history"),
                createAuthHeader(developerKey), clanHistoryRequest.getQueryParameters());
        return new Gson().fromJson(json, ClanHistory.class);
    }

}
