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
public class RarityTest {

    private Rarity unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new Rarity();
    }

    @Test
    public void shouldGetSetBalanceMultiplier() {
        int expected = 815;
        unitUnderTest.setBalanceMultiplier(expected);
        assertEquals(expected, unitUnderTest.getBalanceMultiplier());
    }

    @Test
    public void shouldGetSetChanceWeight() {
        int expected = 815;
        unitUnderTest.setChanceWeight(expected);
        assertEquals(expected, unitUnderTest.getChanceWeight());
    }

    @Test
    public void shouldGetSetCloneRelativeLevel() {
        int expected = 815;
        unitUnderTest.setCloneRelativeLevel(expected);
        assertEquals(expected, unitUnderTest.getCloneRelativeLevel());
    }

    @Test
    public void shouldGetSetDonateCapacity() {
        int expected = 815;
        unitUnderTest.setDonateCapacity(expected);
        assertEquals(expected, unitUnderTest.getDonateCapacity());
    }

    @Test
    public void shouldGetSetDonateReward() {
        int expected = 815;
        unitUnderTest.setDonateReward(expected);
        assertEquals(expected, unitUnderTest.getDonateReward());
    }

    @Test
    public void shouldGetSetDonateXp() {
        int expected = 815;
        unitUnderTest.setDonateXp(expected);
        assertEquals(expected, unitUnderTest.getDonateXp());
    }

    @Test
    public void shouldGetSetGoldConversionValue() {
        int expected = 815;
        unitUnderTest.setGoldConversionValue(expected);
        assertEquals(expected, unitUnderTest.getGoldConversionValue());
    }

    @Test
    public void shouldGetSetLevelCount() {
        int expected = 815;
        unitUnderTest.setLevelCount(expected);
        assertEquals(expected, unitUnderTest.getLevelCount());
    }

    @Test
    public void shouldGetSetMirrorRelativeLevel() {
        int expected = 815;
        unitUnderTest.setMirrorRelativeLevel(expected);
        assertEquals(expected, unitUnderTest.getMirrorRelativeLevel());
    }

    @Test
    public void shouldGetSetPowerLevelMultiplier() {
        java.util.List<Integer> expected = new java.util.ArrayList<Integer>();
        unitUnderTest.setPowerLevelMultiplier(expected);
        assertEquals(expected, unitUnderTest.getPowerLevelMultiplier());
    }

    @Test
    public void shouldGetSetRefundGems() {
        int expected = 815;
        unitUnderTest.setRefundGems(expected);
        assertEquals(expected, unitUnderTest.getRefundGems());
    }

    @Test
    public void shouldGetSetRelativeLevel() {
        int expected = 815;
        unitUnderTest.setRelativeLevel(expected);
        assertEquals(expected, unitUnderTest.getRelativeLevel());
    }

    @Test
    public void shouldGetSetSortCapacity() {
        int expected = 815;
        unitUnderTest.setSortCapacity(expected);
        assertEquals(expected, unitUnderTest.getSortCapacity());
    }

    @Test
    public void shouldGetSetUpgradeCost() {
        java.util.List<Integer> expected = new java.util.ArrayList<Integer>();
        unitUnderTest.setUpgradeCost(expected);
        assertEquals(expected, unitUnderTest.getUpgradeCost());
    }

    @Test
    public void shouldGetSetUpgradeExp() {
        java.util.List<Integer> expected = new java.util.ArrayList<Integer>();
        unitUnderTest.setUpgradeExp(expected);
        assertEquals(expected, unitUnderTest.getUpgradeExp());
    }

    @Test
    public void shouldGetSetUpgradeMaterialCost() {
        java.util.List<Integer> expected = new java.util.ArrayList<Integer>();
        unitUnderTest.setUpgradeMaterialCost(expected);
        assertEquals(expected, unitUnderTest.getUpgradeMaterialCost());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setBalanceMultiplier(815);
        unitUnderTest.setChanceWeight(815);
        unitUnderTest.setCloneRelativeLevel(815);
        unitUnderTest.setDonateCapacity(815);
        unitUnderTest.setDonateReward(815);
        unitUnderTest.setDonateXp(815);
        unitUnderTest.setGoldConversionValue(815);
        unitUnderTest.setLevelCount(815);
        unitUnderTest.setMirrorRelativeLevel(815);
        unitUnderTest.setPowerLevelMultiplier(new java.util.ArrayList<Integer>());
        unitUnderTest.setRefundGems(815);
        unitUnderTest.setRelativeLevel(815);
        unitUnderTest.setSortCapacity(815);
        unitUnderTest.setUpgradeCost(new java.util.ArrayList<Integer>());
        unitUnderTest.setUpgradeExp(new java.util.ArrayList<Integer>());
        unitUnderTest.setUpgradeMaterialCost(new java.util.ArrayList<Integer>());
        String expected = "Rarity{balanceMultiplier=815, chanceWeight=815, cloneRelativeLevel=815, donateCapacity=815, donateReward=815, donateXp=815, goldConversionValue=815, levelCount=815, mirrorRelativeLevel=815, powerLevelMultiplier=" + new java.util.ArrayList<Integer>() + ", refundGems=815, relativeLevel=815, sortCapacity=815, upgradeCost=" + new java.util.ArrayList<Integer>() + ", upgradeExp=" + new java.util.ArrayList<Integer>() + ", upgradeMaterialCost=" + new java.util.ArrayList<Integer>() + "}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}