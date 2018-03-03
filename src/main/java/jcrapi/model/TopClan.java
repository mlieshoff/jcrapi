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
public class TopClan {

    @SerializedName("tag")
    private String tag;

    @SerializedName("name")
    private String name;

    @SerializedName("score")
    private int score;

    @SerializedName("memberCount")
    private int memberCount;

    @SerializedName("rank")
    private int rank;

    @SerializedName("previousRank")
    private int previousRank;

    @SerializedName("badge")
    private Badge badge;

    @SerializedName("location")
    private Location location;

    @SerializedName("tracking")
    private Tracking tracking;

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
    
    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public int getRank() {
        return rank;
    }
    
    public void setPreviousRank(int previousRank) {
        this.previousRank = previousRank;
    }
    
    public int getPreviousRank() {
        return previousRank;
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
    
    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
    }
    
    public Tracking getTracking() {
        return tracking;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("TopClan{");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("score=");
        s.append(score);
        s.append(", ");
        s.append("memberCount=");
        s.append(memberCount);
        s.append(", ");
        s.append("rank=");
        s.append(rank);
        s.append(", ");
        s.append("previousRank=");
        s.append(previousRank);
        s.append(", ");
        s.append("badge=");
        s.append(badge);
        s.append(", ");
        s.append("location=");
        s.append(location);
        s.append(", ");
        s.append("tracking=");
        s.append(tracking);
        s.append("}");
        return s.toString();
    }

}