package main;

import connector.DatabaseOperator;
import connector.JDBCConnector;
import controller.AuthController;
import data.ResponseBody;
import data.User;
import service.AuthService;
import service.impl.AuthServiceImpl;

import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCConnector connector = new JDBCConnector();
        DatabaseOperator operator = new DatabaseOperator(connector);
        AuthService authService = new AuthServiceImpl(operator);
        AuthController authController = new AuthController(authService);

        User user = new User("JohnDoe","janeSmith23");
//        ResponseBody responseBody = authController.registerUser(user);
//        if(responseBody.getStatusCode()==200){
            ResponseBody body = authController.loginUser(user);
            if(body.getStatusCode()==200) System.out.println("Test Successful");
            else System.out.println("Something went wrong. Please debug");

            user.setPassword("wrongPass");
            ResponseBody newBody = authController.loginUser(user);
            if(newBody.getStatusCode()!=200) System.out.println("Another test success");
            else System.out.println("The test has failed and something went wrong.");
//        } else System.out.println("There is wrong during registration");

    }
}