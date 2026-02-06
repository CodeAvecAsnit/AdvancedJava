package service;

import data.User;

import java.util.Map;

public interface LoginService {
    Map<String, String> loginUser(User user);
}
