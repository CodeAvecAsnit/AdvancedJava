package service;

import data.ResponseBody;
import data.User;

import java.util.Map;

public interface RegistrationService {
     ResponseBody createUser(User user);
}
