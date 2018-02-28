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
public class BattleModeTest {

    private BattleMode unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new BattleMode();
    }

    @Test
    public void shouldGetSetName() {
        String expected = "astring";
        unitUnderTest.setName(expected);
        assertEquals(expected, unitUnderTest.getName());
    }

    @Test
    public void shouldGetSetDeck() {
        String expected = "astring";
        unitUnderTest.setDeck(expected);
        assertEquals(expected, unitUnderTest.getDeck());
    }

    @Test
    public void shouldGetSetCardLevels() {
        String expected = "astring";
        unitUnderTest.setCardLevels(expected);
        assertEquals(expected, unitUnderTest.getCardLevels());
    }

    @Test
    public void shouldGetSetOvertimeSecons() {
        int expected = 815;
        unitUnderTest.setOvertimeSecons(expected);
        assertEquals(expected, unitUnderTest.getOvertimeSecons());
    }

    @Test
    public void shouldGetSetOvertimeSeconds() {
        int expected = 815;
        unitUnderTest.setOvertimeSeconds(expected);
        assertEquals(expected, unitUnderTest.getOvertimeSeconds());
    }

    @Test
    public void shouldGetSetPlayers() {
        String expected = "astring";
        unitUnderTest.setPlayers(expected);
        assertEquals(expected, unitUnderTest.getPlayers());
    }

    @Test
    public void shouldGetSetSameDeck() {
        boolean expected = false;
        unitUnderTest.setSameDeck(expected);
        assertEquals(expected, unitUnderTest.getSameDeck());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setName("astring");
        unitUnderTest.setDeck("astring");
        unitUnderTest.setCardLevels("astring");
        unitUnderTest.setOvertimeSecons(815);
        unitUnderTest.setOvertimeSeconds(815);
        unitUnderTest.setPlayers("astring");
        unitUnderTest.setSameDeck(false);
        String expected = "BattleMode{name=astring, deck=astring, cardLevels=astring, overtimeSecons=815, overtimeSeconds=815, players=astring, sameDeck=false}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}