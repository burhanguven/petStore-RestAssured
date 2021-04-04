package PetModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteResponse {
	
	@JsonProperty("code")
	private int code;
	@JsonProperty("type")
	private String type;
	@JsonProperty("mesaage")
	private String message;
	
	public DeleteResponse() {
	
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
