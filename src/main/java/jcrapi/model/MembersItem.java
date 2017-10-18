package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class MembersItem{

	@SerializedName("currentRank")
	private int currentRank;

	@SerializedName("score")
	private int score;

	@SerializedName("role")
	private int role;

	@SerializedName("donations")
	private int donations;

	@SerializedName("previousRank")
	private int previousRank;

	@SerializedName("name")
	private String name;

	@SerializedName("expLevel")
	private int expLevel;

	@SerializedName("clanChestCrowns")
	private int clanChestCrowns;

	@SerializedName("roleName")
	private String roleName;

	@SerializedName("arena")
	private Arena arena;

	@SerializedName("tag")
	private String tag;

	@SerializedName("trophies")
	private int trophies;

	public void setCurrentRank(int currentRank){
		this.currentRank = currentRank;
	}

	public int getCurrentRank(){
		return currentRank;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int getScore(){
		return score;
	}

	public void setRole(int role){
		this.role = role;
	}

	public int getRole(){
		return role;
	}

	public void setDonations(int donations){
		this.donations = donations;
	}

	public int getDonations(){
		return donations;
	}

	public void setPreviousRank(int previousRank){
		this.previousRank = previousRank;
	}

	public int getPreviousRank(){
		return previousRank;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setExpLevel(int expLevel){
		this.expLevel = expLevel;
	}

	public int getExpLevel(){
		return expLevel;
	}

	public void setClanChestCrowns(int clanChestCrowns){
		this.clanChestCrowns = clanChestCrowns;
	}

	public int getClanChestCrowns(){
		return clanChestCrowns;
	}

	public void setRoleName(String roleName){
		this.roleName = roleName;
	}

	public String getRoleName(){
		return roleName;
	}

	public void setArena(Arena arena){
		this.arena = arena;
	}

	public Arena getArena(){
		return arena;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public String getTag(){
		return tag;
	}

	public void setTrophies(int trophies){
		this.trophies = trophies;
	}

	public int getTrophies(){
		return trophies;
	}

	@Override
 	public String toString(){
		return 
			"MembersItem{" + 
			"currentRank = '" + currentRank + '\'' + 
			",score = '" + score + '\'' + 
			",role = '" + role + '\'' + 
			",donations = '" + donations + '\'' + 
			",previousRank = '" + previousRank + '\'' + 
			",name = '" + name + '\'' + 
			",expLevel = '" + expLevel + '\'' + 
			",clanChestCrowns = '" + clanChestCrowns + '\'' + 
			",roleName = '" + roleName + '\'' + 
			",arena = '" + arena + '\'' + 
			",tag = '" + tag + '\'' + 
			",trophies = '" + trophies + '\'' + 
			"}";
		}
}