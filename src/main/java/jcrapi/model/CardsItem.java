package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CardsItem{

	@SerializedName("decklink")
	private String decklink;

	@SerializedName("elixir")
	private int elixir;

	@SerializedName("card_key")
	private String cardKey;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("arena")
	private int arena;

	@SerializedName("type")
	private String type;

	@SerializedName("card_id")
	private int cardId;

	@SerializedName("key")
	private String key;

	@SerializedName("rarity")
	private String rarity;

	public void setDecklink(String decklink){
		this.decklink = decklink;
	}

	public String getDecklink(){
		return decklink;
	}

	public void setElixir(int elixir){
		this.elixir = elixir;
	}

	public int getElixir(){
		return elixir;
	}

	public void setCardKey(String cardKey){
		this.cardKey = cardKey;
	}

	public String getCardKey(){
		return cardKey;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setArena(int arena){
		this.arena = arena;
	}

	public int getArena(){
		return arena;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setCardId(int cardId){
		this.cardId = cardId;
	}

	public int getCardId(){
		return cardId;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	public void setRarity(String rarity){
		this.rarity = rarity;
	}

	public String getRarity(){
		return rarity;
	}

	@Override
 	public String toString(){
		return 
			"CardsItem{" + 
			"decklink = '" + decklink + '\'' + 
			",elixir = '" + elixir + '\'' + 
			",card_key = '" + cardKey + '\'' + 
			",name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",arena = '" + arena + '\'' + 
			",type = '" + type + '\'' + 
			",card_id = '" + cardId + '\'' + 
			",key = '" + key + '\'' + 
			",rarity = '" + rarity + '\'' + 
			"}";
		}
}