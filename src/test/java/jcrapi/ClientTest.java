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

import com.google.common.collect.ImmutableMap;
import jcrapi.model.ClanSearch;
import jcrapi.request.AuthStatsRequest;
import jcrapi.request.ClanBattlesRequest;
import jcrapi.request.ClanHistoryRequest;
import jcrapi.request.ClanSearchRequest;
import jcrapi.request.ClanTrackingRequest;
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
import jcrapi.request.TopClansRequest;
import org.apache.commons.lang.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * @author Michael Lieshoff
 */
public class ClientTest {

    private CrawlerFactory crawlerFactory;

    private Crawler crawler;

    @Before
    public void setUp() {
        crawlerFactory = Mockito.mock(CrawlerFactory.class);
        crawler = Mockito.mock(Crawler.class);
        when(crawlerFactory.createCrawler()).thenReturn(crawler);
    }

    @Test(expected = NullPointerException.class)
    public void failCreateBecauseNullUrl() {
        new Client(null, "abc", AuthMode.NORMAL, crawlerFactory);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failCreateBecauseEmptyUrl() {
        new Client("", "abc", AuthMode.NORMAL, crawlerFactory);
    }

    @Test(expected = NullPointerException.class)
    public void failCreateBecauseNullCrawlerFactory() {
        new Client("abc", "abc", AuthMode.NORMAL, null);
    }

    @Test(expected = NullPointerException.class)
    public void failCreateBecauseNullAuthMode() {
        new Client("abc", "abc", null, crawlerFactory);
    }

    @Test
    public void shouldGetVersion() throws IOException {
        when(crawler.get("lala/version", createHeaders(), null)).thenReturn("1.0");
        assertEquals("1.0", createClient().getVersion());
    }

    private Map<String,String> createHeaders() {
        return ImmutableMap.<String, String>builder().put("auth", "abc").build();
    }

    private Client createClient() {
        return new Client("lala/", "abc", AuthMode.NORMAL, crawlerFactory);
    }

    @Test(expected = NullPointerException.class)
    public void failGetProfileBecauseNullTag() throws IOException {
        createClient().getProfile((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfileBecauseEmptyTag() throws IOException {
        createClient().getProfile("");
    }

    @Test
    public void shouldGetProfile() throws IOException {
        when(crawler.get("lala/player/xyz", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("{}");
        assertNotNull(createClient().getProfile("xyz"));
    }

    @Test(expected = NullPointerException.class)
    public void failGetProfileBecauseNullRequest() throws IOException {
        createClient().getProfile((ProfileRequest) null);
    }

    @Test
    public void shouldGetProfileFromRequest() throws IOException {
        ProfileRequest profileRequest = ProfileRequest.builder("xyz")
                        .keys(Arrays.asList("a", "b"))
                        .excludes(Arrays.asList("x", "y"))
                        .build();
        when(crawler.get("lala/player/xyz", createHeaders(),
                profileRequest.getQueryParameters())).thenReturn("{}");
        assertNotNull(createClient().getProfile(profileRequest));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfilesBecauseNullTag() throws IOException {
        createClient().getProfiles((List<String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfilesBecauseEmptyTag() throws IOException {
        createClient().getProfiles(Collections.<String>emptyList());
    }

    @Test
    public void shouldGetProfiles() throws IOException {
        List<String> tags = createTags();
        when(crawler.get("lala/player/" + StringUtils.join(tags, ','), createHeaders(),
                Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getProfiles(tags));
    }

    private List<String> createTags() {
        List<String> tags = new ArrayList<>();
        tags.add("xyz");
        tags.add("def");
        return tags;
    }

    @Test(expected = NullPointerException.class)
    public void failGetProfilesBecauseNullRequest() throws IOException {
        createClient().getProfiles((ProfilesRequest) null);
    }

    @Test
    public void shouldGetProfilesFromRequest() throws IOException {
        ProfilesRequest profilesRequest = ProfilesRequest.builder(createTags())
                .limit(15)
                .keys(Arrays.asList("a", "b"))
                .excludes(Arrays.asList("x", "y"))
                .build();
        when(crawler.get("lala/player/xyz,def", createHeaders(), profilesRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getProfiles(profilesRequest));
    }

    @Test
    public void shouldGetTopClans() throws IOException {
        when(crawler.get("lala/top/clans", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getTopClans((String) null));
    }

    @Test
    public void shouldGetTopClansWithLocation() throws IOException {
        when(crawler.get("lala/top/clans/EU", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getTopClans("EU"));
    }

    @Test
    public void shouldGetTopClansFromRequest() throws IOException {
        when(crawler.get("lala/top/clans", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getTopClans(TopClansRequest.builder().build()));
    }

    @Test
    public void shouldGetTopClansWithLocationFromRequest() throws IOException {
        TopClansRequest topClansRequest = TopClansRequest.builder().locationKey("EU").build();
        when(crawler.get("lala/top/clans/EU", createHeaders(), topClansRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getTopClans(topClansRequest));
    }

    @Test(expected = NullPointerException.class)
    public void failGetClanBecauseNullTag() throws IOException {
        createClient().getClan((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClanBecauseEmptyTag() throws IOException {
        createClient().getClan("");
    }

    @Test
    public void shouldGetClan() throws IOException {
        when(crawler.get("lala/clan/xyz", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("{}");
        assertNotNull(createClient().getClan("xyz"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClansBecauseNullTag() throws IOException {
        createClient().getClans((List<String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClansBecauseEmptyTag() throws IOException {
        createClient().getClans(Collections.<String>emptyList());
    }

    @Test
    public void shouldGetClans() throws IOException {
        List<String> tags = createTags();
        when(crawler.get("lala/clan/" + StringUtils.join(tags, ','), createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getClans(tags));
    }

    @Test(expected = NullPointerException.class)
    public void failGetClansBecauseNullRequest() throws IOException {
        createClient().getClans((ClansRequest) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClansBecauseEmptyTagFromRequest() throws IOException {
        createClient().getClans(ClansRequest.builder(Collections.EMPTY_LIST).build());
    }

    @Test
    public void shouldGetClansFromRequest() throws IOException {
        List<String> tags = createTags();
        when(crawler.get("lala/clan/" + StringUtils.join(tags, ','), createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getClans(ClansRequest.builder(tags).build()));
    }

    @Test
    public void shouldGetClanSearch() throws IOException {
        ClanSearch clanSearch = new ClanSearch();
        clanSearch.setScore(50);
        when(crawler.get("lala/clan/search", createHeaders(), ImmutableMap.<String, String>builder().put("score", "50").build())).thenReturn("[{}]");
        assertNotNull(createClient().getClanSearch(clanSearch));
    }

    @Test(expected = NullPointerException.class)
    public void failGetClanSearchWithoutCriteria() throws IOException {
        createClient().getClanSearch((ClanSearch) null);
    }

    @Test
    public void shouldGetClanSearchWithParameters() throws IOException {
        ClanSearch clanSearch = new ClanSearch();
        clanSearch.setName("abc");
        clanSearch.setScore(2000);
        clanSearch.setMinMembers(20);
        clanSearch.setMaxMembers(50);
        when(crawler.get("lala/clan/search", createHeaders(), ImmutableMap.<String, String>builder()
                .put("name", "abc")
                .put("score", "2000")
                .put("minMembers", "20")
                .put("maxMembers", "50")
                .build())).thenReturn("[{}]");
        assertNotNull(createClient().getClanSearch(clanSearch));
    }

    @Test
    public void shouldGetClanSearchWithEncodedParameters() throws IOException {
        ClanSearch clanSearch = new ClanSearch();
        clanSearch.setName("reddit+alpha");
        clanSearch.setScore(2000);
        clanSearch.setMinMembers(20);
        clanSearch.setMaxMembers(50);
        when(crawler.get("lala/clan/search", createHeaders(), ImmutableMap.<String, String>builder()
                .put("name", "reddit+alpha")
                .put("score", "2000")
                .put("minMembers", "20")
                .put("maxMembers", "50")
                .build())).thenReturn("[{}]");
        assertNotNull(createClient().getClanSearch(clanSearch));
    }

    @Test
    public void shouldGetClanSearchFromRequest() throws IOException {
        when(crawler.get("lala/clan/search", createHeaders(), ImmutableMap.<String, String>builder().put("score", "50").build())).thenReturn("[{}]");
        assertNotNull(createClient().getClanSearch(ClanSearchRequest.builder().score(50).build()));
    }

    @Test
    public void shouldGetClanSearchWithParametersFromRequest() throws IOException {
        ClanSearchRequest clanSearchRequest = ClanSearchRequest.builder()
                .name("abc")
                .score(2000)
                .minMembers(20)
                .maxMembers(50)
                .build();
        when(crawler.get("lala/clan/search", createHeaders(), clanSearchRequest.getQueryParameters()))
                .thenReturn("[{}]");
        assertNotNull(createClient().getClanSearch(clanSearchRequest));
    }

    @Test
    public void shouldGetClanSearchWithEncodedParametersFromRequest() throws IOException {
        ClanSearchRequest clanSearchRequest = ClanSearchRequest.builder()
                .name("reddit+alpha")
                .score(2000)
                .minMembers(20)
                .maxMembers(50)
                .build();
        when(crawler.get("lala/clan/search", createHeaders(), clanSearchRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getClanSearch(clanSearchRequest));
    }

    @Test
    public void shouldGetTopPlayers() throws IOException {
        when(crawler.get("lala/top/players", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getTopPlayers((String) null));
    }

    @Test
    public void shouldGetTopPlayersWithLocation() throws IOException {
        when(crawler.get("lala/top/players/EU", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getTopPlayers("EU"));
    }

    @Test
    public void shouldGetTournaments() throws IOException {
        when(crawler.get("lala/tournaments/abc", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("{}");
        assertNotNull(createClient().getTournaments("abc"));
    }

    @Test
    public void shouldGetEndpoint() throws IOException {
        when(crawler.get("lala/endpoints", createHeaders(), null)).thenReturn("[]");
        assertNotNull(createClient().getEndpoints());
    }

    @Test
    public void shouldGetPopularClans() throws IOException {
        when(crawler.get("lala/popular/clans", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getPopularClans());
    }

    @Test
    public void shouldGetPopularClansFromRequest() throws IOException {
        PopularClansRequest popularClansRequest = PopularClansRequest.builder().build();
        when(crawler.get("lala/popular/clans", createHeaders(), popularClansRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getPopularClans(popularClansRequest));
    }

    @Test
    public void shouldGetPopularPlayers() throws IOException {
        when(crawler.get("lala/popular/players", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getPopularPlayers());
    }

    @Test
    public void shouldGetPopularPlayersFromRequest() throws IOException {
        PopularPlayersRequest popularPlayersRequest = PopularPlayersRequest.builder().build();
        when(crawler.get("lala/popular/players", createHeaders(), popularPlayersRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getPopularPlayers(popularPlayersRequest));
    }

    @Test
    public void shouldGetPopularTournaments() throws IOException {
        when(crawler.get("lala/popular/tournaments", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getPopularTournaments());
    }

    @Test
    public void shouldGetPopularTournamentsFromRequest() throws IOException {
        PopularTournamentsRequest popularTournamentsRequest = PopularTournamentsRequest.builder().build();
        when(crawler.get("lala/popular/tournaments", createHeaders(), popularTournamentsRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getPopularTournaments(popularTournamentsRequest));
    }

    @Test
    public void shouldGetClanBattles() throws IOException {
        when(crawler.get("lala/clan/xyz/battles", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
        assertNotNull(createClient().getClanBattles("xyz"));
    }

    @Test
    public void shouldGetClanBattlesFromRequest() throws IOException {
        ClanBattlesRequest clanBattlesRequest = ClanBattlesRequest.builder("xyz").build();
        when(crawler.get("lala/clan/xyz/battles", createHeaders(), clanBattlesRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getClanBattles(clanBattlesRequest));
    }

    @Test
    public void shouldGetClanHistory() throws IOException {
        when(crawler.get("lala/clan/xyz/history", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("{}");
        assertNotNull(createClient().getClanHistory("xyz"));
    }

    @Test
    public void shouldGetClanHistoryFromRequest() throws IOException {
        ClanHistoryRequest clanHistoryRequest = ClanHistoryRequest.builder("xyz").build();
        when(crawler.get("lala/clan/xyz/history", createHeaders(), clanHistoryRequest.getQueryParameters())).thenReturn("{}");
        assertNotNull(createClient().getClanHistory(clanHistoryRequest));
    }

    @Test
    public void shouldGetOpenTournaments() throws IOException {
        OpenTournamentsRequest openTournamentsRequest = OpenTournamentsRequest.builder().build();
        when(crawler.get("lala/tournaments/open", createHeaders(), openTournamentsRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getOpenTournaments(openTournamentsRequest));
    }

    @Test
    public void shouldGetKnownTournaments() throws IOException {
        KnownTournamentsRequest knownTournamentsRequest = KnownTournamentsRequest.builder().build();
        when(crawler.get("lala/tournaments/known", createHeaders(), knownTournamentsRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getKnownTournaments(knownTournamentsRequest));
    }

    @Test
    public void shouldGetPlayerBattles() throws IOException {
        List<String> tags = createTags().subList(0, 1);
        PlayerBattlesRequest playerBattlesRequest = PlayerBattlesRequest.builder(tags).build();
        when(crawler.get("lala/player/" + StringUtils.join(tags, ',') + "/battles", createHeaders(),
                playerBattlesRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getPlayerBattles(playerBattlesRequest));
    }

    @Test
    public void shouldGetMultiPlayerBattles() throws IOException {
        List<String> tags = createTags();
        PlayerBattlesRequest playerBattlesRequest = PlayerBattlesRequest.builder(tags).build();
        when(crawler.get("lala/player/" + StringUtils.join(tags, ',') + "/battles", createHeaders(),
                playerBattlesRequest.getQueryParameters())).thenReturn("[[{}]]");
        assertNotNull(createClient().getPlayerBattles(playerBattlesRequest));
    }

    @Test
    public void shouldGetPlayerChests() throws IOException {
        List<String> tags = createTags().subList(0, 1);
        PlayerChestsRequest playerChestsRequest = PlayerChestsRequest.builder(tags).build();
        when(crawler.get("lala/player/" + StringUtils.join(tags, ',') + "/chests", createHeaders(),
                playerChestsRequest.getQueryParameters())).thenReturn("{}");
        assertNotNull(createClient().getPlayerChests(playerChestsRequest));
    }

    @Test
    public void shouldGetMultiPlayerChests() throws IOException {
        List<String> tags = createTags();
        PlayerChestsRequest playerChestsRequest = PlayerChestsRequest.builder(tags).build();
        when(crawler.get("lala/player/" + StringUtils.join(tags, ',') + "/chests", createHeaders(),
                playerChestsRequest.getQueryParameters())).thenReturn("[{}]");
        assertNotNull(createClient().getPlayerChests(playerChestsRequest));
    }

    @Test
    public void shouldGetPopularDecks() throws IOException {
        PopularDecksRequest popularDecksRequest = PopularDecksRequest.builder().build();
        when(crawler.get("lala/popular/decks", createHeaders(), popularDecksRequest.getQueryParameters()))
                .thenReturn("[{}]");
        assertNotNull(createClient().getPopularDecks(popularDecksRequest));
    }

    @Test
    public void shouldGetClanTracking() throws IOException {
        ClanTrackingRequest clanTrackingRequest = ClanTrackingRequest.builder("abc").build();
        when(crawler.get("lala/clan/abc/tracking", createHeaders(), clanTrackingRequest.getQueryParameters()))
                .thenReturn("{}");
        assertNotNull(createClient().getClanTracking(clanTrackingRequest));
    }

    @Test
    public void shouldGetAuthStats() throws IOException {
        AuthStatsRequest authStatsRequest = AuthStatsRequest.builder().build();
        when(crawler.get("lala/auth/stats", createHeaders(), authStatsRequest.getQueryParameters()))
                .thenReturn("{}");
        assertNotNull(createClient().getAuthStats(authStatsRequest));
    }

    @Test
    public void shouldGetLastResponse() throws IOException {
        Response response = new Response();
        when(crawler.getLastResponse()).thenReturn(response);
        assertEquals(response, createClient().getLastResponse());
    }

}