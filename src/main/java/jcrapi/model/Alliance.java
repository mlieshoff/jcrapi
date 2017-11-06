package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Alliance{

	@SerializedName("types")
	private List<Object> types;

	@SerializedName("roles")
	private List<Object> roles;

	public void setTypes(List<Object> types){
		this.types = types;
	}

	public List<Object> getTypes(){
		return types;
	}

	public void setRoles(List<Object> roles){
		this.roles = roles;
	}

	public List<Object> getRoles(){
		return roles;
	}

	@Override
 	public String toString(){
		return 
			"Alliance{" + 
			"types = '" + types + '\'' + 
			",roles = '" + roles + '\'' + 
			"}";
		}
}