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
public class GamesTest {

    private Games unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new Games();
    }

    @Test
    public void shouldGetSetTotal() {
        int expected = 815;
        unitUnderTest.setTotal(expected);
        assertEquals(expected, unitUnderTest.getTotal());
    }

    @Test
    public void shouldGetSetTournamentGames() {
        int expected = 815;
        unitUnderTest.setTournamentGames(expected);
        assertEquals(expected, unitUnderTest.getTournamentGames());
    }

    @Test
    public void shouldGetSetWins() {
        int expected = 815;
        unitUnderTest.setWins(expected);
        assertEquals(expected, unitUnderTest.getWins());
    }

    @Test
    public void shouldGetSetWinsPercent() {
        double expected = 1.41;
        unitUnderTest.setWinsPercent(expected);
        assertEquals(expected, unitUnderTest.getWinsPercent(), 0.0);
    }

    @Test
    public void shouldGetSetLosses() {
        int expected = 815;
        unitUnderTest.setLosses(expected);
        assertEquals(expected, unitUnderTest.getLosses());
    }

    @Test
    public void shouldGetSetLossesPercent() {
        double expected = 1.41;
        unitUnderTest.setLossesPercent(expected);
        assertEquals(expected, unitUnderTest.getLossesPercent(), 0.0);
    }

    @Test
    public void shouldGetSetDraws() {
        int expected = 815;
        unitUnderTest.setDraws(expected);
        assertEquals(expected, unitUnderTest.getDraws());
    }

    @Test
    public void shouldGetSetDrawsPercent() {
        double expected = 1.41;
        unitUnderTest.setDrawsPercent(expected);
        assertEquals(expected, unitUnderTest.getDrawsPercent(), 0.0);
    }

    @Test
    public void shouldGetSetLastBattle() {
        LastBattle expected = new LastBattle();
        unitUnderTest.setLastBattle(expected);
        assertEquals(expected, unitUnderTest.getLastBattle());
    }

    @Test
    public void shouldGetSetWarDayWins() {
        int expected = 815;
        unitUnderTest.setWarDayWins(expected);
        assertEquals(expected, unitUnderTest.getWarDayWins());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setTotal(815);
        unitUnderTest.setTournamentGames(815);
        unitUnderTest.setWins(815);
        unitUnderTest.setWinsPercent(1.41);
        unitUnderTest.setLosses(815);
        unitUnderTest.setLossesPercent(1.41);
        unitUnderTest.setDraws(815);
        unitUnderTest.setDrawsPercent(1.41);
        unitUnderTest.setLastBattle(new LastBattle());
        unitUnderTest.setWarDayWins(815);
        String expected = "Games(total=815, tournamentGames=815, wins=815, winsPercent=1.41, losses=815, lossesPercent=1.41, draws=815, drawsPercent=1.41, lastBattle=" + new LastBattle() + ", warDayWins=815)";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}