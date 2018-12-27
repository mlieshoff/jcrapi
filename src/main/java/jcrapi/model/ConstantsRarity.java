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
public class ConstantsRarity {

  @SerializedName("balance_multiplier")
  private long balanceMultiplier;

  @SerializedName("chance_weight")
  private long chanceWeight;

  @SerializedName("clone_relative_level")
  private long cloneRelativeLevel;

  @SerializedName("donate_capacity")
  private long donateCapacity;

  @SerializedName("donate_reward")
  private long donateReward;

  @SerializedName("donate_xp")
  private long donateXp;

  @SerializedName("gold_conversion_value")
  private long goldConversionValue;

  @SerializedName("level_count")
  private long levelCount;

  @SerializedName("mirror_relative_level")
  private long mirrorRelativeLevel;

  @SerializedName("name")
  private String name;

  @SerializedName("power_level_multiplier")
  private java.util.List<Long> powerLevelMultiplier;

  @SerializedName("refund_gems")
  private long refundGems;

  @SerializedName("relative_level")
  private long relativeLevel;

  @SerializedName("sort_capacity")
  private long sortCapacity;

  @SerializedName("upgrade_cost")
  private java.util.List<Long> upgradeCost;

  @SerializedName("upgrade_exp")
  private java.util.List<Long> upgradeExp;

  @SerializedName("upgrade_material_count")
  private java.util.List<Long> upgradeMaterialCount;

}