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
public class ConstantCard {

    @SerializedName("card_id")
    private int cardId;

    @SerializedName("key")
    private String key;

    @SerializedName("card_key")
    private String cardKey;

    @SerializedName("name")
    private String name;

    @SerializedName("elixir")
    private int elixir;

    @SerializedName("type")
    private String type;

    @SerializedName("rarity")
    private String rarity;

    @SerializedName("arena")
    private int arena;

    @SerializedName("description")
    private String description;

    @SerializedName("decklink")
    private String decklink;

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
    
    public int getCardId() {
        return cardId;
    }
    
    public void setKey(String key) {
        this.key = key;
    }
    
    public String getKey() {
        return key;
    }
    
    public void setCardKey(String cardKey) {
        this.cardKey = cardKey;
    }
    
    public String getCardKey() {
        return cardKey;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setElixir(int elixir) {
        this.elixir = elixir;
    }
    
    public int getElixir() {
        return elixir;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    
    public String getRarity() {
        return rarity;
    }
    
    public void setArena(int arena) {
        this.arena = arena;
    }
    
    public int getArena() {
        return arena;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDecklink(String decklink) {
        this.decklink = decklink;
    }
    
    public String getDecklink() {
        return decklink;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("ConstantCard{");
        s.append("cardId=");
        s.append(cardId);
        s.append(", ");
        s.append("key=");
        s.append(key);
        s.append(", ");
        s.append("cardKey=");
        s.append(cardKey);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("elixir=");
        s.append(elixir);
        s.append(", ");
        s.append("type=");
        s.append(type);
        s.append(", ");
        s.append("rarity=");
        s.append(rarity);
        s.append(", ");
        s.append("arena=");
        s.append(arena);
        s.append(", ");
        s.append("description=");
        s.append(description);
        s.append(", ");
        s.append("decklink=");
        s.append(decklink);
        s.append("}");
        return s.toString();
    }

}