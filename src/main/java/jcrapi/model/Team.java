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
public class Team {

    @SerializedName("tag")
    private String tag;

    @SerializedName("deckLink")
    private String deckLink;

    @SerializedName("name")
    private String name;

    @SerializedName("crownsEarned")
    private int crownsEarned;

    @SerializedName("startTrophies")
    private int startTrophies;

    @SerializedName("trophyChange")
    private int trophyChange;

    @SerializedName("clan")
    private TeamClan clan;

    @SerializedName("deck")
    private java.util.List<TeamCard> deck;

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getTag() {
        return tag;
    }
    
    public void setDeckLink(String deckLink) {
        this.deckLink = deckLink;
    }
    
    public String getDeckLink() {
        return deckLink;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setCrownsEarned(int crownsEarned) {
        this.crownsEarned = crownsEarned;
    }
    
    public int getCrownsEarned() {
        return crownsEarned;
    }
    
    public void setStartTrophies(int startTrophies) {
        this.startTrophies = startTrophies;
    }
    
    public int getStartTrophies() {
        return startTrophies;
    }
    
    public void setTrophyChange(int trophyChange) {
        this.trophyChange = trophyChange;
    }
    
    public int getTrophyChange() {
        return trophyChange;
    }
    
    public void setClan(TeamClan clan) {
        this.clan = clan;
    }
    
    public TeamClan getClan() {
        return clan;
    }
    
    public void setDeck(java.util.List<TeamCard> deck) {
        this.deck = deck;
    }
    
    public java.util.List<TeamCard> getDeck() {
        return deck;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Team{");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("deckLink=");
        s.append(deckLink);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("crownsEarned=");
        s.append(crownsEarned);
        s.append(", ");
        s.append("startTrophies=");
        s.append(startTrophies);
        s.append(", ");
        s.append("trophyChange=");
        s.append(trophyChange);
        s.append(", ");
        s.append("clan=");
        s.append(clan);
        s.append(", ");
        s.append("deck=");
        s.append(deck);
        s.append("}");
        return s.toString();
    }

}