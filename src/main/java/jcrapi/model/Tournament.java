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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Generated("org.mili.generator")
@Getter
@Setter
@ToString
public class Tournament {

  @SerializedName("tag")
  private String tag;

  @SerializedName("type")
  private String type;

  @SerializedName("status")
  private String status;

  @SerializedName("name")
  private String name;

  @SerializedName("description")
  private String description;

  @SerializedName("capacity")
  private int capacity;

  @Deprecated
  @SerializedName("maxCapacity")
  private int maxCapacity;

  @SerializedName("maxPlayers")
  private int maxPlayers;

  @Deprecated
  @SerializedName("preparationDuration")
  private int preparationDuration;

  @SerializedName("prepTime")
  private int prepTime;

  @SerializedName("duration")
  private int duration;

  @Deprecated
  @SerializedName("endedTime")
  private String endedTime;

  @SerializedName("endTime")
  private long endTime;

  @SerializedName("startTime")
  private long startTime;

  @SerializedName("createTime")
  private long createTime;

  @SerializedName("creator")
  private TournamentParticipant creator;

  @SerializedName("members")
  private java.util.List<TournamentParticipant> members;

}