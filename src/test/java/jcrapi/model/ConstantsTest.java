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
  public void shouldGetSetAllianceBadges() {
    java.util.List<ConstantsAllianceBadge> expected = new java.util.ArrayList<ConstantsAllianceBadge>();
    unitUnderTest.setAllianceBadges(expected);
    assertEquals(expected, unitUnderTest.getAllianceBadges());
  }

  @Test
  public void shouldGetSetArenas() {
    java.util.List<ConstantsArena> expected = new java.util.ArrayList<ConstantsArena>();
    unitUnderTest.setArenas(expected);
    assertEquals(expected, unitUnderTest.getArenas());
  }

  @Test
  public void shouldGetSetCards() {
    java.util.List<ConstantsCard> expected = new java.util.ArrayList<ConstantsCard>();
    unitUnderTest.setCards(expected);
    assertEquals(expected, unitUnderTest.getCards());
  }

  @Test
  public void shouldGetSetCardsStats() {
    ConstantsCardsStats expected = new ConstantsCardsStats();
    unitUnderTest.setCardsStats(expected);
    assertEquals(expected, unitUnderTest.getCardsStats());
  }

  @Test
  public void shouldGetSetChallenges() {
    java.util.List<ConstantsChallenge> expected = new java.util.ArrayList<ConstantsChallenge>();
    unitUnderTest.setChallenges(expected);
    assertEquals(expected, unitUnderTest.getChallenges());
  }

  @Test
  public void shouldGetSetChestOrder() {
    ConstantsChestOrder expected = new ConstantsChestOrder();
    unitUnderTest.setChestOrder(expected);
    assertEquals(expected, unitUnderTest.getChestOrder());
  }

  @Test
  public void shouldGetSetClanChest() {
    ConstantsClanChest expected = new ConstantsClanChest();
    unitUnderTest.setClanChest(expected);
    assertEquals(expected, unitUnderTest.getClanChest());
  }

  @Test
  public void shouldGetSetGameModes() {
    java.util.List<ConstantsGameMode> expected = new java.util.ArrayList<ConstantsGameMode>();
    unitUnderTest.setGameModes(expected);
    assertEquals(expected, unitUnderTest.getGameModes());
  }

  @Test
  public void shouldGetSetRarities() {
    java.util.List<ConstantsRarity> expected = new java.util.ArrayList<ConstantsRarity>();
    unitUnderTest.setRarities(expected);
    assertEquals(expected, unitUnderTest.getRarities());
  }

  @Test
  public void shouldGetSetRegions() {
    java.util.List<ConstantsRegion> expected = new java.util.ArrayList<ConstantsRegion>();
    unitUnderTest.setRegions(expected);
    assertEquals(expected, unitUnderTest.getRegions());
  }

  @Test
  public void shouldGetSetTournaments() {
    java.util.List<ConstantsTournament> expected = new java.util.ArrayList<ConstantsTournament>();
    unitUnderTest.setTournaments(expected);
    assertEquals(expected, unitUnderTest.getTournaments());
  }

  @Test
  public void shouldGetSetTreasureChests() {
    ConstantsTreasureChests expected = new ConstantsTreasureChests();
    unitUnderTest.setTreasureChests(expected);
    assertEquals(expected, unitUnderTest.getTreasureChests());
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
    unitUnderTest.setAllianceBadges(new java.util.ArrayList<ConstantsAllianceBadge>());
    unitUnderTest.setArenas(new java.util.ArrayList<ConstantsArena>());
    unitUnderTest.setCards(new java.util.ArrayList<ConstantsCard>());
    unitUnderTest.setCardsStats(new ConstantsCardsStats());
    unitUnderTest.setChallenges(new java.util.ArrayList<ConstantsChallenge>());
    unitUnderTest.setChestOrder(new ConstantsChestOrder());
    unitUnderTest.setClanChest(new ConstantsClanChest());
    unitUnderTest.setGameModes(new java.util.ArrayList<ConstantsGameMode>());
    unitUnderTest.setRarities(new java.util.ArrayList<ConstantsRarity>());
    unitUnderTest.setRegions(new java.util.ArrayList<ConstantsRegion>());
    unitUnderTest.setTournaments(new java.util.ArrayList<ConstantsTournament>());
    unitUnderTest.setTreasureChests(new ConstantsTreasureChests());
    unitUnderTest.setRewardGold(new java.util.ArrayList<Integer>());
    unitUnderTest.setRewardCards(new java.util.ArrayList<Integer>());
    String expected = "Constants(allianceBadges=" + new java.util.ArrayList<ConstantsAllianceBadge>() + ", arenas=" + new java.util.ArrayList<ConstantsArena>() + ", cards=" + new java.util.ArrayList<ConstantsCard>() + ", cardsStats=" + new ConstantsCardsStats() + ", challenges=" + new java.util.ArrayList<ConstantsChallenge>() + ", chestOrder=" + new ConstantsChestOrder() + ", clanChest=" + new ConstantsClanChest() + ", gameModes=" + new java.util.ArrayList<ConstantsGameMode>() + ", rarities=" + new java.util.ArrayList<ConstantsRarity>() + ", regions=" + new java.util.ArrayList<ConstantsRegion>() + ", tournaments=" + new java.util.ArrayList<ConstantsTournament>() + ", treasureChests=" + new ConstantsTreasureChests() + ", rewardGold=" + new java.util.ArrayList<Integer>() + ", rewardCards=" + new java.util.ArrayList<Integer>() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}