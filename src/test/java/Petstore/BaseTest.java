package Petstore;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import Controller.PetController;
import utils.EnvProperties;

public class BaseTest  extends PetController {
	
	@BeforeClass
	public void init(){
		RestAssured.baseURI= EnvProperties.getProperties().get("baseUrl");
	}
	
}
