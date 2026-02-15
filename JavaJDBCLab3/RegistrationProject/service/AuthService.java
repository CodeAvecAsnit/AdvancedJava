package JavaJDBCLab3.RegistrationProject.service;


import JavaJDBCLab3.RegistrationProject.data.ResponseBody;
import JavaJDBCLab3.RegistrationProject.data.User;

public interface AuthService {
     ResponseBody createUser(User user);
     ResponseBody loginUser(User user);
}
