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
public class LeagueStatistics {

    @SerializedName("currentSeason")
    private CurrentSeason currentSeason;

    @SerializedName("previousSeason")
    private PreviousSeason previousSeason;

    @SerializedName("bestSeason")
    private BestSeason bestSeason;

    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }
    
    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }
    
    public void setPreviousSeason(PreviousSeason previousSeason) {
        this.previousSeason = previousSeason;
    }
    
    public PreviousSeason getPreviousSeason() {
        return previousSeason;
    }
    
    public void setBestSeason(BestSeason bestSeason) {
        this.bestSeason = bestSeason;
    }
    
    public BestSeason getBestSeason() {
        return bestSeason;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("LeagueStatistics{");
        s.append("currentSeason=");
        s.append(currentSeason);
        s.append(", ");
        s.append("previousSeason=");
        s.append(previousSeason);
        s.append(", ");
        s.append("bestSeason=");
        s.append(bestSeason);
        s.append("}");
        return s.toString();
    }

}