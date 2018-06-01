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
public class ClanWar {

    @SerializedName("state")
    private String state;

    @SerializedName("warEndTime")
    private long warEndTime;

    @SerializedName("collectionEndTime")
    private long collectionEndTime;

    @SerializedName("clan")
    private ClanWarClan clan;

    @SerializedName("participants")
    private java.util.List<ClanWarParticipant> participants;

    @SerializedName("standings")
    private java.util.List<ClanWarStanding> standings;

    public void setState(String state) {
        this.state = state;
    }
    
    public String getState() {
        return state;
    }
    
    public void setWarEndTime(long warEndTime) {
        this.warEndTime = warEndTime;
    }
    
    public long getWarEndTime() {
        return warEndTime;
    }
    
    public void setCollectionEndTime(long collectionEndTime) {
        this.collectionEndTime = collectionEndTime;
    }
    
    public long getCollectionEndTime() {
        return collectionEndTime;
    }
    
    public void setClan(ClanWarClan clan) {
        this.clan = clan;
    }
    
    public ClanWarClan getClan() {
        return clan;
    }
    
    public void setParticipants(java.util.List<ClanWarParticipant> participants) {
        this.participants = participants;
    }
    
    public java.util.List<ClanWarParticipant> getParticipants() {
        return participants;
    }
    
    public void setStandings(java.util.List<ClanWarStanding> standings) {
        this.standings = standings;
    }
    
    public java.util.List<ClanWarStanding> getStandings() {
        return standings;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("ClanWar{");
        s.append("state=");
        s.append(state);
        s.append(", ");
        s.append("warEndTime=");
        s.append(warEndTime);
        s.append(", ");
        s.append("collectionEndTime=");
        s.append(collectionEndTime);
        s.append(", ");
        s.append("clan=");
        s.append(clan);
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