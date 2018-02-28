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
public class TeamTest {

    private Team unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new Team();
    }

    @Test
    public void shouldGetSetTag() {
        String expected = "astring";
        unitUnderTest.setTag(expected);
        assertEquals(expected, unitUnderTest.getTag());
    }

    @Test
    public void shouldGetSetDeckLink() {
        String expected = "astring";
        unitUnderTest.setDeckLink(expected);
        assertEquals(expected, unitUnderTest.getDeckLink());
    }

    @Test
    public void shouldGetSetName() {
        String expected = "astring";
        unitUnderTest.setName(expected);
        assertEquals(expected, unitUnderTest.getName());
    }

    @Test
    public void shouldGetSetCrownsEarned() {
        int expected = 815;
        unitUnderTest.setCrownsEarned(expected);
        assertEquals(expected, unitUnderTest.getCrownsEarned());
    }

    @Test
    public void shouldGetSetStartTrophies() {
        int expected = 815;
        unitUnderTest.setStartTrophies(expected);
        assertEquals(expected, unitUnderTest.getStartTrophies());
    }

    @Test
    public void shouldGetSetTrophyChange() {
        int expected = 815;
        unitUnderTest.setTrophyChange(expected);
        assertEquals(expected, unitUnderTest.getTrophyChange());
    }

    @Test
    public void shouldGetSetClan() {
        TeamClan expected = new TeamClan();
        unitUnderTest.setClan(expected);
        assertEquals(expected, unitUnderTest.getClan());
    }

    @Test
    public void shouldGetSetDeck() {
        java.util.List<TeamCard> expected = new java.util.ArrayList<TeamCard>();
        unitUnderTest.setDeck(expected);
        assertEquals(expected, unitUnderTest.getDeck());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setTag("astring");
        unitUnderTest.setDeckLink("astring");
        unitUnderTest.setName("astring");
        unitUnderTest.setCrownsEarned(815);
        unitUnderTest.setStartTrophies(815);
        unitUnderTest.setTrophyChange(815);
        unitUnderTest.setClan(new TeamClan());
        unitUnderTest.setDeck(new java.util.ArrayList<TeamCard>());
        String expected = "Team{tag=astring, deckLink=astring, name=astring, crownsEarned=815, startTrophies=815, trophyChange=815, clan=" + new TeamClan() + ", deck=" + new java.util.ArrayList<TeamCard>() + "}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}