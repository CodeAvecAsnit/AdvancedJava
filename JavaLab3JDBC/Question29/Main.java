package JavaLab3JDBC.Question29;

import JavaLab3JDBC.connector.JDBCConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the dog : ");
        String name = scanner.nextLine();

        System.out.print("Enter the breed of the dog : ");
        String breed = scanner.nextLine();
        StringBuilder sb = new StringBuilder("Insert into Dogs(name,breed) values(");
        sb.append("\""+name+"\",");
        sb.append("\""+breed+"\")");

        JDBCConnector connector = new JDBCConnector();
        Connection conn = connector.establishConnection();
        Statement st = conn.createStatement();
        System.out.println(sb.toString());
        int rows = st.executeUpdate(sb.toString());
        if(rows>0) System.out.println("Successfully updated");
        else System.out.println("failed");
    }
}
