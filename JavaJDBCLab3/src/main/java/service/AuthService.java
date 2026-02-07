package service;

import data.ResponseBody;
import data.User;

import java.util.Map;

public interface AuthService {
     ResponseBody createUser(User user);
     ResponseBody loginUser(User user);
}
