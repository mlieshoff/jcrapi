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
public class ConstantsArenaTest {

  private ConstantsArena unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsArena();
  }

  @Test
  public void shouldGetSetArena() {
    long expected = 4711L;
    unitUnderTest.setArena(expected);
    assertEquals(expected, unitUnderTest.getArena());
  }

  @Test
  public void shouldGetSetArenaId() {
    long expected = 4711L;
    unitUnderTest.setArenaId(expected);
    assertEquals(expected, unitUnderTest.getArenaId());
  }

  @Test
  public void shouldGetSetBattleRewardGold() {
    long expected = 4711L;
    unitUnderTest.setBattleRewardGold(expected);
    assertEquals(expected, unitUnderTest.getBattleRewardGold());
  }

  @Test
  public void shouldGetSetChestArena() {
    String expected = "astring";
    unitUnderTest.setChestArena(expected);
    assertEquals(expected, unitUnderTest.getChestArena());
  }

  @Test
  public void shouldGetSetChestRewardMultiplier() {
    long expected = 4711L;
    unitUnderTest.setChestRewardMultiplier(expected);
    assertEquals(expected, unitUnderTest.getChestRewardMultiplier());
  }

  @Test
  public void shouldGetSetCardCountByArena() {
    long expected = 4711L;
    unitUnderTest.setCardCountByArena(expected);
    assertEquals(expected, unitUnderTest.getCardCountByArena());
  }

  @Test
  public void shouldGetSetCardCountCommon() {
    double expected = 1.41;
    unitUnderTest.setCardCountCommon(expected);
    assertEquals(expected, unitUnderTest.getCardCountCommon(), 0.0);
  }

  @Test
  public void shouldGetSetCardCountEpic() {
    double expected = 1.41;
    unitUnderTest.setCardCountEpic(expected);
    assertEquals(expected, unitUnderTest.getCardCountEpic(), 0.0);
  }

  @Test
  public void shouldGetSetCardCountLegendary() {
    double expected = 1.41;
    unitUnderTest.setCardCountLegendary(expected);
    assertEquals(expected, unitUnderTest.getCardCountLegendary(), 0.0);
  }

  @Test
  public void shouldGetSetCardCountRare() {
    double expected = 1.41;
    unitUnderTest.setCardCountRare(expected);
    assertEquals(expected, unitUnderTest.getCardCountRare(), 0.0);
  }

  @Test
  public void shouldGetSetDailyDonationCapacityLimit() {
    long expected = 4711L;
    unitUnderTest.setDailyDonationCapacityLimit(expected);
    assertEquals(expected, unitUnderTest.getDailyDonationCapacityLimit());
  }

  @Test
  public void shouldGetSetDemoteTrophyLimit() {
    long expected = 4711L;
    unitUnderTest.setDemoteTrophyLimit(expected);
    assertEquals(expected, unitUnderTest.getDemoteTrophyLimit());
  }

  @Test
  public void shouldGetSetForceQuestChestCycle() {
    String expected = "astring";
    unitUnderTest.setForceQuestChestCycle(expected);
    assertEquals(expected, unitUnderTest.getForceQuestChestCycle());
  }

  @Test
  public void shouldGetSetId() {
    long expected = 4711L;
    unitUnderTest.setId(expected);
    assertEquals(expected, unitUnderTest.getId());
  }

  @Test
  public void shouldGetSetInUse() {
    boolean expected = false;
    unitUnderTest.setInUse(expected);
    assertEquals(expected, unitUnderTest.isInUse());
  }

  @Test
  public void shouldGetSetKey() {
    String expected = "astring";
    unitUnderTest.setKey(expected);
    assertEquals(expected, unitUnderTest.getKey());
  }

  @Test
  public void shouldGetSetLeagueId() {
    String expected = "astring";
    unitUnderTest.setLeagueId(expected);
    assertEquals(expected, unitUnderTest.getLeagueId());
  }

  @Test
  public void shouldGetSetMatchmakingMaxSeconds() {
    long expected = 4711L;
    unitUnderTest.setMatchmakingMaxSeconds(expected);
    assertEquals(expected, unitUnderTest.getMatchmakingMaxSeconds());
  }

  @Test
  public void shouldGetSetMatchmakingMaxTrophyDelta() {
    long expected = 4711L;
    unitUnderTest.setMatchmakingMaxTrophyDelta(expected);
    assertEquals(expected, unitUnderTest.getMatchmakingMaxTrophyDelta());
  }

  @Test
  public void shouldGetSetMatchmakingMinTrophyDelta() {
    long expected = 4711L;
    unitUnderTest.setMatchmakingMinTrophyDelta(expected);
    assertEquals(expected, unitUnderTest.getMatchmakingMinTrophyDelta());
  }

  @Test
  public void shouldGetSetMaxDonationCountCommon() {
    long expected = 4711L;
    unitUnderTest.setMaxDonationCountCommon(expected);
    assertEquals(expected, unitUnderTest.getMaxDonationCountCommon());
  }

  @Test
  public void shouldGetSetMaxDonationCountEpic() {
    long expected = 4711L;
    unitUnderTest.setMaxDonationCountEpic(expected);
    assertEquals(expected, unitUnderTest.getMaxDonationCountEpic());
  }

  @Test
  public void shouldGetSetMaxDonationCountRare() {
    long expected = 4711L;
    unitUnderTest.setMaxDonationCountRare(expected);
    assertEquals(expected, unitUnderTest.getMaxDonationCountRare());
  }

  @Test
  public void shouldGetSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  public void shouldGetSetQuestCycle() {
    String expected = "astring";
    unitUnderTest.setQuestCycle(expected);
    assertEquals(expected, unitUnderTest.getQuestCycle());
  }

  @Test
  public void shouldGetSetRequestSize() {
    long expected = 4711L;
    unitUnderTest.setRequestSize(expected);
    assertEquals(expected, unitUnderTest.getRequestSize());
  }

  @Test
  public void shouldGetSetSeasonRewardChest() {
    String expected = "astring";
    unitUnderTest.setSeasonRewardChest(expected);
    assertEquals(expected, unitUnderTest.getSeasonRewardChest());
  }

  @Test
  public void shouldGetSetShopChestRewardMultiplier() {
    long expected = 4711L;
    unitUnderTest.setShopChestRewardMultiplier(expected);
    assertEquals(expected, unitUnderTest.getShopChestRewardMultiplier());
  }

  @Test
  public void shouldGetSetSubtitle() {
    String expected = "astring";
    unitUnderTest.setSubtitle(expected);
    assertEquals(expected, unitUnderTest.getSubtitle());
  }

  @Test
  public void shouldGetSetTitle() {
    String expected = "astring";
    unitUnderTest.setTitle(expected);
    assertEquals(expected, unitUnderTest.getTitle());
  }

  @Test
  public void shouldGetSetTrainingCamp() {
    boolean expected = false;
    unitUnderTest.setTrainingCamp(expected);
    assertEquals(expected, unitUnderTest.isTrainingCamp());
  }

  @Test
  public void shouldGetSetTrophyLimit() {
    long expected = 4711L;
    unitUnderTest.setTrophyLimit(expected);
    assertEquals(expected, unitUnderTest.getTrophyLimit());
  }

  @Test
  public void shouldGetSetTvArena() {
    String expected = "astring";
    unitUnderTest.setTvArena(expected);
    assertEquals(expected, unitUnderTest.getTvArena());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setArena(4711L);
    unitUnderTest.setArenaId(4711L);
    unitUnderTest.setBattleRewardGold(4711L);
    unitUnderTest.setChestArena("astring");
    unitUnderTest.setChestRewardMultiplier(4711L);
    unitUnderTest.setCardCountByArena(4711L);
    unitUnderTest.setCardCountCommon(1.41);
    unitUnderTest.setCardCountEpic(1.41);
    unitUnderTest.setCardCountLegendary(1.41);
    unitUnderTest.setCardCountRare(1.41);
    unitUnderTest.setDailyDonationCapacityLimit(4711L);
    unitUnderTest.setDemoteTrophyLimit(4711L);
    unitUnderTest.setForceQuestChestCycle("astring");
    unitUnderTest.setId(4711L);
    unitUnderTest.setInUse(false);
    unitUnderTest.setKey("astring");
    unitUnderTest.setLeagueId("astring");
    unitUnderTest.setMatchmakingMaxSeconds(4711L);
    unitUnderTest.setMatchmakingMaxTrophyDelta(4711L);
    unitUnderTest.setMatchmakingMinTrophyDelta(4711L);
    unitUnderTest.setMaxDonationCountCommon(4711L);
    unitUnderTest.setMaxDonationCountEpic(4711L);
    unitUnderTest.setMaxDonationCountRare(4711L);
    unitUnderTest.setName("astring");
    unitUnderTest.setQuestCycle("astring");
    unitUnderTest.setRequestSize(4711L);
    unitUnderTest.setSeasonRewardChest("astring");
    unitUnderTest.setShopChestRewardMultiplier(4711L);
    unitUnderTest.setSubtitle("astring");
    unitUnderTest.setTitle("astring");
    unitUnderTest.setTrainingCamp(false);
    unitUnderTest.setTrophyLimit(4711L);
    unitUnderTest.setTvArena("astring");
    String expected = "ConstantsArena(arena=4711, arenaId=4711, battleRewardGold=4711, chestArena=astring, chestRewardMultiplier=4711, cardCountByArena=4711, cardCountCommon=1.41, cardCountEpic=1.41, cardCountLegendary=1.41, cardCountRare=1.41, dailyDonationCapacityLimit=4711, demoteTrophyLimit=4711, forceQuestChestCycle=astring, id=4711, InUse=false, key=astring, leagueId=astring, matchmakingMaxSeconds=4711, matchmakingMaxTrophyDelta=4711, matchmakingMinTrophyDelta=4711, maxDonationCountCommon=4711, maxDonationCountEpic=4711, maxDonationCountRare=4711, name=astring, questCycle=astring, requestSize=4711, seasonRewardChest=astring, shopChestRewardMultiplier=4711, subtitle=astring, title=astring, trainingCamp=false, trophyLimit=4711, tvArena=astring)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}