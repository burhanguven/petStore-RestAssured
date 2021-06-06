package UserTest;

import Controller.UserController;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import utils.EnvProperties;

public class BaseTest extends UserController {

    @BeforeClass
    public void init(){
        RestAssured.baseURI= EnvProperties.getProperties().get("baseUrl");
    }
}
