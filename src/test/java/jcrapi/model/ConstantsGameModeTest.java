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
public class ConstantsGameModeTest {

  private ConstantsGameMode unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsGameMode();
  }

  @Test
  public void shouldGetSetBattleStartCooldown() {
    long expected = 4711L;
    unitUnderTest.setBattleStartCooldown(expected);
    assertEquals(expected, unitUnderTest.getBattleStartCooldown());
  }

  @Test
  public void shouldGetSetCardLevelAdjustment() {
    String expected = "astring";
    unitUnderTest.setCardLevelAdjustment(expected);
    assertEquals(expected, unitUnderTest.getCardLevelAdjustment());
  }

  @Test
  public void shouldGetSetClanWarDescription() {
    String expected = "astring";
    unitUnderTest.setClanWarDescription(expected);
    assertEquals(expected, unitUnderTest.getClanWarDescription());
  }

  @Test
  public void shouldGetSetDeckSelection() {
    String expected = "astring";
    unitUnderTest.setDeckSelection(expected);
    assertEquals(expected, unitUnderTest.getDeckSelection());
  }

  @Test
  public void shouldGetSetElixirProductionMultiplier() {
    int expected = 815;
    unitUnderTest.setElixirProductionMultiplier(expected);
    assertEquals(expected, unitUnderTest.getElixirProductionMultiplier());
  }

  @Test
  public void shouldGetSetElixirProductionOvertimeMultiplier() {
    int expected = 815;
    unitUnderTest.setElixirProductionOvertimeMultiplier(expected);
    assertEquals(expected, unitUnderTest.getElixirProductionOvertimeMultiplier());
  }

  @Test
  public void shouldGetSetEventDeckSetLimit() {
    String expected = "astring";
    unitUnderTest.setEventDeckSetLimit(expected);
    assertEquals(expected, unitUnderTest.getEventDeckSetLimit());
  }

  @Test
  public void shouldGetSetFixedArena() {
    String expected = "astring";
    unitUnderTest.setFixedArena(expected);
    assertEquals(expected, unitUnderTest.getFixedArena());
  }

  @Test
  public void shouldGetSetFixedDeckOrder() {
    boolean expected = false;
    unitUnderTest.setFixedDeckOrder(expected);
    assertEquals(expected, unitUnderTest.isFixedDeckOrder());
  }

  @Test
  public void shouldGetSetForcedDeckCards() {
    String expected = "astring";
    unitUnderTest.setForcedDeckCards(expected);
    assertEquals(expected, unitUnderTest.getForcedDeckCards());
  }

  @Test
  public void shouldGetSetGemsPerTower1() {
    int expected = 815;
    unitUnderTest.setGemsPerTower1(expected);
    assertEquals(expected, unitUnderTest.getGemsPerTower1());
  }

  @Test
  public void shouldGetSetGemsPerTower2() {
    int expected = 815;
    unitUnderTest.setGemsPerTower2(expected);
    assertEquals(expected, unitUnderTest.getGemsPerTower2());
  }

  @Test
  public void shouldGetSetGemsPerTower3() {
    int expected = 815;
    unitUnderTest.setGemsPerTower3(expected);
    assertEquals(expected, unitUnderTest.getGemsPerTower3());
  }

  @Test
  public void shouldGetSetGivesClanScore() {
    boolean expected = false;
    unitUnderTest.setGivesClanScore(expected);
    assertEquals(expected, unitUnderTest.isGivesClanScore());
  }

  @Test
  public void shouldGetSetGlobalBuff() {
    String expected = "astring";
    unitUnderTest.setGlobalBuff(expected);
    assertEquals(expected, unitUnderTest.getGlobalBuff());
  }

  @Test
  public void shouldGetSetGoldPerTower1() {
    int expected = 815;
    unitUnderTest.setGoldPerTower1(expected);
    assertEquals(expected, unitUnderTest.getGoldPerTower1());
  }

  @Test
  public void shouldGetSetGoldPerTower2() {
    int expected = 815;
    unitUnderTest.setGoldPerTower2(expected);
    assertEquals(expected, unitUnderTest.getGoldPerTower2());
  }

  @Test
  public void shouldGetSetGoldPerTower3() {
    int expected = 815;
    unitUnderTest.setGoldPerTower3(expected);
    assertEquals(expected, unitUnderTest.getGoldPerTower3());
  }

  @Test
  public void shouldGetSetHeist() {
    boolean expected = false;
    unitUnderTest.setHeist(expected);
    assertEquals(expected, unitUnderTest.isHeist());
  }

  @Test
  public void shouldGetSetHeroes() {
    boolean expected = false;
    unitUnderTest.setHeroes(expected);
    assertEquals(expected, unitUnderTest.isHeroes());
  }

  @Test
  public void shouldGetSetId() {
    long expected = 4711L;
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
  public void shouldGetSetNameEn() {
    String expected = "astring";
    unitUnderTest.setNameEn(expected);
    assertEquals(expected, unitUnderTest.getNameEn());
  }

  @Test
  public void shouldGetSetOvertimeSeconds() {
    long expected = 4711L;
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
  public void shouldGetSetPredefinedDecks() {
    String expected = "astring";
    unitUnderTest.setPredefinedDecks(expected);
    assertEquals(expected, unitUnderTest.getPredefinedDecks());
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
  public void shouldGetSetSkinSet() {
    String expected = "astring";
    unitUnderTest.setSkinSet(expected);
    assertEquals(expected, unitUnderTest.getSkinSet());
  }

  @Test
  public void shouldGetSetStartingElixir() {
    int expected = 815;
    unitUnderTest.setStartingElixir(expected);
    assertEquals(expected, unitUnderTest.getStartingElixir());
  }

  @Test
  public void shouldGetSetSwappingTowers() {
    boolean expected = false;
    unitUnderTest.setSwappingTowers(expected);
    assertEquals(expected, unitUnderTest.isSwappingTowers());
  }

  @Test
  public void shouldGetSetTargetTouchdowns() {
    int expected = 815;
    unitUnderTest.setTargetTouchdowns(expected);
    assertEquals(expected, unitUnderTest.getTargetTouchdowns());
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
  public void shouldGetSetEventDeckClanWar() {
    boolean expected = false;
    unitUnderTest.setEventDeckClanWar(expected);
    assertEquals(expected, unitUnderTest.isEventDeckClanWar());
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
  public void shouldGetSetRewardGold() {
    java.util.List<Integer> expected = new java.util.ArrayList<Integer>();
    unitUnderTest.setRewardGold(expected);
    assertEquals(expected, unitUnderTest.getRewardGold());
  }

  @Test
  public void shouldGetSetRewardCards() {
    java.util.List<Integer> expected = new java.util.ArrayList<Integer>();
    unitUnderTest.setRewardCards(expected);
    assertEquals(expected, unitUnderTest.getRewardCards());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setBattleStartCooldown(4711L);
    unitUnderTest.setCardLevelAdjustment("astring");
    unitUnderTest.setClanWarDescription("astring");
    unitUnderTest.setDeckSelection("astring");
    unitUnderTest.setElixirProductionMultiplier(815);
    unitUnderTest.setElixirProductionOvertimeMultiplier(815);
    unitUnderTest.setEventDeckSetLimit("astring");
    unitUnderTest.setFixedArena("astring");
    unitUnderTest.setFixedDeckOrder(false);
    unitUnderTest.setForcedDeckCards("astring");
    unitUnderTest.setGemsPerTower1(815);
    unitUnderTest.setGemsPerTower2(815);
    unitUnderTest.setGemsPerTower3(815);
    unitUnderTest.setGivesClanScore(false);
    unitUnderTest.setGlobalBuff("astring");
    unitUnderTest.setGoldPerTower1(815);
    unitUnderTest.setGoldPerTower2(815);
    unitUnderTest.setGoldPerTower3(815);
    unitUnderTest.setHeist(false);
    unitUnderTest.setHeroes(false);
    unitUnderTest.setId(4711L);
    unitUnderTest.setName("astring");
    unitUnderTest.setNameEn("astring");
    unitUnderTest.setOvertimeSeconds(4711L);
    unitUnderTest.setPlayers("astring");
    unitUnderTest.setPredefinedDecks("astring");
    unitUnderTest.setSameDeckOnBoth(false);
    unitUnderTest.setSeparateTeamDecks(false);
    unitUnderTest.setSkinSet("astring");
    unitUnderTest.setStartingElixir(815);
    unitUnderTest.setSwappingTowers(false);
    unitUnderTest.setTargetTouchdowns(815);
    unitUnderTest.setUseStartingElixir(false);
    unitUnderTest.setRandomBoosts(false);
    unitUnderTest.setEventDeckClanWar(false);
    unitUnderTest.setSpellSupport(false);
    unitUnderTest.setHasDarkElixirCollector(false);
    unitUnderTest.setRewardGold(new java.util.ArrayList<Integer>());
    unitUnderTest.setRewardCards(new java.util.ArrayList<Integer>());
    String expected = "ConstantsGameMode(battleStartCooldown=4711, cardLevelAdjustment=astring, clanWarDescription=astring, deckSelection=astring, elixirProductionMultiplier=815, elixirProductionOvertimeMultiplier=815, eventDeckSetLimit=astring, fixedArena=astring, fixedDeckOrder=false, forcedDeckCards=astring, gemsPerTower1=815, gemsPerTower2=815, gemsPerTower3=815, givesClanScore=false, globalBuff=astring, goldPerTower1=815, goldPerTower2=815, goldPerTower3=815, heist=false, heroes=false, id=4711, name=astring, nameEn=astring, overtimeSeconds=4711, players=astring, predefinedDecks=astring, sameDeckOnBoth=false, separateTeamDecks=false, skinSet=astring, startingElixir=815, swappingTowers=false, targetTouchdowns=815, useStartingElixir=false, randomBoosts=false, eventDeckClanWar=false, spellSupport=false, hasDarkElixirCollector=false, rewardGold=" + new java.util.ArrayList<Integer>() + ", rewardCards=" + new java.util.ArrayList<Integer>() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}