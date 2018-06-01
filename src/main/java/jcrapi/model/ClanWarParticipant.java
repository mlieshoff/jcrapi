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
public class ClanWarParticipant {

    @SerializedName("tag")
    private String tag;

    @SerializedName("name")
    private String name;

    @SerializedName("cardsEarned")
    private int cardsEarned;

    @SerializedName("battlesPlayed")
    private int battlesPlayed;

    @SerializedName("wins")
    private int wins;

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
    
    public void setCardsEarned(int cardsEarned) {
        this.cardsEarned = cardsEarned;
    }
    
    public int getCardsEarned() {
        return cardsEarned;
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
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("ClanWarParticipant{");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("cardsEarned=");
        s.append(cardsEarned);
        s.append(", ");
        s.append("battlesPlayed=");
        s.append(battlesPlayed);
        s.append(", ");
        s.append("wins=");
        s.append(wins);
        s.append("}");
        return s.toString();
    }

}