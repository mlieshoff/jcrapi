package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ClansItem{

	@SerializedName("badge")
	private Badge badge;

	@SerializedName("previousRank")
	private int previousRank;

	@SerializedName("memberCount")
	private int memberCount;

	@SerializedName("name")
	private String name;

	@SerializedName("rank")
	private int rank;

	@SerializedName("tag")
	private String tag;

	@SerializedName("region")
	private Region region;

	@SerializedName("trophies")
	private int trophies;

	public void setBadge(Badge badge){
		this.badge = badge;
	}

	public Badge getBadge(){
		return badge;
	}

	public void setPreviousRank(int previousRank){
		this.previousRank = previousRank;
	}

	public int getPreviousRank(){
		return previousRank;
	}

	public void setMemberCount(int memberCount){
		this.memberCount = memberCount;
	}

	public int getMemberCount(){
		return memberCount;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public String getTag(){
		return tag;
	}

	public void setRegion(Region region){
		this.region = region;
	}

	public Region getRegion(){
		return region;
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
			"ClansItem{" + 
			"badge = '" + badge + '\'' + 
			",previousRank = '" + previousRank + '\'' + 
			",memberCount = '" + memberCount + '\'' + 
			",name = '" + name + '\'' + 
			",rank = '" + rank + '\'' + 
			",tag = '" + tag + '\'' + 
			",region = '" + region + '\'' + 
			",trophies = '" + trophies + '\'' + 
			"}";
		}
}