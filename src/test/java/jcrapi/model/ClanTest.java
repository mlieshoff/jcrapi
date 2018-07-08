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
public class ClanTest {

    private Clan unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new Clan();
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
    public void shouldGetSetDescription() {
        String expected = "astring";
        unitUnderTest.setDescription(expected);
        assertEquals(expected, unitUnderTest.getDescription());
    }

    @Test
    public void shouldGetSetType() {
        String expected = "astring";
        unitUnderTest.setType(expected);
        assertEquals(expected, unitUnderTest.getType());
    }

    @Test
    public void shouldGetSetScore() {
        int expected = 815;
        unitUnderTest.setScore(expected);
        assertEquals(expected, unitUnderTest.getScore());
    }

    @Test
    public void shouldGetSetMemberCount() {
        int expected = 815;
        unitUnderTest.setMemberCount(expected);
        assertEquals(expected, unitUnderTest.getMemberCount());
    }

    @Test
    public void shouldGetSetRequiredScore() {
        int expected = 815;
        unitUnderTest.setRequiredScore(expected);
        assertEquals(expected, unitUnderTest.getRequiredScore());
    }

    @Test
    public void shouldGetSetDonations() {
        int expected = 815;
        unitUnderTest.setDonations(expected);
        assertEquals(expected, unitUnderTest.getDonations());
    }

    @Test
    public void shouldGetSetClanChest() {
        ClanChest expected = new ClanChest();
        unitUnderTest.setClanChest(expected);
        assertEquals(expected, unitUnderTest.getClanChest());
    }

    @Test
    public void shouldGetSetBadge() {
        Badge expected = new Badge();
        unitUnderTest.setBadge(expected);
        assertEquals(expected, unitUnderTest.getBadge());
    }

    @Test
    public void shouldGetSetLocation() {
        Location expected = new Location();
        unitUnderTest.setLocation(expected);
        assertEquals(expected, unitUnderTest.getLocation());
    }

    @Test
    public void shouldGetSetTracking() {
        Tracking expected = new Tracking();
        unitUnderTest.setTracking(expected);
        assertEquals(expected, unitUnderTest.getTracking());
    }

    @Test
    public void shouldGetSetMembers() {
        java.util.List<Member> expected = new java.util.ArrayList<Member>();
        unitUnderTest.setMembers(expected);
        assertEquals(expected, unitUnderTest.getMembers());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setTag("astring");
        unitUnderTest.setName("astring");
        unitUnderTest.setDescription("astring");
        unitUnderTest.setType("astring");
        unitUnderTest.setScore(815);
        unitUnderTest.setMemberCount(815);
        unitUnderTest.setRequiredScore(815);
        unitUnderTest.setDonations(815);
        unitUnderTest.setClanChest(new ClanChest());
        unitUnderTest.setBadge(new Badge());
        unitUnderTest.setLocation(new Location());
        unitUnderTest.setTracking(new Tracking());
        unitUnderTest.setMembers(new java.util.ArrayList<Member>());
        String expected = "Clan(tag=astring, name=astring, description=astring, type=astring, score=815, memberCount=815, requiredScore=815, donations=815, clanChest=" + new ClanChest() + ", badge=" + new Badge() + ", location=" + new Location() + ", tracking=" + new Tracking() + ", members=" + new java.util.ArrayList<Member>() + ")";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}