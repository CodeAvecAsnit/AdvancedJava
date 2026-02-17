package JavaJDBCLab3.Question37.main;

import JavaJDBCLab3.Question37.DatabaseOperator;
import JavaJDBCLab3.Question37.controller.AuthController;
import JavaJDBCLab3.Question37.data.ResponseBody;
import JavaJDBCLab3.Question37.data.User;
import JavaJDBCLab3.Question37.service.AuthService;
import JavaJDBCLab3.Question37.service.impl.AuthServiceImpl;
import JavaJDBCLab3.connector.JDBCConnector;

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