package Petstore;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PetModel.Category;
import PetModel.Pet;
import PetModel.Tags;
import builders.PetCreate;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import utils.EnvProperties;

public class BaseTest  {
	
	private String BaseURL="https://petstore.swagger.io/v2/pet/";
	
	@BeforeClass
	public void init(){
		//RestAssured.baseURI=EnvProperties.getProperties().get("baseUrl");
	}
	
	protected <T> T getPet(int id,Class<T> responseClass){
		return  given()
					 .contentType(ContentType.JSON)
				   .when()
				   	 .get(BaseURL+id)
				   .then()
				   	  .statusCode(200)
				   	  .extract().response().as(responseClass);
	}
	
	protected <T> T postRequest(String body, Class<T> responseClass) throws JsonProcessingException{
		return  given()
					.contentType(ContentType.JSON)
					.body(body)
				.when()
					.post(BaseURL)
				.then()
					 .statusCode(200).extract().as(responseClass);
	}
	protected <T> T putPet(String body, Class<T> responseClass) throws JsonProcessingException{
		return  given()
					.contentType(ContentType.JSON)
					.body(body)
				.when()
					.put(BaseURL)
				.then()
					 .statusCode(200).extract().as(responseClass);
	}
	
	protected <T> T deletePet(int id, Class<T> responseClass){
		return  given()
					.contentType(ContentType.JSON)
				.when()
					.delete(BaseURL+id)
				.then()
					 .statusCode(200).extract().as(responseClass);
	}
	
	
}
