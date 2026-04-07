package JavaLab3JDBC.Question33;

import JavaLab3JDBC.connector.JDBCConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Asnit's JDBC(Question 33)");
        JDBCConnector connector = new JDBCConnector();
        Connection conn = connector.establishConnection();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee id : ");
        int id = sc.nextInt();
        String query = "Select * from employee where emp_id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.print(rs.getInt("emp_id")+". "+rs.getString("emp_name"));
            System.out.print(" salary : "+  rs.getFloat("emp_salary"));
            System.out.println();
        }
    }
}
