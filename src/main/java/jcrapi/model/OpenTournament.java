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
public class OpenTournament {

    @SerializedName("tag")
    private String tag;

    @SerializedName("type")
    private String type;

    @SerializedName("status")
    private String status;

    @SerializedName("name")
    private String name;

    @SerializedName("capacity")
    private int capacity;

    @SerializedName("playerCount")
    private int playerCount;

    @SerializedName("maxCapacity")
    private int maxCapacity;

    @SerializedName("preparationDuration")
    private int preparationDuration;

    @SerializedName("duration")
    private int duration;

    @SerializedName("createTime")
    private long createTime;

    @SerializedName("startTime")
    private String startTime;

    @SerializedName("endTime")
    private String endTime;

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
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }
    
    public int getPlayerCount() {
        return playerCount;
    }
    
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    
    public int getMaxCapacity() {
        return maxCapacity;
    }
    
    public void setPreparationDuration(int preparationDuration) {
        this.preparationDuration = preparationDuration;
    }
    
    public int getPreparationDuration() {
        return preparationDuration;
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
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("OpenTournament{");
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
        s.append("capacity=");
        s.append(capacity);
        s.append(", ");
        s.append("playerCount=");
        s.append(playerCount);
        s.append(", ");
        s.append("maxCapacity=");
        s.append(maxCapacity);
        s.append(", ");
        s.append("preparationDuration=");
        s.append(preparationDuration);
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
        s.append("}");
        return s.toString();
    }

}