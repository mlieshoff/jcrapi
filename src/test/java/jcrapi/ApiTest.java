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
import jcrapi.request.ProfileRequest;
import jcrapi.request.ProfilesRequest;
import jcrapi.request.TopClansRequest;
import jcrapi.request.TopPlayersRequest;
import jcrapi.request.TournamentsRequest;
import org.apache.commons.lang.ObjectUtils;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.when;

/**
 * @author Michael Lieshoff
 */
public class ApiTest {

    private Client client;

    private Api api;

    @Before
    public void setUp() {
        ClientFactory clientFactory = Mockito.mock(ClientFactory.class);
        client = Mockito.mock(Client.class);
        when(clientFactory.createClient("lala", "abc")).thenReturn(client);
        api = new Api("lala", "abc", clientFactory);
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
        when(client.getVersion()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getVersion();
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test(expected = NullPointerException.class)
    public void failGetProfileBecauseNullTag() throws Exception {
        api.getProfile((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfileBecauseEmptyTag() throws Exception {
        api.getProfile("");
    }

    @Test
    public void shouldGetProfile() throws Exception {
        Profile profile = new Profile();
        when(client.getProfile(argThat(getProfileArgumentMatcher()))).thenReturn(profile);
        assertEquals(profile, api.getProfile("abc"));
    }

    private Matcher<ProfileRequest> getProfileArgumentMatcher() {
        return new ArgumentMatcher<ProfileRequest>() {
            @Override
            public boolean matches(Object o) {
                return o instanceof ProfileRequest && ((ProfileRequest) o).getTag().equals("abc");
            }
        };
    }

    @Test
    public void failGetProfile() throws Exception {
        when(client.getProfile(argThat(getProfileArgumentMatcher()))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getProfile("abc");
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test(expected = NullPointerException.class)
    public void failGetProfileBecauseNullRequest() throws Exception {
        api.getProfile((ProfileRequest) null);
    }

    @Test
    public void shouldGetProfileFromRequest() throws Exception {
        Profile profile = new Profile();
        ProfileRequest profileRequest = ProfileRequest.builder("abc").build();
        when(client.getProfile(profileRequest)).thenReturn(profile);
        assertEquals(profile, api.getProfile(profileRequest));
    }

    @Test
    public void failGetProfileFromRequest() throws Exception {
        ProfileRequest profileRequest = ProfileRequest.builder("abc").build();
        when(client.getProfile(profileRequest)).thenThrow(new IOException("crapi: 400"));
        try {
            api.getProfile(profileRequest);
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfilesBecauseNullTags() throws Exception {
        api.getProfiles((List<String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfilesBecauseEmptyTags() throws Exception {
        api.getProfiles(new ArrayList<String>());
    }

    @Test
    public void shouldGetProfiles() throws Exception {
        List<Profile> profiles = new ArrayList<>();
        List<String> tags = new ArrayList<>();
        tags.add("abc");
        when(client.getProfiles(tags)).thenReturn(profiles);
        assertEquals(profiles, api.getProfiles(tags));
    }

    @Test
    public void failGetProfiles() throws Exception {
        List<String> tags = new ArrayList<>();
        tags.add("abc");
        when(client.getProfiles(argThat(getProfilesArgumentMatcher(tags)))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getProfiles(tags);
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    private ArgumentMatcher<ProfilesRequest> getProfilesArgumentMatcher(final List<String> tags) {
        return new ArgumentMatcher<ProfilesRequest>() {
            @Override
            public boolean matches(Object o) {
                return o instanceof ProfilesRequest && ((ProfilesRequest) o).getTags().equals(tags);
            }
        };
    }

    @Test(expected = NullPointerException.class)
    public void failGetProfilesBecauseNullRequest() throws Exception {
        api.getProfiles((ProfilesRequest) null);
    }

    @Test
    public void shouldGetProfilesFromRequest() throws Exception {
        List<Profile> profiles = new ArrayList<>();
        ProfilesRequest profilesRequest = ProfilesRequest.builder(Arrays.asList("abc"))
                .build();
        when(client.getProfiles(profilesRequest)).thenReturn(profiles);
        assertEquals(profiles, api.getProfiles(profilesRequest));
    }

    @Test
    public void failGetProfilesFromRequest() throws Exception {
        ProfilesRequest profilesRequest = ProfilesRequest.builder(Arrays.asList("abc"))
                .build();
        when(client.getProfiles(profilesRequest)).thenThrow(new IOException("crapi: 400"));
        try {
            api.getProfiles(profilesRequest);
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopClans() throws Exception {
        List<TopClan> topClans = new ArrayList<>();
        when(client.getTopClans(argThat(getTopClansArgumentMatcher(null)))).thenReturn(topClans);
        assertSame(topClans, api.getTopClans());
    }

    private ArgumentMatcher<TopClansRequest> getTopClansArgumentMatcher(final String locationKey) {
        return new ArgumentMatcher<TopClansRequest>() {
            @Override
            public boolean matches(Object o) {
                return o instanceof TopClansRequest
                        && ObjectUtils.equals(((TopClansRequest) o).getLocationKey(), locationKey);
            }
        };
    }

    @Test
    public void failGetTopClans() throws Exception {
        when(client.getTopClans(argThat(getTopClansArgumentMatcher(null)))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopClans();
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopClansWithLocation() throws Exception {
        List<TopClan> topClans = new ArrayList<>();
        when(client.getTopClans(argThat(getTopClansArgumentMatcher("EU")))).thenReturn(topClans);
        assertSame(topClans, api.getTopClans("EU"));
    }

    @Test
    public void failGetTopClansWithLocation() throws Exception {
        when(client.getTopClans(argThat(getTopClansArgumentMatcher("EU")))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopClans("EU");
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopClansFromRequest() throws Exception {
        List<TopClan> topClans = new ArrayList<>();
        when(client.getTopClans(argThat(getTopClansArgumentMatcher(null)))).thenReturn(topClans);
        assertSame(topClans, api.getTopClans());
    }

    @Test
    public void failGetTopClansFromRequest() throws Exception {
        when(client.getTopClans(argThat(getTopClansArgumentMatcher(null)))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopClans();
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopClansWithLocationFromRequest() throws Exception {
        TopClansRequest topClansRequest = TopClansRequest.builder()
                .locationKey("EU")
                .build();
        List<TopClan> topClans = new ArrayList<>();
        when(client.getTopClans(topClansRequest)).thenReturn(topClans);
        assertSame(topClans, api.getTopClans(topClansRequest));
    }

    @Test
    public void failGetTopClansWithLocationFromRequest() throws Exception {
        TopClansRequest topClansRequest = TopClansRequest.builder()
                .locationKey("EU")
                .build();
        when(client.getTopClans(topClansRequest)).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopClans(topClansRequest);
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test(expected = NullPointerException.class)
    public void failGetClanBecauseNullTag() throws Exception {
        api.getClan((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClanBecauseEmptyTag() throws Exception {
        api.getClan("");
    }

    @Test
    public void shouldGetClan() throws Exception {
        Clan clan = new Clan();
        when(client.getClan(argThat(getClanArgumentMatcher("abc")))).thenReturn(clan);
        assertEquals(clan, api.getClan("abc"));
    }

    private ArgumentMatcher<ClanRequest> getClanArgumentMatcher(final String tag) {
        return new ArgumentMatcher<ClanRequest>() {
            @Override
            public boolean matches(Object o) {
                return o instanceof ClanRequest && ((ClanRequest) o).getTag().equals(tag);
            }
        };
    }

    @Test
    public void failGetClan() throws Exception {
        when(client.getClan(argThat(getClanArgumentMatcher("abc")))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClan("abc");
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test(expected = NullPointerException.class)
    public void failGetClanBecauseNullRequest() throws Exception {
        api.getClan((ClanRequest) null);
    }

    @Test
    public void shouldGetClanFromRequest() throws Exception {
        Clan clan = new Clan();
        ClanRequest clanRequest = ClanRequest.builder("abc").build();
        when(client.getClan(clanRequest)).thenReturn(clan);
        assertEquals(clan, api.getClan(clanRequest));
    }

    @Test
    public void failGetClanFromRequest() throws Exception {
        ClanRequest clanRequest = ClanRequest.builder("abc").build();
        when(client.getClan(clanRequest)).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClan(clanRequest);
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClansBecauseNullTags() throws Exception {
        api.getClans(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClansBecauseEmptyTags() throws Exception {
        api.getClans(new ArrayList<String>());
    }

    @Test
    public void shouldGetClans() throws Exception {
        List<Clan> clans = new ArrayList<>();
        List<String> tags = new ArrayList<>();
        tags.add("abc");
        when(client.getClans(tags)).thenReturn(clans);
        assertEquals(clans, api.getClans(tags));
    }

    @Test
    public void failGetClans() throws Exception {
        List<String> tags = new ArrayList<>();
        tags.add("abc");
        when(client.getClans(tags)).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClans(tags);
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetClanSearch() throws Exception {
        List<Clan> clans = new ArrayList<>();
        when(client.getClanSearch((ClanSearch) null)).thenReturn(clans);
        assertEquals(clans, api.getClanSearch());
    }

    @Test
    public void failGetClanSearch() throws Exception {
        when(client.getClanSearch(argThat(getClanSearchArgumentMatcher()))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClanSearch();
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetClanSearchWithParams() throws Exception {
        List<Clan> clans = new ArrayList<>();
        ClanSearch clanSearch = new ClanSearch();
        when(client.getClanSearch(clanSearch)).thenReturn(clans);
        assertEquals(clans, api.getClanSearch(clanSearch));
    }

    @Test
    public void failGetClanSearchWithParams() throws Exception {
        ClanSearch clanSearch = new ClanSearch();
        when(client.getClanSearch(clanSearch)).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClanSearch(clanSearch);
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetClanSearchFromRequest() throws Exception {
        List<Clan> clans = new ArrayList<>();
        when(client.getClanSearch(ClanSearchRequest.builder().build())).thenReturn(clans);
        assertEquals(clans, api.getClanSearch());
    }

    @Test
    public void failGetClanSearchFromRequest() throws Exception {
        when(client.getClanSearch(argThat(getClanSearchArgumentMatcher()))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClanSearch();
            fail();
        } catch(ApiException e) {
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
    public void shouldGetClanSearchWithParamsFromRequest() throws Exception {
        List<Clan> clans = new ArrayList<>();
        when(client.getClanSearch(argThat(getClanSearchArgumentMatcher()))).thenReturn(clans);
        assertEquals(clans, api.getClanSearch(ClanSearchRequest.builder().build()));
    }

    @Test
    public void failGetClanSearchWithParamsFromRequest() throws Exception {
        when(client.getClanSearch(argThat(getClanSearchArgumentMatcher()))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClanSearch(ClanSearchRequest.builder().build());
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopPlayers() throws Exception {
        List<TopPlayer> topPlayers = new ArrayList<>();
        when(client.getTopPlayers(argThat(getTopPlayersRequestArgumentMatcher(null)))).thenReturn(topPlayers);
        assertSame(topPlayers, api.getTopPlayers());
    }

    @Test
    public void failGetTopPlayers() throws Exception {
        when(client.getTopPlayers(argThat(getTopPlayersRequestArgumentMatcher(null)))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopPlayers();
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopPlayersWithLocation() throws Exception {
        List<TopPlayer> topPlayers = new ArrayList<>();
        when(client.getTopPlayers("EU")).thenReturn(topPlayers);
        assertEquals(topPlayers, api.getTopPlayers("EU"));
    }

    @Test
    public void failGetTopPlayersWithLocation() throws Exception {
        when(client.getTopPlayers(argThat(getTopPlayersRequestArgumentMatcher("EU")))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopPlayers("EU");
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopPlayersWithRequest() throws Exception {
        List<TopPlayer> topPlayers = new ArrayList<>();
        when(client.getTopPlayers(argThat(getTopPlayersRequestArgumentMatcher(null)))).thenReturn(topPlayers);
        assertSame(topPlayers, api.getTopPlayers());
    }

    private Matcher<TopPlayersRequest> getTopPlayersRequestArgumentMatcher(final String locationKey) {
        return new ArgumentMatcher<TopPlayersRequest>() {
            @Override
            public boolean matches(Object o) {
                return o instanceof TopPlayersRequest && ObjectUtils.equals(((TopPlayersRequest) o).getLocationKey(), locationKey);
            }
        };
    }

    @Test
    public void failGetTopPlayersWithRequest() throws Exception {
        when(client.getTopPlayers(argThat(getTopPlayersRequestArgumentMatcher(null)))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopPlayers();
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopPlayersWithLocationWithRequest() throws Exception {
        List<TopPlayer> topPlayers = new ArrayList<>();
        when(client.getTopPlayers(argThat(getTopPlayersRequestArgumentMatcher("EU")))).thenReturn(topPlayers);
        assertEquals(topPlayers, api.getTopPlayers("EU"));
    }

    @Test
    public void failGetTopPlayersWithLocationWithRequest() throws Exception {
        when(client.getTopPlayers(argThat(getTopPlayersRequestArgumentMatcher("EU")))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopPlayers("EU");
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTournaments() throws Exception {
        Tournament tournament = new Tournament();
        when(client.getTournaments(argThat(getTournamentsRequestArgumentMatcher("abc")))).thenReturn(tournament);
        assertSame(tournament, api.getTournaments("abc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetTournamentsBecauseEmptyTag() throws Exception {
        api.getTournaments("");
    }

    @Test(expected = NullPointerException.class)
    public void failGetTournamentsBecauseNullTag() throws Exception {
        api.getTournaments((TournamentsRequest) null);
    }

    @Test
    public void failGetTournaments() throws Exception {
        when(client.getTournaments(argThat(getTournamentsRequestArgumentMatcher("abc")))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTournaments("abc");
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTournamentsFromRequest() throws Exception {
        Tournament tournament = new Tournament();
        when(client.getTournaments(argThat(getTournamentsRequestArgumentMatcher("abc")))).thenReturn(tournament);
        assertSame(tournament, api.getTournaments("abc"));
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
    public void failGetTournamentsBecauseNullTagFromRequest() throws Exception {
        api.getTournaments((TournamentsRequest) null);
    }

    @Test
    public void failGetTournamentsFromRequest() throws Exception {
        when(client.getTournaments(argThat(getTournamentsRequestArgumentMatcher("abc")))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTournaments(TournamentsRequest.builder("abc").build());
            fail();
        } catch(ApiException e) {
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
        when(client.getEndpoints()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getEndpoints();
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetPopularClans() throws Exception {
        List<PopularClan> popularClans = new ArrayList<>();
        when(client.getPopularClans()).thenReturn(popularClans);
        assertSame(popularClans, api.getPopularClans());
    }

    @Test
    public void failGetPopularClans() throws Exception {
        when(client.getPopularClans()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getPopularClans();
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetPopularPlayers() throws Exception {
        List<PopularPlayer> popularPlayers = new ArrayList<>();
        when(client.getPopularPlayers()).thenReturn(popularPlayers);
        assertSame(popularPlayers, api.getPopularPlayers());
    }

    @Test
    public void failGetPopularPlayers() throws Exception {
        when(client.getPopularPlayers()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getPopularPlayers();
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetPopularTournaments() throws Exception {
        List<PopularTournament> popularTournaments = new ArrayList<>();
        when(client.getPopularTournaments()).thenReturn(popularTournaments);
        assertSame(popularTournaments, api.getPopularTournaments());
    }

    @Test
    public void failGetPopularTournaments() throws Exception {
        when(client.getPopularTournaments()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getPopularTournaments();
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetClanBattles() throws Exception {
        List<Battle> battles = new ArrayList<>();
        when(client.getClanBattles(argThat(getClanBattlesRequestArgumentMatcher("abc")))).thenReturn(battles);
        assertSame(battles, api.getClanBattles("abc"));
    }

    @Test
    public void failGetClanBattles() throws Exception {
        when(client.getClanBattles(argThat(getClanBattlesRequestArgumentMatcher("abc")))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClanBattles("abc");
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetClanBattlesFromRequest() throws Exception {
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
    public void failGetClanBattlesFromRequest() throws Exception {
        when(client.getClanBattles(argThat(getClanBattlesRequestArgumentMatcher("abc")))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClanBattles(ClanBattlesRequest.builder("abc").build());
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetClanHistory() throws Exception {
        ClanHistory clanHistory = new ClanHistory();
        when(client.getClanHistory(argThat(getClanHistoryRequestArgumentMatcher("abc")))).thenReturn(clanHistory);
        assertSame(clanHistory, api.getClanHistory("abc"));
    }

    @Test
    public void failGetClanHistory() throws Exception {
        when(client.getClanHistory(argThat(getClanHistoryRequestArgumentMatcher("abc")))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClanHistory("abc");
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetClanHistoryFromRequest() throws Exception {
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
    public void failGetClanHistoryFromRequest() throws Exception {
        when(client.getClanHistory(argThat(getClanHistoryRequestArgumentMatcher("abc")))).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClanHistory(ClanHistoryRequest.builder("abc").build());
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

}
