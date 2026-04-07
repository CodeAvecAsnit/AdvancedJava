package JavaLab3JDBC.Question28;

import JavaLab3JDBC.connector.JDBCConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCConnector connector = new JDBCConnector();
        Connection conn = connector.establishConnection();
        Statement statement = conn.createStatement();
        String query = "Insert into users(user_name) values(\"AWAZ_AAYO\")";
        int rows = statement.executeUpdate(query);
        if(rows>0) System.out.println("Successfully Inserted.");
        else System.out.println("Failed");
    }
}
