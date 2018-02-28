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
public class BattleMode {

    @SerializedName("name")
    private String name;

    @SerializedName("deck")
    private String deck;

    @SerializedName("cardLevels")
    private String cardLevels;

    @Deprecated
    @SerializedName("overtimeSecons")
    private int overtimeSecons;

    @SerializedName("overtimeSeconds")
    private int overtimeSeconds;

    @SerializedName("players")
    private String players;

    @SerializedName("sameDeck")
    private boolean sameDeck;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setDeck(String deck) {
        this.deck = deck;
    }
    
    public String getDeck() {
        return deck;
    }
    
    public void setCardLevels(String cardLevels) {
        this.cardLevels = cardLevels;
    }
    
    public String getCardLevels() {
        return cardLevels;
    }
    
    @Deprecated
    public void setOvertimeSecons(int overtimeSecons) {
        this.overtimeSecons = overtimeSecons;
    }
    
    @Deprecated
    public int getOvertimeSecons() {
        return overtimeSecons;
    }
    
    public void setOvertimeSeconds(int overtimeSeconds) {
        this.overtimeSeconds = overtimeSeconds;
    }
    
    public int getOvertimeSeconds() {
        return overtimeSeconds;
    }
    
    public void setPlayers(String players) {
        this.players = players;
    }
    
    public String getPlayers() {
        return players;
    }
    
    public void setSameDeck(boolean sameDeck) {
        this.sameDeck = sameDeck;
    }
    
    public boolean getSameDeck() {
        return sameDeck;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("BattleMode{");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("deck=");
        s.append(deck);
        s.append(", ");
        s.append("cardLevels=");
        s.append(cardLevels);
        s.append(", ");
        s.append("overtimeSecons=");
        s.append(overtimeSecons);
        s.append(", ");
        s.append("overtimeSeconds=");
        s.append(overtimeSeconds);
        s.append(", ");
        s.append("players=");
        s.append(players);
        s.append(", ");
        s.append("sameDeck=");
        s.append(sameDeck);
        s.append("}");
        return s.toString();
    }

}