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
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jcrapi.model.Clan;
import jcrapi.model.Endpoints;
import jcrapi.model.Profile;
import jcrapi.request.ClanBattlesRequest;
import jcrapi.request.ClanHistoryRequest;
import jcrapi.request.ClanRequest;
import jcrapi.request.ClanSearchRequest;
import jcrapi.request.ClanTrackingRequest;
import jcrapi.request.ClanWarLogRequest;
import jcrapi.request.ClanWarRequest;
import jcrapi.request.ClanWeeklyHistoryRequest;
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
import jcrapi.request.TopClansRequest;
import jcrapi.request.TopPlayersRequest;
import jcrapi.request.TopWarsRequest;
import jcrapi.request.TournamentSearchRequest;
import jcrapi.request.TournamentsRequest;

/**
 * @author Michael Lieshoff
 */
public class IntegrationTest {

  public static final String AUTH = "secret";
  public static final String VERSION = "4.0.3";

  private static JettyServer jettyServer;

  private static final String CONTEXT = "test";
  private static final String APP = "jcrapi";
  private static final String URL = String.format("http://localhost:50000/%s/%s/", CONTEXT, APP);

  @BeforeClass
  public static void beforeClass() throws Exception {
    jettyServer = new JettyServer(50000, "/" + CONTEXT);
    jettyServer.addServlet("/" + APP + "/version", new TestVersionServlet());
    jettyServer.addServlet("/" + APP + "/player/*", new TestProfileServlet());
    jettyServer.addServlet("/" + APP + "/top/clans/*", new TestTopClansServlet());
    jettyServer.addServlet("/" + APP + "/top/players/*", new TestTopPlayersServlet());
    jettyServer.addServlet("/" + APP + "/top/war/*", new TestTopWarsServlet());
    jettyServer.addServlet("/" + APP + "/clan/search/*", new TestClanSearchServlet());
    jettyServer.addServlet("/" + APP + "/clan/*", new TestClanServlet());
    jettyServer.addServlet("/" + APP + "/endpoints", new TestEndpointsServlet());
    jettyServer.addServlet("/" + APP + "/popular/clans", new TestPopularClansServlet());
    jettyServer.addServlet("/" + APP + "/popular/decks", new TestPopularDecksServlet());
    jettyServer.addServlet("/" + APP + "/popular/players", new TestPopularPlayersServlet());
    jettyServer.addServlet("/" + APP + "/tournaments/search", new TestTournamentSearchServlet());
    jettyServer.addServlet("/" + APP + "/tournaments/known", new TestKnownTournamentsServlet());
    jettyServer.addServlet("/" + APP + "/tournaments/open", new TestOpenTournamentsServlet());
    jettyServer.addServlet("/" + APP + "/tournaments/1k", new TestOneKTournamentsServlet());
    jettyServer.addServlet("/" + APP + "/tournaments/full", new TestFullTournamentsServlet());
    jettyServer.addServlet("/" + APP + "/tournaments/prep", new TestPrepTournamentsServlet());
    jettyServer.addServlet("/" + APP + "/tournaments/joinable", new TestJoinableTournamentsServlet());
    jettyServer.addServlet("/" + APP + "/tournaments/*", new TestTournamentServlet());
    jettyServer.addServlet("/" + APP + "/popular/tournaments", new TestPopularTournamentsServlet());
    jettyServer.addServlet("/" + APP + "/auth/stats", new TestAuthStatsServlet());
    jettyServer.addServlet("/" + APP + "/constants", new TestConstantsServlet());
    jettyServer.start();
  }

  @AfterClass
  public static void afterClass() throws Exception {
    jettyServer.stop();
  }

  @Test
  public void shouldGetVersionWithAuth() throws IOException {
    doGetVersion(URL, AUTH, VERSION);
  }

  private void doGetVersion(String url, String auth, String expected) {
    String version = new Api(url, auth).getVersion();
    assertEquals(expected, version);
  }

  @Test(expected = ApiException.class)
  public void failGetVersionBecauseWrongAuth() throws IOException {
    doGetVersion(URL, "abc", VERSION);
  }

  @Test
  public void shouldGetProfileWithAuth() throws IOException {
    doGetProfile(URL, AUTH, ProfileRequest.builder("8L9L9GL").build());
  }

  private void doGetProfile(String url, String auth, ProfileRequest profileRequest) {
    assertEquals(profileRequest.getTag(), new Api(url, auth).getProfile(profileRequest).getTag());
  }

