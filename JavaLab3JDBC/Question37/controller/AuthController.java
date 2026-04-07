package JavaLab3JDBC.Question37.controller;


import JavaLab3JDBC.Question37.data.ResponseBody;
import JavaLab3JDBC.Question37.data.User;
import JavaLab3JDBC.Question37.service.AuthService;

public record AuthController(AuthService authService) {

    public ResponseBody registerUser(User user){
        return authService.createUser(user);
    }

    public ResponseBody loginUser(User user){return authService.loginUser(user);}
}
