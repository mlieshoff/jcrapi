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
public class Stats {

    @SerializedName("tournamentCardsWon")
    private int tournamentCardsWon;

    @SerializedName("maxTrophies")
    private int maxTrophies;

    @SerializedName("threeCrownWins")
    private int threeCrownWins;

    @SerializedName("cardsFound")
    private int cardsFound;

    @SerializedName("favoriteCard")
    private FavoriteCard favoriteCard;

    @SerializedName("totalDonations")
    private int totalDonations;

    @SerializedName("challengeMaxWins")
    private int challengeMaxWins;

    @SerializedName("challengeCardsWon")
    private int challengeCardsWon;

    @SerializedName("level")
    private int level;

    public void setTournamentCardsWon(int tournamentCardsWon) {
        this.tournamentCardsWon = tournamentCardsWon;
    }
    
    public int getTournamentCardsWon() {
        return tournamentCardsWon;
    }
    
    public void setMaxTrophies(int maxTrophies) {
        this.maxTrophies = maxTrophies;
    }
    
    public int getMaxTrophies() {
        return maxTrophies;
    }
    
    public void setThreeCrownWins(int threeCrownWins) {
        this.threeCrownWins = threeCrownWins;
    }
    
    public int getThreeCrownWins() {
        return threeCrownWins;
    }
    
    public void setCardsFound(int cardsFound) {
        this.cardsFound = cardsFound;
    }
    
    public int getCardsFound() {
        return cardsFound;
    }
    
    public void setFavoriteCard(FavoriteCard favoriteCard) {
        this.favoriteCard = favoriteCard;
    }
    
    public FavoriteCard getFavoriteCard() {
        return favoriteCard;
    }
    
    public void setTotalDonations(int totalDonations) {
        this.totalDonations = totalDonations;
    }
    
    public int getTotalDonations() {
        return totalDonations;
    }
    
    public void setChallengeMaxWins(int challengeMaxWins) {
        this.challengeMaxWins = challengeMaxWins;
    }
    
    public int getChallengeMaxWins() {
        return challengeMaxWins;
    }
    
    public void setChallengeCardsWon(int challengeCardsWon) {
        this.challengeCardsWon = challengeCardsWon;
    }
    
    public int getChallengeCardsWon() {
        return challengeCardsWon;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public int getLevel() {
        return level;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Stats{");
        s.append("tournamentCardsWon=");
        s.append(tournamentCardsWon);
        s.append(", ");
        s.append("maxTrophies=");
        s.append(maxTrophies);
        s.append(", ");
        s.append("threeCrownWins=");
        s.append(threeCrownWins);
        s.append(", ");
        s.append("cardsFound=");
        s.append(cardsFound);
        s.append(", ");
        s.append("favoriteCard=");
        s.append(favoriteCard);
        s.append(", ");
        s.append("totalDonations=");
        s.append(totalDonations);
        s.append(", ");
        s.append("challengeMaxWins=");
        s.append(challengeMaxWins);
        s.append(", ");
        s.append("challengeCardsWon=");
        s.append(challengeCardsWon);
        s.append(", ");
        s.append("level=");
        s.append(level);
        s.append("}");
        return s.toString();
    }

}