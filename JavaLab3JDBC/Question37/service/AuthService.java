package JavaLab3JDBC.Question37.service;


import JavaLab3JDBC.Question37.data.ResponseBody;
import JavaLab3JDBC.Question37.data.User;

public interface AuthService {
     ResponseBody createUser(User user);
     ResponseBody loginUser(User user);
}
