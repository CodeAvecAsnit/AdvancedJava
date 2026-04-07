package JavaLab3JDBC.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
    private static final String DB_URL;
    private static final String DB_USERNAME;
    private static final String DB_PASSWORD;

    static{
        DB_URL = "jdbc:mysql://localhost:3306/javabank?allowMultipleQueries=true";
        DB_USERNAME = "root";
        DB_PASSWORD = "asnit123";
    }

    public Connection establishConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
    }
}
