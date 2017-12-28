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
public class Tournament {

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

    @SerializedName("capactiy")
    private int capactiy;

    @SerializedName("maxCapactiy")
    private int maxCapactiy;

    @SerializedName("preparationDuration")
    private int preparationDuration;

    @SerializedName("duration")
    private int duration;

    @SerializedName("endedTime")
    private String endedTime;

    @SerializedName("startTime")
    private long startTime;

    @SerializedName("createTime")
    private long createTime;

    @SerializedName("creator")
    private TournamentParticipant creator;

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
    
    public void setCapactiy(int capactiy) {
        this.capactiy = capactiy;
    }
    
    public int getCapactiy() {
        return capactiy;
    }
    
    public void setMaxCapactiy(int maxCapactiy) {
        this.maxCapactiy = maxCapactiy;
    }
    
    public int getMaxCapactiy() {
        return maxCapactiy;
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
    
    public void setEndedTime(String endedTime) {
        this.endedTime = endedTime;
    }
    
    public String getEndedTime() {
        return endedTime;
    }
    
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    
    public long getStartTime() {
        return startTime;
    }
    
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
    
    public long getCreateTime() {
        return createTime;
    }
    
    public void setCreator(TournamentParticipant creator) {
        this.creator = creator;
    }
    
    public TournamentParticipant getCreator() {
        return creator;
    }
    
    public void setMembers(java.util.List<TournamentParticipant> members) {
        this.members = members;
    }
    
    public java.util.List<TournamentParticipant> getMembers() {
        return members;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Tournament{");
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
        s.append("capactiy=");
        s.append(capactiy);
        s.append(", ");
        s.append("maxCapactiy=");
        s.append(maxCapactiy);
        s.append(", ");
        s.append("preparationDuration=");
        s.append(preparationDuration);
        s.append(", ");
        s.append("duration=");
        s.append(duration);
        s.append(", ");
        s.append("endedTime=");
        s.append(endedTime);
        s.append(", ");
        s.append("startTime=");
        s.append(startTime);
        s.append(", ");
        s.append("createTime=");
        s.append(createTime);
        s.append(", ");
        s.append("creator=");
        s.append(creator);
        s.append(", ");
        s.append("members=");
        s.append(members);
        s.append("}");
        return s.toString();
    }

}