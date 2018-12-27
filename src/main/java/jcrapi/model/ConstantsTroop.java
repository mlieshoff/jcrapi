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
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Generated("org.mili.generator")
@Getter
@Setter
@ToString
public class ConstantsTroop {

  @SerializedName("all_targets_hit")
  private boolean allTargetsHit;

  @SerializedName("arena")
  private long arena;

  @SerializedName("attacks_air")
  private boolean attacksAir;

  @SerializedName("attacks_ground")
  private boolean attacksGround;

  @SerializedName("building_target")
  private boolean buildingTarget;

  @SerializedName("burst_affect_animation")
  private boolean burstAffectAnimation;

  @SerializedName("burst_keep_target")
  private boolean burstKeepTarget;

  @SerializedName("collision_radius")
  private long collisionRadius;

  @SerializedName("crowd_effects")
  private boolean crowdEffects;

  @SerializedName("damage")
  private long damage;

  @SerializedName("dash_only_once")
  private boolean dashOnlyOnce;

  @SerializedName("death_inherit_ignore_list")
  private boolean deathInheritIgnoreList;

  @SerializedName("death_spawn_pushback")
  private boolean deathSpawnPushback;

  @SerializedName("deploy_time")
  private long deployTime;

  @SerializedName("description")
  private String description;

  @SerializedName("destroy_at_limit")
  private boolean destroyAtLimit;

  @SerializedName("dont_stop_move_anim")
  private boolean dontStopMoveAnim;

  @SerializedName("dps")
  private double dps;

  @SerializedName("elixir")
  private long elixir;

  @SerializedName("fly_direct_paths")
  private boolean flyDirectPaths;

  @SerializedName("fly_from_ground")
  private boolean flyFromGround;

  @SerializedName("has_rotation_on_timeline")
  private boolean hasRotationOnTimeline;

  @SerializedName("heal_on_morph")
  private boolean healOnMorph;

  @SerializedName("hide_before_first_hit")
  private boolean hideBeforeFirstHit;

  @SerializedName("hides_when_not_attacking")
  private boolean hidesWhenNotAttacking;

  @SerializedName("hit_speed")
  private long hitSpeed;

  @SerializedName("hitpoints")
  private long hitpoints;

  @SerializedName("id")
  private long id;

  @SerializedName("ignore_pushback")
  private boolean ignorePushback;

  @SerializedName("is_summoner_tower")
  private boolean SummonerTower;

  @SerializedName("jump_enabled")
  private boolean jumpEnabled;

  @SerializedName("kamikaze")
  private boolean kamikaze;

  @SerializedName("key")
  private String key;

  @SerializedName("load_after_retarget")
  private boolean loadAfterRetarget;

  @SerializedName("load_first_hit")
  private boolean loadFirstHit;

  @SerializedName("load_time")
  private long loadTime;

  @SerializedName("mass")
  private long mass;

  @SerializedName("morph_keep_target")
  private boolean morphKeepTarget;

  @SerializedName("name")
  private String name;

  @SerializedName("name_en")
  private String nameEn;

  @SerializedName("projectile_start_radius")
  private long projectileStartRadius;

  @SerializedName("projectile_start_z")
  private long projectileStartZ;

  @SerializedName("range")
  private long range;

  @SerializedName("rarity")
  private String rarity;

  @SerializedName("retarget_after_attack")
  private boolean retargetAfterAttack;

  @SerializedName("scale")
  private long scale;

  @SerializedName("self_as_aoe_center")
  private boolean selfAsAoeCenter;

  @SerializedName("show_health_number")
  private boolean showHealthNumber;

  @SerializedName("sight_range")
  private long sightRange;

  @SerializedName("spawn_attach")
  private boolean spawnAttach;

  @SerializedName("spawn_const_priority")
  private boolean spawnConstPriority;

  @SerializedName("spawn_effect_once")
  private boolean spawnEffectOnce;

  @SerializedName("special_attack_when_hidden")
  private boolean specialAttackWhenHidden;

  @SerializedName("speed")
  private long speed;

  @SerializedName("speed_en")
  private String speedEn;

  @SerializedName("target_only_buildings")
  private boolean targetOnlyBuildings;

  @SerializedName("type")
  private String type;

}