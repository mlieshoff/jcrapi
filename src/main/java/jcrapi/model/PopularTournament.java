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
public class PopularTournament extends Tournament {

    @SerializedName("popularity")
    private Popularity popularity;

    @SerializedName("endTime")
    private long endTime;

    @SerializedName("playerCount")
    private int playerCount;

    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
    }
    
    public Popularity getPopularity() {
        return popularity;
    }
    
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    
    public long getEndTime() {
        return endTime;
    }
    
    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }
    
    public int getPlayerCount() {
        return playerCount;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("PopularTournament{");
        s.append("popularity=");
        s.append(popularity);
        s.append(", ");
        s.append("endTime=");
        s.append(endTime);
        s.append(", ");
        s.append("playerCount=");
        s.append(playerCount);
        s.append("}");
        return s.toString();
    }

}