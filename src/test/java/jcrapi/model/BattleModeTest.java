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
  public void shouldGetSetId() {
    int expected = 815;
    unitUnderTest.setId(expected);
    assertEquals(expected, unitUnderTest.getId());
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
    assertEquals(expected, unitUnderTest.isSameDeck());
  }

  @Test
  public void shouldGetSetCardLevelAdjustment() {
    String expected = "astring";
    unitUnderTest.setCardLevelAdjustment(expected);
    assertEquals(expected, unitUnderTest.getCardLevelAdjustment());
  }

  @Test
  public void shouldGetSetDeckSelection() {
    String expected = "astring";
    unitUnderTest.setDeckSelection(expected);
    assertEquals(expected, unitUnderTest.getDeckSelection());
  }

  @Test
  public void shouldGetSetSameDeckOnBoth() {
    boolean expected = false;
    unitUnderTest.setSameDeckOnBoth(expected);
    assertEquals(expected, unitUnderTest.isSameDeckOnBoth());
  }

  @Test
  public void shouldGetSetSeparateTeamDecks() {
    boolean expected = false;
    unitUnderTest.setSeparateTeamDecks(expected);
    assertEquals(expected, unitUnderTest.isSeparateTeamDecks());
  }

  @Test
  public void shouldGetSetSwappingTowers() {
    boolean expected = false;
    unitUnderTest.setSwappingTowers(expected);
    assertEquals(expected, unitUnderTest.isSwappingTowers());
  }

  @Test
  public void shouldGetSetUseStartingElixir() {
    boolean expected = false;
    unitUnderTest.setUseStartingElixir(expected);
    assertEquals(expected, unitUnderTest.isUseStartingElixir());
  }

  @Test
  public void shouldGetSetRandomBoosts() {
    boolean expected = false;
    unitUnderTest.setRandomBoosts(expected);
    assertEquals(expected, unitUnderTest.isRandomBoosts());
  }

  @Test
  public void shouldGetSetHeroes() {
    boolean expected = false;
    unitUnderTest.setHeroes(expected);
    assertEquals(expected, unitUnderTest.isHeroes());
  }

  @Test
  public void shouldGetSetEventDeckClanWar() {
    boolean expected = false;
    unitUnderTest.setEventDeckClanWar(expected);
    assertEquals(expected, unitUnderTest.isEventDeckClanWar());
  }

  @Test
  public void shouldGetSetGivesClanScore() {
    boolean expected = false;
    unitUnderTest.setGivesClanScore(expected);
    assertEquals(expected, unitUnderTest.isGivesClanScore());
  }

  @Test
  public void shouldGetSetFixedDeckOrder() {
    boolean expected = false;
    unitUnderTest.setFixedDeckOrder(expected);
    assertEquals(expected, unitUnderTest.isFixedDeckOrder());
  }

  @Test
  public void shouldGetSetHeist() {
    boolean expected = false;
    unitUnderTest.setHeist(expected);
    assertEquals(expected, unitUnderTest.isHeist());
  }

  @Test
  public void shouldGetSetSpellSupport() {
    boolean expected = false;
    unitUnderTest.setSpellSupport(expected);
    assertEquals(expected, unitUnderTest.isSpellSupport());
  }

  @Test
  public void shouldGetSetHasDarkElixirCollector() {
    boolean expected = false;
    unitUnderTest.setHasDarkElixirCollector(expected);
    assertEquals(expected, unitUnderTest.isHasDarkElixirCollector());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setId(815);
    unitUnderTest.setName("astring");
    unitUnderTest.setDeck("astring");
    unitUnderTest.setCardLevels("astring");
    unitUnderTest.setOvertimeSecons(815);
    unitUnderTest.setOvertimeSeconds(815);
    unitUnderTest.setPlayers("astring");
    unitUnderTest.setSameDeck(false);
    unitUnderTest.setCardLevelAdjustment("astring");
    unitUnderTest.setDeckSelection("astring");
    unitUnderTest.setSameDeckOnBoth(false);
    unitUnderTest.setSeparateTeamDecks(false);
    unitUnderTest.setSwappingTowers(false);
    unitUnderTest.setUseStartingElixir(false);
    unitUnderTest.setRandomBoosts(false);
    unitUnderTest.setHeroes(false);
    unitUnderTest.setEventDeckClanWar(false);
    unitUnderTest.setGivesClanScore(false);
    unitUnderTest.setFixedDeckOrder(false);
    unitUnderTest.setHeist(false);
    unitUnderTest.setSpellSupport(false);
    unitUnderTest.setHasDarkElixirCollector(false);
    String expected = "BattleMode(id=815, name=astring, deck=astring, cardLevels=astring, overtimeSecons=815, overtimeSeconds=815, players=astring, sameDeck=false, cardLevelAdjustment=astring, deckSelection=astring, sameDeckOnBoth=false, separateTeamDecks=false, swappingTowers=false, useStartingElixir=false, randomBoosts=false, heroes=false, eventDeckClanWar=false, givesClanScore=false, fixedDeckOrder=false, heist=false, spellSupport=false, hasDarkElixirCollector=false)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}