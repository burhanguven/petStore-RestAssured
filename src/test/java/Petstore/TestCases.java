package Petstore;

import PetModel.Pet;
import builders.PetCreate;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TestCases extends BaseTest {

	PetCreate create = new PetCreate();

	// pet olustur
	@Test(priority=0)
	public void addPet() throws JsonProcessingException {
		Pet createPet = postRequest(create.petCreateData1(), Pet.class);
		assertNotNull(createPet.getId());
		System.out.println(createPet.toString());
	}

	// olusturulan pet var mı kontrol et
	@Test(priority = 1)
	public void getPetId() throws JsonProcessingException {
		Pet createPet = postRequest(create.petCreateData1(), Pet.class);
		Pet responsePet = getPet(createPet.getId(), Pet.class);
		assertEquals(responsePet.getId(), responsePet.getId());
	}

	// pet update
	@Test(priority = 2)
	public void updatePet() throws JsonProcessingException {
		Pet createPet = postRequest(create.petCreateData1(), Pet.class);
		Pet update = putPet(create.petUpdateData2(), Pet.class);
		assertNotEquals(createPet.getName(), update.getName());
	}

	// pet delete
	@Test(priority = 3)
	public void deletePet() throws JsonProcessingException {
		Pet createPet = postRequest(create.petCreateData1(), Pet.class);
		Pet delete = deletePet(createPet.getId(), Pet.class);
	}
}
