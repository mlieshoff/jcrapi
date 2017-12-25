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
public class Games {

    @SerializedName("total")
    private int total;

    @SerializedName("tournamentGames")
    private int tournamentGames;

    @SerializedName("wins")
    private int wins;

    @SerializedName("winsPercent")
    private double winsPercent;

    @SerializedName("losses")
    private int losses;

    @SerializedName("lossesPercent")
    private double lossesPercent;

    @SerializedName("draws")
    private int draws;

    @SerializedName("drawsPercent")
    private double drawsPercent;

    public void setTotal(int total) {
        this.total = total;
    }
    
    public int getTotal() {
        return total;
    }
    
    public void setTournamentGames(int tournamentGames) {
        this.tournamentGames = tournamentGames;
    }
    
    public int getTournamentGames() {
        return tournamentGames;
    }
    
    public void setWins(int wins) {
        this.wins = wins;
    }
    
    public int getWins() {
        return wins;
    }
    
    public void setWinsPercent(double winsPercent) {
        this.winsPercent = winsPercent;
    }
    
    public double getWinsPercent() {
        return winsPercent;
    }
    
    public void setLosses(int losses) {
        this.losses = losses;
    }
    
    public int getLosses() {
        return losses;
    }
    
    public void setLossesPercent(double lossesPercent) {
        this.lossesPercent = lossesPercent;
    }
    
    public double getLossesPercent() {
        return lossesPercent;
    }
    
    public void setDraws(int draws) {
        this.draws = draws;
    }
    
    public int getDraws() {
        return draws;
    }
    
    public void setDrawsPercent(double drawsPercent) {
        this.drawsPercent = drawsPercent;
    }
    
    public double getDrawsPercent() {
        return drawsPercent;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Games{");
        s.append("total=");
        s.append(total);
        s.append(", ");
        s.append("tournamentGames=");
        s.append(tournamentGames);
        s.append(", ");
        s.append("wins=");
        s.append(wins);
        s.append(", ");
        s.append("winsPercent=");
        s.append(winsPercent);
        s.append(", ");
        s.append("losses=");
        s.append(losses);
        s.append(", ");
        s.append("lossesPercent=");
        s.append(lossesPercent);
        s.append(", ");
        s.append("draws=");
        s.append(draws);
        s.append(", ");
        s.append("drawsPercent=");
        s.append(drawsPercent);
        s.append("}");
        return s.toString();
    }

}