package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Constants{

	@SerializedName("arenas")
	private List<ArenasItem> arenas;

	@SerializedName("badges")
	private Badges badges;

	@SerializedName("rarities")
	private List<RaritiesItem> rarities;

	@SerializedName("countryCodes")
	private List<CountryCodesItem> countryCodes;

	@SerializedName("cards")
	private List<CardsItem> cards;

	@SerializedName("alliance")
	private Alliance alliance;

	@SerializedName("chestCycle")
	private ChestCycle chestCycle;

	public void setArenas(List<ArenasItem> arenas){
		this.arenas = arenas;
	}

	public List<ArenasItem> getArenas(){
		return arenas;
	}

	public void setBadges(Badges badges){
		this.badges = badges;
	}

	public Badges getBadges(){
		return badges;
	}

	public void setRarities(List<RaritiesItem> rarities){
		this.rarities = rarities;
	}

	public List<RaritiesItem> getRarities(){
		return rarities;
	}

	public void setCountryCodes(List<CountryCodesItem> countryCodes){
		this.countryCodes = countryCodes;
	}

	public List<CountryCodesItem> getCountryCodes(){
		return countryCodes;
	}

	public void setCards(List<CardsItem> cards){
		this.cards = cards;
	}

	public List<CardsItem> getCards(){
		return cards;
	}

	public void setAlliance(Alliance alliance){
		this.alliance = alliance;
	}

	public Alliance getAlliance(){
		return alliance;
	}

	public void setChestCycle(ChestCycle chestCycle){
		this.chestCycle = chestCycle;
	}

	public ChestCycle getChestCycle(){
		return chestCycle;
	}

	@Override
 	public String toString(){
		return 
			"Constants{" + 
			"arenas = '" + arenas + '\'' + 
			",badges = '" + badges + '\'' + 
			",rarities = '" + rarities + '\'' + 
			",countryCodes = '" + countryCodes + '\'' + 
			",cards = '" + cards + '\'' + 
			",alliance = '" + alliance + '\'' + 
			",chestCycle = '" + chestCycle + '\'' + 
			"}";
		}
}