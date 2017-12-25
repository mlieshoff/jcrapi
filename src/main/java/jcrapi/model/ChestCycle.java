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
public class ChestCycle {

    @SerializedName("upcomming")
    private java.util.List<String> upcomming;

    @SerializedName("superMagical")
    private int superMagical;

    @SerializedName("magical")
    private int magical;

    @SerializedName("legendary")
    private int legendary;

    @SerializedName("epic")
    private int epic;

    @SerializedName("giant")
    private int giant;

    public void setUpcomming(java.util.List<String> upcomming) {
        this.upcomming = upcomming;
    }
    
    public java.util.List<String> getUpcomming() {
        return upcomming;
    }
    
    public void setSuperMagical(int superMagical) {
        this.superMagical = superMagical;
    }
    
    public int getSuperMagical() {
        return superMagical;
    }
    
    public void setMagical(int magical) {
        this.magical = magical;
    }
    
    public int getMagical() {
        return magical;
    }
    
    public void setLegendary(int legendary) {
        this.legendary = legendary;
    }
    
    public int getLegendary() {
        return legendary;
    }
    
    public void setEpic(int epic) {
        this.epic = epic;
    }
    
    public int getEpic() {
        return epic;
    }
    
    public void setGiant(int giant) {
        this.giant = giant;
    }
    
    public int getGiant() {
        return giant;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("ChestCycle{");
        s.append("upcomming=");
        s.append(upcomming);
        s.append(", ");
        s.append("superMagical=");
        s.append(superMagical);
        s.append(", ");
        s.append("magical=");
        s.append(magical);
        s.append(", ");
        s.append("legendary=");
        s.append(legendary);
        s.append(", ");
        s.append("epic=");
        s.append(epic);
        s.append(", ");
        s.append("giant=");
        s.append(giant);
        s.append("}");
        return s.toString();
    }

}