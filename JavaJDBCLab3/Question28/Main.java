package JavaJDBCLab3.Question28;

import JavaJDBCLab3.connector.JDBCConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCConnector connector = new JDBCConnector();
        Connection conn = connector.establishConnection();
        Statement statement = conn.createStatement();
        String query = "Insert into users(user_name) values(\"weekday\")";
        int rows = statement.executeUpdate(query);
        if(rows>0) System.out.println("Success");
        else System.out.println("Failed");
    }
}
