package JavaLab3JDBC.Question34;

import java.sql.*;
import java.util.Properties;

public class MultipleResultExample {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("user", "root");
        props.setProperty("password", "asnit123");
        props.setProperty("allowMultiQueries", "true");
        String url = "jdbc:mysql://localhost:3306/javabank";

        try (Connection conn = DriverManager.getConnection(url, props);
             Statement stmt = conn.createStatement()) {
            String query = "SELECT * FROM employee WHERE emp_salary > 55000; " +
                    "SELECT * FROM employee WHERE emp_salary < 50000";
            boolean hasResult = stmt.execute(query);
            int count = 1;

            while (hasResult) {
                try (ResultSet rs = stmt.getResultSet()) {
                    System.out.println("\n--- ResultSet " + count + " ---");
                    while (rs.next()) {
                        System.out.printf("ID: %d | Name: %s | Salary: %.2f%n",
                                rs.getInt("emp_id"),
                                rs.getString("emp_name"),
                                rs.getDouble("emp_salary"));
                    }
                }
                hasResult = stmt.getMoreResults();
                count++;
            }
        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
            System.err.println("Vendor Code: " + e.getErrorCode());
        }
    }
}