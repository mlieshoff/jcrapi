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
public class BattleMode {

  @SerializedName("id")
  private int id;

  @SerializedName("name")
  private String name;

  @Deprecated
  @SerializedName("deck")
  private String deck;

  @Deprecated
  @SerializedName("cardLevels")
  private String cardLevels;

  @Deprecated
  @SerializedName("overtimeSecons")
  private int overtimeSecons;

  @SerializedName("overtimeSeconds")
  private int overtimeSeconds;

  @SerializedName("players")
  private String players;

  @Deprecated
  @SerializedName("sameDeck")
  private boolean sameDeck;

  @SerializedName("cardLevelAdjustment")
  private String cardLevelAdjustment;

  @SerializedName("deckSelection")
  private String deckSelection;

  @SerializedName("sameDeckOnBoth")
  private boolean sameDeckOnBoth;

  @SerializedName("separateTeamDecks")
  private boolean separateTeamDecks;

  @SerializedName("swappingTowers")
  private boolean swappingTowers;

  @SerializedName("useStartingElixir")
  private boolean useStartingElixir;

  @SerializedName("randomBoosts")
  private boolean randomBoosts;

  @SerializedName("heroes")
  private boolean heroes;

  @SerializedName("eventDeckClanWar")
  private boolean eventDeckClanWar;

  @SerializedName("givesClanScore")
  private boolean givesClanScore;

  @SerializedName("fixedDeckOrder")
  private boolean fixedDeckOrder;

  @SerializedName("heist")
  private boolean heist;

  @SerializedName("spellSupport")
  private boolean spellSupport;

  @SerializedName("hasDarkElixirCollector")
  private boolean hasDarkElixirCollector;

}