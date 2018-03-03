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
public class ClanChest {

    @SerializedName("status")
    private String status;

    @SerializedName("crowns")
    private int crowns;

    @SerializedName("level")
    private int level;

    @SerializedName("maxLevel")
    private int maxLevel;

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setCrowns(int crowns) {
        this.crowns = crowns;
    }
    
    public int getCrowns() {
        return crowns;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }
    
    public int getMaxLevel() {
        return maxLevel;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("ClanChest{");
        s.append("status=");
        s.append(status);
        s.append(", ");
        s.append("crowns=");
        s.append(crowns);
        s.append(", ");
        s.append("level=");
        s.append(level);
        s.append(", ");
        s.append("maxLevel=");
        s.append(maxLevel);
        s.append("}");
        return s.toString();
    }

}