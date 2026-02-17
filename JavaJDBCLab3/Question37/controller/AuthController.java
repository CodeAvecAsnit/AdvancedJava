package JavaJDBCLab3.Question37.controller;


import JavaJDBCLab3.Question37.data.ResponseBody;
import JavaJDBCLab3.Question37.data.User;
import JavaJDBCLab3.Question37.service.AuthService;

public record AuthController(AuthService authService) {

    public ResponseBody registerUser(User user){
        return authService.createUser(user);
    }

    public ResponseBody loginUser(User user){return authService.loginUser(user);}
}
