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
public class Rarity {

    @SerializedName("balance_multiplier")
    private int balance_multiplier;

    @SerializedName("chance_weight")
    private int chance_weight;

    @SerializedName("clone_relative_level")
    private int clone_relative_level;

    @SerializedName("donate_capacity")
    private int donate_capacity;

    @SerializedName("donate_reward")
    private int donate_reward;

    @SerializedName("donate_xp")
    private int donate_xp;

    @SerializedName("gold_conversion_value")
    private int gold_conversion_value;

    @SerializedName("level_count")
    private int level_count;

    @SerializedName("mirror_relative_level")
    private int mirror_relative_level;

    @SerializedName("power_level_multiplier")
    private java.util.List<Integer> power_level_multiplier;

    @SerializedName("refund_gems")
    private int refund_gems;

    @SerializedName("relative_level")
    private int relative_level;

    @SerializedName("sort_capacity")
    private int sort_capacity;

    @SerializedName("upgrade_cost")
    private java.util.List<Integer> upgrade_cost;

    @SerializedName("upgrade_exp")
    private java.util.List<Integer> upgrade_exp;

    @SerializedName("upgrade_material_cost")
    private java.util.List<Integer> upgrade_material_cost;

    public void setBalance_multiplier(int balance_multiplier) {
        this.balance_multiplier = balance_multiplier;
    }
    
    public int getBalance_multiplier() {
        return balance_multiplier;
    }
    
    public void setChance_weight(int chance_weight) {
        this.chance_weight = chance_weight;
    }
    
    public int getChance_weight() {
        return chance_weight;
    }
    
    public void setClone_relative_level(int clone_relative_level) {
        this.clone_relative_level = clone_relative_level;
    }
    
    public int getClone_relative_level() {
        return clone_relative_level;
    }
    
    public void setDonate_capacity(int donate_capacity) {
        this.donate_capacity = donate_capacity;
    }
    
    public int getDonate_capacity() {
        return donate_capacity;
    }
    
    public void setDonate_reward(int donate_reward) {
        this.donate_reward = donate_reward;
    }
    
    public int getDonate_reward() {
        return donate_reward;
    }
    
    public void setDonate_xp(int donate_xp) {
        this.donate_xp = donate_xp;
    }
    
    public int getDonate_xp() {
        return donate_xp;
    }
    
    public void setGold_conversion_value(int gold_conversion_value) {
        this.gold_conversion_value = gold_conversion_value;
    }
    
    public int getGold_conversion_value() {
        return gold_conversion_value;
    }
    
    public void setLevel_count(int level_count) {
        this.level_count = level_count;
    }
    
    public int getLevel_count() {
        return level_count;
    }
    
    public void setMirror_relative_level(int mirror_relative_level) {
        this.mirror_relative_level = mirror_relative_level;
    }
    
    public int getMirror_relative_level() {
        return mirror_relative_level;
    }
    
    public void setPower_level_multiplier(java.util.List<Integer> power_level_multiplier) {
        this.power_level_multiplier = power_level_multiplier;
    }
    
    public java.util.List<Integer> getPower_level_multiplier() {
        return power_level_multiplier;
    }
    
    public void setRefund_gems(int refund_gems) {
        this.refund_gems = refund_gems;
    }
    
    public int getRefund_gems() {
        return refund_gems;
    }
    
    public void setRelative_level(int relative_level) {
        this.relative_level = relative_level;
    }
    
    public int getRelative_level() {
        return relative_level;
    }
    
    public void setSort_capacity(int sort_capacity) {
        this.sort_capacity = sort_capacity;
    }
    
    public int getSort_capacity() {
        return sort_capacity;
    }
    
    public void setUpgrade_cost(java.util.List<Integer> upgrade_cost) {
        this.upgrade_cost = upgrade_cost;
    }
    
    public java.util.List<Integer> getUpgrade_cost() {
        return upgrade_cost;
    }
    
    public void setUpgrade_exp(java.util.List<Integer> upgrade_exp) {
        this.upgrade_exp = upgrade_exp;
    }
    
    public java.util.List<Integer> getUpgrade_exp() {
        return upgrade_exp;
    }
    
    public void setUpgrade_material_cost(java.util.List<Integer> upgrade_material_cost) {
        this.upgrade_material_cost = upgrade_material_cost;
    }
    
    public java.util.List<Integer> getUpgrade_material_cost() {
        return upgrade_material_cost;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Rarity{");
        s.append("balance_multiplier=");
        s.append(balance_multiplier);
        s.append(", ");
        s.append("chance_weight=");
        s.append(chance_weight);
        s.append(", ");
        s.append("clone_relative_level=");
        s.append(clone_relative_level);
        s.append(", ");
        s.append("donate_capacity=");
        s.append(donate_capacity);
        s.append(", ");
        s.append("donate_reward=");
        s.append(donate_reward);
        s.append(", ");
        s.append("donate_xp=");
        s.append(donate_xp);
        s.append(", ");
        s.append("gold_conversion_value=");
        s.append(gold_conversion_value);
        s.append(", ");
        s.append("level_count=");
        s.append(level_count);
        s.append(", ");
        s.append("mirror_relative_level=");
        s.append(mirror_relative_level);
        s.append(", ");
        s.append("power_level_multiplier=");
        s.append(power_level_multiplier);
        s.append(", ");
        s.append("refund_gems=");
        s.append(refund_gems);
        s.append(", ");
        s.append("relative_level=");
        s.append(relative_level);
        s.append(", ");
        s.append("sort_capacity=");
        s.append(sort_capacity);
        s.append(", ");
        s.append("upgrade_cost=");
        s.append(upgrade_cost);
        s.append(", ");
        s.append("upgrade_exp=");
        s.append(upgrade_exp);
        s.append(", ");
        s.append("upgrade_material_cost=");
        s.append(upgrade_material_cost);
        s.append("}");
        return s.toString();
    }

}