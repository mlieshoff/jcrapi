package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Clan{

	@SerializedName("badge")
	private Badge badge;

	@SerializedName("role")
	private String role;

	@SerializedName("name")
	private String name;

	@SerializedName("tag")
	private String tag;

	public void setBadge(Badge badge){
		this.badge = badge;
	}

	public Badge getBadge(){
		return badge;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public String getTag(){
		return tag;
	}

	@Override
 	public String toString(){
		return 
			"Clan{" + 
			"badge = '" + badge + '\'' + 
			",role = '" + role + '\'' + 
			",name = '" + name + '\'' + 
			",tag = '" + tag + '\'' + 
			"}";
		}
}