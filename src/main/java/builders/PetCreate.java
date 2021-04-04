package builders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import PetModel.Category;
import PetModel.Pet;
import PetModel.Tags;

public class PetCreate {

	public static String petCreateData1() throws JsonProcessingException{
		Pet pet = new Pet();
		Category category = new Category();
		Tags[] tag = { new Tags(0, "animal"), new Tags(1, "pet"), new Tags(2, "dog") };
		String[] photoUrls = { "https://www.youtube.com/watch?v=5wzntE1XNrs" };
		category.setId(0);
		category.setName("Dog");

		pet.setId(585834);
		pet.setCategory(category);
		pet.setPhotoUrls(photoUrls);
		pet.setName("blackhead");
		pet.setTags(tag);
		pet.setStatus("available");

		return objectMapper(pet);
	}
	public static String petUpdateData2() throws JsonProcessingException {
		Pet pet = new Pet();
		Category category = new Category();
		Tags[] tag = { new Tags(0, "animal update"), new Tags(1, "pet update"), new Tags(2, "dog update") };
		String[] photoUrls = { "https://www.youtube.com/watch?v=5wzntE1XNrs" };
		category.setId(0);
		category.setName("Dog");

		pet.setId(585834);
		pet.setCategory(category);
		pet.setPhotoUrls(photoUrls);
		pet.setName("blackhead update");
		pet.setTags(tag);
		pet.setStatus("available update");
		
		return objectMapper(pet);
	}

	public static String objectMapper(Pet petCreate) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		String employeeJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(petCreate);
		return employeeJson;
	}


}
