package Petstore;

import PetModel.Pet;
import Builders.PetCreateBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class PetTestCases extends BaseTest {

	// pet olustur
	@Test(priority = 0)
	public void addPet() throws JsonProcessingException {
		Pet createPet = postRequest(PetCreateBuilder.petCreateData(), Pet.class);
		assertNotNull(createPet.getId());
	}

	// olusturulan pet var mı kontrol et
	@Test(priority = 1)
	public void getPetId() throws JsonProcessingException {
		Pet createPet = postRequest(PetCreateBuilder.petCreateData(), Pet.class);
		Pet responsePet = getPet(createPet.getId(), Pet.class);
		assertEquals(responsePet.getId(), responsePet.getId());
	}

	// pet update
	@Test(priority = 2)
	public void updatePet() throws JsonProcessingException {
		Pet createPet = postRequest(PetCreateBuilder.petCreateData(), Pet.class);
		Pet update = putPet(PetCreateBuilder.petUpdateData(), Pet.class);
		assertNotEquals(createPet.getName(), update.getName());
	}

	// pet delete
	@Test(priority = 3)
	public void deletePet() throws JsonProcessingException {
		Pet createPet = postRequest(PetCreateBuilder.petCreateData(), Pet.class);
		Pet delete = deletePet(createPet.getId(), Pet.class);
	}
}
