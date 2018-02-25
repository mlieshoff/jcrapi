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
public class PopularDeck {

    @SerializedName("decklink")
    private String decklink;

    @SerializedName("popularity")
    private int popularity;

    @SerializedName("cards")
    private java.util.List<PopularCard> cards;

    public void setDecklink(String decklink) {
        this.decklink = decklink;
    }
    
    public String getDecklink() {
        return decklink;
    }
    
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }
    
    public int getPopularity() {
        return popularity;
    }
    
    public void setCards(java.util.List<PopularCard> cards) {
        this.cards = cards;
    }
    
    public java.util.List<PopularCard> getCards() {
        return cards;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("PopularDeck{");
        s.append("decklink=");
        s.append(decklink);
        s.append(", ");
        s.append("popularity=");
        s.append(popularity);
        s.append(", ");
        s.append("cards=");
        s.append(cards);
        s.append("}");
        return s.toString();
    }

}