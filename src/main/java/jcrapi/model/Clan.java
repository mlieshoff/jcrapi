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
public class Clan {

    @SerializedName("tag")
    private String tag;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("type")
    private String type;

    @SerializedName("score")
    private int score;

    @SerializedName("memberCount")
    private int memberCount;

    @SerializedName("requiredScore")
    private int requiredScore;

    @SerializedName("donations")
    private int donations;

    @SerializedName("clanChest")
    private ClanChest clanChest;

    @SerializedName("badge")
    private Badge badge;

    @SerializedName("location")
    private Location location;

    @SerializedName("members")
    private java.util.List<Member> members;

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
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }
    
    public int getMemberCount() {
        return memberCount;
    }
    
    public void setRequiredScore(int requiredScore) {
        this.requiredScore = requiredScore;
    }
    
    public int getRequiredScore() {
        return requiredScore;
    }
    
    public void setDonations(int donations) {
        this.donations = donations;
    }
    
    public int getDonations() {
        return donations;
    }
    
    public void setClanChest(ClanChest clanChest) {
        this.clanChest = clanChest;
    }
    
    public ClanChest getClanChest() {
        return clanChest;
    }
    
    public void setBadge(Badge badge) {
        this.badge = badge;
    }
    
    public Badge getBadge() {
        return badge;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    
    public Location getLocation() {
        return location;
    }
    
    public void setMembers(java.util.List<Member> members) {
        this.members = members;
    }
    
    public java.util.List<Member> getMembers() {
        return members;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Clan{");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("description=");
        s.append(description);
        s.append(", ");
        s.append("type=");
        s.append(type);
        s.append(", ");
        s.append("score=");
        s.append(score);
        s.append(", ");
        s.append("memberCount=");
        s.append(memberCount);
        s.append(", ");
        s.append("requiredScore=");
        s.append(requiredScore);
        s.append(", ");
        s.append("donations=");
        s.append(donations);
        s.append(", ");
        s.append("clanChest=");
        s.append(clanChest);
        s.append(", ");
        s.append("badge=");
        s.append(badge);
        s.append(", ");
        s.append("location=");
        s.append(location);
        s.append(", ");
        s.append("members=");
        s.append(members);
        s.append("}");
        return s.toString();
    }

}