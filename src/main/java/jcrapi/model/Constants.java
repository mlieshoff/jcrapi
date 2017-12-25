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
public class Constants {

    @SerializedName("alliance")
    private Alliance alliance;

    @SerializedName("arenas")
    private java.util.List<Arena> arenas;

    @SerializedName("badges")
    private Badges badges;

    @SerializedName("chestCycle")
    private ChestCycleList chestCycle;

    @SerializedName("countryCodes")
    private java.util.List<CountryCode> countryCodes;

    @SerializedName("rarities")
    private java.util.List<Rarity> rarities;

    @SerializedName("cards")
    private java.util.List<ConstantCard> cards;

    public void setAlliance(Alliance alliance) {
        this.alliance = alliance;
    }
    
    public Alliance getAlliance() {
        return alliance;
    }
    
    public void setArenas(java.util.List<Arena> arenas) {
        this.arenas = arenas;
    }
    
    public java.util.List<Arena> getArenas() {
        return arenas;
    }
    
    public void setBadges(Badges badges) {
        this.badges = badges;
    }
    
    public Badges getBadges() {
        return badges;
    }
    
    public void setChestCycle(ChestCycleList chestCycle) {
        this.chestCycle = chestCycle;
    }
    
    public ChestCycleList getChestCycle() {
        return chestCycle;
    }
    
    public void setCountryCodes(java.util.List<CountryCode> countryCodes) {
        this.countryCodes = countryCodes;
    }
    
    public java.util.List<CountryCode> getCountryCodes() {
        return countryCodes;
    }
    
    public void setRarities(java.util.List<Rarity> rarities) {
        this.rarities = rarities;
    }
    
    public java.util.List<Rarity> getRarities() {
        return rarities;
    }
    
    public void setCards(java.util.List<ConstantCard> cards) {
        this.cards = cards;
    }
    
    public java.util.List<ConstantCard> getCards() {
        return cards;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Constants{");
        s.append("alliance=");
        s.append(alliance);
        s.append(", ");
        s.append("arenas=");
        s.append(arenas);
        s.append(", ");
        s.append("badges=");
        s.append(badges);
        s.append(", ");
        s.append("chestCycle=");
        s.append(chestCycle);
        s.append(", ");
        s.append("countryCodes=");
        s.append(countryCodes);
        s.append(", ");
        s.append("rarities=");
        s.append(rarities);
        s.append(", ");
        s.append("cards=");
        s.append(cards);
        s.append("}");
        return s.toString();
    }

}