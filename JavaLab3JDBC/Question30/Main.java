package JavaLab3JDBC.Question30;

import JavaLab3JDBC.connector.JDBCConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Asnit's JDBC (Question 30)");
        System.out.println();
        System.out.println("Result Data :)");
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
