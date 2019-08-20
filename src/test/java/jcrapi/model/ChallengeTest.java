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
public class ChallengeTest {

  private Challenge unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new Challenge();
  }

  @Test
  public void shouldGetSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  public void shouldGetSetGameMode() {
    String expected = "astring";
    unitUnderTest.setGameMode(expected);
    assertEquals(expected, unitUnderTest.getGameMode());
  }

  @Test
  public void shouldGetSetEnabled() {
    boolean expected = false;
    unitUnderTest.setEnabled(expected);
    assertEquals(expected, unitUnderTest.isEnabled());
  }

  @Test
  public void shouldGetSetJoinCost() {
    int expected = 815;
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
  public void shouldGetSetMaxWins() {
    int expected = 815;
    unitUnderTest.setMaxWins(expected);
    assertEquals(expected, unitUnderTest.getMaxWins());
  }

  @Test
  public void shouldGetSetMaxLoss() {
    int expected = 815;
    unitUnderTest.setMaxLoss(expected);
    assertEquals(expected, unitUnderTest.getMaxLoss());
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
  public void shouldGetSetKey() {
    String expected = "astring";
    unitUnderTest.setKey(expected);
    assertEquals(expected, unitUnderTest.getKey());
  }

  @Test
  public void shouldGetSetId() {
    int expected = 815;
    unitUnderTest.setId(expected);
    assertEquals(expected, unitUnderTest.getId());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setName("astring");
    unitUnderTest.setGameMode("astring");
    unitUnderTest.setEnabled(false);
    unitUnderTest.setJoinCost(815);
    unitUnderTest.setJoinCostResource("astring");
    unitUnderTest.setMaxWins(815);
    unitUnderTest.setMaxLoss(815);
    unitUnderTest.setRewardGold(new java.util.ArrayList<Integer>());
    unitUnderTest.setRewardCards(new java.util.ArrayList<Integer>());
    unitUnderTest.setKey("astring");
    unitUnderTest.setId(815);
    String expected = "Challenge(name=astring, gameMode=astring, enabled=false, joinCost=815, joinCostResource=astring, maxWins=815, maxLoss=815, rewardGold=" + new java.util.ArrayList<Integer>() + ", rewardCards=" + new java.util.ArrayList<Integer>() + ", key=astring, id=815)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}