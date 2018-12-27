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
public class ConstantsRarityTest {

  private ConstantsRarity unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsRarity();
  }

  @Test
  public void shouldGetSetBalanceMultiplier() {
    long expected = 4711L;
    unitUnderTest.setBalanceMultiplier(expected);
    assertEquals(expected, unitUnderTest.getBalanceMultiplier());
  }

  @Test
  public void shouldGetSetChanceWeight() {
    long expected = 4711L;
    unitUnderTest.setChanceWeight(expected);
    assertEquals(expected, unitUnderTest.getChanceWeight());
  }

  @Test
  public void shouldGetSetCloneRelativeLevel() {
    long expected = 4711L;
    unitUnderTest.setCloneRelativeLevel(expected);
    assertEquals(expected, unitUnderTest.getCloneRelativeLevel());
  }

  @Test
  public void shouldGetSetDonateCapacity() {
    long expected = 4711L;
    unitUnderTest.setDonateCapacity(expected);
    assertEquals(expected, unitUnderTest.getDonateCapacity());
  }

  @Test
  public void shouldGetSetDonateReward() {
    long expected = 4711L;
    unitUnderTest.setDonateReward(expected);
    assertEquals(expected, unitUnderTest.getDonateReward());
  }

  @Test
  public void shouldGetSetDonateXp() {
    long expected = 4711L;
    unitUnderTest.setDonateXp(expected);
    assertEquals(expected, unitUnderTest.getDonateXp());
  }

  @Test
  public void shouldGetSetGoldConversionValue() {
    long expected = 4711L;
    unitUnderTest.setGoldConversionValue(expected);
    assertEquals(expected, unitUnderTest.getGoldConversionValue());
  }

  @Test
  public void shouldGetSetLevelCount() {
    long expected = 4711L;
    unitUnderTest.setLevelCount(expected);
    assertEquals(expected, unitUnderTest.getLevelCount());
  }

  @Test
  public void shouldGetSetMirrorRelativeLevel() {
    long expected = 4711L;
    unitUnderTest.setMirrorRelativeLevel(expected);
    assertEquals(expected, unitUnderTest.getMirrorRelativeLevel());
  }

  @Test
  public void shouldGetSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  public void shouldGetSetPowerLevelMultiplier() {
    java.util.List<Long> expected = new java.util.ArrayList<Long>();
    unitUnderTest.setPowerLevelMultiplier(expected);
    assertEquals(expected, unitUnderTest.getPowerLevelMultiplier());
  }

  @Test
  public void shouldGetSetRefundGems() {
    long expected = 4711L;
    unitUnderTest.setRefundGems(expected);
    assertEquals(expected, unitUnderTest.getRefundGems());
  }

  @Test
  public void shouldGetSetRelativeLevel() {
    long expected = 4711L;
    unitUnderTest.setRelativeLevel(expected);
    assertEquals(expected, unitUnderTest.getRelativeLevel());
  }

  @Test
  public void shouldGetSetSortCapacity() {
    long expected = 4711L;
    unitUnderTest.setSortCapacity(expected);
    assertEquals(expected, unitUnderTest.getSortCapacity());
  }

  @Test
  public void shouldGetSetUpgradeCost() {
    java.util.List<Long> expected = new java.util.ArrayList<Long>();
    unitUnderTest.setUpgradeCost(expected);
    assertEquals(expected, unitUnderTest.getUpgradeCost());
  }

  @Test
  public void shouldGetSetUpgradeExp() {
    java.util.List<Long> expected = new java.util.ArrayList<Long>();
    unitUnderTest.setUpgradeExp(expected);
    assertEquals(expected, unitUnderTest.getUpgradeExp());
  }

  @Test
  public void shouldGetSetUpgradeMaterialCount() {
    java.util.List<Long> expected = new java.util.ArrayList<Long>();
    unitUnderTest.setUpgradeMaterialCount(expected);
    assertEquals(expected, unitUnderTest.getUpgradeMaterialCount());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setBalanceMultiplier(4711L);
    unitUnderTest.setChanceWeight(4711L);
    unitUnderTest.setCloneRelativeLevel(4711L);
    unitUnderTest.setDonateCapacity(4711L);
    unitUnderTest.setDonateReward(4711L);
    unitUnderTest.setDonateXp(4711L);
    unitUnderTest.setGoldConversionValue(4711L);
    unitUnderTest.setLevelCount(4711L);
    unitUnderTest.setMirrorRelativeLevel(4711L);
    unitUnderTest.setName("astring");
    unitUnderTest.setPowerLevelMultiplier(new java.util.ArrayList<Long>());
    unitUnderTest.setRefundGems(4711L);
    unitUnderTest.setRelativeLevel(4711L);
    unitUnderTest.setSortCapacity(4711L);
    unitUnderTest.setUpgradeCost(new java.util.ArrayList<Long>());
    unitUnderTest.setUpgradeExp(new java.util.ArrayList<Long>());
    unitUnderTest.setUpgradeMaterialCount(new java.util.ArrayList<Long>());
    String expected = "ConstantsRarity(balanceMultiplier=4711, chanceWeight=4711, cloneRelativeLevel=4711, donateCapacity=4711, donateReward=4711, donateXp=4711, goldConversionValue=4711, levelCount=4711, mirrorRelativeLevel=4711, name=astring, powerLevelMultiplier=" + new java.util.ArrayList<Long>() + ", refundGems=4711, relativeLevel=4711, sortCapacity=4711, upgradeCost=" + new java.util.ArrayList<Long>() + ", upgradeExp=" + new java.util.ArrayList<Long>() + ", upgradeMaterialCount=" + new java.util.ArrayList<Long>() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}