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
package jcrapi.model;

import org.junit.Before;
import org.junit.Test;

import javax.annotation.Generated;

import static org.junit.Assert.assertEquals;

@Generated("org.mili.generator")
public class ProfileTest {

    private Profile unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new Profile();
    }

    @Test
    public void shouldGetSetTag() {
        String expected = "astring";
        unitUnderTest.setTag(expected);
        assertEquals(expected, unitUnderTest.getTag());
    }

    @Test
    public void shouldGetSetName() {
        String expected = "astring";
        unitUnderTest.setName(expected);
        assertEquals(expected, unitUnderTest.getName());
    }

    @Test
    public void shouldGetSetTrophies() {
        int expected = 815;
        unitUnderTest.setTrophies(expected);
        assertEquals(expected, unitUnderTest.getTrophies());
    }

    @Test
    public void shouldGetSetArena() {
        Arena expected = new Arena();
        unitUnderTest.setArena(expected);
        assertEquals(expected, unitUnderTest.getArena());
    }

    @Test
    public void shouldGetSetClan() {
        ProfileClan expected = new ProfileClan();
        unitUnderTest.setClan(expected);
        assertEquals(expected, unitUnderTest.getClan());
    }

    @Test
    public void shouldGetSetStats() {
        Stats expected = new Stats();
        unitUnderTest.setStats(expected);
        assertEquals(expected, unitUnderTest.getStats());
    }

    @Test
    public void shouldGetSetGames() {
        Games expected = new Games();
        unitUnderTest.setGames(expected);
        assertEquals(expected, unitUnderTest.getGames());
    }

    @Test
    public void shouldGetSetChestCycle() {
        ChestCycle expected = new ChestCycle();
        unitUnderTest.setChestCycle(expected);
        assertEquals(expected, unitUnderTest.getChestCycle());
    }

    @Test
    public void shouldGetSetLeagueStatistics() {
        LeagueStatistics expected = new LeagueStatistics();
        unitUnderTest.setLeagueStatistics(expected);
        assertEquals(expected, unitUnderTest.getLeagueStatistics());
    }

    @Test
    public void shouldGetSetCurrentDeck() {
        java.util.List<Card> expected = new java.util.ArrayList<>();
        unitUnderTest.setCurrentDeck(expected);
        assertEquals(expected, unitUnderTest.getCurrentDeck());
    }

    @Test
    public void shouldGetSetCards() {
        java.util.List<Card> expected = new java.util.ArrayList<>();
        unitUnderTest.setCards(expected);
        assertEquals(expected, unitUnderTest.getCards());
    }

    @Test
    public void shouldGetSetAchievments() {
        java.util.List<Achievment> expected = new java.util.ArrayList<>();
        unitUnderTest.setAchievments(expected);
        assertEquals(expected, unitUnderTest.getAchievments());
    }

    @Test
    public void shouldGetSetBattles() {
        java.util.List<Battle> expected = new java.util.ArrayList<>();
        unitUnderTest.setBattles(expected);
        assertEquals(expected, unitUnderTest.getBattles());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setTag("astring");
        unitUnderTest.setName("astring");
        unitUnderTest.setTrophies(815);
        unitUnderTest.setArena(new Arena());
        unitUnderTest.setClan(new ProfileClan());
        unitUnderTest.setStats(new Stats());
        unitUnderTest.setGames(new Games());
        unitUnderTest.setChestCycle(new ChestCycle());
        unitUnderTest.setLeagueStatistics(new LeagueStatistics());
        unitUnderTest.setCurrentDeck(new java.util.ArrayList<Card>());
        unitUnderTest.setCards(new java.util.ArrayList<Card>());
        unitUnderTest.setAchievments(new java.util.ArrayList<Achievment>());
        unitUnderTest.setBattles(new java.util.ArrayList<Battle>());
        String expected = "Profile{tag=astring, name=astring, trophies=815, arena=" + new Arena() + ", clan=" + new ProfileClan() + ", stats=" + new Stats() + ", games=" + new Games() + ", chestCycle=" + new ChestCycle() + ", leagueStatistics=" + new LeagueStatistics() + ", currentDeck=" + new java.util.ArrayList<>() + ", cards=" + new java.util.ArrayList<>() + ", achievments=" + new java.util.ArrayList<>() + ", battles=" + new java.util.ArrayList<>() + "}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}