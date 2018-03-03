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
public class Tracking {

    @SerializedName("active")
    private boolean active;

    @SerializedName("available")
    private boolean available;

    @SerializedName("snapshotCount")
    private int snapshotCount;

    public void setActive(boolean active) {
        this.active = active;
    }
    
    public boolean getActive() {
        return active;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public boolean getAvailable() {
        return available;
    }
    
    public void setSnapshotCount(int snapshotCount) {
        this.snapshotCount = snapshotCount;
    }
    
    public int getSnapshotCount() {
        return snapshotCount;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Tracking{");
        s.append("active=");
        s.append(active);
        s.append(", ");
        s.append("available=");
        s.append(available);
        s.append(", ");
        s.append("snapshotCount=");
        s.append(snapshotCount);
        s.append("}");
        return s.toString();
    }

}