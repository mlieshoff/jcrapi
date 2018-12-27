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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Generated("org.mili.generator")
@Getter
@Setter
@ToString
public class FavoriteCard {

  @SerializedName("id")
  private int id;

  @SerializedName("name")
  private String name;

  @SerializedName("maxLevel")
  private int maxLevel;

  @Deprecated
  @SerializedName("iconUrls")
  private IconUrls iconUrls;

  @SerializedName("icon")
  private String icon;

  @SerializedName("key")
  private String key;

  @SerializedName("elixir")
  private int elixir;

  @SerializedName("type")
  private String type;

  @SerializedName("rarity")
  private String rarity;

  @SerializedName("arena")
  private int arena;

  @SerializedName("description")
  private String description;

}