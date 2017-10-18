package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ClanChest{

	@SerializedName("clanChestCrowns")
	private int clanChestCrowns;

	@SerializedName("clanChestCrownsPercent")
	private int clanChestCrownsPercent;

	@SerializedName("clanChestCrownsRequired")
	private int clanChestCrownsRequired;

	public void setClanChestCrowns(int clanChestCrowns){
		this.clanChestCrowns = clanChestCrowns;
	}

	public int getClanChestCrowns(){
		return clanChestCrowns;
	}

	public void setClanChestCrownsPercent(int clanChestCrownsPercent){
		this.clanChestCrownsPercent = clanChestCrownsPercent;
	}

	public int getClanChestCrownsPercent(){
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