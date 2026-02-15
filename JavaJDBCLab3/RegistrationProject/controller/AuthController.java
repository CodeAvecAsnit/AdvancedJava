package JavaJDBCLab3.RegistrationProject.controller;


import JavaJDBCLab3.RegistrationProject.data.ResponseBody;
import JavaJDBCLab3.RegistrationProject.data.User;
import JavaJDBCLab3.RegistrationProject.service.AuthService;

public record AuthController(AuthService authService) {

    public ResponseBody registerUser(User user){
        return authService.createUser(user);
    }

    public ResponseBody loginUser(User user){return authService.loginUser(user);}

}
