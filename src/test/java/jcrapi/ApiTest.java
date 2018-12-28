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

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.lang.ObjectUtils;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;

import java.util.ArrayList;
import java.util.List;
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
import jcrapi.request.TopClansRequest;
import jcrapi.request.TopPlayersRequest;
import jcrapi.request.TopWarsRequest;
import jcrapi.request.TournamentSearchRequest;
import jcrapi.request.TournamentsRequest;

/**
 * @author Michael Lieshoff
 */
public class ApiTest {

  private Client client;

  private Api api;

  private CrawlerException crawlerException;

  @Before
  public void setUp() {
    ClientFactory clientFactory = mock(ClientFactory.class);
    client = mock(Client.class);
    when(clientFactory.createClient("lala", "abc", AuthMode.NORMAL)).thenReturn(client);
    api = new Api("lala", "abc", clientFactory, AuthMode.NORMAL);
    crawlerException = mock(CrawlerException.class);
    when(crawlerException.getStatusCode()).thenReturn(400);
  }

  @Test(expected = NullPointerException.class)
  public void failCreateBecauseNullUrl() {
    new Api(null, "abc");
  }

  @Test(expected = IllegalArgumentException.class)
  public void failCreateBecauseEmptyUrl() {
    new Api("", "abc");
  }

  @Test(expected = NullPointerException.class)
  public void failCreateBecauseNullDeveloperKey() {
    new Api("url", null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void failCreateBecauseEmptyDeveloperKey() {
    new Api("url", "");
  }

  @Test
  public void shouldGetVersion() throws Exception {
    when(client.getVersion()).thenReturn("1.0");
    assertEquals("1.0", api.getVersion());
  }

  @Test
  public void failGetVersion() throws Exception {
    when(client.getVersion()).thenThrow(crawlerException);
    try {
      api.getVersion();
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test(expected = NullPointerException.class)
  public void failGetProfileBecauseNullRequest() throws Exception {
    api.getProfile(null);
  }

  @Test
  public void shouldGetProfile() throws Exception {
    Profile profile = new Profile();
    ProfileRequest profileRequest = ProfileRequest.builder("abc").build();
    when(client.getProfile(profileRequest)).thenReturn(profile);
    assertEquals(profile, api.getProfile(profileRequest));
  }

  @Test
  public void failGetProfile() throws Exception {
    ProfileRequest profileRequest = ProfileRequest.builder("abc").build();
    when(client.getProfile(profileRequest)).thenThrow(crawlerException);
    try {
      api.getProfile(profileRequest);
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  private List<String> createTags() {
    List<String> tags = new ArrayList<>();
    tags.add("abc");
    return tags;
  }

  @Test(expected = NullPointerException.class)
  public void failGetProfilesBecauseNullRequest() throws Exception {
    api.getProfiles(null);
  }

  @Test
  public void shouldGetProfiles() throws Exception {
    List<Profile> profiles = new ArrayList<>();
    ProfilesRequest profilesRequest = ProfilesRequest.builder(asList("abc")).build();
    when(client.getProfiles(profilesRequest)).thenReturn(profiles);
    assertEquals(profiles, api.getProfiles(profilesRequest));
  }

  @Test
  public void failGetProfiles() throws Exception {
    ProfilesRequest profilesRequest = ProfilesRequest.builder(asList("abc")).build();
    when(client.getProfiles(profilesRequest)).thenThrow(crawlerException);
    try {
      api.getProfiles(profilesRequest);
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetTopClansWithLocation() throws Exception {
    TopClansRequest topClansRequest = TopClansRequest.builder()
        .locationKey("EU")
        .build();
    List<TopClan> topClans = new ArrayList<>();
    when(client.getTopClans(topClansRequest)).thenReturn(topClans);
    assertSame(topClans, api.getTopClans(topClansRequest));
  }

  @Test
  public void failGetTopClansWithLocation() throws Exception {
    TopClansRequest topClansRequest = TopClansRequest.builder()
        .locationKey("EU")
        .build();
    when(client.getTopClans(topClansRequest)).thenThrow(crawlerException);
    try {
      api.getTopClans(topClansRequest);
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test(expected = NullPointerException.class)
  public void failGetClanBecauseNullRequest() throws Exception {
    api.getClan(null);
  }

  @Test
  public void shouldGetClan() throws Exception {
    Clan clan = new Clan();
    ClanRequest clanRequest = ClanRequest.builder("abc").build();
    when(client.getClan(clanRequest)).thenReturn(clan);
    assertEquals(clan, api.getClan(clanRequest));
  }

  @Test
  public void failGetClan() throws Exception {
    ClanRequest clanRequest = ClanRequest.builder("abc").build();
    when(client.getClan(clanRequest)).thenThrow(crawlerException);
    try {
      api.getClan(clanRequest);
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetClans() throws Exception {
    List<Clan> clans = new ArrayList<>();
    ClansRequest clansRequest = ClansRequest.builder(asList("abc", "xyz")).build();
    when(client.getClans(clansRequest)).thenReturn(clans);
    assertEquals(clans, api.getClans(clansRequest));
  }

  @Test
  public void failGetClans() throws Exception {
    ClansRequest clansRequest = ClansRequest.builder(asList("abc", "xyz")).build();
    when(client.getClans(clansRequest)).thenThrow(crawlerException);
    try {
      api.getClans(clansRequest);
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetClanSearch() throws Exception {
    List<Clan> clans = new ArrayList<>();
    ClanSearchRequest clanSearchRequest = createClanSearchRequest();
    when(client.getClanSearch(clanSearchRequest)).thenReturn(clans);
    assertEquals(clans, api.getClanSearch(clanSearchRequest));
  }

  private ClanSearchRequest createClanSearchRequest() {
    return ClanSearchRequest.builder().score(50).build();
  }

  @Test
  public void failGetClanSearch() throws Exception {
    when(client.getClanSearch(argThat(getClanSearchArgumentMatcher()))).thenThrow(crawlerException);
    try {
      api.getClanSearch(createClanSearchRequest());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  private Matcher<ClanSearchRequest> getClanSearchArgumentMatcher() {
    return new ArgumentMatcher<ClanSearchRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof ClanSearchRequest;
      }
    };
  }

  @Test
  public void shouldGetClanSearchWithParams() throws Exception {
    List<Clan> clans = new ArrayList<>();
    when(client.getClanSearch(argThat(getClanSearchArgumentMatcher()))).thenReturn(clans);
    assertEquals(clans, api.getClanSearch(createClanSearchRequest()));
  }

  @Test
  public void failGetClanSearchWithParams() throws Exception {
    when(client.getClanSearch(argThat(getClanSearchArgumentMatcher()))).thenThrow(crawlerException);
    try {
      api.getClanSearch(createClanSearchRequest());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetTopPlayersWithRequest() throws Exception {
    List<TopPlayer> topPlayers = new ArrayList<>();
    when(client.getTopPlayers(argThat(getTopPlayersRequestArgumentMatcher(null)))).thenReturn(topPlayers);
    assertSame(topPlayers, api.getTopPlayers(TopPlayersRequest.builder().build()));
  }

  private Matcher<TopPlayersRequest> getTopPlayersRequestArgumentMatcher(final String locationKey) {
    return new ArgumentMatcher<TopPlayersRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof TopPlayersRequest && ObjectUtils
            .equals(((TopPlayersRequest) o).getLocationKey(), locationKey);
      }
    };
  }

  @Test
  public void failGetTopPlayersWithRequest() throws Exception {
    when(client.getTopPlayers(argThat(getTopPlayersRequestArgumentMatcher(null)))).thenThrow(crawlerException);
    try {
      api.getTopPlayers(TopPlayersRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  private Matcher<TournamentsRequest> getTournamentsRequestArgumentMatcher(final String locationKey) {
    return new ArgumentMatcher<TournamentsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof TournamentsRequest && ((TournamentsRequest) o).getTag().equals(locationKey);
      }
    };
  }

  @Test(expected = NullPointerException.class)
  public void failGetTournamentsBecauseNullTag() throws Exception {
    api.getTournaments(null);
  }

  @Test
  public void failGetTournaments() throws Exception {
    when(client.getTournaments(argThat(getTournamentsRequestArgumentMatcher("abc")))).thenThrow(crawlerException);
    try {
      api.getTournaments(TournamentsRequest.builder("abc").build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetEndpoints() throws Exception {
    Endpoints endpoints = new Endpoints();
    when(client.getEndpoints()).thenReturn(endpoints);
    assertEquals(endpoints, api.getEndpoints());
  }

  @Test
  public void failGetEndpoints() throws Exception {
    when(client.getEndpoints()).thenThrow(crawlerException);
    try {
      api.getEndpoints();
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetPopularClans() throws Exception {
    PopularClansRequest popularClansRequest = PopularClansRequest.builder().build();
    List<PopularClan> popularClans = new ArrayList<>();
    when(client.getPopularClans(popularClansRequest)).thenReturn(popularClans);
    assertSame(popularClans, api.getPopularClans(popularClansRequest));
  }

  @Test
  public void failGetPopularClans() throws Exception {
    PopularClansRequest popularClansRequest = PopularClansRequest.builder().build();
    when(client.getPopularClans(popularClansRequest)).thenThrow(crawlerException);
    try {
      api.getPopularClans(popularClansRequest);
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetPopularPlayers() throws Exception {
    PopularPlayersRequest popularPlayersRequest = PopularPlayersRequest.builder().build();
    List<PopularPlayer> popularPlayers = new ArrayList<>();
    when(client.getPopularPlayers(popularPlayersRequest)).thenReturn(popularPlayers);
    assertSame(popularPlayers, api.getPopularPlayers(popularPlayersRequest));
  }

  @Test
  public void failGetPopularPlayers() throws Exception {
    PopularPlayersRequest popularPlayersRequest = PopularPlayersRequest.builder().build();
    when(client.getPopularPlayers(popularPlayersRequest)).thenThrow(crawlerException);
    try {
      api.getPopularPlayers(popularPlayersRequest);
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetPopularTournaments() throws Exception {
    PopularTournamentsRequest popularTournamentsRequest = PopularTournamentsRequest.builder().build();
    List<PopularTournament> popularTournaments = new ArrayList<>();
    when(client.getPopularTournaments(popularTournamentsRequest)).thenReturn(popularTournaments);
    assertSame(popularTournaments, api.getPopularTournaments(popularTournamentsRequest));
  }

  @Test
  public void failGetPopularTournaments() throws Exception {
    PopularTournamentsRequest popularTournamentsRequest = PopularTournamentsRequest.builder().build();
    when(client.getPopularTournaments(popularTournamentsRequest)).thenThrow(crawlerException);
    try {
      api.getPopularTournaments(popularTournamentsRequest);
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetClanBattles() throws Exception {
    List<Battle> battles = new ArrayList<>();
    when(client.getClanBattles(argThat(getClanBattlesRequestArgumentMatcher("abc")))).thenReturn(battles);
    assertSame(battles, api.getClanBattles(ClanBattlesRequest.builder("abc").build()));
  }

  private Matcher<ClanBattlesRequest> getClanBattlesRequestArgumentMatcher(final String tag) {
    return new ArgumentMatcher<ClanBattlesRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof ClanBattlesRequest && ((ClanBattlesRequest) o).getTag().equals(tag);
      }
    };
  }

  @Test
  public void failGetClanBattles() throws Exception {
    when(client.getClanBattles(argThat(getClanBattlesRequestArgumentMatcher("abc")))).thenThrow(crawlerException);
    try {
      api.getClanBattles(ClanBattlesRequest.builder("abc").build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetClanHistory() throws Exception {
    ClanHistory clanHistory = new ClanHistory();
    when(client.getClanHistory(argThat(getClanHistoryRequestArgumentMatcher("abc")))).thenReturn(clanHistory);
    assertSame(clanHistory, api.getClanHistory(ClanHistoryRequest.builder("abc").build()));
  }

  private Matcher<ClanHistoryRequest> getClanHistoryRequestArgumentMatcher(final String tag) {
    return new ArgumentMatcher<ClanHistoryRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof ClanHistoryRequest && ((ClanHistoryRequest) o).getTag().equals(tag);
      }
    };
  }

  @Test
  public void failGetClanHistory() throws Exception {
    when(client.getClanHistory(argThat(getClanHistoryRequestArgumentMatcher("abc")))).thenThrow(crawlerException);
    try {
      api.getClanHistory(ClanHistoryRequest.builder("abc").build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetClanWeeklyHistory() throws Exception {
    ClanWeeklyHistory clanWeeklyHistory = new ClanWeeklyHistory();
    when(client.getClanWeeklyHistory(argThat(getClanWeeklyHistoryRequestArgumentMatcher("abc"))))
        .thenReturn(clanWeeklyHistory);
    assertSame(clanWeeklyHistory, api.getClanWeeklyHistory(ClanWeeklyHistoryRequest.builder("abc").build()));
  }

  private Matcher<ClanWeeklyHistoryRequest> getClanWeeklyHistoryRequestArgumentMatcher(final String tag) {
    return new ArgumentMatcher<ClanWeeklyHistoryRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof ClanWeeklyHistoryRequest && ((ClanWeeklyHistoryRequest) o).getTag().equals(tag);
      }
    };
  }

  @Test
  public void failGetClanWeeklyHistory() throws Exception {
    when(client.getClanWeeklyHistory(argThat(getClanWeeklyHistoryRequestArgumentMatcher("abc"))))
        .thenThrow(crawlerException);
    try {
      api.getClanWeeklyHistory(ClanWeeklyHistoryRequest.builder("abc").build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetOpenTournaments() throws Exception {
    List<OpenTournament> openTournaments = new ArrayList<>();
    when(client.getOpenTournaments(argThat(getOpenTournamentsRequestArgumentMatcher()))).thenReturn(openTournaments);
    assertSame(openTournaments, api.getOpenTournaments(OpenTournamentsRequest.builder().build()));
  }

  private Matcher<OpenTournamentsRequest> getOpenTournamentsRequestArgumentMatcher() {
    return new ArgumentMatcher<OpenTournamentsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof OpenTournamentsRequest;
      }
    };
  }

  @Test
  public void failGetOpenTournaments() throws Exception {
    when(client.getOpenTournaments(argThat(getOpenTournamentsRequestArgumentMatcher()))).thenThrow(crawlerException);
    try {
      api.getOpenTournaments(OpenTournamentsRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetKnownTournaments() throws Exception {
    List<KnownTournament> KnownTournaments = new ArrayList<>();
    when(client.getKnownTournaments(argThat(getKnownTournamentsRequestArgumentMatcher()))).thenReturn(KnownTournaments);
    assertSame(KnownTournaments, api.getKnownTournaments(KnownTournamentsRequest.builder().build()));
  }

  private Matcher<KnownTournamentsRequest> getKnownTournamentsRequestArgumentMatcher() {
    return new ArgumentMatcher<KnownTournamentsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof KnownTournamentsRequest;
      }
    };
  }

  @Test
  public void failGetKnownTournaments() throws Exception {
    when(client.getKnownTournaments(argThat(getKnownTournamentsRequestArgumentMatcher()))).thenThrow(crawlerException);
    try {
      api.getKnownTournaments(KnownTournamentsRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetTournamentSearch() throws Exception {
    List<SearchedTournament> searchedTournaments = new ArrayList<>();
    when(client.getTournamentSearch(argThat(getTournamentSearchRequestArgumentMatcher())))
        .thenReturn(searchedTournaments);
    assertSame(searchedTournaments, api.getTournamentSearch(TournamentSearchRequest.builder("abc").build()));
  }

  private Matcher<TournamentSearchRequest> getTournamentSearchRequestArgumentMatcher() {
    return new ArgumentMatcher<TournamentSearchRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof TournamentSearchRequest;
      }
    };
  }

  @Test
  public void failGetTournamentSearch() throws Exception {
    when(client.getTournamentSearch(argThat(getTournamentSearchRequestArgumentMatcher()))).thenThrow(crawlerException);
    try {
      api.getTournamentSearch(TournamentSearchRequest.builder("abc").build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetPlayerBattles() throws Exception {
    List<String> tags = createTags();
    List<List<Battle>> playerBattles = new ArrayList<>();
    when(client.getPlayerBattles(argThat(getPlayerBattlesRequestArgumentMatcher(tags)))).thenReturn(playerBattles);
    assertSame(playerBattles, api.getPlayerBattles(PlayerBattlesRequest.builder(tags).build()));
  }

  private Matcher<PlayerBattlesRequest> getPlayerBattlesRequestArgumentMatcher(final List<String> tags) {
    return new ArgumentMatcher<PlayerBattlesRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof PlayerBattlesRequest && ((PlayerBattlesRequest) o).getTags().equals(tags);
      }
    };
  }

  @Test
  public void failGetPlayerBattles() throws Exception {
    List<String> tags = createTags();
    when(client.getPlayerBattles(argThat(getPlayerBattlesRequestArgumentMatcher(tags)))).thenThrow(
        crawlerException);
    try {
      api.getPlayerBattles(PlayerBattlesRequest.builder(tags).build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetPlayerChests() throws Exception {
    List<String> tags = createTags();
    List<ChestCycle> chestCycles = new ArrayList<>();
    when(client.getPlayerChests(argThat(getPlayerChestsRequestArgumentMatcher(tags)))).thenReturn(chestCycles);
    assertSame(chestCycles, api.getPlayerChests(PlayerChestsRequest.builder(tags).build()));
  }

  private Matcher<PlayerChestsRequest> getPlayerChestsRequestArgumentMatcher(final List<String> tags) {
    return new ArgumentMatcher<PlayerChestsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof PlayerChestsRequest && ((PlayerChestsRequest) o).getTags().equals(tags);
      }
    };
  }

  @Test
  public void failGetPlayerChests() throws Exception {
    List<String> tags = createTags();
    when(client.getPlayerChests(argThat(getPlayerChestsRequestArgumentMatcher(tags)))).thenThrow(
        crawlerException);
    try {
      api.getPlayerChests(PlayerChestsRequest.builder(tags).build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetPopularDecks() throws Exception {
    List<PopularDeck> popularDecks = new ArrayList<>();
    when(client.getPopularDecks(argThat(getPopularDecksRequestArgumentMatcher()))).thenReturn(popularDecks);
    assertSame(popularDecks, api.getPopularDecks(PopularDecksRequest.builder().build()));
  }

  private Matcher<PopularDecksRequest> getPopularDecksRequestArgumentMatcher() {
    return new ArgumentMatcher<PopularDecksRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof PopularDecksRequest;
      }
    };
  }

  @Test
  public void failGetPopularDecks() throws Exception {
    when(client.getPopularDecks(argThat(getPopularDecksRequestArgumentMatcher()))).thenThrow(
        crawlerException);
    try {
      api.getPopularDecks(PopularDecksRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetClanTracking() throws Exception {
    ClanTracking clanTracking = new ClanTracking();
    when(client.getClanTracking(argThat(getClanTrackingRequestArgumentMatcher()))).thenReturn(clanTracking);
    assertSame(clanTracking, api.getClanTracking(ClanTrackingRequest.builder("abc").build()));
  }

  private Matcher<ClanTrackingRequest> getClanTrackingRequestArgumentMatcher() {
    return new ArgumentMatcher<ClanTrackingRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof ClanTrackingRequest;
      }
    };
  }

  @Test
  public void failGetClanTracking() throws Exception {
    when(client.getClanTracking(argThat(getClanTrackingRequestArgumentMatcher()))).thenThrow(
        crawlerException);
    try {
      api.getClanTracking(ClanTrackingRequest.builder("abc").build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetClanWarLog() throws Exception {
    List<ClanWarLog> clanWarLogs = new ArrayList<>();
    when(client.getClanWarLog(argThat(getClanWarLogRequestArgumentMatcher()))).thenReturn(clanWarLogs);
    assertSame(clanWarLogs, api.getClanWarLog(ClanWarLogRequest.builder("abc").build()));
  }

  private Matcher<ClanWarLogRequest> getClanWarLogRequestArgumentMatcher() {
    return new ArgumentMatcher<ClanWarLogRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof ClanWarLogRequest;
      }
    };
  }

  @Test
  public void failGetClanWarLog() throws Exception {
    when(client.getClanWarLog(argThat(getClanWarLogRequestArgumentMatcher()))).thenThrow(
        crawlerException);
    try {
      api.getClanWarLog(ClanWarLogRequest.builder("abc").build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetClanWar() throws Exception {
    ClanWar clanWar = new ClanWar();
    when(client.getClanWar(argThat(getClanWarRequestArgumentMatcher()))).thenReturn(clanWar);
    assertSame(clanWar, api.getClanWar(ClanWarRequest.builder("abc").build()));
  }

  private Matcher<ClanWarRequest> getClanWarRequestArgumentMatcher() {
    return new ArgumentMatcher<ClanWarRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof ClanWarRequest;
      }
    };
  }

  @Test
  public void failGetClanWar() throws Exception {
    when(client.getClanWar(argThat(getClanWarRequestArgumentMatcher()))).thenThrow(crawlerException);
    try {
      api.getClanWar(ClanWarRequest.builder("abc").build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetAuthStats() throws Exception {
    AuthStats authStats = new AuthStats();
    when(client.getAuthStats(argThat(getAuthStatsRequestArgumentMatcher()))).thenReturn(authStats);
    assertSame(authStats, api.getAuthStats(AuthStatsRequest.builder().build()));
  }

  private Matcher<AuthStatsRequest> getAuthStatsRequestArgumentMatcher() {
    return new ArgumentMatcher<AuthStatsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof AuthStatsRequest;
      }
    };
  }

  @Test
  public void failGetAuthStats() throws Exception {
    when(client.getAuthStats(argThat(getAuthStatsRequestArgumentMatcher()))).thenThrow(
        crawlerException);
    try {
      api.getAuthStats(AuthStatsRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetLastResponse() throws Exception {
    Response response = new Response();
    when(client.getLastResponse()).thenReturn(response);
    assertEquals(response, api.getLastResponse());
  }

  @Test
  public void shouldGetOneKTournaments() throws Exception {
    List<OneKTournament> oneKTournaments = new ArrayList<>();
    when(client.getOneKTournaments(argThat(getOneKTournamentsRequestArgumentMatcher()))).thenReturn(oneKTournaments);
    assertSame(oneKTournaments, api.getOneKTournaments(OneKTournamentsRequest.builder().build()));
  }

  private Matcher<OneKTournamentsRequest> getOneKTournamentsRequestArgumentMatcher() {
    return new ArgumentMatcher<OneKTournamentsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof OneKTournamentsRequest;
      }
    };
  }

  @Test
  public void failGetOneKTournaments() throws Exception {
    when(client.getOneKTournaments(argThat(getOneKTournamentsRequestArgumentMatcher()))).thenThrow(crawlerException);
    try {
      api.getOneKTournaments(OneKTournamentsRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetFullTournaments() throws Exception {
    List<FullTournament> oneKTournaments = new ArrayList<>();
    when(client.getFullTournaments(argThat(getFullTournamentsRequestArgumentMatcher()))).thenReturn(oneKTournaments);
    assertSame(oneKTournaments, api.getFullTournaments(FullTournamentsRequest.builder().build()));
  }

  private Matcher<FullTournamentsRequest> getFullTournamentsRequestArgumentMatcher() {
    return new ArgumentMatcher<FullTournamentsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof FullTournamentsRequest;
      }
    };
  }

  @Test
  public void failGetFullTournaments() throws Exception {
    when(client.getFullTournaments(argThat(getFullTournamentsRequestArgumentMatcher()))).thenThrow(crawlerException);
    try {
      api.getFullTournaments(FullTournamentsRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetInPreparationTournaments() throws Exception {
    List<InPreparationTournament> oneKTournaments = new ArrayList<>();
    when(client.getInPreparationTournaments(argThat(getInPreparationTournamentsRequestArgumentMatcher())))
        .thenReturn(oneKTournaments);
    assertSame(oneKTournaments, api.getInPreparationTournaments(InPreparationTournamentsRequest.builder().build()));
  }

  private Matcher<InPreparationTournamentsRequest> getInPreparationTournamentsRequestArgumentMatcher() {
    return new ArgumentMatcher<InPreparationTournamentsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof InPreparationTournamentsRequest;
      }
    };
  }

  @Test
  public void failGetInPreparationTournaments() throws Exception {
    when(client.getInPreparationTournaments(argThat(getInPreparationTournamentsRequestArgumentMatcher())))
        .thenThrow(crawlerException);
    try {
      api.getInPreparationTournaments(InPreparationTournamentsRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetJoinableTournaments() throws Exception {
    List<JoinableTournament> oneKTournaments = new ArrayList<>();
    when(client.getJoinableTournaments(argThat(getJoinableTournamentsRequestArgumentMatcher())))
        .thenReturn(oneKTournaments);
    assertSame(oneKTournaments, api.getJoinableTournaments(JoinableTournamentsRequest.builder().build()));
  }

  private Matcher<JoinableTournamentsRequest> getJoinableTournamentsRequestArgumentMatcher() {
    return new ArgumentMatcher<JoinableTournamentsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof JoinableTournamentsRequest;
      }
    };
  }

  @Test
  public void failGetJoinableTournaments() throws Exception {
    when(client.getJoinableTournaments(argThat(getJoinableTournamentsRequestArgumentMatcher())))
        .thenThrow(crawlerException);
    try {
      api.getJoinableTournaments(JoinableTournamentsRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetTopWarsWithRequest() throws Exception {
    List<TopWar> topWars = new ArrayList<>();
    when(client.getTopWars(argThat(getTopWarsRequestArgumentMatcher(null)))).thenReturn(topWars);
    assertSame(topWars, api.getTopWars(TopWarsRequest.builder().build()));
  }

  private Matcher<TopWarsRequest> getTopWarsRequestArgumentMatcher(final String locationKey) {
    return new ArgumentMatcher<TopWarsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof TopWarsRequest && ObjectUtils
            .equals(((TopWarsRequest) o).getLocationKey(), locationKey);
      }
    };
  }

  @Test
  public void failGetTopWarsWithRequest() throws Exception {
    when(client.getTopWars(argThat(getTopWarsRequestArgumentMatcher(null)))).thenThrow(crawlerException);
    try {
      api.getTopWars(TopWarsRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetConstantsWithRequest() throws Exception {
    Constants constants = new Constants();
    when(client.getConstants(argThat(getConstantsRequestArgumentMatcher()))).thenReturn(constants);
    assertSame(constants, api.getConstants(ConstantsRequest.builder().build()));
  }

  private Matcher<ConstantsRequest> getConstantsRequestArgumentMatcher() {
    return new ArgumentMatcher<ConstantsRequest>() {
      @Override
      public boolean matches(Object o) {
        return o instanceof ConstantsRequest;
      }
    };
  }

  @Test
  public void failGetConstantsWithRequest() throws Exception {
    when(client.getConstants(argThat(getConstantsRequestArgumentMatcher()))).thenThrow(crawlerException);
    try {
      api.getConstants(ConstantsRequest.builder().build());
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetStatusWithRequest() throws Exception {
    Status status = new Status();
    when(client.getStatus()).thenReturn(status);
    assertSame(status, api.getStatus());
  }

  @Test
  public void failGetStatusWithRequest() throws Exception {
    when(client.getStatus()).thenThrow(crawlerException);
    try {
      api.getStatus();
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

  @Test
  public void shouldGetHealth() throws Exception {
    when(client.getHealth()).thenReturn("ok");
    assertEquals("ok", api.getHealth());
  }

  @Test
  public void failGetHealth() throws Exception {
    when(client.getHealth()).thenThrow(crawlerException);
    try {
      api.getHealth();
      fail();
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
    }
  }

}
