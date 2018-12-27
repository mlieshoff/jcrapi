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
  public void shouldGetSetDeckSelection() {
    String expected = "astring";
    unitUnderTest.setDeckSelection(expected);
    assertEquals(expected, unitUnderTest.getDeckSelection());
  }

  @Test
  public void shouldGetSetFixedDeckOrder() {
    boolean expected = false;
    unitUnderTest.setFixedDeckOrder(expected);
    assertEquals(expected, unitUnderTest.isFixedDeckOrder());
  }

  @Test
  public void shouldGetSetGivesClanScore() {
    boolean expected = false;
    unitUnderTest.setGivesClanScore(expected);
    assertEquals(expected, unitUnderTest.isGivesClanScore());
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
  public void shouldToString() {
    unitUnderTest.setBattleStartCooldown(4711L);
    unitUnderTest.setCardLevelAdjustment("astring");
    unitUnderTest.setDeckSelection("astring");
    unitUnderTest.setFixedDeckOrder(false);
    unitUnderTest.setGivesClanScore(false);
    unitUnderTest.setHeroes(false);
    unitUnderTest.setId(4711L);
    unitUnderTest.setName("astring");
    unitUnderTest.setNameEn("astring");
    unitUnderTest.setOvertimeSeconds(4711L);
    unitUnderTest.setPlayers("astring");
    unitUnderTest.setPredefinedDecks("astring");
    unitUnderTest.setSameDeckOnBoth(false);
    unitUnderTest.setSeparateTeamDecks(false);
    unitUnderTest.setSwappingTowers(false);
    unitUnderTest.setUseStartingElixir(false);
    String expected = "ConstantsGameMode(battleStartCooldown=4711, cardLevelAdjustment=astring, deckSelection=astring, fixedDeckOrder=false, givesClanScore=false, heroes=false, id=4711, name=astring, nameEn=astring, overtimeSeconds=4711, players=astring, predefinedDecks=astring, sameDeckOnBoth=false, separateTeamDecks=false, swappingTowers=false, useStartingElixir=false)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}