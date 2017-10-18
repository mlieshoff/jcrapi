package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ShopOffers{

	@SerializedName("legendary")
	private int legendary;

	@SerializedName("epic")
	private int epic;

	@SerializedName("arena")
	private Object arena;

	public void setLegendary(int legendary){
		this.legendary = legendary;
	}

	public int getLegendary(){
		return legendary;
	}

	public void setEpic(int epic){
		this.epic = epic;
	}

	public int getEpic(){
		return epic;
	}

	public void setArena(Object arena){
		this.arena = arena;
	}

	public Object getArena(){
		return arena;
	}

	@Override
 	public String toString(){
		return 
			"ShopOffers{" + 
			"legendary = '" + legendary + '\'' + 
			",epic = '" + epic + '\'' + 
			",arena = '" + arena + '\'' + 
			"}";
		}
}