package org.itstep.service;

import org.itstep.model.User;

public class UserService {

    public static User findUserByLoginAndPassword(String login, String password) {

        User user = new User("Julia", "Shilo", "julia93", "123456");

        if (login.equals(user.getLogin()) && password.equals(user.getPassword()))

        {
            return user;
        }

        return null;
    }

}
