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

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.mili.generator")
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

    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public void setChallengeType(String challengeType) {
        this.challengeType = challengeType;
    }
    
    public String getChallengeType() {
        return challengeType;
    }
    
    public void setMode(BattleMode mode) {
        this.mode = mode;
    }
    
    public BattleMode getMode() {
        return mode;
    }
    
    public void setWinCountBefore(int winCountBefore) {
        this.winCountBefore = winCountBefore;
    }
    
    public int getWinCountBefore() {
        return winCountBefore;
    }
    
    public void setUtcTime(long utcTime) {
        this.utcTime = utcTime;
    }
    
    public long getUtcTime() {
        return utcTime;
    }
    
    public void setDeckType(String deckType) {
        this.deckType = deckType;
    }
    
    public String getDeckType() {
        return deckType;
    }
    
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    
    public int getTeamSize() {
        return teamSize;
    }
    
    public void setWinner(int winner) {
        this.winner = winner;
    }
    
    public int getWinner() {
        return winner;
    }
    
    public void setTeamCrowns(int teamCrowns) {
        this.teamCrowns = teamCrowns;
    }
    
    public int getTeamCrowns() {
        return teamCrowns;
    }
    
    public void setOpponentCrowns(int opponentCrowns) {
        this.opponentCrowns = opponentCrowns;
    }
    
    public int getOpponentCrowns() {
        return opponentCrowns;
    }
    
    public void setTeam(java.util.List<Team> team) {
        this.team = team;
    }
    
    public java.util.List<Team> getTeam() {
        return team;
    }
    
    public void setOpponent(java.util.List<Team> opponent) {
        this.opponent = opponent;
    }
    
    public java.util.List<Team> getOpponent() {
        return opponent;
    }
    
    public void setArena(Arena arena) {
        this.arena = arena;
    }
    
    public Arena getArena() {
        return arena;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Battle{");
        s.append("type=");
        s.append(type);
        s.append(", ");
        s.append("challengeType=");
        s.append(challengeType);
        s.append(", ");
        s.append("mode=");
        s.append(mode);
        s.append(", ");
        s.append("winCountBefore=");
        s.append(winCountBefore);
        s.append(", ");
        s.append("utcTime=");
        s.append(utcTime);
        s.append(", ");
        s.append("deckType=");
        s.append(deckType);
        s.append(", ");
        s.append("teamSize=");
        s.append(teamSize);
        s.append(", ");
        s.append("winner=");
        s.append(winner);
        s.append(", ");
        s.append("teamCrowns=");
        s.append(teamCrowns);
        s.append(", ");
        s.append("opponentCrowns=");
        s.append(opponentCrowns);
        s.append(", ");
        s.append("team=");
        s.append(team);
        s.append(", ");
        s.append("opponent=");
        s.append(opponent);
        s.append(", ");
        s.append("arena=");
        s.append(arena);
        s.append("}");
        return s.toString();
    }

}