package service.impl;

import connector.DatabaseOperator;
import data.ResponseBody;
import data.User;
import org.mindrot.jbcrypt.BCrypt;
import service.AuthService;


public record AuthServiceImpl(DatabaseOperator databaseOperator) implements AuthService {

    @Override
    public ResponseBody createUser(User user){
        if(databaseOperator.existsByUserName(user.getUserName()))
            return new ResponseBody(409,"Error","User already exists.");
        String rawPass = user.getPassword();
        String hashedPass = BCrypt.hashpw(rawPass,BCrypt.gensalt());
        user.setPassword(hashedPass);
        if(databaseOperator.createUser(user))return new ResponseBody(200, "Success","User Created Successfully");
        else return new ResponseBody(401,"Error","Three was some error while creating the user");
    }

    @Override
    public ResponseBody loginUser(User user) {
        if (!databaseOperator.existsByUserName(user.getUserName()))
            return new ResponseBody(404,"Error","User with this username not found.");

        if (databaseOperator.loginUser(user))
            return new ResponseBody(200,"Success","User Successfully Logged In");
        else return new ResponseBody(401,"Unauthorized", "Unauthorized;Passwords do not match");
    }

}
