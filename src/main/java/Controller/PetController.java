package Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class PetController {

    private String path = "user/";

    protected <T> T getPet(int id,Class<T> responseClass){
        return  given()
                .contentType(ContentType.JSON)
                .when()
                .get(path+id)
                .then()
                .statusCode(200)
                .extract().response().as(responseClass);
    }

    protected <T> T postRequest(Object body, Class<T> responseClass) throws JsonProcessingException {
        return  given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(path)
                .then()
                .statusCode(200).extract().as(responseClass);
    }
    protected <T> T putPet(Object body, Class<T> responseClass) throws JsonProcessingException{
        return  given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .put(path)
                .then()
                .statusCode(200).extract().as(responseClass);
    }

    protected <T> T deletePet(int id, Class<T> responseClass){
        return  given()
                .contentType(ContentType.JSON)
                .when()
                .delete(path+id)
                .then()
                .statusCode(200).extract().as(responseClass);
    }
}
