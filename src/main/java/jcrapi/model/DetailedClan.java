package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class DetailedClan{

	@SerializedName("clanChest")
	private ClanChest clanChest;

	@SerializedName("donations")
	private int donations;

	@SerializedName("memberCount")
	private int memberCount;

	@SerializedName("typeName")
	private String typeName;

	@SerializedName("description")
	private String description;

	@SerializedName("type")
	private int type;

	@SerializedName("currentRank")
	private int currentRank;

	@SerializedName("badge")
	private Badge badge;

	@SerializedName("score")
	private int score;

	@SerializedName("requiredScore")
	private int requiredScore;

	@SerializedName("members")
	private List<MembersItem> members;

	@SerializedName("name")
	private String name;

	@SerializedName("tag")
	private String tag;

	@SerializedName("region")
	private Region region;

	public void setClanChest(ClanChest clanChest){
		this.clanChest = clanChest;
	}

	public ClanChest getClanChest(){
		return clanChest;
	}

	public void setDonations(int donations){
		this.donations = donations;
	}

	public int getDonations(){
		return donations;
	}

	public void setMemberCount(int memberCount){
		this.memberCount = memberCount;
	}

	public int getMemberCount(){
		return memberCount;
	}

	public void setTypeName(String typeName){
		this.typeName = typeName;
	}

	public String getTypeName(){
		return typeName;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setType(int type){
		this.type = type;
	}

	public int getType(){
		return type;
	}

	public void setCurrentRank(int currentRank){
		this.currentRank = currentRank;
	}

	public int getCurrentRank(){
		return currentRank;
	}

	public void setBadge(Badge badge){
		this.badge = badge;
	}

	public Badge getBadge(){
		return badge;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int getScore(){
		return score;
	}

	public void setRequiredScore(int requiredScore){
		this.requiredScore = requiredScore;
	}

	public int getRequiredScore(){
		return requiredScore;
	}

	public void setMembers(List<MembersItem> members){
		this.members = members;
	}

	public List<MembersItem> getMembers(){
		return members;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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
			"DetailedClan{" + 
			"clanChest = '" + clanChest + '\'' + 
			",donations = '" + donations + '\'' + 
			",memberCount = '" + memberCount + '\'' + 
			",typeName = '" + typeName + '\'' + 
			",description = '" + description + '\'' + 
			",type = '" + type + '\'' + 
			",currentRank = '" + currentRank + '\'' + 
			",badge = '" + badge + '\'' + 
			",score = '" + score + '\'' + 
			",requiredScore = '" + requiredScore + '\'' + 
			",members = '" + members + '\'' + 
			",name = '" + name + '\'' + 
			",tag = '" + tag + '\'' + 
			",region = '" + region + '\'' + 
			"}";
		}
}