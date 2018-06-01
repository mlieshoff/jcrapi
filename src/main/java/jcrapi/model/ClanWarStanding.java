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
public class ClanWarStanding {

    @SerializedName("tag")
    private String tag;

    @SerializedName("name")
    private String name;

    @SerializedName("participants")
    private int participants;

    @SerializedName("battlesPlayed")
    private int battlesPlayed;

    @SerializedName("wins")
    private int wins;

    @SerializedName("crowns")
    private int crowns;

    @SerializedName("warTrophies")
    private int warTrophies;

    @SerializedName("badge")
    private Badge badge;

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
    
    public void setParticipants(int participants) {
        this.participants = participants;
    }
    
    public int getParticipants() {
        return participants;
    }
    
    public void setBattlesPlayed(int battlesPlayed) {
        this.battlesPlayed = battlesPlayed;
    }
    
    public int getBattlesPlayed() {
        return battlesPlayed;
    }
    
    public void setWins(int wins) {
        this.wins = wins;
    }
    
    public int getWins() {
        return wins;
    }
    
    public void setCrowns(int crowns) {
        this.crowns = crowns;
    }
    
    public int getCrowns() {
        return crowns;
    }
    
    public void setWarTrophies(int warTrophies) {
        this.warTrophies = warTrophies;
    }
    
    public int getWarTrophies() {
        return warTrophies;
    }
    
    public void setBadge(Badge badge) {
        this.badge = badge;
    }
    
    public Badge getBadge() {
        return badge;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("ClanWarStanding{");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("participants=");
        s.append(participants);
        s.append(", ");
        s.append("battlesPlayed=");
        s.append(battlesPlayed);
        s.append(", ");
        s.append("wins=");
        s.append(wins);
        s.append(", ");
        s.append("crowns=");
        s.append(crowns);
        s.append(", ");
        s.append("warTrophies=");
        s.append(warTrophies);
        s.append(", ");
        s.append("badge=");
        s.append(badge);
        s.append("}");
        return s.toString();
    }

}