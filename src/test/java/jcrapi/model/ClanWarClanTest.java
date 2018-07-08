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
public class ClanWarClanTest {

    private ClanWarClan unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new ClanWarClan();
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
    public void shouldGetSetParticipants() {
        int expected = 815;
        unitUnderTest.setParticipants(expected);
        assertEquals(expected, unitUnderTest.getParticipants());
    }

    @Test
    public void shouldGetSetBattlesPlayed() {
        int expected = 815;
        unitUnderTest.setBattlesPlayed(expected);
        assertEquals(expected, unitUnderTest.getBattlesPlayed());
    }

    @Test
    public void shouldGetSetWins() {
        int expected = 815;
        unitUnderTest.setWins(expected);
        assertEquals(expected, unitUnderTest.getWins());
    }

    @Test
    public void shouldGetSetCrowns() {
        int expected = 815;
        unitUnderTest.setCrowns(expected);
        assertEquals(expected, unitUnderTest.getCrowns());
    }

    @Test
    public void shouldGetSetWarTrophies() {
        int expected = 815;
        unitUnderTest.setWarTrophies(expected);
        assertEquals(expected, unitUnderTest.getWarTrophies());
    }

    @Test
    public void shouldGetSetBadge() {
        Badge expected = new Badge();
        unitUnderTest.setBadge(expected);
        assertEquals(expected, unitUnderTest.getBadge());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setTag("astring");
        unitUnderTest.setName("astring");
        unitUnderTest.setParticipants(815);
        unitUnderTest.setBattlesPlayed(815);
        unitUnderTest.setWins(815);
        unitUnderTest.setCrowns(815);
        unitUnderTest.setWarTrophies(815);
        unitUnderTest.setBadge(new Badge());
        String expected = "ClanWarClan(tag=astring, name=astring, participants=815, battlesPlayed=815, wins=815, crowns=815, warTrophies=815, badge=" + new Badge() + ")";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}