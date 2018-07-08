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
public class ClanWarTest {

    private ClanWar unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new ClanWar();
    }

    @Test
    public void shouldGetSetState() {
        String expected = "astring";
        unitUnderTest.setState(expected);
        assertEquals(expected, unitUnderTest.getState());
    }

    @Test
    public void shouldGetSetWarEndTime() {
        long expected = 4711L;
        unitUnderTest.setWarEndTime(expected);
        assertEquals(expected, unitUnderTest.getWarEndTime());
    }

    @Test
    public void shouldGetSetCollectionEndTime() {
        long expected = 4711L;
        unitUnderTest.setCollectionEndTime(expected);
        assertEquals(expected, unitUnderTest.getCollectionEndTime());
    }

    @Test
    public void shouldGetSetClan() {
        ClanWarClan expected = new ClanWarClan();
        unitUnderTest.setClan(expected);
        assertEquals(expected, unitUnderTest.getClan());
    }

    @Test
    public void shouldGetSetParticipants() {
        java.util.List<ClanWarParticipant> expected = new java.util.ArrayList<ClanWarParticipant>();
        unitUnderTest.setParticipants(expected);
        assertEquals(expected, unitUnderTest.getParticipants());
    }

    @Test
    public void shouldGetSetStandings() {
        java.util.List<ClanWarStanding> expected = new java.util.ArrayList<ClanWarStanding>();
        unitUnderTest.setStandings(expected);
        assertEquals(expected, unitUnderTest.getStandings());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setState("astring");
        unitUnderTest.setWarEndTime(4711L);
        unitUnderTest.setCollectionEndTime(4711L);
        unitUnderTest.setClan(new ClanWarClan());
        unitUnderTest.setParticipants(new java.util.ArrayList<ClanWarParticipant>());
        unitUnderTest.setStandings(new java.util.ArrayList<ClanWarStanding>());
        String expected = "ClanWar(state=astring, warEndTime=4711, collectionEndTime=4711, clan=" + new ClanWarClan() + ", participants=" + new java.util.ArrayList<ClanWarParticipant>() + ", standings=" + new java.util.ArrayList<ClanWarStanding>() + ")";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}