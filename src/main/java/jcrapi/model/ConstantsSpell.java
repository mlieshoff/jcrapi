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
public class ConstantsSpell {

  @SerializedName("affects_hidden")
  private boolean affectsHidden;

  @SerializedName("arena")
  private long arena;

  @SerializedName("buff")
  private String buff;

  @SerializedName("buff_number")
  private long buffNumber;

  @SerializedName("buff_time")
  private long buffTime;

  @SerializedName("buff_time_increase_after_tournament_cap")
  private long buffTimeIncreaseAfterTournamentCap;

  @SerializedName("buff_time_increase_per_level")
  private long buffTimeIncreasePerLevel;

  @SerializedName("cap_buff_time_to_area_effect_time")
  private boolean capBuffTimeToAreaEffectTime;

  @SerializedName("crown_tower_damage_percent")
  private long crownTowerDamagePercent;

  @SerializedName("damage")
  private long damage;

  @SerializedName("description")
  private String description;

  @SerializedName("elixir")
  private long elixir;

  @SerializedName("hit_biggest_targets")
  private boolean hitBiggestTargets;

  @SerializedName("hit_speed")
  private long hitSpeed;

  @SerializedName("hits_air")
  private boolean hitsAir;

  @SerializedName("hits_ground")
  private boolean hitsGround;

  @SerializedName("id")
  private long id;

  @SerializedName("ignore_buildings")
  private boolean ignoreBuildings;

  @SerializedName("ignore_hero")
  private boolean ignoreHero;

  @SerializedName("key")
  private String key;

  @SerializedName("life_duration")
  private long lifeDuration;

  @SerializedName("life_duration_increase_after_tournament_cap")
  private long lifeDurationIncreaseAfterTournamentCap;

  @SerializedName("life_duration_increase_per_level")
  private long lifeDurationIncreasePerLevel;

  @SerializedName("name")
  private String name;

  @SerializedName("no_effect_to_crown_towers")
  private boolean noEffectToCrownTowers;

  @SerializedName("only_enemies")
  private boolean onlyEnemies;

  @SerializedName("only_own_troops")
  private boolean onlyOwnTroops;

  @SerializedName("projectile")
  private String projectile;

  @SerializedName("radius")
  private long radius;

  @SerializedName("rarity")
  private String rarity;

  @SerializedName("spawn_angle_shift")
  private long spawnAngleShift;

  @SerializedName("spawn_character")
  private String spawnCharacter;

  @SerializedName("spawn_character_level_index")
  private long spawnCharacterLevelIndex;

  @SerializedName("spawn_deploy_base_anim")
  private String spawnDeployBaseAnim;

  @SerializedName("spawn_from_min_to_max")
  private boolean spawnFromMinToMax;

  @SerializedName("spawn_initial_delay")
  private long spawnInitialDelay;

  @SerializedName("spawn_interval")
  private long spawnInterval;

  @SerializedName("spawn_max_count")
  private long spawnMaxCount;

  @SerializedName("spawn_max_radius")
  private long spawnMaxRadius;

  @SerializedName("spawn_min_radius")
  private long spawnMinRadius;

  @SerializedName("spawn_randomize_sequence")
  private boolean spawnRandomizeSequence;

  @SerializedName("spawn_time")
  private long spawnTime;

  @SerializedName("type")
  private String type;

}