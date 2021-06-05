package PetModel.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DeleteResponse {
	
	@JsonProperty("code")
	private int code;
	@JsonProperty("type")
	private String type;
	@JsonProperty("mesaage")
	private String message;
	
	public DeleteResponse() {
	}
}
