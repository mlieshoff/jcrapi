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
public class PopularTournamentTest {

    private PopularTournament unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new PopularTournament();
    }

    @Test
    public void shouldGetSetPopularity() {
        Popularity expected = new Popularity();
        unitUnderTest.setPopularity(expected);
        assertEquals(expected, unitUnderTest.getPopularity());
    }

    @Test
    public void shouldGetSetEndTime() {
        long expected = 4711L;
        unitUnderTest.setEndTime(expected);
        assertEquals(expected, unitUnderTest.getEndTime());
    }

    @Test
    public void shouldGetSetPlayerCount() {
        int expected = 815;
        unitUnderTest.setPlayerCount(expected);
        assertEquals(expected, unitUnderTest.getPlayerCount());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setPopularity(new Popularity());
        unitUnderTest.setEndTime(4711L);
        unitUnderTest.setPlayerCount(815);
        String expected = "PopularTournament{popularity=" + new Popularity() + ", endTime=4711, playerCount=815}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}