package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Experience{

	@SerializedName("xpToLevelUp")
	private int xpToLevelUp;

	@SerializedName("level")
	private int level;

	@SerializedName("xp")
	private int xp;

	@SerializedName("xpRequiredForLevelUp")
	private String xpRequiredForLevelUp;

	public void setXpToLevelUp(int xpToLevelUp){
		this.xpToLevelUp = xpToLevelUp;
	}

	public int getXpToLevelUp(){
		return xpToLevelUp;
	}

	public void setLevel(int level){
		this.level = level;
	}

	public int getLevel(){
		return level;
	}

	public void setXp(int xp){
		this.xp = xp;
	}

	public int getXp(){
		return xp;
	}

	public void setXpRequiredForLevelUp(String xpRequiredForLevelUp){
		this.xpRequiredForLevelUp = xpRequiredForLevelUp;
	}

	public String getXpRequiredForLevelUp(){
		return xpRequiredForLevelUp;
	}

	@Override
 	public String toString(){
		return 
			"Experience{" + 
			"xpToLevelUp = '" + xpToLevelUp + '\'' + 
			",level = '" + level + '\'' + 
			",xp = '" + xp + '\'' + 
			",xpRequiredForLevelUp = '" + xpRequiredForLevelUp + '\'' + 
			"}";
		}
}