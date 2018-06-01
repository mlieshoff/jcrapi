package jcrapi;

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

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jcrapi.model.Battle;
import jcrapi.model.ChestCycle;
import jcrapi.model.Clan;
import jcrapi.model.ClanHistory;
import jcrapi.model.ClanWar;
import jcrapi.model.ClanWarLog;
import jcrapi.model.OpenTournament;
import jcrapi.model.PopularDeck;
import jcrapi.model.Profile;
import jcrapi.model.SearchedTournament;
import jcrapi.model.TopClan;
import jcrapi.model.TopPlayer;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class JsonModelIntegrationTest {

    private static final Gson GSON = new Gson();

    @Test
    public void shouldResolveProfile() throws Exception {
        assertType("profile.json", Profile.class);
    }

    private <T> void assertType(String filename, Class<T> typeClass) throws IOException {
        String json = FileUtils.readFileToString(new File("src/test/java/jcrapi/" + filename));
        T object = GSON.fromJson(json, typeClass);
        assertNotNull(object);
    }

    @Test
    public void shouldResolveProfiles() throws Exception {
        assertListType("profiles.json", Profile.class);
    }

    private <T> void assertListType(String filename, Class<T> elementClass) throws IOException {
        String json = FileUtils.readFileToString(new File("src/test/java/jcrapi/" + filename));
        Type listType = new TypeToken<ArrayList<T>>(){}.getType();
        List<T> list = new Gson().fromJson(json, listType);
        assertNotNull(list);
        for (T element : list) {
            assertNotNull(element);
        }
    }

    @Test
    public void shouldResolveTopClans() throws Exception {
        assertListType("topClans.json", TopClan.class);
    }

    @Test
    public void shouldResolveClan() throws Exception {
        assertType("clan.json", Clan.class);
    }

    @Test
    public void shouldResolveMultiClans() throws Exception {
        assertListType("multiClans.json", Clan.class);
    }

    @Test
    public void shouldResolveTopPlayers() throws Exception {
        assertListType("topPlayers.json", TopPlayer.class);
    }

    @Test
    public void shouldResolveClanBattles() throws Exception {
        assertListType("clanBattles.json", Battle.class);
    }

    @Test
    public void shouldResolveClanHistory() throws Exception {
        assertType("clanHistory.json", ClanHistory.class);
    }

    @Test
    public void shouldResolveClanWarLog() throws Exception {
        assertListType("clanWarLog.json", ClanWarLog.class);
    }

    @Test
    public void shouldResolveClanWar() throws Exception {
        assertType("clanWar.json", ClanWar.class);
    }

    @Test
    public void shouldResolveOpenTournaments() throws Exception {
        assertListType("openTournaments.json", OpenTournament.class);
    }

    @Test
    public void shouldResolvePlayerBattles() throws Exception {
        assertListType("playerBattles.json", Battle.class);
    }

    @Test
    public void shouldResolveMultiPlayerBattles() throws Exception {
        assertListOfListType("multiPlayerBattles.json", Battle.class);
    }

    private <T> void assertListOfListType(String filename, Class<T> elementClass) throws IOException {
        String json = FileUtils.readFileToString(new File("src/test/java/jcrapi/" + filename));
        Type listType = new TypeToken<List<List<T>>>(){}.getType();
        List<List<T>> list = new Gson().fromJson(json, listType);
        assertNotNull(list);
        for (List<T> innerList : list) {
            assertNotNull(innerList);
            for (T t : innerList) {
                assertNotNull(t);
            }
        }
    }

    @Test
    public void shouldResolvePlayerChests() throws Exception {
        assertType("playerChests.json", ChestCycle.class);
    }

    @Test
    public void shouldResolveMultiPlayerChests() throws Exception {
        assertListType("multiPlayerChests.json", ChestCycle.class);
    }

    @Test
    public void shouldResolvePopularDecks() throws Exception {
        assertListType("popularDecks.json", PopularDeck.class);
    }

    @Test
    public void shouldResolveTournamentSearch() throws Exception {
        assertListType("tournamentSearch.json", SearchedTournament.class);
    }

}
