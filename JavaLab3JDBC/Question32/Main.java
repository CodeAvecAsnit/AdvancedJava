package JavaLab3JDBC.Question32;

import JavaLab3JDBC.connector.JDBCConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCConnector connector = new JDBCConnector();
        Connection conn = connector.establishConnection();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the dog : ");
        String name = sc.nextLine();
        System.out.print("Enter the breed of the dog : ");
        String breed = sc.nextLine();

        String query = "Insert into Dogs(name,breed) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1,name);
        ps.setString(2,breed);
        int rows = ps.executeUpdate();
        if(rows>0) System.out.println("Successfully Inserted.");
    }
}
