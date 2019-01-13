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
public class ConstantsArena {

  @SerializedName("arena")
  private long arena;

  @SerializedName("arena_id")
  private long arenaId;

  @SerializedName("battle_reward_gold")
  private long battleRewardGold;

  @SerializedName("chest_arena")
  private String chestArena;

  @SerializedName("chest_reward_multiplier")
  private long chestRewardMultiplier;

  @SerializedName("card_count_by_arena")
  private long cardCountByArena;

  @SerializedName("card_count_common")
  private double cardCountCommon;

  @SerializedName("card_count_epic")
  private double cardCountEpic;

  @SerializedName("card_count_legendary")
  private double cardCountLegendary;

  @SerializedName("card_count_rare")
  private double cardCountRare;

  @SerializedName("daily_donation_capacity_limit")
  private long dailyDonationCapacityLimit;

  @SerializedName("demote_trophy_limit")
  private long demoteTrophyLimit;

  @SerializedName("force_quest_chest_cycle")
  private String forceQuestChestCycle;

  @SerializedName("id")
  private long id;

  @SerializedName("is_in_use")
  private boolean InUse;

  @SerializedName("key")
  private String key;

  @SerializedName("league_id")
  private String leagueId;

  @SerializedName("matchmaking_max_seconds")
  private long matchmakingMaxSeconds;

  @SerializedName("matchmaking_max_trophy_delta")
  private long matchmakingMaxTrophyDelta;

  @SerializedName("matchmaking_min_trophy_delta")
  private long matchmakingMinTrophyDelta;

  @SerializedName("max_donation_count_common")
  private long maxDonationCountCommon;

  @SerializedName("max_donation_count_epic")
  private long maxDonationCountEpic;

  @SerializedName("max_donation_count_rare")
  private long maxDonationCountRare;

  @SerializedName("name")
  private String name;

  @SerializedName("quest_cycle")
  private String questCycle;

  @SerializedName("request_size")
  private long requestSize;

  @SerializedName("season_reward_chest")
  private String seasonRewardChest;

  @SerializedName("shop_chest_reward_multiplier")
  private long shopChestRewardMultiplier;

  @SerializedName("subtitle")
  private String subtitle;

  @SerializedName("title")
  private String title;

  @SerializedName("training_camp")
  private boolean trainingCamp;

  @SerializedName("trophy_limit")
  private long trophyLimit;

  @SerializedName("tv_arena")
  private String tvArena;

}