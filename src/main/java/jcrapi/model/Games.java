package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Games{

	@SerializedName("wins")
	private int wins;

	@SerializedName("total")
	private int total;

	@SerializedName("tournamentGames")
	private int tournamentGames;

	@SerializedName("currentWinStreak")
	private int currentWinStreak;

	@SerializedName("draws")
	private int draws;

	@SerializedName("losses")
	private int losses;

	public void setWins(int wins){
		this.wins = wins;
	}

	public int getWins(){
		return wins;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setTournamentGames(int tournamentGames){
		this.tournamentGames = tournamentGames;
	}

	public int getTournamentGames(){
		return tournamentGames;
	}

	public void setCurrentWinStreak(int currentWinStreak){
		this.currentWinStreak = currentWinStreak;
	}

	public int getCurrentWinStreak(){
		return currentWinStreak;
	}

	public void setDraws(int draws){
		this.draws = draws;
	}

	public int getDraws(){
		return draws;
	}

	public void setLosses(int losses){
		this.losses = losses;
	}

	public int getLosses(){
		return losses;
	}

	@Override
 	public String toString(){
		return 
			"Games{" + 
			"wins = '" + wins + '\'' + 
			",total = '" + total + '\'' + 
			",tournamentGames = '" + tournamentGames + '\'' + 
			",currentWinStreak = '" + currentWinStreak + '\'' + 
			",draws = '" + draws + '\'' + 
			",losses = '" + losses + '\'' + 
			"}";
		}
}