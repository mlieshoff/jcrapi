package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Region{

	@SerializedName("isCountry")
	private String isCountry;

	@SerializedName("name")
	private String name;

	public void setIsCountry(String isCountry){
		this.isCountry = isCountry;
	}

	public String getIsCountry(){
		return isCountry;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"Region{" + 
			"isCountry = '" + isCountry + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}