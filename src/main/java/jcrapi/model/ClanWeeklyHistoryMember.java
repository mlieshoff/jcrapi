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
public class ClanWeeklyHistoryMember {

    @SerializedName("clanRank")
    private Integer clanRank;

    @SerializedName("crowns")
    private Integer crowns;

    @SerializedName("donations")
    private Integer donations;

    @SerializedName("name")
    private String name;

    @SerializedName("tag")
    private String tag;

    @SerializedName("trophies")
    private Integer trophies;

    public void setClanRank(Integer clanRank) {
        this.clanRank = clanRank;
    }
    
    public Integer getClanRank() {
        return clanRank;
    }
    
    public void setCrowns(Integer crowns) {
        this.crowns = crowns;
    }
    
    public Integer getCrowns() {
        return crowns;
    }
    
    public void setDonations(Integer donations) {
        this.donations = donations;
    }
    
    public Integer getDonations() {
        return donations;
    }
    
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
    
    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }
    
    public Integer getTrophies() {
        return trophies;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("ClanWeeklyHistoryMember{");
        s.append("clanRank=");
        s.append(clanRank);
        s.append(", ");
        s.append("crowns=");
        s.append(crowns);
        s.append(", ");
        s.append("donations=");
        s.append(donations);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("trophies=");
        s.append(trophies);
        s.append("}");
        return s.toString();
    }

}