package PetModel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Category {
	
	private int id;
	private String name;

	public Category() {
	}
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
