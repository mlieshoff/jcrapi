package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class TopClans{

	@SerializedName("lastUpdated")
	private long lastUpdated;

	@SerializedName("clans")
	private List<ClansItem> clans;

	public void setLastUpdated(long lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public long getLastUpdated(){
		return lastUpdated;
	}

	public void setClans(List<ClansItem> clans){
		this.clans = clans;
	}

	public List<ClansItem> getClans(){
		return clans;
	}

	@Override
 	public String toString(){
		return 
			"TopClans{" + 
			"lastUpdated = '" + lastUpdated + '\'' + 
			",clans = '" + clans + '\'' + 
			"}";
		}
}