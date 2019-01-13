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
public class ConstantsSpellTest {

  private ConstantsSpell unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsSpell();
  }

  @Test
  public void shouldGetSetAffectsHidden() {
    boolean expected = false;
    unitUnderTest.setAffectsHidden(expected);
    assertEquals(expected, unitUnderTest.isAffectsHidden());
  }

  @Test
  public void shouldGetSetArena() {
    long expected = 4711L;
    unitUnderTest.setArena(expected);
    assertEquals(expected, unitUnderTest.getArena());
  }

  @Test
  public void shouldGetSetBuff() {
    String expected = "astring";
    unitUnderTest.setBuff(expected);
    assertEquals(expected, unitUnderTest.getBuff());
  }

  @Test
  public void shouldGetSetBuffNumber() {
    long expected = 4711L;
    unitUnderTest.setBuffNumber(expected);
    assertEquals(expected, unitUnderTest.getBuffNumber());
  }

  @Test
  public void shouldGetSetBuffTime() {
    long expected = 4711L;
    unitUnderTest.setBuffTime(expected);
    assertEquals(expected, unitUnderTest.getBuffTime());
  }

  @Test
  public void shouldGetSetBuffTimeIncreaseAfterTournamentCap() {
    long expected = 4711L;
    unitUnderTest.setBuffTimeIncreaseAfterTournamentCap(expected);
    assertEquals(expected, unitUnderTest.getBuffTimeIncreaseAfterTournamentCap());
  }

  @Test
  public void shouldGetSetBuffTimeIncreasePerLevel() {
    long expected = 4711L;
    unitUnderTest.setBuffTimeIncreasePerLevel(expected);
    assertEquals(expected, unitUnderTest.getBuffTimeIncreasePerLevel());
  }

  @Test
  public void shouldGetSetCapBuffTimeToAreaEffectTime() {
    boolean expected = false;
    unitUnderTest.setCapBuffTimeToAreaEffectTime(expected);
    assertEquals(expected, unitUnderTest.isCapBuffTimeToAreaEffectTime());
  }

  @Test
  public void shouldGetSetCrownTowerDamagePercent() {
    long expected = 4711L;
    unitUnderTest.setCrownTowerDamagePercent(expected);
    assertEquals(expected, unitUnderTest.getCrownTowerDamagePercent());
  }

  @Test
  public void shouldGetSetDamage() {
    long expected = 4711L;
    unitUnderTest.setDamage(expected);
    assertEquals(expected, unitUnderTest.getDamage());
  }

  @Test
  public void shouldGetSetDamagePerLevel() {
    java.util.List<Integer> expected = new java.util.ArrayList<Integer>();
    unitUnderTest.setDamagePerLevel(expected);
    assertEquals(expected, unitUnderTest.getDamagePerLevel());
  }

  @Test
  public void shouldGetSetDescription() {
    String expected = "astring";
    unitUnderTest.setDescription(expected);
    assertEquals(expected, unitUnderTest.getDescription());
  }

  @Test
  public void shouldGetSetDpsPerLevel() {
    java.util.List<Integer> expected = new java.util.ArrayList<Integer>();
    unitUnderTest.setDpsPerLevel(expected);
    assertEquals(expected, unitUnderTest.getDpsPerLevel());
  }

  @Test
  public void shouldGetSetElixir() {
    long expected = 4711L;
    unitUnderTest.setElixir(expected);
    assertEquals(expected, unitUnderTest.getElixir());
  }

  @Test
  public void shouldGetSetHitBiggestTargets() {
    boolean expected = false;
    unitUnderTest.setHitBiggestTargets(expected);
    assertEquals(expected, unitUnderTest.isHitBiggestTargets());
  }

  @Test
  public void shouldGetSetHitSpeed() {
    long expected = 4711L;
    unitUnderTest.setHitSpeed(expected);
    assertEquals(expected, unitUnderTest.getHitSpeed());
  }

  @Test
  public void shouldGetSetHitsAir() {
    boolean expected = false;
    unitUnderTest.setHitsAir(expected);
    assertEquals(expected, unitUnderTest.isHitsAir());
  }

  @Test
  public void shouldGetSetHitsGround() {
    boolean expected = false;
    unitUnderTest.setHitsGround(expected);
    assertEquals(expected, unitUnderTest.isHitsGround());
  }

  @Test
  public void shouldGetSetHitpointsPerLevel() {
    java.util.List<Integer> expected = new java.util.ArrayList<Integer>();
    unitUnderTest.setHitpointsPerLevel(expected);
    assertEquals(expected, unitUnderTest.getHitpointsPerLevel());
  }

  @Test
  public void shouldGetSetId() {
    long expected = 4711L;
    unitUnderTest.setId(expected);
    assertEquals(expected, unitUnderTest.getId());
  }

  @Test
  public void shouldGetSetIgnoreBuildings() {
    boolean expected = false;
    unitUnderTest.setIgnoreBuildings(expected);
    assertEquals(expected, unitUnderTest.isIgnoreBuildings());
  }

  @Test
  public void shouldGetSetIgnoreHero() {
    boolean expected = false;
    unitUnderTest.setIgnoreHero(expected);
    assertEquals(expected, unitUnderTest.isIgnoreHero());
  }

  @Test
  public void shouldGetSetKey() {
    String expected = "astring";
    unitUnderTest.setKey(expected);
    assertEquals(expected, unitUnderTest.getKey());
  }

  @Test
  public void shouldGetSetLifeDuration() {
    long expected = 4711L;
    unitUnderTest.setLifeDuration(expected);
    assertEquals(expected, unitUnderTest.getLifeDuration());
  }

  @Test
  public void shouldGetSetLifeDurationIncreaseAfterTournamentCap() {
    long expected = 4711L;
    unitUnderTest.setLifeDurationIncreaseAfterTournamentCap(expected);
    assertEquals(expected, unitUnderTest.getLifeDurationIncreaseAfterTournamentCap());
  }

  @Test
  public void shouldGetSetLifeDurationIncreasePerLevel() {
    long expected = 4711L;
    unitUnderTest.setLifeDurationIncreasePerLevel(expected);
    assertEquals(expected, unitUnderTest.getLifeDurationIncreasePerLevel());
  }

  @Test
  public void shouldGetSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  public void shouldGetSetNoEffectToCrownTowers() {
    boolean expected = false;
    unitUnderTest.setNoEffectToCrownTowers(expected);
    assertEquals(expected, unitUnderTest.isNoEffectToCrownTowers());
  }

  @Test
  public void shouldGetSetOnlyEnemies() {
    boolean expected = false;
    unitUnderTest.setOnlyEnemies(expected);
    assertEquals(expected, unitUnderTest.isOnlyEnemies());
  }

  @Test
  public void shouldGetSetOnlyOwnTroops() {
    boolean expected = false;
    unitUnderTest.setOnlyOwnTroops(expected);
    assertEquals(expected, unitUnderTest.isOnlyOwnTroops());
  }

  @Test
  public void shouldGetSetProjectile() {
    String expected = "astring";
    unitUnderTest.setProjectile(expected);
    assertEquals(expected, unitUnderTest.getProjectile());
  }

  @Test
  public void shouldGetSetRadius() {
    long expected = 4711L;
    unitUnderTest.setRadius(expected);
    assertEquals(expected, unitUnderTest.getRadius());
  }

  @Test
  public void shouldGetSetRarity() {
    String expected = "astring";
    unitUnderTest.setRarity(expected);
    assertEquals(expected, unitUnderTest.getRarity());
  }

  @Test
  public void shouldGetSetSpawnAngleShift() {
    long expected = 4711L;
    unitUnderTest.setSpawnAngleShift(expected);
    assertEquals(expected, unitUnderTest.getSpawnAngleShift());
  }

  @Test
  public void shouldGetSetSpawnCharacter() {
    String expected = "astring";
    unitUnderTest.setSpawnCharacter(expected);
    assertEquals(expected, unitUnderTest.getSpawnCharacter());
  }

  @Test
  public void shouldGetSetSpawnCharacterLevelIndex() {
    long expected = 4711L;
    unitUnderTest.setSpawnCharacterLevelIndex(expected);
    assertEquals(expected, unitUnderTest.getSpawnCharacterLevelIndex());
  }

  @Test
  public void shouldGetSetSpawnDeployBaseAnim() {
    String expected = "astring";
    unitUnderTest.setSpawnDeployBaseAnim(expected);
    assertEquals(expected, unitUnderTest.getSpawnDeployBaseAnim());
  }

  @Test
  public void shouldGetSetSpawnFromMinToMax() {
    boolean expected = false;
    unitUnderTest.setSpawnFromMinToMax(expected);
    assertEquals(expected, unitUnderTest.isSpawnFromMinToMax());
  }

  @Test
  public void shouldGetSetSpawnInitialDelay() {
    long expected = 4711L;
    unitUnderTest.setSpawnInitialDelay(expected);
    assertEquals(expected, unitUnderTest.getSpawnInitialDelay());
  }

  @Test
  public void shouldGetSetSpawnInterval() {
    long expected = 4711L;
    unitUnderTest.setSpawnInterval(expected);
    assertEquals(expected, unitUnderTest.getSpawnInterval());
  }

  @Test
  public void shouldGetSetSpawnMaxCount() {
    long expected = 4711L;
    unitUnderTest.setSpawnMaxCount(expected);
    assertEquals(expected, unitUnderTest.getSpawnMaxCount());
  }

  @Test
  public void shouldGetSetSpawnMaxRadius() {
    long expected = 4711L;
    unitUnderTest.setSpawnMaxRadius(expected);
    assertEquals(expected, unitUnderTest.getSpawnMaxRadius());
  }

  @Test
  public void shouldGetSetSpawnMinRadius() {
    long expected = 4711L;
    unitUnderTest.setSpawnMinRadius(expected);
    assertEquals(expected, unitUnderTest.getSpawnMinRadius());
  }

  @Test
  public void shouldGetSetSpawnRandomizeSequence() {
    boolean expected = false;
    unitUnderTest.setSpawnRandomizeSequence(expected);
    assertEquals(expected, unitUnderTest.isSpawnRandomizeSequence());
  }

  @Test
  public void shouldGetSetSpawnTime() {
    long expected = 4711L;
    unitUnderTest.setSpawnTime(expected);
    assertEquals(expected, unitUnderTest.getSpawnTime());
  }

  @Test
  public void shouldGetSetType() {
    String expected = "astring";
    unitUnderTest.setType(expected);
    assertEquals(expected, unitUnderTest.getType());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setAffectsHidden(false);
    unitUnderTest.setArena(4711L);
    unitUnderTest.setBuff("astring");
    unitUnderTest.setBuffNumber(4711L);
    unitUnderTest.setBuffTime(4711L);
    unitUnderTest.setBuffTimeIncreaseAfterTournamentCap(4711L);
    unitUnderTest.setBuffTimeIncreasePerLevel(4711L);
    unitUnderTest.setCapBuffTimeToAreaEffectTime(false);
    unitUnderTest.setCrownTowerDamagePercent(4711L);
    unitUnderTest.setDamage(4711L);
    unitUnderTest.setDamagePerLevel(new java.util.ArrayList<Integer>());
    unitUnderTest.setDescription("astring");
    unitUnderTest.setDpsPerLevel(new java.util.ArrayList<Integer>());
    unitUnderTest.setElixir(4711L);
    unitUnderTest.setHitBiggestTargets(false);
    unitUnderTest.setHitSpeed(4711L);
    unitUnderTest.setHitsAir(false);
    unitUnderTest.setHitsGround(false);
    unitUnderTest.setHitpointsPerLevel(new java.util.ArrayList<Integer>());
    unitUnderTest.setId(4711L);
    unitUnderTest.setIgnoreBuildings(false);
    unitUnderTest.setIgnoreHero(false);
    unitUnderTest.setKey("astring");
    unitUnderTest.setLifeDuration(4711L);
    unitUnderTest.setLifeDurationIncreaseAfterTournamentCap(4711L);
    unitUnderTest.setLifeDurationIncreasePerLevel(4711L);
    unitUnderTest.setName("astring");
    unitUnderTest.setNoEffectToCrownTowers(false);
    unitUnderTest.setOnlyEnemies(false);
    unitUnderTest.setOnlyOwnTroops(false);
    unitUnderTest.setProjectile("astring");
    unitUnderTest.setRadius(4711L);
    unitUnderTest.setRarity("astring");
    unitUnderTest.setSpawnAngleShift(4711L);
    unitUnderTest.setSpawnCharacter("astring");
    unitUnderTest.setSpawnCharacterLevelIndex(4711L);
    unitUnderTest.setSpawnDeployBaseAnim("astring");
    unitUnderTest.setSpawnFromMinToMax(false);
    unitUnderTest.setSpawnInitialDelay(4711L);
    unitUnderTest.setSpawnInterval(4711L);
    unitUnderTest.setSpawnMaxCount(4711L);
    unitUnderTest.setSpawnMaxRadius(4711L);
    unitUnderTest.setSpawnMinRadius(4711L);
    unitUnderTest.setSpawnRandomizeSequence(false);
    unitUnderTest.setSpawnTime(4711L);
    unitUnderTest.setType("astring");
    String expected = "ConstantsSpell(affectsHidden=false, arena=4711, buff=astring, buffNumber=4711, buffTime=4711, buffTimeIncreaseAfterTournamentCap=4711, buffTimeIncreasePerLevel=4711, capBuffTimeToAreaEffectTime=false, crownTowerDamagePercent=4711, damage=4711, damagePerLevel=" + new java.util.ArrayList<Integer>() + ", description=astring, dpsPerLevel=" + new java.util.ArrayList<Integer>() + ", elixir=4711, hitBiggestTargets=false, hitSpeed=4711, hitsAir=false, hitsGround=false, hitpointsPerLevel=" + new java.util.ArrayList<Integer>() + ", id=4711, ignoreBuildings=false, ignoreHero=false, key=astring, lifeDuration=4711, lifeDurationIncreaseAfterTournamentCap=4711, lifeDurationIncreasePerLevel=4711, name=astring, noEffectToCrownTowers=false, onlyEnemies=false, onlyOwnTroops=false, projectile=astring, radius=4711, rarity=astring, spawnAngleShift=4711, spawnCharacter=astring, spawnCharacterLevelIndex=4711, spawnDeployBaseAnim=astring, spawnFromMinToMax=false, spawnInitialDelay=4711, spawnInterval=4711, spawnMaxCount=4711, spawnMaxRadius=4711, spawnMinRadius=4711, spawnRandomizeSequence=false, spawnTime=4711, type=astring)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}