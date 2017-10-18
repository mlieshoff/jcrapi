package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Constants {

	@SerializedName("arenas")
	private List<ArenasItem> arenas;

	@SerializedName("badges")
	private Badges badges;

	@SerializedName("countryCodes")
	private List<CountryCodesItem> countryCodes;

	@SerializedName("cards")
	private List<CardsItem> cards;

	@SerializedName("alliance")
	private Alliance alliance;

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

	@Override
 	public String toString(){
		return
			"Response{" +
			"arenas = '" + arenas + '\'' +
			",badges = '" + badges + '\'' +
			",countryCodes = '" + countryCodes + '\'' +
			",cards = '" + cards + '\'' +
			",alliance = '" + alliance + '\'' +
			"}";
		}
}