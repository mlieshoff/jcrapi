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

  @SerializedName("battle_start_cooldown")
  private long battleStartCooldown;

  @SerializedName("card_level_adjustment")
  private String cardLevelAdjustment;

  @SerializedName("deck_selection")
  private String deckSelection;

  @SerializedName("fixed_deck_order")
  private boolean fixedDeckOrder;

  @SerializedName("gives_clan_score")
  private boolean givesClanScore;

  @SerializedName("heroes")
  private boolean heroes;

  @SerializedName("id")
  private long id;

  @SerializedName("name")
  private String name;

  @SerializedName("name_en")
  private String nameEn;

  @SerializedName("overtime_seconds")
  private long overtimeSeconds;

  @SerializedName("players")
  private String players;

  @SerializedName("predefined_decks")
  private String predefinedDecks;

  @SerializedName("same_deck_on_both")
  private boolean sameDeckOnBoth;

  @SerializedName("separate_team_decks")
  private boolean separateTeamDecks;

  @SerializedName("swapping_towers")
  private boolean swappingTowers;

  @SerializedName("use_starting_elixir")
  private boolean useStartingElixir;

}