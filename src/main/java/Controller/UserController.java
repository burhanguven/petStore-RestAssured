package Controller;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class UserController {

    private String path = "user/";

    protected <T> T postRequest(Object body, Class<T> responseClass) {
        return given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(path)
                .then()
                .statusCode(200).extract().as(responseClass);
    }

    protected <T> T getUsername(String username, Class<T> responseClass) {
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get(path + username)
                .then()
                .statusCode(200)
                .extract().response().as(responseClass);
    }

    protected <T> T updateUsername(String username, Object body, Class<T> responseClass) {
        return given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .put(path + username)
                .then()
                .statusCode(200)
                .extract().response().as(responseClass);
    }
}
