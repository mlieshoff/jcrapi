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
public class ClanWarLog {

    @SerializedName("createdDate")
    private long createdDate;

    @SerializedName("seasonNumber")
    private int seasonNumber;

    @SerializedName("participants")
    private java.util.List<ClanWarLogParticipant> participants;

    @SerializedName("standings")
    private java.util.List<ClanWarLogStanding> standings;

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }
    
    public long getCreatedDate() {
        return createdDate;
    }
    
    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
    
    public int getSeasonNumber() {
        return seasonNumber;
    }
    
    public void setParticipants(java.util.List<ClanWarLogParticipant> participants) {
        this.participants = participants;
    }
    
    public java.util.List<ClanWarLogParticipant> getParticipants() {
        return participants;
    }
    
    public void setStandings(java.util.List<ClanWarLogStanding> standings) {
        this.standings = standings;
    }
    
    public java.util.List<ClanWarLogStanding> getStandings() {
        return standings;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("ClanWarLog{");
        s.append("createdDate=");
        s.append(createdDate);
        s.append(", ");
        s.append("seasonNumber=");
        s.append(seasonNumber);
        s.append(", ");
        s.append("participants=");
        s.append(participants);
        s.append(", ");
        s.append("standings=");
        s.append(standings);
        s.append("}");
        return s.toString();
    }

}