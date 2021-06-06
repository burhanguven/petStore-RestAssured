package UserTest;

import Builders.UserBuilder;
import UserModel.Response.UserResponse;
import UserModel.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTestCases extends BaseTest {

    // User olustur
    @Test(priority = 0)
    public void create_user() throws JsonProcessingException {
        UserResponse createUser = postRequest(UserBuilder.createUserbuilder(), UserResponse.class);
        assertThat(createUser.getCode(), is(200));
    }
    //username e göre kayit getirme
    @Test(priority = 1)
    public void get_username_test() {
        //!!!burada yeni id ile göndermek gerekiyor!!!
        postRequest(UserBuilder.createUserbuilder(), UserResponse.class);
        User getUserData=getUsername("burhanguvenn",User.class);
        //assertEquals("burhanguvenn",getUserData.getUsername());
    }
    @Test(priority = 2)
    public void update_by_username(){
        postRequest(UserBuilder.createUserbuilder(), UserResponse.class);
        updateUsername("burhanguvenn", UserBuilder.userUpdateData(),UserResponse.class);
    }

}
