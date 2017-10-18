package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Badge{

	@SerializedName("filename")
	private String filename;

	@SerializedName("url")
	private String url;

	@SerializedName("key")
	private String key;

	public void setFilename(String filename){
		this.filename = filename;
	}

	public String getFilename(){
		return filename;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
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
			"Badge{" + 
			"filename = '" + filename + '\'' + 
			",url = '" + url + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}