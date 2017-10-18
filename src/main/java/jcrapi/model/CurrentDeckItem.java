package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CurrentDeckItem{

	@SerializedName("elixir")
	private int elixir;

	@SerializedName("level")
	private int level;

	@SerializedName("count")
	private int count;

	@SerializedName("requiredForUpgrade")
	private String requiredForUpgrade;

	@SerializedName("description")
	private String description;

	@SerializedName("arena")
	private int arena;

	@SerializedName("type")
	private String type;

	@SerializedName("card_id")
	private int cardId;

	@SerializedName("leftToUpgrade")
	private int leftToUpgrade;

	@SerializedName("decklink")
	private String decklink;

	@SerializedName("card_key")
	private String cardKey;

	@SerializedName("name")
	private String name;

	@SerializedName("key")
	private String key;

	@SerializedName("rarity")
	private String rarity;

	public void setElixir(int elixir){
		this.elixir = elixir;
	}

	public int getElixir(){
		return elixir;
	}

	public void setLevel(int level){
		this.level = level;
	}

	public int getLevel(){
		return level;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setRequiredForUpgrade(String requiredForUpgrade){
		this.requiredForUpgrade = requiredForUpgrade;
	}

	public String getRequiredForUpgrade(){
		return requiredForUpgrade;
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

	public void setLeftToUpgrade(int leftToUpgrade){
		this.leftToUpgrade = leftToUpgrade;
	}

	public int getLeftToUpgrade(){
		return leftToUpgrade;
	}

	public void setDecklink(String decklink){
		this.decklink = decklink;
	}

	public String getDecklink(){
		return decklink;
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
			"CurrentDeckItem{" +
			"elixir = '" + elixir + '\'' +
			",level = '" + level + '\'' +
			",count = '" + count + '\'' +
			",requiredForUpgrade = '" + requiredForUpgrade + '\'' +
			",description = '" + description + '\'' +
			",arena = '" + arena + '\'' +
			",type = '" + type + '\'' +
			",card_id = '" + cardId + '\'' +
			",leftToUpgrade = '" + leftToUpgrade + '\'' +
			",decklink = '" + decklink + '\'' +
			",card_key = '" + cardKey + '\'' +
			",name = '" + name + '\'' +
			",key = '" + key + '\'' +
			",rarity = '" + rarity + '\'' +
			"}";
		}
}