  @Test(expected = ApiException.class)
  public void failGetProfileBecauseWrongAuth() throws IOException {
    doGetProfile(URL, "abc", ProfileRequest.builder("8L9L9GL").build());
  }

  @Test
  public void shouldGetProfileWithAuthWithBearer() throws IOException {
    doGetProfileWithBearer(URL, AUTH, ProfileRequest.builder("8L9L9GL").build());
  }

  private void doGetProfileWithBearer(String url, String auth, ProfileRequest profileRequest) {
    assertEquals(profileRequest.getTag(), new Api(url, auth, AuthMode.BEARER).getProfile(profileRequest).getTag());
  }

  @Test(expected = ApiException.class)
  public void failGetProfileBecauseWrongAuthWithBearer() throws IOException {
    doGetProfileWithBearer(URL, "abc", ProfileRequest.builder("8L9L9GL").build());
  }

  private List<String> createProfileTags() {
    List<String> tags = new ArrayList<>();
    tags.add("L88P2282");
    tags.add("9CQ2U8QJ");
    tags.add("8L9L9GL");
    return tags;
  }

  @Test
  public void shouldGetProfilesWithAuth() throws IOException {
    doGetProfiles(URL, AUTH, ProfilesRequest.builder(createProfileTags()).build());
  }

  private void doGetProfiles(String url, String auth, ProfilesRequest profilesRequest) {
    List<Profile> profiles = new Api(url, auth).getProfiles(profilesRequest);
    assertEquals(profilesRequest.getTags().size(), profiles.size());
    List<String> tags = new ArrayList(profilesRequest.getTags());
    for (int i = 0, n = profilesRequest.getTags().size(); i < n; i++) {
      Profile profile = profiles.get(i);
      String tag = tags.get(i);
      assertEquals(tag, profile.getTag());
    }
  }

  @Test
  public void shouldGetTopClansWithAuth() throws IOException {
    doGetTopClans(URL, AUTH, TopClansRequest.builder().build());
  }

