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
public class ConstantsCycleTest {

  private ConstantsCycle unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsCycle();
  }

  @Test
  public void shouldGetSetArena() {
    ConstantsArena expected = new ConstantsArena();
    unitUnderTest.setArena(expected);
    assertEquals(expected, unitUnderTest.getArena());
  }

  @Test
  public void shouldGetSetArenas() {
    java.util.List<ConstantsArena> expected = new java.util.ArrayList<ConstantsArena>();
    unitUnderTest.setArenas(expected);
    assertEquals(expected, unitUnderTest.getArenas());
  }

  @Test
  public void shouldGetSetBaseChest() {
    String expected = "astring";
    unitUnderTest.setBaseChest(expected);
    assertEquals(expected, unitUnderTest.getBaseChest());
  }

  @Test
  public void shouldGetSetBoostedChest() {
    boolean expected = false;
    unitUnderTest.setBoostedChest(expected);
    assertEquals(expected, unitUnderTest.isBoostedChest());
  }

  @Test
  public void shouldGetSetCardCount() {
    long expected = 4711L;
    unitUnderTest.setCardCount(expected);
    assertEquals(expected, unitUnderTest.getCardCount());
  }

  @Test
  public void shouldGetSetChestCountInChestCycle() {
    long expected = 4711L;
    unitUnderTest.setChestCountInChestCycle(expected);
    assertEquals(expected, unitUnderTest.getChestCountInChestCycle());
  }

  @Test
  public void shouldGetSetDescription() {
    String expected = "astring";
    unitUnderTest.setDescription(expected);
    assertEquals(expected, unitUnderTest.getDescription());
  }

  @Test
  public void shouldGetSetDifferentSpells() {
    long expected = 4711L;
    unitUnderTest.setDifferentSpells(expected);
    assertEquals(expected, unitUnderTest.getDifferentSpells());
  }

  @Test
  public void shouldGetSetDraftChest() {
    boolean expected = false;
    unitUnderTest.setDraftChest(expected);
    assertEquals(expected, unitUnderTest.isDraftChest());
  }

  @Test
  public void shouldGetSetEpicChance() {
    long expected = 4711L;
    unitUnderTest.setEpicChance(expected);
    assertEquals(expected, unitUnderTest.getEpicChance());
  }

  @Test
  public void shouldGetSetExp() {
    long expected = 4711L;
    unitUnderTest.setExp(expected);
    assertEquals(expected, unitUnderTest.getExp());
  }

  @Test
  public void shouldGetSetGuaranteedSpells() {
    String expected = "astring";
    unitUnderTest.setGuaranteedSpells(expected);
    assertEquals(expected, unitUnderTest.getGuaranteedSpells());
  }

  @Test
  public void shouldGetSetInArenaInfo() {
    boolean expected = false;
    unitUnderTest.setInArenaInfo(expected);
    assertEquals(expected, unitUnderTest.isInArenaInfo());
  }

  @Test
  public void shouldGetSetInShop() {
    boolean expected = false;
    unitUnderTest.setInShop(expected);
    assertEquals(expected, unitUnderTest.isInShop());
  }

  @Test
  public void shouldGetSetLegendaryChance() {
    long expected = 4711L;
    unitUnderTest.setLegendaryChance(expected);
    assertEquals(expected, unitUnderTest.getLegendaryChance());
  }

  @Test
  public void shouldGetSetLegendaryOverrideChance() {
    long expected = 4711L;
    unitUnderTest.setLegendaryOverrideChance(expected);
    assertEquals(expected, unitUnderTest.getLegendaryOverrideChance());
  }

  @Test
  public void shouldGetSetMaxGold() {
    long expected = 4711L;
    unitUnderTest.setMaxGold(expected);
    assertEquals(expected, unitUnderTest.getMaxGold());
  }

  @Test
  public void shouldGetSetMaxGoldPerCard() {
    long expected = 4711L;
    unitUnderTest.setMaxGoldPerCard(expected);
    assertEquals(expected, unitUnderTest.getMaxGoldPerCard());
  }

  @Test
  public void shouldGetSetMinGold() {
    long expected = 4711L;
    unitUnderTest.setMinGold(expected);
    assertEquals(expected, unitUnderTest.getMinGold());
  }

  @Test
  public void shouldGetSetMinGoldPerCard() {
    long expected = 4711L;
    unitUnderTest.setMinGoldPerCard(expected);
    assertEquals(expected, unitUnderTest.getMinGoldPerCard());
  }

  @Test
  public void shouldGetSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  public void shouldGetSetNotification() {
    String expected = "astring";
    unitUnderTest.setNotification(expected);
    assertEquals(expected, unitUnderTest.getNotification());
  }

  @Test
  public void shouldGetSetRandomSpells() {
    long expected = 4711L;
    unitUnderTest.setRandomSpells(expected);
    assertEquals(expected, unitUnderTest.getRandomSpells());
  }

  @Test
  public void shouldGetSetRareChance() {
    long expected = 4711L;
    unitUnderTest.setRareChance(expected);
    assertEquals(expected, unitUnderTest.getRareChance());
  }

  @Test
  public void shouldGetSetShopPriceWithoutSpeedUp() {
    long expected = 4711L;
    unitUnderTest.setShopPriceWithoutSpeedUp(expected);
    assertEquals(expected, unitUnderTest.getShopPriceWithoutSpeedUp());
  }

  @Test
  public void shouldGetSetSkinChance() {
    long expected = 4711L;
    unitUnderTest.setSkinChance(expected);
    assertEquals(expected, unitUnderTest.getSkinChance());
  }

  @Test
  public void shouldGetSetSortValue() {
    long expected = 4711L;
    unitUnderTest.setSortValue(expected);
    assertEquals(expected, unitUnderTest.getSortValue());
  }

  @Test
  public void shouldGetSetSpecialOffer() {
    boolean expected = false;
    unitUnderTest.setSpecialOffer(expected);
    assertEquals(expected, unitUnderTest.isSpecialOffer());
  }

  @Test
  public void shouldGetSetSpellSet() {
    String expected = "astring";
    unitUnderTest.setSpellSet(expected);
    assertEquals(expected, unitUnderTest.getSpellSet());
  }

  @Test
  public void shouldGetSetSurvivalChest() {
    boolean expected = false;
    unitUnderTest.setSurvivalChest(expected);
    assertEquals(expected, unitUnderTest.isSurvivalChest());
  }

  @Test
  public void shouldGetSetTimeTakenDays() {
    long expected = 4711L;
    unitUnderTest.setTimeTakenDays(expected);
    assertEquals(expected, unitUnderTest.getTimeTakenDays());
  }

  @Test
  public void shouldGetSetTimeTakenHours() {
    long expected = 4711L;
    unitUnderTest.setTimeTakenHours(expected);
    assertEquals(expected, unitUnderTest.getTimeTakenHours());
  }

  @Test
  public void shouldGetSetTimeTakenMinutes() {
    long expected = 4711L;
    unitUnderTest.setTimeTakenMinutes(expected);
    assertEquals(expected, unitUnderTest.getTimeTakenMinutes());
  }

  @Test
  public void shouldGetSetTimeTakenSeconds() {
    long expected = 4711L;
    unitUnderTest.setTimeTakenSeconds(expected);
    assertEquals(expected, unitUnderTest.getTimeTakenSeconds());
  }

  @Test
  public void shouldGetSetTournamentChest() {
    boolean expected = false;
    unitUnderTest.setTournamentChest(expected);
    assertEquals(expected, unitUnderTest.isTournamentChest());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setArena(new ConstantsArena());
    unitUnderTest.setArenas(new java.util.ArrayList<ConstantsArena>());
    unitUnderTest.setBaseChest("astring");
    unitUnderTest.setBoostedChest(false);
    unitUnderTest.setCardCount(4711L);
    unitUnderTest.setChestCountInChestCycle(4711L);
    unitUnderTest.setDescription("astring");
    unitUnderTest.setDifferentSpells(4711L);
    unitUnderTest.setDraftChest(false);
    unitUnderTest.setEpicChance(4711L);
    unitUnderTest.setExp(4711L);
    unitUnderTest.setGuaranteedSpells("astring");
    unitUnderTest.setInArenaInfo(false);
    unitUnderTest.setInShop(false);
    unitUnderTest.setLegendaryChance(4711L);
    unitUnderTest.setLegendaryOverrideChance(4711L);
    unitUnderTest.setMaxGold(4711L);
    unitUnderTest.setMaxGoldPerCard(4711L);
    unitUnderTest.setMinGold(4711L);
    unitUnderTest.setMinGoldPerCard(4711L);
    unitUnderTest.setName("astring");
    unitUnderTest.setNotification("astring");
    unitUnderTest.setRandomSpells(4711L);
    unitUnderTest.setRareChance(4711L);
    unitUnderTest.setShopPriceWithoutSpeedUp(4711L);
    unitUnderTest.setSkinChance(4711L);
    unitUnderTest.setSortValue(4711L);
    unitUnderTest.setSpecialOffer(false);
    unitUnderTest.setSpellSet("astring");
    unitUnderTest.setSurvivalChest(false);
    unitUnderTest.setTimeTakenDays(4711L);
    unitUnderTest.setTimeTakenHours(4711L);
    unitUnderTest.setTimeTakenMinutes(4711L);
    unitUnderTest.setTimeTakenSeconds(4711L);
    unitUnderTest.setTournamentChest(false);
    String expected = "ConstantsCycle(arena=" + new ConstantsArena() + ", arenas=" + new java.util.ArrayList<ConstantsArena>() + ", baseChest=astring, boostedChest=false, cardCount=4711, chestCountInChestCycle=4711, description=astring, differentSpells=4711, draftChest=false, epicChance=4711, exp=4711, guaranteedSpells=astring, inArenaInfo=false, inShop=false, legendaryChance=4711, legendaryOverrideChance=4711, maxGold=4711, maxGoldPerCard=4711, minGold=4711, minGoldPerCard=4711, name=astring, notification=astring, randomSpells=4711, rareChance=4711, shopPriceWithoutSpeedUp=4711, skinChance=4711, sortValue=4711, specialOffer=false, spellSet=astring, survivalChest=false, timeTakenDays=4711, timeTakenHours=4711, timeTakenMinutes=4711, timeTakenSeconds=4711, tournamentChest=false)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}