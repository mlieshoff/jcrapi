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
public class PopularCardTest {

    private PopularCard unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new PopularCard();
    }

    @Test
    public void shouldGetSetArena() {
        int expected = 815;
        unitUnderTest.setArena(expected);
        assertEquals(expected, unitUnderTest.getArena());
    }

    @Test
    public void shouldGetSetDescription() {
        String expected = "astring";
        unitUnderTest.setDescription(expected);
        assertEquals(expected, unitUnderTest.getDescription());
    }

    @Test
    public void shouldGetSetElixir() {
        int expected = 815;
        unitUnderTest.setElixir(expected);
        assertEquals(expected, unitUnderTest.getElixir());
    }

    @Test
    public void shouldGetSetIcon() {
        String expected = "astring";
        unitUnderTest.setIcon(expected);
        assertEquals(expected, unitUnderTest.getIcon());
    }

    @Test
    public void shouldGetSetId() {
        long expected = 4711L;
        unitUnderTest.setId(expected);
        assertEquals(expected, unitUnderTest.getId());
    }

    @Test
    public void shouldGetSetKey() {
        String expected = "astring";
        unitUnderTest.setKey(expected);
        assertEquals(expected, unitUnderTest.getKey());
    }

    @Test
    public void shouldGetSetMaxLevel() {
        int expected = 815;
        unitUnderTest.setMaxLevel(expected);
        assertEquals(expected, unitUnderTest.getMaxLevel());
    }

    @Test
    public void shouldGetSetName() {
        String expected = "astring";
        unitUnderTest.setName(expected);
        assertEquals(expected, unitUnderTest.getName());
    }

    @Test
    public void shouldGetSetRarity() {
        String expected = "astring";
        unitUnderTest.setRarity(expected);
        assertEquals(expected, unitUnderTest.getRarity());
    }

    @Test
    public void shouldGetSetType() {
        String expected = "astring";
        unitUnderTest.setType(expected);
        assertEquals(expected, unitUnderTest.getType());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setArena(815);
        unitUnderTest.setDescription("astring");
        unitUnderTest.setElixir(815);
        unitUnderTest.setIcon("astring");
        unitUnderTest.setId(4711L);
        unitUnderTest.setKey("astring");
        unitUnderTest.setMaxLevel(815);
        unitUnderTest.setName("astring");
        unitUnderTest.setRarity("astring");
        unitUnderTest.setType("astring");
        String expected = "PopularCard{arena=815, description=astring, elixir=815, icon=astring, id=4711, key=astring, maxLevel=815, name=astring, rarity=astring, type=astring}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}