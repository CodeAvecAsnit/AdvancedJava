package JavaLab3JDBC.Question37.main;

import JavaLab3JDBC.Question37.DatabaseOperator;
import JavaLab3JDBC.Question37.controller.AuthController;
import JavaLab3JDBC.Question37.data.ResponseBody;
import JavaLab3JDBC.Question37.data.User;
import JavaLab3JDBC.Question37.service.AuthService;
import JavaLab3JDBC.Question37.service.impl.AuthServiceImpl;
import JavaLab3JDBC.connector.JDBCConnector;

import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCConnector connector = new JDBCConnector();
        DatabaseOperator operator = new DatabaseOperator(connector);
        AuthService authService = new AuthServiceImpl(operator);
        AuthController authController = new AuthController(authService);

        User user = new User("JohnDoe","janeSmith23");
            ResponseBody body = authController.loginUser(user);
            if(body.getStatusCode()==200) System.out.println("Test Successful");
            else System.out.println("Something went wrong. Please debug");

            user.setPassword("wrongPass");
            ResponseBody newBody = authController.loginUser(user);
            if(newBody.getStatusCode()!=200) System.out.println("Another test success");
            else System.out.println("The test has failed and something went wrong.");

    }
}