package JavaJDBCLab3.Question30;

import JavaJDBCLab3.connector.JDBCConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCConnector connector = new JDBCConnector();
        Connection conn = connector.establishConnection();
        String query = "Select *from result";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getInt("roll_no")+". "+rs.getString("course_name")+"     "+rs.getInt("marks_obtained"));
        }
    }
}
