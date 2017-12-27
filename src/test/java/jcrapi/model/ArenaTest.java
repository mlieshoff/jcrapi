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
public class ArenaTest {

    private Arena unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new Arena();
    }

    @Test
    public void shouldGetSetName() {
        String expected = "astring";
        unitUnderTest.setName(expected);
        assertEquals(expected, unitUnderTest.getName());
    }

    @Test
    public void shouldGetSetArena() {
        String expected = "astring";
        unitUnderTest.setArena(expected);
        assertEquals(expected, unitUnderTest.getArena());
    }

    @Test
    public void shouldGetSetArenaID() {
        int expected = 815;
        unitUnderTest.setArenaID(expected);
        assertEquals(expected, unitUnderTest.getArenaID());
    }

    @Test
    public void shouldGetSetTrophyLimit() {
        int expected = 815;
        unitUnderTest.setTrophyLimit(expected);
        assertEquals(expected, unitUnderTest.getTrophyLimit());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setName("astring");
        unitUnderTest.setArena("astring");
        unitUnderTest.setArenaID(815);
        unitUnderTest.setTrophyLimit(815);
        String expected = "Arena{name=astring, arena=astring, arenaID=815, trophyLimit=815}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}