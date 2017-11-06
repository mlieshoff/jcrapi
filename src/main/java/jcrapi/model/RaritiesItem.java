package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class RaritiesItem{

	@SerializedName("sort_capacity")
	private int sortCapacity;

	@SerializedName("clone_relative_level")
	private int cloneRelativeLevel;

	@SerializedName("upgrade_exp")
	private List<Integer> upgradeExp;

	@SerializedName("donate_xp")
	private int donateXp;

	@SerializedName("level_count")
	private int levelCount;

	@SerializedName("power_level_multiplier")
	private List<Integer> powerLevelMultiplier;

	@SerializedName("upgrade_material_count")
	private List<Integer> upgradeMaterialCount;

	@SerializedName("balance_multiplier")
	private int balanceMultiplier;

	@SerializedName("mirror_relative_level")
	private int mirrorRelativeLevel;

	@SerializedName("relative_level")
	private int relativeLevel;

	@SerializedName("gold_conversion_value")
	private int goldConversionValue;

	@SerializedName("refund_gems")
	private int refundGems;

	@SerializedName("chance_weight")
	private int chanceWeight;

	@SerializedName("name")
	private String name;

	@SerializedName("upgrade_cost")
	private List<Integer> upgradeCost;

	@SerializedName("donate_reward")
	private int donateReward;

	@SerializedName("donate_capacity")
	private int donateCapacity;

	public void setSortCapacity(int sortCapacity){
		this.sortCapacity = sortCapacity;
	}

	public int getSortCapacity(){
		return sortCapacity;
	}

	public void setCloneRelativeLevel(int cloneRelativeLevel){
		this.cloneRelativeLevel = cloneRelativeLevel;
	}

	public int getCloneRelativeLevel(){
		return cloneRelativeLevel;
	}

	public void setUpgradeExp(List<Integer> upgradeExp){
		this.upgradeExp = upgradeExp;
	}

	public List<Integer> getUpgradeExp(){
		return upgradeExp;
	}

	public void setDonateXp(int donateXp){
		this.donateXp = donateXp;
	}

	public int getDonateXp(){
		return donateXp;
	}

	public void setLevelCount(int levelCount){
		this.levelCount = levelCount;
	}

	public int getLevelCount(){
		return levelCount;
	}

	public void setPowerLevelMultiplier(List<Integer> powerLevelMultiplier){
		this.powerLevelMultiplier = powerLevelMultiplier;
	}

	public List<Integer> getPowerLevelMultiplier(){
		return powerLevelMultiplier;
	}

	public void setUpgradeMaterialCount(List<Integer> upgradeMaterialCount){
		this.upgradeMaterialCount = upgradeMaterialCount;
	}

	public List<Integer> getUpgradeMaterialCount(){
		return upgradeMaterialCount;
	}

	public void setBalanceMultiplier(int balanceMultiplier){
		this.balanceMultiplier = balanceMultiplier;
	}

	public int getBalanceMultiplier(){
		return balanceMultiplier;
	}

	public void setMirrorRelativeLevel(int mirrorRelativeLevel){
		this.mirrorRelativeLevel = mirrorRelativeLevel;
	}

	public int getMirrorRelativeLevel(){
		return mirrorRelativeLevel;
	}

	public void setRelativeLevel(int relativeLevel){
		this.relativeLevel = relativeLevel;
	}

	public int getRelativeLevel(){
		return relativeLevel;
	}

	public void setGoldConversionValue(int goldConversionValue){
		this.goldConversionValue = goldConversionValue;
	}

	public int getGoldConversionValue(){
		return goldConversionValue;
	}

	public void setRefundGems(int refundGems){
		this.refundGems = refundGems;
	}

	public int getRefundGems(){
		return refundGems;
	}

	public void setChanceWeight(int chanceWeight){
		this.chanceWeight = chanceWeight;
	}

	public int getChanceWeight(){
		return chanceWeight;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUpgradeCost(List<Integer> upgradeCost){
		this.upgradeCost = upgradeCost;
	}

	public List<Integer> getUpgradeCost(){
		return upgradeCost;
	}

	public void setDonateReward(int donateReward){
		this.donateReward = donateReward;
	}

	public int getDonateReward(){
		return donateReward;
	}

	public void setDonateCapacity(int donateCapacity){
		this.donateCapacity = donateCapacity;
	}

	public int getDonateCapacity(){
		return donateCapacity;
	}

	@Override
 	public String toString(){
		return 
			"RaritiesItem{" + 
			"sort_capacity = '" + sortCapacity + '\'' + 
			",clone_relative_level = '" + cloneRelativeLevel + '\'' + 
			",upgrade_exp = '" + upgradeExp + '\'' + 
			",donate_xp = '" + donateXp + '\'' + 
			",level_count = '" + levelCount + '\'' + 
			",power_level_multiplier = '" + powerLevelMultiplier + '\'' + 
			",upgrade_material_count = '" + upgradeMaterialCount + '\'' + 
			",balance_multiplier = '" + balanceMultiplier + '\'' + 
			",mirror_relative_level = '" + mirrorRelativeLevel + '\'' + 
			",relative_level = '" + relativeLevel + '\'' + 
			",gold_conversion_value = '" + goldConversionValue + '\'' + 
			",refund_gems = '" + refundGems + '\'' + 
			",chance_weight = '" + chanceWeight + '\'' + 
			",name = '" + name + '\'' + 
			",upgrade_cost = '" + upgradeCost + '\'' + 
			",donate_reward = '" + donateReward + '\'' + 
			",donate_capacity = '" + donateCapacity + '\'' + 
			"}";
		}
}