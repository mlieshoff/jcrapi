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
public class ConstantsChallengeTest {

  private ConstantsChallenge unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsChallenge();
  }

  @Test
  public void shouldGetSetEnabled() {
    boolean expected = false;
    unitUnderTest.setEnabled(expected);
    assertEquals(expected, unitUnderTest.isEnabled());
  }

  @Test
  public void shouldGetSetGameMode() {
    String expected = "astring";
    unitUnderTest.setGameMode(expected);
    assertEquals(expected, unitUnderTest.getGameMode());
  }

  @Test
  public void shouldGetSetId() {
    long expected = 4711L;
    unitUnderTest.setId(expected);
    assertEquals(expected, unitUnderTest.getId());
  }

  @Test
  public void shouldGetSetJoinCost() {
    long expected = 4711L;
    unitUnderTest.setJoinCost(expected);
    assertEquals(expected, unitUnderTest.getJoinCost());
  }

  @Test
  public void shouldGetSetJoinCostResource() {
    String expected = "astring";
    unitUnderTest.setJoinCostResource(expected);
    assertEquals(expected, unitUnderTest.getJoinCostResource());
  }

  @Test
  public void shouldGetSetKey() {
    String expected = "astring";
    unitUnderTest.setKey(expected);
    assertEquals(expected, unitUnderTest.getKey());
  }

  @Test
  public void shouldGetSetMaxLoss() {
    long expected = 4711L;
    unitUnderTest.setMaxLoss(expected);
    assertEquals(expected, unitUnderTest.getMaxLoss());
  }

  @Test
  public void shouldGetSetMaxWins() {
    long expected = 4711L;
    unitUnderTest.setMaxWins(expected);
    assertEquals(expected, unitUnderTest.getMaxWins());
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
  public void shouldGetSetRewardCards() {
    java.util.List<Long> expected = new java.util.ArrayList<Long>();
    unitUnderTest.setRewardCards(expected);
    assertEquals(expected, unitUnderTest.getRewardCards());
  }

  @Test
  public void shouldGetSetRewardGold() {
    java.util.List<Long> expected = new java.util.ArrayList<Long>();
    unitUnderTest.setRewardGold(expected);
    assertEquals(expected, unitUnderTest.getRewardGold());
  }

  @Test
  public void shouldGetSetRewardSpell() {
    String expected = "astring";
    unitUnderTest.setRewardSpell(expected);
    assertEquals(expected, unitUnderTest.getRewardSpell());
  }

  @Test
  public void shouldGetSetRewardSpellMaxCount() {
    long expected = 4711L;
    unitUnderTest.setRewardSpellMaxCount(expected);
    assertEquals(expected, unitUnderTest.getRewardSpellMaxCount());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setEnabled(false);
    unitUnderTest.setGameMode("astring");
    unitUnderTest.setId(4711L);
    unitUnderTest.setJoinCost(4711L);
    unitUnderTest.setJoinCostResource("astring");
    unitUnderTest.setKey("astring");
    unitUnderTest.setMaxLoss(4711L);
    unitUnderTest.setMaxWins(4711L);
    unitUnderTest.setName("astring");
    unitUnderTest.setNameEn("astring");
    unitUnderTest.setRewardCards(new java.util.ArrayList<Long>());
    unitUnderTest.setRewardGold(new java.util.ArrayList<Long>());
    unitUnderTest.setRewardSpell("astring");
    unitUnderTest.setRewardSpellMaxCount(4711L);
    String expected = "ConstantsChallenge(enabled=false, gameMode=astring, id=4711, joinCost=4711, joinCostResource=astring, key=astring, maxLoss=4711, maxWins=4711, name=astring, nameEn=astring, rewardCards=" + new java.util.ArrayList<Long>() + ", rewardGold=" + new java.util.ArrayList<Long>() + ", rewardSpell=astring, rewardSpellMaxCount=4711)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}