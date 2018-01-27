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

import jcrapi.model.Alliance;
import jcrapi.model.Arena;
import jcrapi.model.Battle;
import jcrapi.model.ChestCycleList;
import jcrapi.model.Clan;
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
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * @author Michael Lieshoff
 */
public class ApiTest {

    private ClientFactory clientFactory;

    private Client client;

    private Api api;

    @Before
    public void setUp() {
        clientFactory = Mockito.mock(ClientFactory.class);
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
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test(expected = NullPointerException.class)
    public void failGetProfileBecauseNullTag() throws Exception {
        api.getProfile(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfileBecauseEmptyTag() throws Exception {
        api.getProfile("");
    }

    @Test
    public void shouldGetProfile() throws Exception {
        Profile profile = new Profile();
        when(client.getProfile("abc")).thenReturn(profile);
        assertEquals(profile, api.getProfile("abc"));
    }

    @Test
    public void failGetProfile() throws Exception {
        when(client.getProfile("abc")).thenThrow(new IOException("crapi: 400"));
        try {
            api.getProfile("abc");
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfilesBecauseNullTags() throws Exception {
        api.getProfiles(null);
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
        when(client.getProfiles(tags)).thenThrow(new IOException("crapi: 400"));
        try {
            api.getProfiles(tags);
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopClans() throws Exception {
        List<TopClan> topClans = new ArrayList<>();
        when(client.getTopClans(null)).thenReturn(topClans);
        assertSame(topClans, api.getTopClans());
    }

    @Test
    public void failGetTopClans() throws Exception {
        when(client.getTopClans(null)).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopClans();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopClansWithLocation() throws Exception {
        List<TopClan> topClans = new ArrayList<>();
        when(client.getTopClans("EU")).thenReturn(topClans);
        assertSame(topClans, api.getTopClans("EU"));
    }

    @Test
    public void failGetTopClansWithLocation() throws Exception {
        when(client.getTopClans("EU")).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopClans("EU");
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test(expected = NullPointerException.class)
    public void failGetClanBecauseNullTag() throws Exception {
        api.getClan(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClanBecauseEmptyTag() throws Exception {
        api.getClan("");
    }

    @Test
    public void shouldGetClan() throws Exception {
        Clan clan = new Clan();
        when(client.getClan("abc")).thenReturn(clan);
        assertEquals(clan, api.getClan("abc"));
    }

    @Test
    public void failGetClan() throws Exception {
        when(client.getClan("abc")).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClan("abc");
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
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetClanSearch() throws Exception {
        List<Clan> clans = new ArrayList<>();
        when(client.getClanSearch(null)).thenReturn(clans);
        assertEquals(clans, api.getClanSearch());
    }

    @Test
    public void failGetClanSearch() throws Exception {
        when(client.getClanSearch(null)).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClanSearch();
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
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTopPlayers() throws Exception {
        List<TopPlayer> topPlayers = new ArrayList<>();
        when(client.getTopPlayers(null)).thenReturn(topPlayers);
        assertSame(topPlayers, api.getTopPlayers());
    }

    @Test
    public void failGetTopPlayers() throws Exception {
        when(client.getTopPlayers(null)).thenThrow(new IOException("crapi: 400"));
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
        when(client.getTopPlayers("EU")).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTopPlayers("EU");
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetTournaments() throws Exception {
        Tournament tournament = new Tournament();
        when(client.getTournaments("abc")).thenReturn(tournament);
        assertSame(tournament, api.getTournaments("abc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetTournamentsBecauseEmptyTag() throws Exception {
        api.getTournaments("");
    }

    @Test(expected = NullPointerException.class)
    public void failGetTournamentsBecauseNullTag() throws Exception {
        api.getTournaments(null);
    }

    @Test
    public void failGetTournaments() throws Exception {
        when(client.getTournaments("abc")).thenThrow(new IOException("crapi: 400"));
        try {
            api.getTournaments("abc");
            fail();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetConstants() throws Exception {
        Constants constants = new Constants();
        when(client.getConstants()).thenReturn(constants);
        assertEquals(constants, api.getConstants());
    }

    @Test
    public void failGetConstants() throws Exception {
        when(client.getConstants()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getConstants();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetAllianceConstants() throws Exception {
        Alliance alliance = new Alliance();
        when(client.getAllianceConstants()).thenReturn(alliance);
        assertEquals(alliance, api.getAllianceConstants());
    }

    @Test
    public void failGetAllianceConstants() throws Exception {
        when(client.getAllianceConstants()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getAllianceConstants();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetArenasConstants() throws Exception {
        List<Arena> arenas = new ArrayList<>();
        when(client.getArenasConstants()).thenReturn(arenas);
        assertEquals(arenas, api.getArenasConstants());
    }

    @Test
    public void failGetArenasConstants() throws Exception {
        when(client.getArenasConstants()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getArenasConstants();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetBadgesConstants() throws Exception {
        List<Arena> arenas = new ArrayList<>();
        when(client.getArenasConstants()).thenReturn(arenas);
        assertEquals(arenas, api.getArenasConstants());
    }

    @Test
    public void failGetBadgesConstants() throws Exception {
        when(client.getBadgesConstants()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getBadgesConstants();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetChestCycleConstants() throws Exception {
        ChestCycleList chestCycleList = new ChestCycleList();
        when(client.getChestCycleConstants()).thenReturn(chestCycleList);
        assertEquals(chestCycleList, api.getChestCycleConstants());
    }

    @Test
    public void failGetChestCycleConstants() throws Exception {
        when(client.getChestCycleConstants()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getChestCycleConstants();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetCountryCodesConstants() throws Exception {
        List<CountryCode> countryCodes = new ArrayList<>();
        when(client.getCountryCodesConstants()).thenReturn(countryCodes);
        assertEquals(countryCodes, api.getCountryCodesConstants());
    }

    @Test
    public void failGetCountryCodesConstants() throws Exception {
        when(client.getCountryCodesConstants()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getCountryCodesConstants();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetRaritiesConstants() throws Exception {
        List<Rarity> rarities = new ArrayList<>();
        when(client.getRaritiesConstants()).thenReturn(rarities);
        assertEquals(rarities, api.getRaritiesConstants());
    }

    @Test
    public void failGetRaritiesConstants() throws Exception {
        when(client.getRaritiesConstants()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getRaritiesConstants();
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetCardsConstants() throws Exception {
        List<ConstantCard> constantCards = new ArrayList<>();
        when(client.getCardsConstants()).thenReturn(constantCards);
        assertEquals(constantCards, api.getCardsConstants());
    }

    @Test
    public void failGetCardsConstants() throws Exception {
        when(client.getCardsConstants()).thenThrow(new IOException("crapi: 400"));
        try {
            api.getCardsConstants();
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
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void shouldGetClanBattles() throws Exception {
        List<Battle> battles = new ArrayList<>();
        when(client.getClanBattles("abc")).thenReturn(battles);
        assertSame(battles, api.getClanBattles("abc"));
    }

    @Test
    public void failGetClanBattles() throws Exception {
        when(client.getClanBattles("abc")).thenThrow(new IOException("crapi: 400"));
        try {
            api.getClanBattles("abc");
        } catch(ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

}
