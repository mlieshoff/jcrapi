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
public class MemberTest {

    private Member unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new Member();
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
    public void shouldGetSetRole() {
        String expected = "astring";
        unitUnderTest.setRole(expected);
        assertEquals(expected, unitUnderTest.getRole());
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
    public void shouldGetSetClanChestCrowns() {
        int expected = 815;
        unitUnderTest.setClanChestCrowns(expected);
        assertEquals(expected, unitUnderTest.getClanChestCrowns());
    }

    @Test
    public void shouldGetSetDonations() {
        int expected = 815;
        unitUnderTest.setDonations(expected);
        assertEquals(expected, unitUnderTest.getDonations());
    }

    @Test
    public void shouldGetSetDonationsReceived() {
        int expected = 815;
        unitUnderTest.setDonationsReceived(expected);
        assertEquals(expected, unitUnderTest.getDonationsReceived());
    }

    @Test
    public void shouldGetSetDonationsDelta() {
        int expected = 815;
        unitUnderTest.setDonationsDelta(expected);
        assertEquals(expected, unitUnderTest.getDonationsDelta());
    }

    @Test
    public void shouldGetSetDonationsPercent() {
        double expected = 1.41;
        unitUnderTest.setDonationsPercent(expected);
        assertEquals(expected, unitUnderTest.getDonationsPercent(), 0.0);
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
        unitUnderTest.setRole("astring");
        unitUnderTest.setExpLevel(815);
        unitUnderTest.setTrophies(815);
        unitUnderTest.setClanChestCrowns(815);
        unitUnderTest.setDonations(815);
        unitUnderTest.setDonationsReceived(815);
        unitUnderTest.setDonationsDelta(815);
        unitUnderTest.setDonationsPercent(1.41);
        unitUnderTest.setArena(new Arena());
        String expected = "Member(name=astring, tag=astring, rank=815, previousRank=815, role=astring, expLevel=815, trophies=815, clanChestCrowns=815, donations=815, donationsReceived=815, donationsDelta=815, donationsPercent=1.41, arena=" + new Arena() + ")";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}