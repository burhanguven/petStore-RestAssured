package PetModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pet {
	
	@JsonProperty("id")
	private int id;
	@JsonProperty("category")
	private Category category;
	@JsonProperty("name")
	private String name;
	@JsonProperty("photoUrls")
	private String[] photoUrls;
	@JsonProperty("tags")
	private Tags[] tags;
	@JsonProperty("status")
	private String status;
	
	public Pet() {
		
	}
	
	public Pet(int id, Category category, String name, String[] photoUrls, Tags[] tags, String status) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(String[] photoUrls) {
		this.photoUrls = photoUrls;
	}
	public Tags[] getTags() {
		return tags;
	}
	public void setTags(Tags[] tags) {
		this.tags = tags;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
