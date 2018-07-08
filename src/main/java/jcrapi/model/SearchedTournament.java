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
public class SearchedTournament {

    @SerializedName("tag")
    private String tag;

    @SerializedName("type")
    private String type;

    @SerializedName("status")
    private String status;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @Deprecated
    @SerializedName("maxCapacity")
    private int maxCapacity;

    @SerializedName("maxPlayers")
    private int maxPlayers;

    @Deprecated
    @SerializedName("preparationDuration")
    private int preparationDuration;

    @SerializedName("prepTime")
    private int prepTime;

    @SerializedName("duration")
    private int duration;

    @SerializedName("createTime")
    private long createTime;

    @SerializedName("startTime")
    private long startTime;

    @SerializedName("endTime")
    private long endTime;

    @Deprecated
    @SerializedName("playerCount")
    private int playerCount;

    @SerializedName("currentPlayer")
    private int currentPlayer;

    @SerializedName("members")
    private java.util.List<TournamentParticipant> members;

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getTag() {
        return tag;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    @Deprecated
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    
    @Deprecated
    public int getMaxCapacity() {
        return maxCapacity;
    }
    
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }
    
    public int getMaxPlayers() {
        return maxPlayers;
    }
    
    @Deprecated
    public void setPreparationDuration(int preparationDuration) {
        this.preparationDuration = preparationDuration;
    }
    
    @Deprecated
    public int getPreparationDuration() {
        return preparationDuration;
    }
    
    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }
    
    public int getPrepTime() {
        return prepTime;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
    
    public long getCreateTime() {
        return createTime;
    }
    
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    
    public long getStartTime() {
        return startTime;
    }
    
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    
    public long getEndTime() {
        return endTime;
    }
    
    @Deprecated
    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }
    
    @Deprecated
    public int getPlayerCount() {
        return playerCount;
    }
    
    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
    
    public int getCurrentPlayer() {
        return currentPlayer;
    }
    
    public void setMembers(java.util.List<TournamentParticipant> members) {
        this.members = members;
    }
    
    public java.util.List<TournamentParticipant> getMembers() {
        return members;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("SearchedTournament{");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("type=");
        s.append(type);
        s.append(", ");
        s.append("status=");
        s.append(status);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("description=");
        s.append(description);
        s.append(", ");
        s.append("maxCapacity=");
        s.append(maxCapacity);
        s.append(", ");
        s.append("maxPlayers=");
        s.append(maxPlayers);
        s.append(", ");
        s.append("preparationDuration=");
        s.append(preparationDuration);
        s.append(", ");
        s.append("prepTime=");
        s.append(prepTime);
        s.append(", ");
        s.append("duration=");
        s.append(duration);
        s.append(", ");
        s.append("createTime=");
        s.append(createTime);
        s.append(", ");
        s.append("startTime=");
        s.append(startTime);
        s.append(", ");
        s.append("endTime=");
        s.append(endTime);
        s.append(", ");
        s.append("playerCount=");
        s.append(playerCount);
        s.append(", ");
        s.append("currentPlayer=");
        s.append(currentPlayer);
        s.append(", ");
        s.append("members=");
        s.append(members);
        s.append("}");
        return s.toString();
    }

}