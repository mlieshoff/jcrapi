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
public class Profile {

  @SerializedName("tag")
  private String tag;

  @SerializedName("name")
  private String name;

  @Deprecated
  @SerializedName("rank")
  private int rank;

  @SerializedName("trophies")
  private int trophies;

  @SerializedName("arena")
  private Arena arena;

  @SerializedName("clan")
  private ProfileClan clan;

  @SerializedName("stats")
  private Stats stats;

  @SerializedName("games")
  private Games games;

  @Deprecated
  @SerializedName("chestCycle")
  private ChestCycle chestCycle;

  @SerializedName("leagueStatistics")
  private LeagueStatistics leagueStatistics;

  @SerializedName("currentDeck")
  private java.util.List<Card> currentDeck;

  @SerializedName("cards")
  private java.util.List<Card> cards;

  @Deprecated
  @SerializedName("achievments")
  private java.util.List<Achievment> achievments;

  @SerializedName("achievements")
  private java.util.List<Achievement> achievements;

  @Deprecated
  @SerializedName("battles")
  private java.util.List<Battle> battles;

  @SerializedName("deckLink")
  private String deckLink;

}