  private void doGetTopClans(String url, String auth, TopClansRequest topClansRequest) {
    assertTrue(new Api(url, auth).getTopClans(topClansRequest).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetTopClansBecauseWrongAuth() throws IOException {
    doGetTopClans(URL, "abc", TopClansRequest.builder().build());
  }

  @Test
  public void shouldGetTopClansWithLocation() throws IOException {
    doGetTopClans(URL, AUTH, TopClansRequest.builder().locationKey("EU").build());
  }

  @Test
  public void shouldGetClanWithAuth() throws IOException {
    doGetClan(URL, AUTH, ClanRequest.builder("2CCCP").build());
  }

  private void doGetClan(String url, String auth, ClanRequest clanRequest) {
    assertEquals(clanRequest.getTag(), new Api(url, auth).getClan(clanRequest).getTag());
  }

  @Test(expected = ApiException.class)
  public void failGetClanBecauseWrongAuth() throws IOException {
    doGetClan(URL, "abc", ClanRequest.builder("2CCCP").build());
  }

  @Test
  public void shouldGetClanSearchWithAuth() throws IOException {
    doGetClanSearch(URL, AUTH);
  }

  private void doGetClanSearch(String url, String auth) {
    List<Clan> clans = new Api(url, auth).getClanSearch(ClanSearchRequest.builder().score(50).build());
    assertTrue(clans.size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetClanSearchBecauseWrongAuth() throws IOException {
    doGetClanSearch(URL, "abc");
  }

  @Test
  public void shouldGetTopPlayersWithAuth() throws IOException {
    doGetTopPlayers(URL, AUTH, TopPlayersRequest.builder().build());
  }

  private void doGetTopPlayers(String url, String auth, TopPlayersRequest topPlayersRequest) {
    assertTrue(new Api(url, auth).getTopPlayers(topPlayersRequest).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetTopPlayersBecauseWrongAuth() throws IOException {
    doGetTopPlayers(URL, "abc", TopPlayersRequest.builder().build());
  }

  @Test
  public void shouldGetTopPlayersWithLocation() throws IOException {
    doGetTopPlayers(URL, AUTH, TopPlayersRequest.builder().locationKey("EU").build());
  }

  @Test
  public void shouldGetTournamentsWithAuth() throws IOException {
    doGetTournaments(URL, AUTH, TournamentsRequest.builder("20YU0VJ9").build());
  }

  private void doGetTournaments(String url, String auth, TournamentsRequest tournamentsRequest) {
    assertEquals("im a baaad guuy r.i.p.papakush", new Api(url, auth).getTournaments(tournamentsRequest).getName());
  }

  @Test(expected = ApiException.class)
  public void failGetTournamentsBecauseWrongAuth() throws IOException {
    doGetTournaments(URL, "abc", TournamentsRequest.builder("abc").build());
  }

  @Test
  public void shouldGetEndpointsWithAuth() throws IOException {
    doGetEndpoints(URL, AUTH);
  }

  private void doGetEndpoints(String url, String auth) {
    Endpoints endpoints = new Api(url, auth).getEndpoints();
    assertTrue(endpoints.size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetEndpointsBecauseWrongAuth() throws IOException {
    doGetEndpoints(URL, "abc");
  }

  @Test
  public void shouldGetPopularClansWithAuth() throws IOException {
    doGetPopularClans(URL, AUTH);
  }

  private void doGetPopularClans(String url, String auth) {
    assertTrue(new Api(url, auth).getPopularClans(PopularClansRequest.builder().build()).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetPopularClansBecauseWrongAuth() throws IOException {
    doGetPopularClans(URL, "abc");
  }

  @Test
  public void shouldGetPopularPlayersWithAuth() throws IOException {
    doGetPopularPlayers(URL, AUTH);
  }

  private void doGetPopularPlayers(String url, String auth) {
    assertTrue(new Api(url, auth).getPopularPlayers(PopularPlayersRequest.builder().build()).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetPopularPlayersBecauseWrongAuth() throws IOException {
    doGetPopularPlayers(URL, "abc");
  }

  @Test
  public void shouldGetPopularTournamentsWithAuth() throws IOException {
    doGetPopularTournaments(URL, AUTH);
  }

  private void doGetPopularTournaments(String url, String auth) {
    assertTrue(new Api(url, auth).getPopularTournaments(PopularTournamentsRequest.builder().build()).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetPopularTournamentsBecauseWrongAuth() throws IOException {
    doGetPopularTournaments(URL, "abc");
  }

  @Test
  public void shouldGetClanBattlesWithAuth() throws IOException {
    doGetClanBattles(URL, AUTH, ClanBattlesRequest.builder("abc").build());
  }

  private void doGetClanBattles(String url, String auth, ClanBattlesRequest clanBattlesRequest) {
    assertTrue(new Api(url, auth).getClanBattles(clanBattlesRequest).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetClanBattlesBecauseWrongAuth() throws IOException {
    doGetClanBattles(URL, "abc", ClanBattlesRequest.builder("abc").build());
  }

  @Test
  public void shouldGetClanHistoryWithAuth() throws IOException {
    doGetClanHistory(URL, AUTH, ClanHistoryRequest.builder("abc").build());
  }

  private void doGetClanHistory(String url, String auth, ClanHistoryRequest clanHistoryRequest) {
    assertTrue(new Api(url, auth).getClanHistory(clanHistoryRequest).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetClanHistoryBecauseWrongAuth() throws IOException {
    doGetClanHistory(URL, "abc", ClanHistoryRequest.builder("abc").build());
  }

  @Test
  public void shouldGetClanWeeklyHistoryWithAuth() throws IOException {
    doGetClanWeeklyHistory(URL, AUTH, ClanWeeklyHistoryRequest.builder("abc").build());
  }

  private void doGetClanWeeklyHistory(String url, String auth, ClanWeeklyHistoryRequest clanWeeklyHistoryRequest) {
    assertTrue(new Api(url, auth).getClanWeeklyHistory(clanWeeklyHistoryRequest).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetClanWeeklyHistoryBecauseWrongAuth() throws IOException {
    doGetClanWeeklyHistory(URL, "abc", ClanWeeklyHistoryRequest.builder("abc").build());
  }

  @Test
  public void shouldGetOpenTournamentsWithAuth() throws IOException {
    doGetOpenTournaments(URL, AUTH, OpenTournamentsRequest.builder().build());
  }

  private void doGetOpenTournaments(String url, String auth, OpenTournamentsRequest openTournamentsRequest) {
    assertTrue(new Api(url, auth).getOpenTournaments(openTournamentsRequest).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetOpenTournamentsBecauseWrongAuth() throws IOException {
    doGetOpenTournaments(URL, "abc", OpenTournamentsRequest.builder().build());
  }

  @Test
  public void shouldGetKnownTournamentsWithAuth() throws IOException {
    doGetKnownTournaments(URL, AUTH, KnownTournamentsRequest.builder().build());
  }

  private void doGetKnownTournaments(String url, String auth, KnownTournamentsRequest knownTournamentsRequest) {
    assertTrue(new Api(url, auth).getKnownTournaments(knownTournamentsRequest).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetKnownTournamentsBecauseWrongAuth() throws IOException {
    doGetKnownTournaments(URL, "abc", KnownTournamentsRequest.builder().build());
  }

  @Test
  public void shouldGetTournamentSearchWithAuth() throws IOException {
    doGetTournamentSearch(URL, AUTH, TournamentSearchRequest.builder("abc").build());
  }

  private void doGetTournamentSearch(String url, String auth, TournamentSearchRequest tournamentSearchRequest) {
    assertTrue(new Api(url, auth).getTournamentSearch(tournamentSearchRequest).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetTournamentSearchBecauseWrongAuth() throws IOException {
    doGetTournamentSearch(URL, "abc", TournamentSearchRequest.builder("abc").build());
  }

  @Test
  public void shouldGetPlayerBattlesWithAuth() throws IOException {
    doGetPlayerBattles(URL, AUTH, PlayerBattlesRequest.builder(createProfileTags().subList(0, 1))
        .build());
  }

  private void doGetPlayerBattles(String url, String auth, PlayerBattlesRequest playerBattlesRequest) {
    assertTrue(new Api(url, auth).getPlayerBattles(playerBattlesRequest).size() > 0);
  }

  @Test(expected = ApiException.class)
  public void failGetPlayerBattlesBecauseWrongAuth() throws IOException {
    doGetPlayerBattles(URL, "abc", PlayerBattlesRequest.builder(createProfileTags().subList(0, 1))
        .build());
  }

  @Test
  public void shouldGetMultiPlayerBattlesWithAuth() throws IOException {
    doGetPlayerBattles(URL, AUTH, PlayerBattlesRequest.builder(createProfileTags()).build());
  }

  @Test(expected = ApiException.class)
  public void failGetMultiPlayerBattlesBecauseWrongAuth() throws IOException {
    doGetPlayerBattles(URL, "abc", PlayerBattlesRequest.builder(createProfileTags()).build());
  }

  @Test
  public void shouldGetPlayerChestsWithAuth() throws IOException {
    doGetPlayerChests(URL, AUTH, PlayerChestsRequest.builder(createProfileTags().subList(0, 1))
        .build());
  }

  private void doGetPlayerChests(String url, String auth, PlayerChestsRequest playerChestsRequest) {
    assertNotNull(new Api(url, auth).getPlayerChests(playerChestsRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetPlayerChestsBecauseWrongAuth() throws IOException {
    doGetPlayerChests(URL, "abc", PlayerChestsRequest.builder(createProfileTags().subList(0, 1))
        .build());
  }

  @Test
  public void shouldGetMultiPlayerChestsWithAuth() throws IOException {
    doGetPlayerChests(URL, AUTH, PlayerChestsRequest.builder(createProfileTags()).build());
  }

  @Test(expected = ApiException.class)
  public void failGetMultiPlayerChestsBecauseWrongAuth() throws IOException {
    doGetPlayerChests(URL, "abc", PlayerChestsRequest.builder(createProfileTags()).build());
  }

  @Test
  public void shouldGetPopularDecksWithAuth() throws IOException {
    doGetPopularDecks(URL, AUTH, PopularDecksRequest.builder().build());
  }

  private void doGetPopularDecks(String url, String auth, PopularDecksRequest popularDecksRequest) {
    assertNotNull(new Api(url, auth).getPopularDecks(popularDecksRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetPopularDecksBecauseWrongAuth() throws IOException {
    doGetPopularDecks(URL, "abc", PopularDecksRequest.builder().build());
  }

  @Test
  public void shouldGetClanTrackingWithAuth() throws IOException {
    doGetClanTracking(URL, AUTH, ClanTrackingRequest.builder("abc").build());
  }

  private void doGetClanTracking(String url, String auth, ClanTrackingRequest clanTrackingRequest) {
    assertNotNull(new Api(url, auth).getClanTracking(clanTrackingRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetClanTrackingBecauseWrongAuth() throws IOException {
    doGetClanTracking(URL, "abc", ClanTrackingRequest.builder("abc").build());
  }

  @Test
  public void shouldGetClanWarLogWithAuth() throws IOException {
    doGetClanWarLog(URL, AUTH, ClanWarLogRequest.builder("abc").build());
  }

  private void doGetClanWarLog(String url, String auth, ClanWarLogRequest clanWarLogRequest) {
    assertNotNull(new Api(url, auth).getClanWarLog(clanWarLogRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetClanWarLogBecauseWrongAuth() throws IOException {
    doGetClanWarLog(URL, "abc", ClanWarLogRequest.builder("abc").build());
  }

  @Test
  public void shouldGetClanWarWithAuth() throws IOException {
    doGetClanWar(URL, AUTH, ClanWarRequest.builder("abc").build());
  }

  private void doGetClanWar(String url, String auth, ClanWarRequest clanWarRequest) {
    assertNotNull(new Api(url, auth).getClanWar(clanWarRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetClanWarBecauseWrongAuth() throws IOException {
    doGetClanWar(URL, "abc", ClanWarRequest.builder("abc").build());
  }

  @Test
  public void shouldGetOneKTournaments() throws IOException {
    doGetOneKTournaments(URL, AUTH, OneKTournamentsRequest.builder().build());
  }

  private void doGetOneKTournaments(String url, String auth, OneKTournamentsRequest oneKTournamentsRequest) {
    assertNotNull(new Api(url, auth).getOneKTournaments(oneKTournamentsRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetOneKTournamentsBecauseWrongAuth() throws IOException {
    doGetOneKTournaments(URL, "abc", OneKTournamentsRequest.builder().build());
  }

  @Test
  public void shouldGetFullTournaments() throws IOException {
    doGetFullTournaments(URL, AUTH, FullTournamentsRequest.builder().build());
  }

  private void doGetFullTournaments(String url, String auth, FullTournamentsRequest fullTournamentsRequest) {
    assertNotNull(new Api(url, auth).getFullTournaments(fullTournamentsRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetFullTournamentsBecauseWrongAuth() throws IOException {
    doGetFullTournaments(URL, "abc", FullTournamentsRequest.builder().build());
  }

  @Test
  public void shouldGetInPreparationTournaments() throws IOException {
    doGetInPreparationTournaments(URL, AUTH, InPreparationTournamentsRequest.builder().build());
  }

  private void doGetInPreparationTournaments(String url, String auth,
                                             InPreparationTournamentsRequest inPreparationTournamentsRequest) {
    assertNotNull(new Api(url, auth).getInPreparationTournaments(inPreparationTournamentsRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetInPreparationTournamentsBecauseWrongAuth() throws IOException {
    doGetInPreparationTournaments(URL, "abc", InPreparationTournamentsRequest.builder().build());
  }

  @Test
  public void shouldGetJoinableTournaments() throws IOException {
    doGetJoinableTournaments(URL, AUTH, JoinableTournamentsRequest.builder().build());
  }

  private void doGetJoinableTournaments(String url, String auth,
                                        JoinableTournamentsRequest inPreparationTournamentsRequest) {
    assertNotNull(new Api(url, auth).getJoinableTournaments(inPreparationTournamentsRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetJoinableTournamentsBecauseWrongAuth() throws IOException {
    doGetJoinableTournaments(URL, "abc", JoinableTournamentsRequest.builder().build());
  }

  @Test
  public void shouldGetTopWars() throws IOException {
    doGetTopWars(URL, AUTH, TopWarsRequest.builder().build());
  }

  private void doGetTopWars(String url, String auth, TopWarsRequest topWarsRequest) {
    assertNotNull(new Api(url, auth).getTopWars(topWarsRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetTopWarsBecauseWrongAuth() throws IOException {
    doGetTopWars(URL, "abc", TopWarsRequest.builder().build());
  }

  @Test
  public void shouldGetConstants() throws IOException {
    doGetConstants(URL, AUTH, ConstantsRequest.builder().build());
  }

  private void doGetConstants(String url, String auth, ConstantsRequest ConstantsRequest) {
    assertNotNull(new Api(url, auth).getConstants(ConstantsRequest));
  }

  @Test(expected = ApiException.class)
  public void failGetConstantsBecauseWrongAuth() throws IOException {
    doGetConstants(URL, "abc", ConstantsRequest.builder().build());
  }

}
