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
public class ConstantsGameMode {

  @Deprecated
  @SerializedName("battle_start_cooldown")
  private long battleStartCooldown;

  @SerializedName("cardLevelAdjustment")
  private String cardLevelAdjustment;

  @Deprecated
  @SerializedName("clan_war_description")
  private String clanWarDescription;

  @SerializedName("deckSelection")
  private String deckSelection;

  @Deprecated
  @SerializedName("elixir_production_multiplier")
  private int elixirProductionMultiplier;

  @Deprecated
  @SerializedName("elixir_production_overtime_multiplier")
  private int elixirProductionOvertimeMultiplier;

  @Deprecated
  @SerializedName("event_deck_set_limit")
  private String eventDeckSetLimit;

  @Deprecated
  @SerializedName("fixed_arena")
  private String fixedArena;

  @SerializedName("fixedDeckOrder")
  private boolean fixedDeckOrder;

  @Deprecated
  @SerializedName("forced_deck_cards")
  private String forcedDeckCards;

  @Deprecated
  @SerializedName("gems_per_tower1")
  private int gemsPerTower1;

  @Deprecated
  @SerializedName("gems_per_tower2")
  private int gemsPerTower2;

  @Deprecated
  @SerializedName("gems_per_tower3")
  private int gemsPerTower3;

  @SerializedName("givesClanScore")
  private boolean givesClanScore;

  @Deprecated
  @SerializedName("global_buff")
  private String globalBuff;

  @Deprecated
  @SerializedName("gold_per_tower1")
  private int goldPerTower1;

  @Deprecated
  @SerializedName("gold_per_tower2")
  private int goldPerTower2;

  @Deprecated
  @SerializedName("gold_per_tower3")
  private int goldPerTower3;

  @SerializedName("heist")
  private boolean heist;

  @SerializedName("heroes")
  private boolean heroes;

  @SerializedName("id")
  private long id;

  @SerializedName("name")
  private String name;

  @Deprecated
  @SerializedName("name_en")
  private String nameEn;

  @SerializedName("overtimeSeconds")
  private long overtimeSeconds;

  @SerializedName("players")
  private String players;

  @Deprecated
  @SerializedName("predefined_decks")
  private String predefinedDecks;

  @SerializedName("sameDeckOnBoth")
  private boolean sameDeckOnBoth;

  @SerializedName("separateTeamDecks")
  private boolean separateTeamDecks;

  @Deprecated
  @SerializedName("skin_set")
  private String skinSet;

  @Deprecated
  @SerializedName("starting_elixir")
  private int startingElixir;

  @SerializedName("swappingTowers")
  private boolean swappingTowers;

  @Deprecated
  @SerializedName("target_touchdowns")
  private int targetTouchdowns;

  @SerializedName("useStartingElixir")
  private boolean useStartingElixir;

  @SerializedName("randomBoosts")
  private boolean randomBoosts;

  @SerializedName("eventDeckClanWar")
  private boolean eventDeckClanWar;

  @SerializedName("spellSupport")
  private boolean spellSupport;

  @SerializedName("hasDarkElixirCollector")
  private boolean hasDarkElixirCollector;

  @Deprecated
  @SerializedName("rewardGold")
  private java.util.List<Integer> rewardGold;

  @Deprecated
  @SerializedName("rewardCards")
  private java.util.List<Integer> rewardCards;

}