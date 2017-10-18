package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ChestCycle{

	@SerializedName("superMagicalPos")
	private int superMagicalPos;

	@SerializedName("legendaryPos")
	private int legendaryPos;

	@SerializedName("epicPos")
	private int epicPos;

	@SerializedName("position")
	private int position;

	public void setSuperMagicalPos(int superMagicalPos){
		this.superMagicalPos = superMagicalPos;
	}

	public int getSuperMagicalPos(){
		return superMagicalPos;
	}

	public void setLegendaryPos(int legendaryPos){
		this.legendaryPos = legendaryPos;
	}

	public int getLegendaryPos(){
		return legendaryPos;
	}

	public void setEpicPos(int epicPos){
		this.epicPos = epicPos;
	}

	public int getEpicPos(){
		return epicPos;
	}

	public void setPosition(int position){
		this.position = position;
	}

	public int getPosition(){
		return position;
	}

	@Override
 	public String toString(){
		return 
			"ChestCycle{" + 
			"superMagicalPos = '" + superMagicalPos + '\'' + 
			",legendaryPos = '" + legendaryPos + '\'' + 
			",epicPos = '" + epicPos + '\'' + 
			",position = '" + position + '\'' + 
			"}";
		}
}