package JavaJDBCLab3.Question27;

import JavaJDBCLab3.connector.JDBCConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCConnector connector = new JDBCConnector();
        Connection connection = connector.establishConnection();
        Statement st = connection.createStatement();
        String query = "Select *from Users";
        ResultSet set = st.executeQuery(query);
        while(set.next()){
            System.out.println(set.getInt("user_id")+". "+set.getString("user_name"));
        }
    }
}
