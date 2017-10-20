package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ClanChest{

	@SerializedName("clanChestCrowns")
	private int clanChestCrowns;

	@SerializedName("clanChestCrownsPercent")
	private double clanChestCrownsPercent;

	@SerializedName("clanChestCrownsRequired")
	private int clanChestCrownsRequired;

	public void setClanChestCrowns(int clanChestCrowns){
		this.clanChestCrowns = clanChestCrowns;
	}

	public int getClanChestCrowns(){
		return clanChestCrowns;
	}

	public void setClanChestCrownsPercent(double clanChestCrownsPercent){
		this.clanChestCrownsPercent = clanChestCrownsPercent;
	}

	public double getClanChestCrownsPercent(){
		return clanChestCrownsPercent;
	}

	public void setClanChestCrownsRequired(int clanChestCrownsRequired){
		this.clanChestCrownsRequired = clanChestCrownsRequired;
	}

	public int getClanChestCrownsRequired(){
		return clanChestCrownsRequired;
	}

	@Override
 	public String toString(){
		return 
			"ClanChest{" + 
			"clanChestCrowns = '" + clanChestCrowns + '\'' + 
			",clanChestCrownsPercent = '" + clanChestCrownsPercent + '\'' + 
			",clanChestCrownsRequired = '" + clanChestCrownsRequired + '\'' + 
			"}";
		}
}