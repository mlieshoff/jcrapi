package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Stats{

	@SerializedName("tournamentCardsWon")
	private int tournamentCardsWon;

	@SerializedName("maxTrophies")
	private int maxTrophies;

	@SerializedName("threeCrownWins")
	private int threeCrownWins;

	@SerializedName("totalDonations")
	private int totalDonations;

	@SerializedName("level")
	private int level;

	@SerializedName("favoriteCard")
	private String favoriteCard;

	@SerializedName("challengeMaxWins")
	private int challengeMaxWins;

	@SerializedName("challengeCardsWon")
	private int challengeCardsWon;

	@SerializedName("cardsFound")
	private int cardsFound;

	@SerializedName("legendaryTrophies")
	private int legendaryTrophies;

	public void setTournamentCardsWon(int tournamentCardsWon){
		this.tournamentCardsWon = tournamentCardsWon;
	}

	public int getTournamentCardsWon(){
		return tournamentCardsWon;
	}

	public void setMaxTrophies(int maxTrophies){
		this.maxTrophies = maxTrophies;
	}

	public int getMaxTrophies(){
		return maxTrophies;
	}

	public void setThreeCrownWins(int threeCrownWins){
		this.threeCrownWins = threeCrownWins;
	}

	public int getThreeCrownWins(){
		return threeCrownWins;
	}

	public void setTotalDonations(int totalDonations){
		this.totalDonations = totalDonations;
	}

	public int getTotalDonations(){
		return totalDonations;
	}

	public void setLevel(int level){
		this.level = level;
	}

	public int getLevel(){
		return level;
	}

	public void setFavoriteCard(String favoriteCard){
		this.favoriteCard = favoriteCard;
	}

	public String getFavoriteCard(){
		return favoriteCard;
	}

	public void setChallengeMaxWins(int challengeMaxWins){
		this.challengeMaxWins = challengeMaxWins;
	}

	public int getChallengeMaxWins(){
		return challengeMaxWins;
	}

	public void setChallengeCardsWon(int challengeCardsWon){
		this.challengeCardsWon = challengeCardsWon;
	}

	public int getChallengeCardsWon(){
		return challengeCardsWon;
	}

	public void setCardsFound(int cardsFound){
		this.cardsFound = cardsFound;
	}

	public int getCardsFound(){
		return cardsFound;
	}

	public void setLegendaryTrophies(int legendaryTrophies){
		this.legendaryTrophies = legendaryTrophies;
	}

	public int getLegendaryTrophies(){
		return legendaryTrophies;
	}

	@Override
 	public String toString(){
		return 
			"Stats{" + 
			"tournamentCardsWon = '" + tournamentCardsWon + '\'' + 
			",maxTrophies = '" + maxTrophies + '\'' + 
			",threeCrownWins = '" + threeCrownWins + '\'' + 
			",totalDonations = '" + totalDonations + '\'' + 
			",level = '" + level + '\'' + 
			",favoriteCard = '" + favoriteCard + '\'' + 
			",challengeMaxWins = '" + challengeMaxWins + '\'' + 
			",challengeCardsWon = '" + challengeCardsWon + '\'' + 
			",cardsFound = '" + cardsFound + '\'' + 
			",legendaryTrophies = '" + legendaryTrophies + '\'' + 
			"}";
		}
}