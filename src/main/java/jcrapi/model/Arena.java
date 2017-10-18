package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Arena{

	@SerializedName("arenaID")
	private int arenaID;

	@SerializedName("imageURL")
	private String imageURL;

	@SerializedName("name")
	private String name;

	@SerializedName("arena")
	private String arena;

	@SerializedName("trophyLimit")
	private int trophyLimit;

	public void setArenaID(int arenaID){
		this.arenaID = arenaID;
	}

	public int getArenaID(){
		return arenaID;
	}

	public void setImageURL(String imageURL){
		this.imageURL = imageURL;
	}

	public String getImageURL(){
		return imageURL;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setArena(String arena){
		this.arena = arena;
	}

	public String getArena(){
		return arena;
	}

	public void setTrophyLimit(int trophyLimit){
		this.trophyLimit = trophyLimit;
	}

	public int getTrophyLimit(){
		return trophyLimit;
	}

	@Override
 	public String toString(){
		return 
			"Arena{" + 
			"arenaID = '" + arenaID + '\'' + 
			",imageURL = '" + imageURL + '\'' + 
			",name = '" + name + '\'' + 
			",arena = '" + arena + '\'' + 
			",trophyLimit = '" + trophyLimit + '\'' + 
			"}";
		}
}