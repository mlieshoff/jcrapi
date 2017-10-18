package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Profile {

	@SerializedName("globalRank")
	private int globalRank;

	@SerializedName("arena")
	private Arena arena;

	@SerializedName("experience")
	private Experience experience;

	@SerializedName("currentDeck")
	private List<CurrentDeckItem> currentDeck;

	@SerializedName("previousSeasons")
	private List<PreviousSeasonsItem> previousSeasons;

	@SerializedName("shopOffers")
	private ShopOffers shopOffers;

	@SerializedName("chestCycle")
	private ChestCycle chestCycle;

	@SerializedName("stats")
	private Stats stats;

	@SerializedName("name")
	private String name;

	@SerializedName("clan")
	private Clan clan;

	@SerializedName("games")
	private Games games;

	@SerializedName("tag")
	private String tag;

	@SerializedName("legendaryTrophies")
	private int legendaryTrophies;

	@SerializedName("trophies")
	private int trophies;

	@SerializedName("nameChanged")
	private boolean nameChanged;

	public void setGlobalRank(int globalRank){
		this.globalRank = globalRank;
	}

	public int getGlobalRank(){
		return globalRank;
	}

	public void setArena(Arena arena){
		this.arena = arena;
	}

	public Arena getArena(){
		return arena;
	}

	public void setExperience(Experience experience){
		this.experience = experience;
	}

	public Experience getExperience(){
		return experience;
	}

	public void setCurrentDeck(List<CurrentDeckItem> currentDeck){
		this.currentDeck = currentDeck;
	}

	public List<CurrentDeckItem> getCurrentDeck(){
		return currentDeck;
	}

	public void setPreviousSeasons(List<PreviousSeasonsItem> previousSeasons){
		this.previousSeasons = previousSeasons;
	}

	public List<PreviousSeasonsItem> getPreviousSeasons(){
		return previousSeasons;
	}

	public void setShopOffers(ShopOffers shopOffers){
		this.shopOffers = shopOffers;
	}

	public ShopOffers getShopOffers(){
		return shopOffers;
	}

	public void setChestCycle(ChestCycle chestCycle){
		this.chestCycle = chestCycle;
	}

	public ChestCycle getChestCycle(){
		return chestCycle;
	}

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setClan(Clan clan){
		this.clan = clan;
	}

	public Clan getClan(){
		return clan;
	}

	public void setGames(Games games){
		this.games = games;
	}

	public Games getGames(){
		return games;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public String getTag(){
		return tag;
	}

	public void setLegendaryTrophies(int legendaryTrophies){
		this.legendaryTrophies = legendaryTrophies;
	}

	public int getLegendaryTrophies(){
		return legendaryTrophies;
	}

	public void setTrophies(int trophies){
		this.trophies = trophies;
	}

	public int getTrophies(){
		return trophies;
	}

	public void setNameChanged(boolean nameChanged){
		this.nameChanged = nameChanged;
	}

	public boolean isNameChanged(){
		return nameChanged;
	}

	@Override
 	public String toString(){
		return
			"Response{" +
			"globalRank = '" + globalRank + '\'' +
			",arena = '" + arena + '\'' +
			",experience = '" + experience + '\'' +
			",currentDeck = '" + currentDeck + '\'' +
			",previousSeasons = '" + previousSeasons + '\'' +
			",shopOffers = '" + shopOffers + '\'' +
			",chestCycle = '" + chestCycle + '\'' +
			",stats = '" + stats + '\'' +
			",name = '" + name + '\'' +
			",clan = '" + clan + '\'' +
			",games = '" + games + '\'' +
			",tag = '" + tag + '\'' +
			",legendaryTrophies = '" + legendaryTrophies + '\'' +
			",trophies = '" + trophies + '\'' +
			",nameChanged = '" + nameChanged + '\'' +
			"}";
		}
}