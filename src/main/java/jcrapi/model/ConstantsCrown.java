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
public class ConstantsCrown {

  @SerializedName("arena")
  private ConstantsArena arena;

  @SerializedName("arenas")
  private java.util.List<ConstantsArena> arenas;

  @SerializedName("base_chest")
  private String baseChest;

  @SerializedName("boosted_chest")
  private boolean boostedChest;

  @SerializedName("card_count")
  private long cardCount;

  @SerializedName("chest_count_in_chest_cycle")
  private long chestCountInChestCycle;

  @SerializedName("description")
  private String description;

  @SerializedName("different_spells")
  private long differentSpells;

  @SerializedName("draft_chest")
  private boolean draftChest;

  @SerializedName("epic_chance")
  private long epicChance;

  @SerializedName("exp")
  private long exp;

  @SerializedName("guaranteed_spells")
  private String guaranteedSpells;

  @SerializedName("in_arena_info")
  private boolean inArenaInfo;

  @SerializedName("in_shop")
  private boolean inShop;

  @SerializedName("legendary_chance")
  private long legendaryChance;

  @SerializedName("legendary_override_chance")
  private long legendaryOverrideChance;

  @SerializedName("max_gold")
  private long maxGold;

  @SerializedName("max_gold_per_card")
  private long maxGoldPerCard;

  @SerializedName("min_gold")
  private long minGold;

  @SerializedName("min_gold_per_card")
  private long minGoldPerCard;

  @SerializedName("name")
  private String name;

  @SerializedName("notification")
  private String notification;

  @SerializedName("random_spells")
  private long randomSpells;

  @SerializedName("rare_chance")
  private long rareChance;

  @SerializedName("shop_price_without_speed_up")
  private long shopPriceWithoutSpeedUp;

  @SerializedName("skin_chance")
  private long skinChance;

  @SerializedName("sort_value")
  private long sortValue;

  @SerializedName("special_offer")
  private boolean specialOffer;

  @SerializedName("spell_set")
  private String spellSet;

  @SerializedName("survival_chest")
  private boolean survivalChest;

  @SerializedName("time_taken_days")
  private long timeTakenDays;

  @SerializedName("time_taken_hours")
  private long timeTakenHours;

  @SerializedName("time_taken_minutes")
  private long timeTakenMinutes;

  @SerializedName("time_taken_seconds")
  private long timeTakenSeconds;

  @SerializedName("tournament_chest")
  private boolean tournamentChest;

}