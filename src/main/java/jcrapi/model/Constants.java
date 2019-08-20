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
public class Constants {

  @SerializedName("alliance_badges")
  private java.util.List<ConstantsAllianceBadge> allianceBadges;

  @SerializedName("arenas")
  private java.util.List<ConstantsArena> arenas;

  @SerializedName("cards")
  private java.util.List<ConstantsCard> cards;

  @SerializedName("cards_stats")
  private ConstantsCardsStats cardsStats;

  @SerializedName("challenges")
  private java.util.List<ConstantsChallenge> challenges;

  @SerializedName("chest_order")
  private ConstantsChestOrder chestOrder;

  @SerializedName("clan_chest")
  private ConstantsClanChest clanChest;

  @SerializedName("game_modes")
  private java.util.List<ConstantsGameMode> gameModes;

  @SerializedName("rarities")
  private java.util.List<ConstantsRarity> rarities;

  @SerializedName("regions")
  private java.util.List<ConstantsRegion> regions;

  @SerializedName("tournaments")
  private java.util.List<ConstantsTournament> tournaments;

  @SerializedName("treasure_chests")
  private ConstantsTreasureChests treasureChests;

  @SerializedName("rewardGold")
  private java.util.List<Integer> rewardGold;

  @SerializedName("rewardCards")
  private java.util.List<Integer> rewardCards;

}