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
public class Member {

    @SerializedName("name")
    private String name;

    @SerializedName("tag")
    private String tag;

    @SerializedName("rank")
    private int rank;

    @SerializedName("previousRank")
    private int previousRank;

    @SerializedName("role")
    private String role;

    @SerializedName("expLevel")
    private int expLevel;

    @SerializedName("trophies")
    private int trophies;

    @SerializedName("clanChestCrowns")
    private int clanChestCrowns;

    @SerializedName("donations")
    private int donations;

    @SerializedName("donationsReceived")
    private int donationsReceived;

    @SerializedName("donationsDelta")
    private int donationsDelta;

    @SerializedName("donationsPercent")
    private double donationsPercent;

    @SerializedName("arena")
    private Arena arena;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getTag() {
        return tag;
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
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setExpLevel(int expLevel) {
        this.expLevel = expLevel;
    }
    
    public int getExpLevel() {
        return expLevel;
    }
    
    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
    
    public int getTrophies() {
        return trophies;
    }
    
    public void setClanChestCrowns(int clanChestCrowns) {
        this.clanChestCrowns = clanChestCrowns;
    }
    
    public int getClanChestCrowns() {
        return clanChestCrowns;
    }
    
    public void setDonations(int donations) {
        this.donations = donations;
    }
    
    public int getDonations() {
        return donations;
    }
    
    public void setDonationsReceived(int donationsReceived) {
        this.donationsReceived = donationsReceived;
    }
    
    public int getDonationsReceived() {
        return donationsReceived;
    }
    
    public void setDonationsDelta(int donationsDelta) {
        this.donationsDelta = donationsDelta;
    }
    
    public int getDonationsDelta() {
        return donationsDelta;
    }
    
    public void setDonationsPercent(double donationsPercent) {
        this.donationsPercent = donationsPercent;
    }
    
    public double getDonationsPercent() {
        return donationsPercent;
    }
    
    public void setArena(Arena arena) {
        this.arena = arena;
    }
    
    public Arena getArena() {
        return arena;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Member{");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("rank=");
        s.append(rank);
        s.append(", ");
        s.append("previousRank=");
        s.append(previousRank);
        s.append(", ");
        s.append("role=");
        s.append(role);
        s.append(", ");
        s.append("expLevel=");
        s.append(expLevel);
        s.append(", ");
        s.append("trophies=");
        s.append(trophies);
        s.append(", ");
        s.append("clanChestCrowns=");
        s.append(clanChestCrowns);
        s.append(", ");
        s.append("donations=");
        s.append(donations);
        s.append(", ");
        s.append("donationsReceived=");
        s.append(donationsReceived);
        s.append(", ");
        s.append("donationsDelta=");
        s.append(donationsDelta);
        s.append(", ");
        s.append("donationsPercent=");
        s.append(donationsPercent);
        s.append(", ");
        s.append("arena=");
        s.append(arena);
        s.append("}");
        return s.toString();
    }

}