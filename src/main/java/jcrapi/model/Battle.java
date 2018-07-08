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
public class Battle {

    @SerializedName("type")
    private String type;

    @SerializedName("challengeType")
    private String challengeType;

    @SerializedName("mode")
    private BattleMode mode;

    @SerializedName("winCountBefore")
    private int winCountBefore;

    @SerializedName("utcTime")
    private long utcTime;

    @SerializedName("deckType")
    private String deckType;

    @SerializedName("teamSize")
    private int teamSize;

    @SerializedName("winner")
    private int winner;

    @SerializedName("teamCrowns")
    private int teamCrowns;

    @SerializedName("opponentCrowns")
    private int opponentCrowns;

    @SerializedName("team")
    private java.util.List<Team> team;

    @SerializedName("opponent")
    private java.util.List<Team> opponent;

    @SerializedName("arena")
    private Arena arena;

    @SerializedName("tournamentTag")
    private String tournamentTag;

}