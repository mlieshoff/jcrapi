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
public class TopPlayerTest {

    private TopPlayer unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new TopPlayer();
    }

    @Test
    public void shouldGetSetName() {
        String expected = "astring";
        unitUnderTest.setName(expected);
        assertEquals(expected, unitUnderTest.getName());
    }

    @Test
    public void shouldGetSetTag() {
        String expected = "astring";
        unitUnderTest.setTag(expected);
        assertEquals(expected, unitUnderTest.getTag());
    }

    @Test
    public void shouldGetSetRank() {
        int expected = 815;
        unitUnderTest.setRank(expected);
        assertEquals(expected, unitUnderTest.getRank());
    }

    @Test
    public void shouldGetSetPreviousRank() {
        int expected = 815;
        unitUnderTest.setPreviousRank(expected);
        assertEquals(expected, unitUnderTest.getPreviousRank());
    }

    @Test
    public void shouldGetSetExpLevel() {
        int expected = 815;
        unitUnderTest.setExpLevel(expected);
        assertEquals(expected, unitUnderTest.getExpLevel());
    }

    @Test
    public void shouldGetSetTrophies() {
        int expected = 815;
        unitUnderTest.setTrophies(expected);
        assertEquals(expected, unitUnderTest.getTrophies());
    }

    @Test
    public void shouldGetSetDonationsDelta() {
        int expected = 815;
        unitUnderTest.setDonationsDelta(expected);
        assertEquals(expected, unitUnderTest.getDonationsDelta());
    }

    @Test
    public void shouldGetSetClan() {
        TeamClan expected = new TeamClan();
        unitUnderTest.setClan(expected);
        assertEquals(expected, unitUnderTest.getClan());
    }

    @Test
    public void shouldGetSetArena() {
        Arena expected = new Arena();
        unitUnderTest.setArena(expected);
        assertEquals(expected, unitUnderTest.getArena());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setName("astring");
        unitUnderTest.setTag("astring");
        unitUnderTest.setRank(815);
        unitUnderTest.setPreviousRank(815);
        unitUnderTest.setExpLevel(815);
        unitUnderTest.setTrophies(815);
        unitUnderTest.setDonationsDelta(815);
        unitUnderTest.setClan(new TeamClan());
        unitUnderTest.setArena(new Arena());
        String expected = "TopPlayer{name=astring, tag=astring, rank=815, previousRank=815, expLevel=815, trophies=815, donationsDelta=815, clan=" + new TeamClan() + ", arena=" + new Arena() + "}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}