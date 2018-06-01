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
public class ClanWarLogTest {

    private ClanWarLog unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new ClanWarLog();
    }

    @Test
    public void shouldGetSetCreatedDate() {
        long expected = 4711L;
        unitUnderTest.setCreatedDate(expected);
        assertEquals(expected, unitUnderTest.getCreatedDate());
    }

    @Test
    public void shouldGetSetSeasonNumber() {
        int expected = 815;
        unitUnderTest.setSeasonNumber(expected);
        assertEquals(expected, unitUnderTest.getSeasonNumber());
    }

    @Test
    public void shouldGetSetParticipants() {
        java.util.List<ClanWarLogParticipant> expected = new java.util.ArrayList<ClanWarLogParticipant>();
        unitUnderTest.setParticipants(expected);
        assertEquals(expected, unitUnderTest.getParticipants());
    }

    @Test
    public void shouldGetSetStandings() {
        java.util.List<ClanWarLogStanding> expected = new java.util.ArrayList<ClanWarLogStanding>();
        unitUnderTest.setStandings(expected);
        assertEquals(expected, unitUnderTest.getStandings());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setCreatedDate(4711L);
        unitUnderTest.setSeasonNumber(815);
        unitUnderTest.setParticipants(new java.util.ArrayList<ClanWarLogParticipant>());
        unitUnderTest.setStandings(new java.util.ArrayList<ClanWarLogStanding>());
        String expected = "ClanWarLog{createdDate=4711, seasonNumber=815, participants=" + new java.util.ArrayList<ClanWarLogParticipant>() + ", standings=" + new java.util.ArrayList<ClanWarLogStanding>() + "}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}