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
public class Achievment {

    @SerializedName("name")
    private String name;

    @SerializedName("stars")
    private int stars;

    @SerializedName("value")
    private int value;

    @SerializedName("target")
    private int target;

    @SerializedName("info")
    private String info;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setStars(int stars) {
        this.stars = stars;
    }
    
    public int getStars() {
        return stars;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setTarget(int target) {
        this.target = target;
    }
    
    public int getTarget() {
        return target;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
    
    public String getInfo() {
        return info;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Achievment{");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("stars=");
        s.append(stars);
        s.append(", ");
        s.append("value=");
        s.append(value);
        s.append(", ");
        s.append("target=");
        s.append(target);
        s.append(", ");
        s.append("info=");
        s.append(info);
        s.append("}");
        return s.toString();
    }

}