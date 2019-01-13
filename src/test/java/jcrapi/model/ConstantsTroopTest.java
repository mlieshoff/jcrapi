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
public class ConstantsTroopTest {

  private ConstantsTroop unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsTroop();
  }

  @Test
  public void shouldGetSetAllTargetsHit() {
    boolean expected = false;
    unitUnderTest.setAllTargetsHit(expected);
    assertEquals(expected, unitUnderTest.isAllTargetsHit());
  }

  @Test
  public void shouldGetSetArena() {
    long expected = 4711L;
    unitUnderTest.setArena(expected);
    assertEquals(expected, unitUnderTest.getArena());
  }

  @Test
  public void shouldGetSetAttacksAir() {
    boolean expected = false;
    unitUnderTest.setAttacksAir(expected);
    assertEquals(expected, unitUnderTest.isAttacksAir());
  }

  @Test
  public void shouldGetSetAttacksGround() {
    boolean expected = false;
    unitUnderTest.setAttacksGround(expected);
    assertEquals(expected, unitUnderTest.isAttacksGround());
  }

  @Test
  public void shouldGetSetBuildingTarget() {
    boolean expected = false;
    unitUnderTest.setBuildingTarget(expected);
    assertEquals(expected, unitUnderTest.isBuildingTarget());
  }

  @Test
  public void shouldGetSetBurstAffectAnimation() {
    boolean expected = false;
    unitUnderTest.setBurstAffectAnimation(expected);
    assertEquals(expected, unitUnderTest.isBurstAffectAnimation());
  }

  @Test
  public void shouldGetSetBurstKeepTarget() {
    boolean expected = false;
    unitUnderTest.setBurstKeepTarget(expected);
    assertEquals(expected, unitUnderTest.isBurstKeepTarget());
  }

  @Test
  public void shouldGetSetCollisionRadius() {
    long expected = 4711L;
    unitUnderTest.setCollisionRadius(expected);
    assertEquals(expected, unitUnderTest.getCollisionRadius());
  }

  @Test
  public void shouldGetSetCrowdEffects() {
    boolean expected = false;
    unitUnderTest.setCrowdEffects(expected);
    assertEquals(expected, unitUnderTest.isCrowdEffects());
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
  public void shouldGetSetDpsPerLevel() {
    java.util.List<Integer> expected = new java.util.ArrayList<Integer>();
    unitUnderTest.setDpsPerLevel(expected);
    assertEquals(expected, unitUnderTest.getDpsPerLevel());
  }

  @Test
  public void shouldGetSetDashOnlyOnce() {
    boolean expected = false;
    unitUnderTest.setDashOnlyOnce(expected);
    assertEquals(expected, unitUnderTest.isDashOnlyOnce());
  }

  @Test
  public void shouldGetSetDeathInheritIgnoreList() {
    boolean expected = false;
    unitUnderTest.setDeathInheritIgnoreList(expected);
    assertEquals(expected, unitUnderTest.isDeathInheritIgnoreList());
  }

  @Test
  public void shouldGetSetDeathSpawnCharacter() {
    String expected = "astring";
    unitUnderTest.setDeathSpawnCharacter(expected);
    assertEquals(expected, unitUnderTest.getDeathSpawnCharacter());
  }

  @Test
  public void shouldGetSetDeathSpawnPushback() {
    boolean expected = false;
    unitUnderTest.setDeathSpawnPushback(expected);
    assertEquals(expected, unitUnderTest.isDeathSpawnPushback());
  }

  @Test
  public void shouldGetSetDeprioritizeTargetsWithBuff() {
    boolean expected = false;
    unitUnderTest.setDeprioritizeTargetsWithBuff(expected);
    assertEquals(expected, unitUnderTest.isDeprioritizeTargetsWithBuff());
  }

  @Test
  public void shouldGetSetDeployDelay() {
    long expected = 4711L;
    unitUnderTest.setDeployDelay(expected);
    assertEquals(expected, unitUnderTest.getDeployDelay());
  }

  @Test
  public void shouldGetSetDeployTime() {
    long expected = 4711L;
    unitUnderTest.setDeployTime(expected);
    assertEquals(expected, unitUnderTest.getDeployTime());
  }

  @Test
  public void shouldGetSetDescription() {
    String expected = "astring";
    unitUnderTest.setDescription(expected);
    assertEquals(expected, unitUnderTest.getDescription());
  }

  @Test
  public void shouldGetSetDestroyAtLimit() {
    boolean expected = false;
    unitUnderTest.setDestroyAtLimit(expected);
    assertEquals(expected, unitUnderTest.isDestroyAtLimit());
  }

  @Test
  public void shouldGetSetDontStopMoveAnim() {
    boolean expected = false;
    unitUnderTest.setDontStopMoveAnim(expected);
    assertEquals(expected, unitUnderTest.isDontStopMoveAnim());
  }

  @Test
  public void shouldGetSetDps() {
    double expected = 1.41;
    unitUnderTest.setDps(expected);
    assertEquals(expected, unitUnderTest.getDps(), 0.0);
  }

  @Test
  public void shouldGetSetElixir() {
    long expected = 4711L;
    unitUnderTest.setElixir(expected);
    assertEquals(expected, unitUnderTest.getElixir());
  }

  @Test
  public void shouldGetSetFlyDirectPaths() {
    boolean expected = false;
    unitUnderTest.setFlyDirectPaths(expected);
    assertEquals(expected, unitUnderTest.isFlyDirectPaths());
  }

  @Test
  public void shouldGetSetFlyFromGround() {
    boolean expected = false;
    unitUnderTest.setFlyFromGround(expected);
    assertEquals(expected, unitUnderTest.isFlyFromGround());
  }

  @Test
  public void shouldGetSetFlyingHeight() {
    long expected = 4711L;
    unitUnderTest.setFlyingHeight(expected);
    assertEquals(expected, unitUnderTest.getFlyingHeight());
  }

  @Test
  public void shouldGetSetHasRotationOnTimeline() {
    boolean expected = false;
    unitUnderTest.setHasRotationOnTimeline(expected);
    assertEquals(expected, unitUnderTest.isHasRotationOnTimeline());
  }

  @Test
  public void shouldGetSetHealOnMorph() {
    boolean expected = false;
    unitUnderTest.setHealOnMorph(expected);
    assertEquals(expected, unitUnderTest.isHealOnMorph());
  }

  @Test
  public void shouldGetSetHideBeforeFirstHit() {
    boolean expected = false;
    unitUnderTest.setHideBeforeFirstHit(expected);
    assertEquals(expected, unitUnderTest.isHideBeforeFirstHit());
  }

  @Test
  public void shouldGetSetHidesWhenNotAttacking() {
    boolean expected = false;
    unitUnderTest.setHidesWhenNotAttacking(expected);
    assertEquals(expected, unitUnderTest.isHidesWhenNotAttacking());
  }

  @Test
  public void shouldGetSetHitSpeed() {
    long expected = 4711L;
    unitUnderTest.setHitSpeed(expected);
    assertEquals(expected, unitUnderTest.getHitSpeed());
  }

  @Test
  public void shouldGetSetHitpoints() {
    long expected = 4711L;
    unitUnderTest.setHitpoints(expected);
    assertEquals(expected, unitUnderTest.getHitpoints());
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
  public void shouldGetSetIgnorePushback() {
    boolean expected = false;
    unitUnderTest.setIgnorePushback(expected);
    assertEquals(expected, unitUnderTest.isIgnorePushback());
  }

  @Test
  public void shouldGetSetSummonerTower() {
    boolean expected = false;
    unitUnderTest.setSummonerTower(expected);
    assertEquals(expected, unitUnderTest.isSummonerTower());
  }

  @Test
  public void shouldGetSetJumpEnabled() {
    boolean expected = false;
    unitUnderTest.setJumpEnabled(expected);
    assertEquals(expected, unitUnderTest.isJumpEnabled());
  }

  @Test
  public void shouldGetSetKamikaze() {
    boolean expected = false;
    unitUnderTest.setKamikaze(expected);
    assertEquals(expected, unitUnderTest.isKamikaze());
  }

  @Test
  public void shouldGetSetKey() {
    String expected = "astring";
    unitUnderTest.setKey(expected);
    assertEquals(expected, unitUnderTest.getKey());
  }

  @Test
  public void shouldGetSetLoadAfterRetarget() {
    boolean expected = false;
    unitUnderTest.setLoadAfterRetarget(expected);
    assertEquals(expected, unitUnderTest.isLoadAfterRetarget());
  }

  @Test
  public void shouldGetSetLoadFirstHit() {
    boolean expected = false;
    unitUnderTest.setLoadFirstHit(expected);
    assertEquals(expected, unitUnderTest.isLoadFirstHit());
  }

  @Test
  public void shouldGetSetLoadTime() {
    long expected = 4711L;
    unitUnderTest.setLoadTime(expected);
    assertEquals(expected, unitUnderTest.getLoadTime());
  }

  @Test
  public void shouldGetSetMass() {
    long expected = 4711L;
    unitUnderTest.setMass(expected);
    assertEquals(expected, unitUnderTest.getMass());
  }

  @Test
  public void shouldGetSetMorphKeepTarget() {
    boolean expected = false;
    unitUnderTest.setMorphKeepTarget(expected);
    assertEquals(expected, unitUnderTest.isMorphKeepTarget());
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
  public void shouldGetSetOverrideAttackFinishTime() {
    boolean expected = false;
    unitUnderTest.setOverrideAttackFinishTime(expected);
    assertEquals(expected, unitUnderTest.isOverrideAttackFinishTime());
  }

  @Test
  public void shouldGetSetPrestigeSwf() {
    String expected = "astring";
    unitUnderTest.setPrestigeSwf(expected);
    assertEquals(expected, unitUnderTest.getPrestigeSwf());
  }

  @Test
  public void shouldGetSetPrestigeExportName2() {
    String expected = "astring";
    unitUnderTest.setPrestigeExportName2(expected);
    assertEquals(expected, unitUnderTest.getPrestigeExportName2());
  }

  @Test
  public void shouldGetSetPrestigeExportName3() {
    String expected = "astring";
    unitUnderTest.setPrestigeExportName3(expected);
    assertEquals(expected, unitUnderTest.getPrestigeExportName3());
  }

  @Test
  public void shouldGetSetProjectile() {
    String expected = "astring";
    unitUnderTest.setProjectile(expected);
    assertEquals(expected, unitUnderTest.getProjectile());
  }

  @Test
  public void shouldGetSetProjectileStartRadius() {
    long expected = 4711L;
    unitUnderTest.setProjectileStartRadius(expected);
    assertEquals(expected, unitUnderTest.getProjectileStartRadius());
  }

  @Test
  public void shouldGetSetProjectileStartZ() {
    long expected = 4711L;
    unitUnderTest.setProjectileStartZ(expected);
    assertEquals(expected, unitUnderTest.getProjectileStartZ());
  }

  @Test
  public void shouldGetSetRange() {
    long expected = 4711L;
    unitUnderTest.setRange(expected);
    assertEquals(expected, unitUnderTest.getRange());
  }

  @Test
  public void shouldGetSetRarity() {
    String expected = "astring";
    unitUnderTest.setRarity(expected);
    assertEquals(expected, unitUnderTest.getRarity());
  }

  @Test
  public void shouldGetSetRetargetAfterAttack() {
    boolean expected = false;
    unitUnderTest.setRetargetAfterAttack(expected);
    assertEquals(expected, unitUnderTest.isRetargetAfterAttack());
  }

  @Test
  public void shouldGetSetScale() {
    long expected = 4711L;
    unitUnderTest.setScale(expected);
    assertEquals(expected, unitUnderTest.getScale());
  }

  @Test
  public void shouldGetSetSelfAsAoeCenter() {
    boolean expected = false;
    unitUnderTest.setSelfAsAoeCenter(expected);
    assertEquals(expected, unitUnderTest.isSelfAsAoeCenter());
  }

  @Test
  public void shouldGetSetShowHealthNumber() {
    boolean expected = false;
    unitUnderTest.setShowHealthNumber(expected);
    assertEquals(expected, unitUnderTest.isShowHealthNumber());
  }

  @Test
  public void shouldGetSetSightClip() {
    long expected = 4711L;
    unitUnderTest.setSightClip(expected);
    assertEquals(expected, unitUnderTest.getSightClip());
  }

  @Test
  public void shouldGetSetSightClipSide() {
    long expected = 4711L;
    unitUnderTest.setSightClipSide(expected);
    assertEquals(expected, unitUnderTest.getSightClipSide());
  }

  @Test
  public void shouldGetSetSightRange() {
    long expected = 4711L;
    unitUnderTest.setSightRange(expected);
    assertEquals(expected, unitUnderTest.getSightRange());
  }

  @Test
  public void shouldGetSetSpawnAttach() {
    boolean expected = false;
    unitUnderTest.setSpawnAttach(expected);
    assertEquals(expected, unitUnderTest.isSpawnAttach());
  }

  @Test
  public void shouldGetSetSpawnCharacter() {
    String expected = "astring";
    unitUnderTest.setSpawnCharacter(expected);
    assertEquals(expected, unitUnderTest.getSpawnCharacter());
  }

  @Test
  public void shouldGetSetSpawnCharacterLevelIndex() {
    int expected = 815;
    unitUnderTest.setSpawnCharacterLevelIndex(expected);
    assertEquals(expected, unitUnderTest.getSpawnCharacterLevelIndex());
  }

  @Test
  public void shouldGetSetSpawnConstPriority() {
    boolean expected = false;
    unitUnderTest.setSpawnConstPriority(expected);
    assertEquals(expected, unitUnderTest.isSpawnConstPriority());
  }

  @Test
  public void shouldGetSetSpawnEffectOnce() {
    boolean expected = false;
    unitUnderTest.setSpawnEffectOnce(expected);
    assertEquals(expected, unitUnderTest.isSpawnEffectOnce());
  }

  @Test
  public void shouldGetSetSpawnInterval() {
    long expected = 4711L;
    unitUnderTest.setSpawnInterval(expected);
    assertEquals(expected, unitUnderTest.getSpawnInterval());
  }

  @Test
  public void shouldGetSetSpawnNumber() {
    int expected = 815;
    unitUnderTest.setSpawnNumber(expected);
    assertEquals(expected, unitUnderTest.getSpawnNumber());
  }

  @Test
  public void shouldGetSetSpawnPauseTime() {
    long expected = 4711L;
    unitUnderTest.setSpawnPauseTime(expected);
    assertEquals(expected, unitUnderTest.getSpawnPauseTime());
  }

  @Test
  public void shouldGetSetSpawnStartTime() {
    long expected = 4711L;
    unitUnderTest.setSpawnStartTime(expected);
    assertEquals(expected, unitUnderTest.getSpawnStartTime());
  }

  @Test
  public void shouldGetSetSpecialAttackWhenHidden() {
    boolean expected = false;
    unitUnderTest.setSpecialAttackWhenHidden(expected);
    assertEquals(expected, unitUnderTest.isSpecialAttackWhenHidden());
  }

  @Test
  public void shouldGetSetSpeed() {
    long expected = 4711L;
    unitUnderTest.setSpeed(expected);
    assertEquals(expected, unitUnderTest.getSpeed());
  }

  @Test
  public void shouldGetSetSpeedEn() {
    String expected = "astring";
    unitUnderTest.setSpeedEn(expected);
    assertEquals(expected, unitUnderTest.getSpeedEn());
  }

  @Test
  public void shouldGetSetStopMovementAfterMs() {
    long expected = 4711L;
    unitUnderTest.setStopMovementAfterMs(expected);
    assertEquals(expected, unitUnderTest.getStopMovementAfterMs());
  }

  @Test
  public void shouldGetSetSummonCharacter() {
    String expected = "astring";
    unitUnderTest.setSummonCharacter(expected);
    assertEquals(expected, unitUnderTest.getSummonCharacter());
  }

  @Test
  public void shouldGetSetSummonNumber() {
    int expected = 815;
    unitUnderTest.setSummonNumber(expected);
    assertEquals(expected, unitUnderTest.getSummonNumber());
  }

  @Test
  public void shouldGetSetTargetOnlyBuildings() {
    boolean expected = false;
    unitUnderTest.setTargetOnlyBuildings(expected);
    assertEquals(expected, unitUnderTest.isTargetOnlyBuildings());
  }

  @Test
  public void shouldGetSetTargetOnlyTroops() {
    boolean expected = false;
    unitUnderTest.setTargetOnlyTroops(expected);
    assertEquals(expected, unitUnderTest.isTargetOnlyTroops());
  }

  @Test
  public void shouldGetSetType() {
    String expected = "astring";
    unitUnderTest.setType(expected);
    assertEquals(expected, unitUnderTest.getType());
  }

  @Test
  public void shouldGetSetWaitMs() {
    long expected = 4711L;
    unitUnderTest.setWaitMs(expected);
    assertEquals(expected, unitUnderTest.getWaitMs());
  }

  @Test
  public void shouldGetSetWalkingSpeedTweakPercentage() {
    long expected = 4711L;
    unitUnderTest.setWalkingSpeedTweakPercentage(expected);
    assertEquals(expected, unitUnderTest.getWalkingSpeedTweakPercentage());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setAllTargetsHit(false);
    unitUnderTest.setArena(4711L);
    unitUnderTest.setAttacksAir(false);
    unitUnderTest.setAttacksGround(false);
    unitUnderTest.setBuildingTarget(false);
    unitUnderTest.setBurstAffectAnimation(false);
    unitUnderTest.setBurstKeepTarget(false);
    unitUnderTest.setCollisionRadius(4711L);
    unitUnderTest.setCrowdEffects(false);
    unitUnderTest.setDamage(4711L);
    unitUnderTest.setDamagePerLevel(new java.util.ArrayList<Integer>());
    unitUnderTest.setDpsPerLevel(new java.util.ArrayList<Integer>());
    unitUnderTest.setDashOnlyOnce(false);
    unitUnderTest.setDeathInheritIgnoreList(false);
    unitUnderTest.setDeathSpawnCharacter("astring");
    unitUnderTest.setDeathSpawnPushback(false);
    unitUnderTest.setDeprioritizeTargetsWithBuff(false);
    unitUnderTest.setDeployDelay(4711L);
    unitUnderTest.setDeployTime(4711L);
    unitUnderTest.setDescription("astring");
    unitUnderTest.setDestroyAtLimit(false);
    unitUnderTest.setDontStopMoveAnim(false);
    unitUnderTest.setDps(1.41);
    unitUnderTest.setElixir(4711L);
    unitUnderTest.setFlyDirectPaths(false);
    unitUnderTest.setFlyFromGround(false);
    unitUnderTest.setFlyingHeight(4711L);
    unitUnderTest.setHasRotationOnTimeline(false);
    unitUnderTest.setHealOnMorph(false);
    unitUnderTest.setHideBeforeFirstHit(false);
    unitUnderTest.setHidesWhenNotAttacking(false);
    unitUnderTest.setHitSpeed(4711L);
    unitUnderTest.setHitpoints(4711L);
    unitUnderTest.setHitpointsPerLevel(new java.util.ArrayList<Integer>());
    unitUnderTest.setId(4711L);
    unitUnderTest.setIgnorePushback(false);
    unitUnderTest.setSummonerTower(false);
    unitUnderTest.setJumpEnabled(false);
    unitUnderTest.setKamikaze(false);
    unitUnderTest.setKey("astring");
    unitUnderTest.setLoadAfterRetarget(false);
    unitUnderTest.setLoadFirstHit(false);
    unitUnderTest.setLoadTime(4711L);
    unitUnderTest.setMass(4711L);
    unitUnderTest.setMorphKeepTarget(false);
    unitUnderTest.setName("astring");
    unitUnderTest.setNameEn("astring");
    unitUnderTest.setOverrideAttackFinishTime(false);
    unitUnderTest.setPrestigeSwf("astring");
    unitUnderTest.setPrestigeExportName2("astring");
    unitUnderTest.setPrestigeExportName3("astring");
    unitUnderTest.setProjectile("astring");
    unitUnderTest.setProjectileStartRadius(4711L);
    unitUnderTest.setProjectileStartZ(4711L);
    unitUnderTest.setRange(4711L);
    unitUnderTest.setRarity("astring");
    unitUnderTest.setRetargetAfterAttack(false);
    unitUnderTest.setScale(4711L);
    unitUnderTest.setSelfAsAoeCenter(false);
    unitUnderTest.setShowHealthNumber(false);
    unitUnderTest.setSightClip(4711L);
    unitUnderTest.setSightClipSide(4711L);
    unitUnderTest.setSightRange(4711L);
    unitUnderTest.setSpawnAttach(false);
    unitUnderTest.setSpawnCharacter("astring");
    unitUnderTest.setSpawnCharacterLevelIndex(815);
    unitUnderTest.setSpawnConstPriority(false);
    unitUnderTest.setSpawnEffectOnce(false);
    unitUnderTest.setSpawnInterval(4711L);
    unitUnderTest.setSpawnNumber(815);
    unitUnderTest.setSpawnPauseTime(4711L);
    unitUnderTest.setSpawnStartTime(4711L);
    unitUnderTest.setSpecialAttackWhenHidden(false);
    unitUnderTest.setSpeed(4711L);
    unitUnderTest.setSpeedEn("astring");
    unitUnderTest.setStopMovementAfterMs(4711L);
    unitUnderTest.setSummonCharacter("astring");
    unitUnderTest.setSummonNumber(815);
    unitUnderTest.setTargetOnlyBuildings(false);
    unitUnderTest.setTargetOnlyTroops(false);
    unitUnderTest.setType("astring");
    unitUnderTest.setWaitMs(4711L);
    unitUnderTest.setWalkingSpeedTweakPercentage(4711L);
    String expected = "ConstantsTroop(allTargetsHit=false, arena=4711, attacksAir=false, attacksGround=false, buildingTarget=false, burstAffectAnimation=false, burstKeepTarget=false, collisionRadius=4711, crowdEffects=false, damage=4711, damagePerLevel=" + new java.util.ArrayList<Integer>() + ", dpsPerLevel=" + new java.util.ArrayList<Integer>() + ", dashOnlyOnce=false, deathInheritIgnoreList=false, deathSpawnCharacter=astring, deathSpawnPushback=false, deprioritizeTargetsWithBuff=false, deployDelay=4711, deployTime=4711, description=astring, destroyAtLimit=false, dontStopMoveAnim=false, dps=1.41, elixir=4711, flyDirectPaths=false, flyFromGround=false, flyingHeight=4711, hasRotationOnTimeline=false, healOnMorph=false, hideBeforeFirstHit=false, hidesWhenNotAttacking=false, hitSpeed=4711, hitpoints=4711, hitpointsPerLevel=" + new java.util.ArrayList<Integer>() + ", id=4711, ignorePushback=false, SummonerTower=false, jumpEnabled=false, kamikaze=false, key=astring, loadAfterRetarget=false, loadFirstHit=false, loadTime=4711, mass=4711, morphKeepTarget=false, name=astring, nameEn=astring, overrideAttackFinishTime=false, prestigeSwf=astring, prestigeExportName2=astring, prestigeExportName3=astring, projectile=astring, projectileStartRadius=4711, projectileStartZ=4711, range=4711, rarity=astring, retargetAfterAttack=false, scale=4711, selfAsAoeCenter=false, showHealthNumber=false, sightClip=4711, sightClipSide=4711, sightRange=4711, spawnAttach=false, spawnCharacter=astring, spawnCharacterLevelIndex=815, spawnConstPriority=false, spawnEffectOnce=false, spawnInterval=4711, spawnNumber=815, spawnPauseTime=4711, spawnStartTime=4711, specialAttackWhenHidden=false, speed=4711, speedEn=astring, stopMovementAfterMs=4711, summonCharacter=astring, summonNumber=815, targetOnlyBuildings=false, targetOnlyTroops=false, type=astring, waitMs=4711, walkingSpeedTweakPercentage=4711)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}