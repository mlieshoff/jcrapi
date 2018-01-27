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
public class ConstantsTest {

    private Constants unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new Constants();
    }

    @Test
    public void shouldGetSetAlliance() {
        Alliance expected = new Alliance();
        unitUnderTest.setAlliance(expected);
        assertEquals(expected, unitUnderTest.getAlliance());
    }

    @Test
    public void shouldGetSetArenas() {
        java.util.List<Arena> expected = new java.util.ArrayList<Arena>();
        unitUnderTest.setArenas(expected);
        assertEquals(expected, unitUnderTest.getArenas());
    }

    @Test
    public void shouldGetSetBadges() {
        Badges expected = new Badges();
        unitUnderTest.setBadges(expected);
        assertEquals(expected, unitUnderTest.getBadges());
    }

    @Test
    public void shouldGetSetChestCycle() {
        ChestCycleList expected = new ChestCycleList();
        unitUnderTest.setChestCycle(expected);
        assertEquals(expected, unitUnderTest.getChestCycle());
    }

    @Test
    public void shouldGetSetCountryCodes() {
        java.util.List<CountryCode> expected = new java.util.ArrayList<CountryCode>();
        unitUnderTest.setCountryCodes(expected);
        assertEquals(expected, unitUnderTest.getCountryCodes());
    }

    @Test
    public void shouldGetSetRarities() {
        java.util.List<Rarity> expected = new java.util.ArrayList<Rarity>();
        unitUnderTest.setRarities(expected);
        assertEquals(expected, unitUnderTest.getRarities());
    }

    @Test
    public void shouldGetSetCards() {
        java.util.List<ConstantCard> expected = new java.util.ArrayList<ConstantCard>();
        unitUnderTest.setCards(expected);
        assertEquals(expected, unitUnderTest.getCards());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setAlliance(new Alliance());
        unitUnderTest.setArenas(new java.util.ArrayList<Arena>());
        unitUnderTest.setBadges(new Badges());
        unitUnderTest.setChestCycle(new ChestCycleList());
        unitUnderTest.setCountryCodes(new java.util.ArrayList<CountryCode>());
        unitUnderTest.setRarities(new java.util.ArrayList<Rarity>());
        unitUnderTest.setCards(new java.util.ArrayList<ConstantCard>());
        String expected = "Constants{alliance=" + new Alliance() + ", arenas=" + new java.util.ArrayList<Arena>() + ", badges=" + new Badges() + ", chestCycle=" + new ChestCycleList() + ", countryCodes=" + new java.util.ArrayList<CountryCode>() + ", rarities=" + new java.util.ArrayList<Rarity>() + ", cards=" + new java.util.ArrayList<ConstantCard>() + "}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}