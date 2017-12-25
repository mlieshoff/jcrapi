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

@Generated("org.mili.generator")
public class Profile {

    @SerializedName("tag")
    private String tag;

    @SerializedName("name")
    private String name;

    @SerializedName("trophies")
    private int trophies;

    @SerializedName("arena")
    private Arena arena;

    @SerializedName("clan")
    private ProfileClan clan;

    @SerializedName("games")
    private Games games;

    @SerializedName("chestCycle")
    private ChestCycle chestCycle;

    @SerializedName("leagueStatistics")
    private LeagueStatistics leagueStatistics;

    @SerializedName("currentDeck")
    private java.util.List<Card> currentDeck;

    @SerializedName("cards")
    private java.util.List<Card> cards;

    @SerializedName("achievments")
    private java.util.List<Achievment> achievments;

    @SerializedName("battles")
    private java.util.List<Battle> battles;

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getTag() {
        return tag;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
    
    public int getTrophies() {
        return trophies;
    }
    
    public void setArena(Arena arena) {
        this.arena = arena;
    }
    
    public Arena getArena() {
        return arena;
    }
    
    public void setClan(ProfileClan clan) {
        this.clan = clan;
    }
    
    public ProfileClan getClan() {
        return clan;
    }
    
    public void setGames(Games games) {
        this.games = games;
    }
    
    public Games getGames() {
        return games;
    }
    
    public void setChestCycle(ChestCycle chestCycle) {
        this.chestCycle = chestCycle;
    }
    
    public ChestCycle getChestCycle() {
        return chestCycle;
    }
    
    public void setLeagueStatistics(LeagueStatistics leagueStatistics) {
        this.leagueStatistics = leagueStatistics;
    }
    
    public LeagueStatistics getLeagueStatistics() {
        return leagueStatistics;
    }
    
    public void setCurrentDeck(java.util.List<Card> currentDeck) {
        this.currentDeck = currentDeck;
    }
    
    public java.util.List<Card> getCurrentDeck() {
        return currentDeck;
    }
    
    public void setCards(java.util.List<Card> cards) {
        this.cards = cards;
    }
    
    public java.util.List<Card> getCards() {
        return cards;
    }
    
    public void setAchievments(java.util.List<Achievment> achievments) {
        this.achievments = achievments;
    }
    
    public java.util.List<Achievment> getAchievments() {
        return achievments;
    }
    
    public void setBattles(java.util.List<Battle> battles) {
        this.battles = battles;
    }
    
    public java.util.List<Battle> getBattles() {
        return battles;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Profile{");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("trophies=");
        s.append(trophies);
        s.append(", ");
        s.append("arena=");
        s.append(arena);
        s.append(", ");
        s.append("clan=");
        s.append(clan);
        s.append(", ");
        s.append("games=");
        s.append(games);
        s.append(", ");
        s.append("chestCycle=");
        s.append(chestCycle);
        s.append(", ");
        s.append("leagueStatistics=");
        s.append(leagueStatistics);
        s.append(", ");
        s.append("currentDeck=");
        s.append(currentDeck);
        s.append(", ");
        s.append("cards=");
        s.append(cards);
        s.append(", ");
        s.append("achievments=");
        s.append(achievments);
        s.append(", ");
        s.append("battles=");
        s.append(battles);
        s.append("}");
        return s.toString();
    }

}