package UserModel;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
public class User {

    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private int userStatus;

    public User() {

    }

    public User(int id, String username, String firstName, String lastName, String email, String password, String phone, int userStatus) {
        super();
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.username = username;
    }


}
