package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PreviousSeasonsItem{

	@SerializedName("seasonNumber")
	private int seasonNumber;

	@SerializedName("seasonEnding")
	private int seasonEnding;

	@SerializedName("seasonHighest")
	private int seasonHighest;

	@SerializedName("seasonEndGlobalRank")
	private int seasonEndGlobalRank;

	public void setSeasonNumber(int seasonNumber){
		this.seasonNumber = seasonNumber;
	}

	public int getSeasonNumber(){
		return seasonNumber;
	}

	public void setSeasonEnding(int seasonEnding){
		this.seasonEnding = seasonEnding;
	}

	public int getSeasonEnding(){
		return seasonEnding;
	}

	public void setSeasonHighest(int seasonHighest){
		this.seasonHighest = seasonHighest;
	}

	public int getSeasonHighest(){
		return seasonHighest;
	}

	public void setSeasonEndGlobalRank(int seasonEndGlobalRank){
		this.seasonEndGlobalRank = seasonEndGlobalRank;
	}

	public int getSeasonEndGlobalRank(){
		return seasonEndGlobalRank;
	}

	@Override
 	public String toString(){
		return 
			"PreviousSeasonsItem{" + 
			"seasonNumber = '" + seasonNumber + '\'' + 
			",seasonEnding = '" + seasonEnding + '\'' + 
			",seasonHighest = '" + seasonHighest + '\'' + 
			",seasonEndGlobalRank = '" + seasonEndGlobalRank + '\'' + 
			"}";
		}
}