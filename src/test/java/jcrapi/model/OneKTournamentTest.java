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
public class OneKTournamentTest {

    private OneKTournament unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new OneKTournament();
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
    public void shouldGetSetOpen() {
        boolean expected = false;
        unitUnderTest.setOpen(expected);
        assertEquals(expected, unitUnderTest.isOpen());
    }

    @Test
    public void shouldGetSetMaxPlayers() {
        int expected = 815;
        unitUnderTest.setMaxPlayers(expected);
        assertEquals(expected, unitUnderTest.getMaxPlayers());
    }

    @Test
    public void shouldGetSetCurrentPlayers() {
        int expected = 815;
        unitUnderTest.setCurrentPlayers(expected);
        assertEquals(expected, unitUnderTest.getCurrentPlayers());
    }

    @Test
    public void shouldGetSetStatus() {
        String expected = "astring";
        unitUnderTest.setStatus(expected);
        assertEquals(expected, unitUnderTest.getStatus());
    }

    @Test
    public void shouldGetSetCreateTime() {
        long expected = 4711L;
        unitUnderTest.setCreateTime(expected);
        assertEquals(expected, unitUnderTest.getCreateTime());
    }

    @Test
    public void shouldGetSetPrepTime() {
        int expected = 815;
        unitUnderTest.setPrepTime(expected);
        assertEquals(expected, unitUnderTest.getPrepTime());
    }

    @Test
    public void shouldGetSetStartTime() {
        String expected = "astring";
        unitUnderTest.setStartTime(expected);
        assertEquals(expected, unitUnderTest.getStartTime());
    }

    @Test
    public void shouldGetSetEndTime() {
        String expected = "astring";
        unitUnderTest.setEndTime(expected);
        assertEquals(expected, unitUnderTest.getEndTime());
    }

    @Test
    public void shouldGetSetDuration() {
        int expected = 815;
        unitUnderTest.setDuration(expected);
        assertEquals(expected, unitUnderTest.getDuration());
    }

    @Test
    public void shouldGetSetDescription() {
        String expected = "astring";
        unitUnderTest.setDescription(expected);
        assertEquals(expected, unitUnderTest.getDescription());
    }

    @Test
    public void shouldGetSetUpdatedAt() {
        long expected = 4711L;
        unitUnderTest.setUpdatedAt(expected);
        assertEquals(expected, unitUnderTest.getUpdatedAt());
    }

    @Test
    public void shouldGetSetType() {
        String expected = "astring";
        unitUnderTest.setType(expected);
        assertEquals(expected, unitUnderTest.getType());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setTag("astring");
        unitUnderTest.setName("astring");
        unitUnderTest.setOpen(false);
        unitUnderTest.setMaxPlayers(815);
        unitUnderTest.setCurrentPlayers(815);
        unitUnderTest.setStatus("astring");
        unitUnderTest.setCreateTime(4711L);
        unitUnderTest.setPrepTime(815);
        unitUnderTest.setStartTime("astring");
        unitUnderTest.setEndTime("astring");
        unitUnderTest.setDuration(815);
        unitUnderTest.setDescription("astring");
        unitUnderTest.setUpdatedAt(4711L);
        unitUnderTest.setType("astring");
        String expected = "OneKTournament(tag=astring, name=astring, open=false, maxPlayers=815, currentPlayers=815, status=astring, createTime=4711, prepTime=815, startTime=astring, endTime=astring, duration=815, description=astring, updatedAt=4711, type=astring)";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}