package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Region{

	@SerializedName("isCountry")
	private boolean isCountry;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("key")
	private String key;

	public void setIsCountry(boolean isCountry){
		this.isCountry = isCountry;
	}

	public boolean isIsCountry(){
		return isCountry;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"Region{" + 
			"isCountry = '" + isCountry + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}