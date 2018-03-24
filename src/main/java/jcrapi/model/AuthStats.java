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
public class AuthStats {

    @SerializedName("id")
    private long id;

    @SerializedName("lastRequest")
    private long lastRequest;

    @SerializedName("requestCount")
    private java.util.Map<String, String> requestCount;

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setLastRequest(long lastRequest) {
        this.lastRequest = lastRequest;
    }
    
    public long getLastRequest() {
        return lastRequest;
    }
    
    public void setRequestCount(java.util.Map<String, String> requestCount) {
        this.requestCount = requestCount;
    }
    
    public java.util.Map<String, String> getRequestCount() {
        return requestCount;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("AuthStats{");
        s.append("id=");
        s.append(id);
        s.append(", ");
        s.append("lastRequest=");
        s.append(lastRequest);
        s.append(", ");
        s.append("requestCount=");
        s.append(requestCount);
        s.append("}");
        return s.toString();
    }

}