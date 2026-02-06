package controller;

import data.ResponseBody;
import data.User;
import service.RegistrationService;

import java.util.Map;

public record RegistrationController(RegistrationService registrationService) {

    public ResponseBody registerUser(User user){
        return registrationService.createUser(user);
    }

}
