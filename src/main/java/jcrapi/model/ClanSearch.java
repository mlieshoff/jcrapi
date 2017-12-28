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
public class ClanSearch {

    @SerializedName("name")
    private String name;

    @SerializedName("score")
    private Integer score;

    @SerializedName("minMembers")
    private Integer minMembers;

    @SerializedName("maxMembers")
    private Integer maxMembers;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setScore(Integer score) {
        this.score = score;
    }
    
    public Integer getScore() {
        return score;
    }
    
    public void setMinMembers(Integer minMembers) {
        this.minMembers = minMembers;
    }
    
    public Integer getMinMembers() {
        return minMembers;
    }
    
    public void setMaxMembers(Integer maxMembers) {
        this.maxMembers = maxMembers;
    }
    
    public Integer getMaxMembers() {
        return maxMembers;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("ClanSearch{");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("score=");
        s.append(score);
        s.append(", ");
        s.append("minMembers=");
        s.append(minMembers);
        s.append(", ");
        s.append("maxMembers=");
        s.append(maxMembers);
        s.append("}");
        return s.toString();
    }

}