package petController;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class PetController {

    private String BaseURL="https://petstore.swagger.io/v2/pet/";

    protected <T> T getPet(int id,Class<T> responseClass){
        return  given()
                .contentType(ContentType.JSON)
                .when()
                .get(BaseURL+id)
                .then()
                .statusCode(200)
                .extract().response().as(responseClass);
    }

    protected <T> T postRequest(String body, Class<T> responseClass) throws JsonProcessingException {
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
