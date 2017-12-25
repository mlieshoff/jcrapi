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
    private int balanceMultiplier;

    @SerializedName("chance_weight")
    private int chanceWeight;

    @SerializedName("clone_relative_level")
    private int cloneRelativeLevel;

    @SerializedName("donate_capacity")
    private int donateCapacity;

    @SerializedName("donate_reward")
    private int donateReward;

    @SerializedName("donate_xp")
    private int donateXp;

    @SerializedName("gold_conversion_value")
    private int goldConversionValue;

    @SerializedName("level_count")
    private int levelCount;

    @SerializedName("mirror_relative_level")
    private int mirrorRelativeLevel;

    @SerializedName("power_level_multiplier")
    private java.util.List<Integer> powerLevelMultiplier;

    @SerializedName("refund_gems")
    private int refundGems;

    @SerializedName("relative_level")
    private int relativeLevel;

    @SerializedName("sort_capacity")
    private int sortCapacity;

    @SerializedName("upgrade_cost")
    private java.util.List<Integer> upgradeCost;

    @SerializedName("upgrade_exp")
    private java.util.List<Integer> upgradeExp;

    @SerializedName("upgrade_material_cost")
    private java.util.List<Integer> upgradeMaterialCost;

    public void setBalanceMultiplier(int balanceMultiplier) {
        this.balanceMultiplier = balanceMultiplier;
    }
    
    public int getBalanceMultiplier() {
        return balanceMultiplier;
    }
    
    public void setChanceWeight(int chanceWeight) {
        this.chanceWeight = chanceWeight;
    }
    
    public int getChanceWeight() {
        return chanceWeight;
    }
    
    public void setCloneRelativeLevel(int cloneRelativeLevel) {
        this.cloneRelativeLevel = cloneRelativeLevel;
    }
    
    public int getCloneRelativeLevel() {
        return cloneRelativeLevel;
    }
    
    public void setDonateCapacity(int donateCapacity) {
        this.donateCapacity = donateCapacity;
    }
    
    public int getDonateCapacity() {
        return donateCapacity;
    }
    
    public void setDonateReward(int donateReward) {
        this.donateReward = donateReward;
    }
    
    public int getDonateReward() {
        return donateReward;
    }
    
    public void setDonateXp(int donateXp) {
        this.donateXp = donateXp;
    }
    
    public int getDonateXp() {
        return donateXp;
    }
    
    public void setGoldConversionValue(int goldConversionValue) {
        this.goldConversionValue = goldConversionValue;
    }
    
    public int getGoldConversionValue() {
        return goldConversionValue;
    }
    
    public void setLevelCount(int levelCount) {
        this.levelCount = levelCount;
    }
    
    public int getLevelCount() {
        return levelCount;
    }
    
    public void setMirrorRelativeLevel(int mirrorRelativeLevel) {
        this.mirrorRelativeLevel = mirrorRelativeLevel;
    }
    
    public int getMirrorRelativeLevel() {
        return mirrorRelativeLevel;
    }
    
    public void setPowerLevelMultiplier(java.util.List<Integer> powerLevelMultiplier) {
        this.powerLevelMultiplier = powerLevelMultiplier;
    }
    
    public java.util.List<Integer> getPowerLevelMultiplier() {
        return powerLevelMultiplier;
    }
    
    public void setRefundGems(int refundGems) {
        this.refundGems = refundGems;
    }
    
    public int getRefundGems() {
        return refundGems;
    }
    
    public void setRelativeLevel(int relativeLevel) {
        this.relativeLevel = relativeLevel;
    }
    
    public int getRelativeLevel() {
        return relativeLevel;
    }
    
    public void setSortCapacity(int sortCapacity) {
        this.sortCapacity = sortCapacity;
    }
    
    public int getSortCapacity() {
        return sortCapacity;
    }
    
    public void setUpgradeCost(java.util.List<Integer> upgradeCost) {
        this.upgradeCost = upgradeCost;
    }
    
    public java.util.List<Integer> getUpgradeCost() {
        return upgradeCost;
    }
    
    public void setUpgradeExp(java.util.List<Integer> upgradeExp) {
        this.upgradeExp = upgradeExp;
    }
    
    public java.util.List<Integer> getUpgradeExp() {
        return upgradeExp;
    }
    
    public void setUpgradeMaterialCost(java.util.List<Integer> upgradeMaterialCost) {
        this.upgradeMaterialCost = upgradeMaterialCost;
    }
    
    public java.util.List<Integer> getUpgradeMaterialCost() {
        return upgradeMaterialCost;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("Rarity{");
        s.append("balanceMultiplier=");
        s.append(balanceMultiplier);
        s.append(", ");
        s.append("chanceWeight=");
        s.append(chanceWeight);
        s.append(", ");
        s.append("cloneRelativeLevel=");
        s.append(cloneRelativeLevel);
        s.append(", ");
        s.append("donateCapacity=");
        s.append(donateCapacity);
        s.append(", ");
        s.append("donateReward=");
        s.append(donateReward);
        s.append(", ");
        s.append("donateXp=");
        s.append(donateXp);
        s.append(", ");
        s.append("goldConversionValue=");
        s.append(goldConversionValue);
        s.append(", ");
        s.append("levelCount=");
        s.append(levelCount);
        s.append(", ");
        s.append("mirrorRelativeLevel=");
        s.append(mirrorRelativeLevel);
        s.append(", ");
        s.append("powerLevelMultiplier=");
        s.append(powerLevelMultiplier);
        s.append(", ");
        s.append("refundGems=");
        s.append(refundGems);
        s.append(", ");
        s.append("relativeLevel=");
        s.append(relativeLevel);
        s.append(", ");
        s.append("sortCapacity=");
        s.append(sortCapacity);
        s.append(", ");
        s.append("upgradeCost=");
        s.append(upgradeCost);
        s.append(", ");
        s.append("upgradeExp=");
        s.append(upgradeExp);
        s.append(", ");
        s.append("upgradeMaterialCost=");
        s.append(upgradeMaterialCost);
        s.append("}");
        return s.toString();
    }

}