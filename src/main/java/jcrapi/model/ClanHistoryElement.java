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
public class ClanHistoryElement {

    @SerializedName("donations")
    private Integer donations;

    @SerializedName("memberCount")
    private Integer memberCount;

    @SerializedName("members")
    private java.util.List<ClanHistoryMember> members;

    @SerializedName("score")
    private Integer score;

    public void setDonations(Integer donations) {
        this.donations = donations;
    }
    
    public Integer getDonations() {
        return donations;
    }
    
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }
    
    public Integer getMemberCount() {
        return memberCount;
    }
    
    public void setMembers(java.util.List<ClanHistoryMember> members) {
        this.members = members;
    }
    
    public java.util.List<ClanHistoryMember> getMembers() {
        return members;
    }
    
    public void setScore(Integer score) {
        this.score = score;
    }
    
    public Integer getScore() {
        return score;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("ClanHistoryElement{");
        s.append("donations=");
        s.append(donations);
        s.append(", ");
        s.append("memberCount=");
        s.append(memberCount);
        s.append(", ");
        s.append("members=");
        s.append(members);
        s.append(", ");
        s.append("score=");
        s.append(score);
        s.append("}");
        return s.toString();
    }

}