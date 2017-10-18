package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ClansItem{

	@SerializedName("badge_url")
	private String badgeUrl;

	@SerializedName("score")
	private int score;

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

	public void setBadgeUrl(String badgeUrl){
		this.badgeUrl = badgeUrl;
	}

	public String getBadgeUrl(){
		return badgeUrl;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int getScore(){
		return score;
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

	@Override
 	public String toString(){
		return 
			"ClansItem{" + 
			"badge_url = '" + badgeUrl + '\'' + 
			",score = '" + score + '\'' + 
			",previousRank = '" + previousRank + '\'' + 
			",memberCount = '" + memberCount + '\'' + 
			",name = '" + name + '\'' + 
			",rank = '" + rank + '\'' + 
			",tag = '" + tag + '\'' + 
			",region = '" + region + '\'' + 
			"}";
		}
}