package service.impl;

import connector.DatabaseOperator;
import data.ResponseBody;
import data.User;
import org.mindrot.jbcrypt.BCrypt;
import service.RegistrationService;

public record RegistrationServiceImpl(DatabaseOperator databaseOperator) implements RegistrationService {

    @Override
    public ResponseBody createUser(User user){
        if(databaseOperator.existsByUserName(user.getUserName()))
            return new ResponseBody(409,"Error","User already exists.");

        user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt()));
        if(databaseOperator.createUser(user))return new ResponseBody(200, "Success","User Created Successfully");
        else return new ResponseBody(401,"Error","Three was some error while creating the user");
    }

}
