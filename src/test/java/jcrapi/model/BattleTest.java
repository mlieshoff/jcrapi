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

import javax.annotation.Generated;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Generated("org.mili.generator")
public class BattleTest {

    private Battle unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new Battle();
    }

    @Test
    public void shouldGetSetType() {
        String expected = "astring";
        unitUnderTest.setType(expected);
        assertEquals(expected, unitUnderTest.getType());
    }

    @Test
    public void shouldGetSetChallengeType() {
        String expected = "astring";
        unitUnderTest.setChallengeType(expected);
        assertEquals(expected, unitUnderTest.getChallengeType());
    }

    @Test
    public void shouldGetSetMode() {
        BattleMode expected = new BattleMode();
        unitUnderTest.setMode(expected);
        assertEquals(expected, unitUnderTest.getMode());
    }

    @Test
    public void shouldGetSetWinCountBefore() {
        int expected = 815;
        unitUnderTest.setWinCountBefore(expected);
        assertEquals(expected, unitUnderTest.getWinCountBefore());
    }

    @Test
    public void shouldGetSetUtcTime() {
        long expected = 4711L;
        unitUnderTest.setUtcTime(expected);
        assertEquals(expected, unitUnderTest.getUtcTime());
    }

    @Test
    public void shouldGetSetDeckType() {
        String expected = "astring";
        unitUnderTest.setDeckType(expected);
        assertEquals(expected, unitUnderTest.getDeckType());
    }

    @Test
    public void shouldGetSetTeamSize() {
        int expected = 815;
        unitUnderTest.setTeamSize(expected);
        assertEquals(expected, unitUnderTest.getTeamSize());
    }

    @Test
    public void shouldGetSetWinner() {
        int expected = 815;
        unitUnderTest.setWinner(expected);
        assertEquals(expected, unitUnderTest.getWinner());
    }

    @Test
    public void shouldGetSetTeamCrowns() {
        int expected = 815;
        unitUnderTest.setTeamCrowns(expected);
        assertEquals(expected, unitUnderTest.getTeamCrowns());
    }

    @Test
    public void shouldGetSetOpponentCrowns() {
        int expected = 815;
        unitUnderTest.setOpponentCrowns(expected);
        assertEquals(expected, unitUnderTest.getOpponentCrowns());
    }

    @Test
    public void shouldGetSetTeam() {
        java.util.List<Team> expected = new java.util.ArrayList<Team>();
        unitUnderTest.setTeam(expected);
        assertEquals(expected, unitUnderTest.getTeam());
    }

    @Test
    public void shouldGetSetOpponent() {
        java.util.List<Team> expected = new java.util.ArrayList<Team>();
        unitUnderTest.setOpponent(expected);
        assertEquals(expected, unitUnderTest.getOpponent());
    }

    @Test
    public void shouldGetSetArena() {
        Arena expected = new Arena();
        unitUnderTest.setArena(expected);
        assertEquals(expected, unitUnderTest.getArena());
    }

    @Test
    public void shouldGetSetTournamentTag() {
        String expected = "astring";
        unitUnderTest.setTournamentTag(expected);
        assertEquals(expected, unitUnderTest.getTournamentTag());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setType("astring");
        unitUnderTest.setChallengeType("astring");
        unitUnderTest.setMode(new BattleMode());
        unitUnderTest.setWinCountBefore(815);
        unitUnderTest.setUtcTime(4711L);
        unitUnderTest.setDeckType("astring");
        unitUnderTest.setTeamSize(815);
        unitUnderTest.setWinner(815);
        unitUnderTest.setTeamCrowns(815);
        unitUnderTest.setOpponentCrowns(815);
        unitUnderTest.setTeam(new java.util.ArrayList<Team>());
        unitUnderTest.setOpponent(new java.util.ArrayList<Team>());
        unitUnderTest.setArena(new Arena());
        unitUnderTest.setTournamentTag("astring");
        String expected = "Battle{type=astring, challengeType=astring, mode=" + new BattleMode() + ", winCountBefore=815, utcTime=4711, deckType=astring, teamSize=815, winner=815, teamCrowns=815, opponentCrowns=815, team=" + new java.util.ArrayList<Team>() + ", opponent=" + new java.util.ArrayList<Team>() + ", arena=" + new Arena() + ", tournamentTag=astring}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}