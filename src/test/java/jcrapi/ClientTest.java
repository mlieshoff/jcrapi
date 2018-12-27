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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import com.google.common.collect.ImmutableMap;

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
import jcrapi.request.TopClansRequest;
import jcrapi.request.TopPlayersRequest;
import jcrapi.request.TopWarsRequest;
import jcrapi.request.TournamentSearchRequest;
import jcrapi.request.TournamentsRequest;

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

  private Map<String, String> createHeaders() {
    return ImmutableMap.<String, String>builder().put("auth", "abc").build();
  }

  private Client createClient() {
    return new Client("lala/", "abc", AuthMode.NORMAL, crawlerFactory);
  }

  @Test(expected = NullPointerException.class)
  public void failGetProfileBecauseNullRequest() throws IOException {
    createClient().getProfile(null);
  }

  @Test
  public void shouldGetProfile() throws IOException {
    ProfileRequest profileRequest = ProfileRequest.builder("xyz")
        .keys(Arrays.asList("a", "b"))
        .excludes(Arrays.asList("x", "y"))
        .build();
    when(crawler.get("lala/player/xyz", createHeaders(),
        profileRequest.getQueryParameters())).thenReturn("{}");
    assertNotNull(createClient().getProfile(profileRequest));
  }

  private List<String> createTags() {
    List<String> tags = new ArrayList<>();
    tags.add("xyz");
    tags.add("def");
    return tags;
  }

  @Test(expected = NullPointerException.class)
  public void failGetProfilesBecauseNullRequest() throws IOException {
    createClient().getProfiles(null);
  }

  @Test
  public void shouldGetProfiles() throws IOException {
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
    assertNotNull(createClient().getTopClans(TopClansRequest.builder().build()));
  }

  @Test
  public void shouldGetTopClansWithLocation() throws IOException {
    TopClansRequest topClansRequest = TopClansRequest.builder().locationKey("EU").build();
    when(crawler.get("lala/top/clans/EU", createHeaders(), topClansRequest.getQueryParameters())).thenReturn("[{}]");
    assertNotNull(createClient().getTopClans(topClansRequest));
  }

  @Test(expected = NullPointerException.class)
  public void failGetClanBecauseNullRequest() throws IOException {
    createClient().getClan(null);
  }

  @Test
  public void shouldGetClan() throws IOException {
    when(crawler.get("lala/clan/abc", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("{}");
    assertNotNull(createClient().getClan(ClanRequest.builder("abc").build()));
  }

  @Test(expected = NullPointerException.class)
  public void failGetClansBecauseNullRequest() throws IOException {
    createClient().getClans(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void failGetClansBecauseEmptyTag() throws IOException {
    createClient().getClans(ClansRequest.builder(Collections.EMPTY_LIST).build());
  }

  @Test
  public void shouldGetClans() throws IOException {
    List<String> tags = createTags();
    when(crawler
        .get("lala/clan/" + StringUtils.join(tags, ','), createHeaders(), Collections.<String, String>emptyMap()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getClans(ClansRequest.builder(tags).build()));
  }

  @Test
  public void shouldGetClanSearch() throws IOException {
    when(crawler
        .get("lala/clan/search", createHeaders(), ImmutableMap.<String, String>builder().put("score", "50").build()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getClanSearch(ClanSearchRequest.builder().score(50).build()));
  }

  @Test
  public void shouldGetClanSearchWithParameters() throws IOException {
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
  public void shouldGetClanSearchWithEncodedParameters() throws IOException {
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
    assertNotNull(createClient().getTopPlayers(TopPlayersRequest.builder().build()));
  }

  @Test
  public void shouldGetTournaments() throws IOException {
    when(crawler.get("lala/tournaments/abc", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("{}");
    assertNotNull(createClient().getTournaments(TournamentsRequest.builder("abc").build()));
  }

  @Test
  public void shouldGetEndpoint() throws IOException {
    when(crawler.get("lala/endpoints", createHeaders(), null)).thenReturn("[]");
    assertNotNull(createClient().getEndpoints());
  }

  @Test
  public void shouldGetPopularClans() throws IOException {
    PopularClansRequest popularClansRequest = PopularClansRequest.builder().build();
    when(crawler.get("lala/popular/clans", createHeaders(), popularClansRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getPopularClans(popularClansRequest));
  }

  @Test
  public void shouldGetPopularPlayers() throws IOException {
    PopularPlayersRequest popularPlayersRequest = PopularPlayersRequest.builder().build();
    when(crawler.get("lala/popular/players", createHeaders(), popularPlayersRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getPopularPlayers(popularPlayersRequest));
  }

  @Test
  public void shouldGetPopularTournaments() throws IOException {
    PopularTournamentsRequest popularTournamentsRequest = PopularTournamentsRequest.builder().build();
    when(crawler.get("lala/popular/tournaments", createHeaders(), popularTournamentsRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getPopularTournaments(popularTournamentsRequest));
  }

  @Test
  public void shouldGetClanBattles() throws IOException {
    ClanBattlesRequest clanBattlesRequest = ClanBattlesRequest.builder("xyz").build();
    when(crawler.get("lala/clan/xyz/battles", createHeaders(), clanBattlesRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getClanBattles(clanBattlesRequest));
  }

  @Test
  public void shouldGetClanHistory() throws IOException {
    ClanHistoryRequest clanHistoryRequest = ClanHistoryRequest.builder("xyz").build();
    when(crawler.get("lala/clan/xyz/history", createHeaders(), clanHistoryRequest.getQueryParameters()))
        .thenReturn("{}");
    assertNotNull(createClient().getClanHistory(clanHistoryRequest));
  }

  @Test
  public void shouldGetClanWeeklyHistory() throws IOException {
    ClanWeeklyHistoryRequest clanWeeklyHistoryRequest = ClanWeeklyHistoryRequest.builder("xyz").build();
    when(crawler.get("lala/clan/xyz/history/weekly", createHeaders(), clanWeeklyHistoryRequest.getQueryParameters()))
        .thenReturn("{}");
    assertNotNull(createClient().getClanWeeklyHistory(clanWeeklyHistoryRequest));
  }

  @Test
  public void shouldGetOpenTournaments() throws IOException {
    OpenTournamentsRequest openTournamentsRequest = OpenTournamentsRequest.builder().build();
    when(crawler.get("lala/tournaments/open", createHeaders(), openTournamentsRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getOpenTournaments(openTournamentsRequest));
  }

  @Test
  public void shouldGetKnownTournaments() throws IOException {
    KnownTournamentsRequest knownTournamentsRequest = KnownTournamentsRequest.builder().build();
    when(crawler.get("lala/tournaments/known", createHeaders(), knownTournamentsRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getKnownTournaments(knownTournamentsRequest));
  }

  @Test
  public void shouldGetTournamentSearch() throws IOException {
    TournamentSearchRequest tournamentSearchRequest = TournamentSearchRequest.builder("abc").build();
    when(crawler.get("lala/tournaments/search", createHeaders(), tournamentSearchRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getTournamentSearch(tournamentSearchRequest));
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
  public void shouldGetClanWarLog() throws IOException {
    ClanWarLogRequest clanWarLogRequest = ClanWarLogRequest.builder("abc").build();
    when(crawler.get("lala/clan/abc/warlog", createHeaders(), clanWarLogRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getClanWarLog(clanWarLogRequest));
  }

  @Test
  public void shouldGetClanWar() throws IOException {
    ClanWarRequest clanWarRequest = ClanWarRequest.builder("abc").build();
    when(crawler.get("lala/clan/abc/war", createHeaders(), clanWarRequest.getQueryParameters()))
        .thenReturn("{}");
    assertNotNull(createClient().getClanWar(clanWarRequest));
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

  @Test
  public void shouldGetOneKTournaments() throws IOException {
    OneKTournamentsRequest oneKTournamentsRequest = OneKTournamentsRequest.builder().build();
    when(crawler.get("lala/tournaments/1k", createHeaders(), oneKTournamentsRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getOneKTournaments(oneKTournamentsRequest));
  }

  @Test
  public void shouldGetFullTournaments() throws IOException {
    FullTournamentsRequest fullTournamentsRequest = FullTournamentsRequest.builder().build();
    when(crawler.get("lala/tournaments/full", createHeaders(), fullTournamentsRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getFullTournaments(fullTournamentsRequest));
  }

  @Test
  public void shouldGetInPreparationTournaments() throws IOException {
    InPreparationTournamentsRequest inPreparationTournamentsRequest = InPreparationTournamentsRequest.builder().build();
    when(crawler.get("lala/tournaments/prep", createHeaders(), inPreparationTournamentsRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getInPreparationTournaments(inPreparationTournamentsRequest));
  }

  @Test
  public void shouldGetJoinableTournaments() throws IOException {
    JoinableTournamentsRequest inPreparationTournamentsRequest = JoinableTournamentsRequest.builder().build();
    when(
        crawler.get("lala/tournaments/joinable", createHeaders(), inPreparationTournamentsRequest.getQueryParameters()))
        .thenReturn("[{}]");
    assertNotNull(createClient().getJoinableTournaments(inPreparationTournamentsRequest));
  }

  @Test
  public void shouldGetTopWars() throws IOException {
    when(crawler.get("lala/top/war", createHeaders(), Collections.<String, String>emptyMap())).thenReturn("[{}]");
    assertNotNull(createClient().getTopWars(TopWarsRequest.builder().build()));
  }

  @Test
  public void shouldGetTopWarsWithLocation() throws IOException {
    TopWarsRequest topWarsRequest = TopWarsRequest.builder().locationKey("EU").build();
    when(crawler.get("lala/top/war/EU", createHeaders(), topWarsRequest.getQueryParameters())).thenReturn("[{}]");
    assertNotNull(createClient().getTopWars(topWarsRequest));
  }

}