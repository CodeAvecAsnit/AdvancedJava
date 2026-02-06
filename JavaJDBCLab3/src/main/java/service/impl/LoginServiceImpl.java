package service.impl;

import connector.DatabaseOperator;
import data.User;
import service.LoginService;

import java.util.Map;

public record LoginServiceImpl(DatabaseOperator databaseOperator) implements LoginService {

    @Override
    public Map<String, String> loginUser(User user) {
        if (!databaseOperator.existsByUserName(user.getUserName()))
            return Map.of("Error", "The user doesn't exist");

        if (databaseOperator.loginUser(user))
            return Map.of("Success", "User has successfully logged in.");
        else return Map.of("Error", "Unauthorized;Passwords do not match");
    }
}
