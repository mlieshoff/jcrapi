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
public class ConstantsBuildingTest {

  private ConstantsBuilding unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsBuilding();
  }

  @Test
  public void shouldGetSetAllTargetsHit() {
    boolean expected = false;
    unitUnderTest.setAllTargetsHit(expected);
    assertEquals(expected, unitUnderTest.isAllTargetsHit());
  }

  @Test
  public void shouldGetSetAttachedCharacterHeight() {
    long expected = 4711L;
    unitUnderTest.setAttachedCharacterHeight(expected);
    assertEquals(expected, unitUnderTest.getAttachedCharacterHeight());
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
  public void shouldGetSetDeathSpawnPushback() {
    boolean expected = false;
    unitUnderTest.setDeathSpawnPushback(expected);
    assertEquals(expected, unitUnderTest.isDeathSpawnPushback());
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
  public void shouldGetSetNoDeploySizeH() {
    long expected = 4711L;
    unitUnderTest.setNoDeploySizeH(expected);
    assertEquals(expected, unitUnderTest.getNoDeploySizeH());
  }

  @Test
  public void shouldGetSetNoDeploySizeW() {
    long expected = 4711L;
    unitUnderTest.setNoDeploySizeW(expected);
    assertEquals(expected, unitUnderTest.getNoDeploySizeW());
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
  public void shouldGetSetProjectileYOffset() {
    long expected = 4711L;
    unitUnderTest.setProjectileYOffset(expected);
    assertEquals(expected, unitUnderTest.getProjectileYOffset());
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
  public void shouldGetSetSpecialAttackWhenHidden() {
    boolean expected = false;
    unitUnderTest.setSpecialAttackWhenHidden(expected);
    assertEquals(expected, unitUnderTest.isSpecialAttackWhenHidden());
  }

  @Test
  public void shouldGetSetTargetOnlyBuildings() {
    boolean expected = false;
    unitUnderTest.setTargetOnlyBuildings(expected);
    assertEquals(expected, unitUnderTest.isTargetOnlyBuildings());
  }

  @Test
  public void shouldGetSetTileSizeOverride() {
    long expected = 4711L;
    unitUnderTest.setTileSizeOverride(expected);
    assertEquals(expected, unitUnderTest.getTileSizeOverride());
  }

  @Test
  public void shouldGetSetTurretMovement() {
    long expected = 4711L;
    unitUnderTest.setTurretMovement(expected);
    assertEquals(expected, unitUnderTest.getTurretMovement());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setAllTargetsHit(false);
    unitUnderTest.setAttachedCharacterHeight(4711L);
    unitUnderTest.setAttacksAir(false);
    unitUnderTest.setAttacksGround(false);
    unitUnderTest.setBuildingTarget(false);
    unitUnderTest.setBurstAffectAnimation(false);
    unitUnderTest.setBurstKeepTarget(false);
    unitUnderTest.setCollisionRadius(4711L);
    unitUnderTest.setCrowdEffects(false);
    unitUnderTest.setDashOnlyOnce(false);
    unitUnderTest.setDeathInheritIgnoreList(false);
    unitUnderTest.setDeathSpawnPushback(false);
    unitUnderTest.setDestroyAtLimit(false);
    unitUnderTest.setDontStopMoveAnim(false);
    unitUnderTest.setFlyDirectPaths(false);
    unitUnderTest.setFlyFromGround(false);
    unitUnderTest.setHasRotationOnTimeline(false);
    unitUnderTest.setHealOnMorph(false);
    unitUnderTest.setHideBeforeFirstHit(false);
    unitUnderTest.setHidesWhenNotAttacking(false);
    unitUnderTest.setHitSpeed(4711L);
    unitUnderTest.setHitpoints(4711L);
    unitUnderTest.setIgnorePushback(false);
    unitUnderTest.setSummonerTower(false);
    unitUnderTest.setJumpEnabled(false);
    unitUnderTest.setKamikaze(false);
    unitUnderTest.setLoadAfterRetarget(false);
    unitUnderTest.setLoadFirstHit(false);
    unitUnderTest.setLoadTime(4711L);
    unitUnderTest.setMorphKeepTarget(false);
    unitUnderTest.setName("astring");
    unitUnderTest.setNameEn("astring");
    unitUnderTest.setNoDeploySizeH(4711L);
    unitUnderTest.setNoDeploySizeW(4711L);
    unitUnderTest.setProjectile("astring");
    unitUnderTest.setProjectileStartRadius(4711L);
    unitUnderTest.setProjectileStartZ(4711L);
    unitUnderTest.setProjectileYOffset(4711L);
    unitUnderTest.setRange(4711L);
    unitUnderTest.setRarity("astring");
    unitUnderTest.setRetargetAfterAttack(false);
    unitUnderTest.setScale(4711L);
    unitUnderTest.setSelfAsAoeCenter(false);
    unitUnderTest.setShowHealthNumber(false);
    unitUnderTest.setSightRange(4711L);
    unitUnderTest.setSpawnAttach(false);
    unitUnderTest.setSpawnConstPriority(false);
    unitUnderTest.setSpawnEffectOnce(false);
    unitUnderTest.setSpecialAttackWhenHidden(false);
    unitUnderTest.setTargetOnlyBuildings(false);
    unitUnderTest.setTileSizeOverride(4711L);
    unitUnderTest.setTurretMovement(4711L);
    String expected = "ConstantsBuilding(allTargetsHit=false, attachedCharacterHeight=4711, attacksAir=false, attacksGround=false, buildingTarget=false, burstAffectAnimation=false, burstKeepTarget=false, collisionRadius=4711, crowdEffects=false, dashOnlyOnce=false, deathInheritIgnoreList=false, deathSpawnPushback=false, destroyAtLimit=false, dontStopMoveAnim=false, flyDirectPaths=false, flyFromGround=false, hasRotationOnTimeline=false, healOnMorph=false, hideBeforeFirstHit=false, hidesWhenNotAttacking=false, hitSpeed=4711, hitpoints=4711, ignorePushback=false, SummonerTower=false, jumpEnabled=false, kamikaze=false, loadAfterRetarget=false, loadFirstHit=false, loadTime=4711, morphKeepTarget=false, name=astring, nameEn=astring, noDeploySizeH=4711, noDeploySizeW=4711, projectile=astring, projectileStartRadius=4711, projectileStartZ=4711, projectileYOffset=4711, range=4711, rarity=astring, retargetAfterAttack=false, scale=4711, selfAsAoeCenter=false, showHealthNumber=false, sightRange=4711, spawnAttach=false, spawnConstPriority=false, spawnEffectOnce=false, specialAttackWhenHidden=false, targetOnlyBuildings=false, tileSizeOverride=4711, turretMovement=4711)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}