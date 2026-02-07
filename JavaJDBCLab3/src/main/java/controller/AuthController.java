package controller;

import data.ResponseBody;
import data.User;
import service.AuthService;

public record AuthController(AuthService authService) {

    public ResponseBody registerUser(User user){
        return authService.createUser(user);
    }

    public ResponseBody loginUser(User user){return authService.loginUser(user);}

}
