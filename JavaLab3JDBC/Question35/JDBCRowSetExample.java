package JavaLab3JDBC.Question35;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class JDBCRowSetExample {
    public static void main(String[] args) {
            System.out.println("Asnit's JDBC(Question 35) JDBC Rowset");
            try {
                JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();
                jrs.setUrl("jdbc:mysql://localhost:3306/javabank");
                jrs.setUsername("root");
                jrs.setPassword("asnit123");
                jrs.setCommand("SELECT * FROM employee");
                jrs.execute();
                System.out.println("Employees using JdbcRowSet:");
                while (jrs.next()) {
                    System.out.println(jrs.getInt("emp_id") + " " +
                            jrs.getString("emp_name") + " " +
                            jrs.getDouble("emp_salary"));
                }
                jrs.close();
            } catch (SQLException e) {e.printStackTrace();}
        }
}
