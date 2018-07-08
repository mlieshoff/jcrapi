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
public class OneKTournament {

    @SerializedName("tag")
    private String tag;

    @SerializedName("name")
    private String name;

    @SerializedName("open")
    private boolean open;

    @SerializedName("maxPlayers")
    private int maxPlayers;

    @SerializedName("currentPlayers")
    private int currentPlayers;

    @SerializedName("status")
    private String status;

    @SerializedName("createTime")
    private long createTime;

    @SerializedName("prepTime")
    private int prepTime;

    @SerializedName("startTime")
    private String startTime;

    @SerializedName("endTime")
    private String endTime;

    @SerializedName("duration")
    private int duration;

    @SerializedName("description")
    private String description;

    @SerializedName("updatedAt")
    private long updatedAt;

    @SerializedName("type")
    private String type;

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getTag() {
        return tag;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setOpen(boolean open) {
        this.open = open;
    }
    
    public boolean getOpen() {
        return open;
    }
    
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }
    
    public int getMaxPlayers() {
        return maxPlayers;
    }
    
    public void setCurrentPlayers(int currentPlayers) {
        this.currentPlayers = currentPlayers;
    }
    
    public int getCurrentPlayers() {
        return currentPlayers;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
    
    public long getCreateTime() {
        return createTime;
    }
    
    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }
    
    public int getPrepTime() {
        return prepTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    public String getStartTime() {
        return startTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
    public String getEndTime() {
        return endTime;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    public long getUpdatedAt() {
        return updatedAt;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("OneKTournament{");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("open=");
        s.append(open);
        s.append(", ");
        s.append("maxPlayers=");
        s.append(maxPlayers);
        s.append(", ");
        s.append("currentPlayers=");
        s.append(currentPlayers);
        s.append(", ");
        s.append("status=");
        s.append(status);
        s.append(", ");
        s.append("createTime=");
        s.append(createTime);
        s.append(", ");
        s.append("prepTime=");
        s.append(prepTime);
        s.append(", ");
        s.append("startTime=");
        s.append(startTime);
        s.append(", ");
        s.append("endTime=");
        s.append(endTime);
        s.append(", ");
        s.append("duration=");
        s.append(duration);
        s.append(", ");
        s.append("description=");
        s.append(description);
        s.append(", ");
        s.append("updatedAt=");
        s.append(updatedAt);
        s.append(", ");
        s.append("type=");
        s.append(type);
        s.append("}");
        return s.toString();
    }

}