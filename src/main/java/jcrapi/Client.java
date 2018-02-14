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
import jcrapi.model.Alliance;
import jcrapi.model.Arena;
import jcrapi.model.Badges;
import jcrapi.model.Battle;
import jcrapi.model.ChestCycleList;
import jcrapi.model.Clan;
import jcrapi.model.ClanHistory;
import jcrapi.model.ClanSearch;
import jcrapi.model.ConstantCard;
import jcrapi.model.Constants;
import jcrapi.model.CountryCode;
import jcrapi.model.Endpoints;
import jcrapi.model.PopularClan;
import jcrapi.model.PopularPlayer;
import jcrapi.model.PopularTournament;
import jcrapi.model.Profile;
import jcrapi.model.Rarity;
import jcrapi.model.TopClan;
import jcrapi.model.TopPlayer;
import jcrapi.model.Tournament;
import jcrapi.request.ClanBattlesRequest;
import jcrapi.request.ClanHistoryRequest;
import jcrapi.request.ClanRequest;
import jcrapi.request.ClanSearchRequest;
import jcrapi.request.ProfileRequest;
import jcrapi.request.ProfilesRequest;
import jcrapi.request.Request;
import jcrapi.request.TopClansRequest;
import jcrapi.request.TopPlayersRequest;
import jcrapi.request.TournamentsRequest;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
class Client {

    private static final String PARAM = "%s=%s";

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
        return getProfile(ProfileRequest.builder().tag(tag).build());
    }

    Profile getProfile(ProfileRequest profileRequest) throws IOException {
        Preconditions.checkNotNull(profileRequest, "profileRequest");
        String url = createUrl("player/" + profileRequest.getTag() + createQuery(profileRequest));
        String json = createCrawler().get(url, createAuthHeader(developerKey));
        return new Gson().fromJson(json, Profile.class);
    }

    private StringBuilder createQuery(Request request) {
        StringBuilder s = new StringBuilder();
        Map<String, String> queryParameters = request.getQueryParameters();
        if (MapUtils.isNotEmpty(queryParameters)) {
            s.append("?");
            for (Iterator<Map.Entry<String, String>> iterator = queryParameters.entrySet().iterator();
                 iterator.hasNext(); ) {
                Map.Entry<String, String> keyAndValue = iterator.next();
                s.append(keyAndValue.getKey());
                s.append("=");
                s.append(keyAndValue.getValue());
                if (iterator.hasNext()) {
                    s.append("&");
                }
            }
        }
        return s;
    }

    @Deprecated
    List<Profile> getProfiles(List<String> tags) throws IOException {
        return getProfiles(ProfilesRequest.builder().tags(tags).build());
    }

    List<Profile> getProfiles(ProfilesRequest profilesRequest) throws IOException {
        Preconditions.checkNotNull(profilesRequest, "profilesRequest");
        String url = createUrl("player/" + StringUtils.join(profilesRequest.getTags(), ",")
                + createQuery(profilesRequest));
        String json = createCrawler().get(url, createAuthHeader(developerKey));
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
        String json = createCrawler().get(url, createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<TopClan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    Clan getClan(String tag) throws IOException {
        return getClan(ClanRequest.builder().tag(tag).build());
    }

    Clan getClan(ClanRequest clanRequest) throws IOException {
        Preconditions.checkNotNull(clanRequest);
        String json = createCrawler().get(createUrl("clan/" + clanRequest.getTag()), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Clan.class);
    }

    List<Clan> getClans(List<String> tags) throws IOException {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        String json = createCrawler().get(createUrl("clan/" + StringUtils.join(tags, ",")),
                createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<Clan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    List<Clan> getClanSearch(ClanSearch clanSearch) throws IOException {
        ClanSearchRequest.ClanSearchRequestBuilder builder = ClanSearchRequest.builder();
        if (clanSearch != null) {
            builder
                    .name(clanSearch.getName())
                    .score(clanSearch.getScore())
                    .minMembers(clanSearch.getMinMembers())
                    .maxMembers(clanSearch.getMaxMembers());
        }
        String json = createCrawler().get(appendClanSearch(
                builder.build(),
                createUrl("clan/search")),
                createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<Clan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    private String appendClanSearch(ClanSearchRequest clanSearchRequest, String url) throws UnsupportedEncodingException {
        List<String> params = new ArrayList<>();
        String name = clanSearchRequest.getName();
        if (StringUtils.isNotBlank(name)) {
            addQueryParamIfPresent(params, "name", URLEncoder.encode(name, "UTF-8"));
        }
        addQueryParamIfPresent(params, "score", clanSearchRequest.getScore());
        addQueryParamIfPresent(params, "minMembers", clanSearchRequest.getMinMembers());
        addQueryParamIfPresent(params, "maxMembers", clanSearchRequest.getMaxMembers());
        if (params.size() > 0) {
            url += "?";
            url = url + StringUtils.join(params, '&');
        }
        return url;
    }

    private void addQueryParamIfPresent(List<String> params, String name, Object value) {
        if (value != null) {
            params.add(String.format(PARAM, name, value));
        }
    }

    List<Clan> getClanSearch(ClanSearchRequest clanSearchRequest) throws IOException {
        String json = createCrawler().get(appendClanSearch(clanSearchRequest, createUrl("clan/search")),
                createAuthHeader(developerKey));
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
        String json = createCrawler().get(url, createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<TopPlayer>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    Tournament getTournaments(String tag) throws IOException {
        return getTournaments(TournamentsRequest.builder().tag(tag).build());
    }

    Tournament getTournaments(TournamentsRequest tournamentsRequest) throws IOException {
        String json = createCrawler().get(createUrl("tournaments/" + tournamentsRequest.getTag()), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Tournament.class);
    }

    Constants getConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants"), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Constants.class);
    }

    Alliance getAllianceConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/alliance/"), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Alliance.class);
    }

    List<Arena> getArenasConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/arenas/"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<Arena>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    Badges getBadgesConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/badges/"), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Badges.class);
    }

    ChestCycleList getChestCycleConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/chestCycle/"), createAuthHeader(developerKey));
        return new Gson().fromJson(json, ChestCycleList.class);
    }

    List<CountryCode> getCountryCodesConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/countryCodes/"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<CountryCode>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    List<Rarity> getRaritiesConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/rarities/"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<Rarity>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    List<ConstantCard> getCardsConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/cards/"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<ConstantCard>>(){}.getType();
        return new Gson().fromJson(json, listType);
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
        return getClanBattles(ClanBattlesRequest.builder().tag(tag).build());
    }

    List<Battle> getClanBattles(ClanBattlesRequest clanBattlesRequest) throws IOException {
        String json = createCrawler().get(createUrl("clan/" + clanBattlesRequest.getTag() + "/battles"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<Battle>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    @Deprecated
    ClanHistory getClanHistory(String tag) throws IOException {
        return getClanHistory(ClanHistoryRequest.builder().tag(tag).build());
    }

    ClanHistory getClanHistory(ClanHistoryRequest clanHistoryRequest) throws IOException {
        String json = createCrawler().get(createUrl("clan/" + clanHistoryRequest.getTag() + "/history"), createAuthHeader(developerKey));
        return new Gson().fromJson(json, ClanHistory.class);
    }

}
