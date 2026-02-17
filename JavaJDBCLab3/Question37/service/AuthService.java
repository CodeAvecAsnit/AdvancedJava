package JavaJDBCLab3.Question37.service;


import JavaJDBCLab3.Question37.data.ResponseBody;
import JavaJDBCLab3.Question37.data.User;

public interface AuthService {
     ResponseBody createUser(User user);
     ResponseBody loginUser(User user);
}
