package Builders;

import UserModel.User;

public class UserBuilder {

    private static int userId = 99999922;

    //user olusturmak icin
    public static Object createUserbuilder() {
        User userCreate = User.builder()
                .id(userId)
                .username("burhanguvenn1")
                .firstName("burhan")
                .lastName("güven")
                .email("burhan@gmail.com")
                .password("123123123")
                .userStatus(1)
                .phone("054654654654")
                .build();
        return userCreate;
    }
    //user update data
    public static Object userUpdateData() {
        User userCreate = User.builder()
                .id(userId)
                .username("burhanguvenn1")
                .firstName("burhan Can")
                .lastName("Guven")
                .email("burhan@gmail.com")
                .password("burhancanburhan123*")
                .userStatus(1)
                .phone("054654654654")
                .build();
        return userCreate;
    }
}
