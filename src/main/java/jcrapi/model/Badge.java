package jcrapi.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Badge{

	@SerializedName("filename")
	private String filename;

	@SerializedName("key")
	private String key;

	@SerializedName("url")
	private String url;

	public void setFilename(String filename){
		this.filename = filename;
	}

	public String getFilename(){
		return filename;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Badge{" + 
			"filename = '" + filename + '\'' + 
			",key = '" + key + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}