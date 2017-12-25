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
public class BestSeason {

    @SerializedName("id")
    private String id;

    @SerializedName("rank")
    private int rank;

    @SerializedName("trophies")
    private int trophies;

    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public int getRank() {
        return rank;
    }
    
    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
    
    public int getTrophies() {
        return trophies;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("BestSeason{");
        s.append("id=");
        s.append(id);
        s.append(", ");
        s.append("rank=");
        s.append(rank);
        s.append(", ");
        s.append("trophies=");
        s.append(trophies);
        s.append("}");
        return s.toString();
    }

}