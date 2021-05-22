package Petstore;

import org.testng.annotations.BeforeClass;
import petController.PetController;

public class BaseTest  extends PetController {
	
	private String BaseURL="https://petstore.swagger.io/v2/pet/";
	
	@BeforeClass
	public void init(){
		//RestAssured.baseURI=EnvProperties.getProperties().get("baseUrl");
	}
	
}
