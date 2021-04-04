package Petstore;

import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import PetModel.Pet;
import builders.PetCreate;
import static org.junit.Assert.*;

public class TestCases extends BaseTest {

	PetCreate create = new PetCreate();
	private int createPetID;
	Pet responsePet;

	// pet olustur
	@Test(priority = 0)
	public void addPet() throws JsonProcessingException {
		Pet getPet = postRequest(create.petCreateData1(), Pet.class);
		assertNotNull(getPet.getId());
		createPetID = getPet.getId();
	}

	// olusturulan pet var mı kontrol et
	@Test(priority = 1)
	public void getPetId() {
		responsePet = getPet(createPetID, Pet.class);
		assertEquals(createPetID, responsePet.getId());
	}

	// pet update
	@Test(priority = 2)
	public void updatePet() throws JsonProcessingException {
		Pet update = putPet(create.petUpdateData2(), Pet.class);
		assertNotEquals(responsePet.getName(), update.getName());
	}

	// pet delete
	@Test(priority = 3)
	public void deletePet() throws JsonProcessingException {
		Pet delete = deletePet(createPetID, Pet.class);
	}
}
