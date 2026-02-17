package JavaJDBCLab3.Question35;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class CachedRowSetExample {
    public static void main(String[] args) {
        try {
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setUrl("jdbc:mysql://localhost:3306/javabank");
            crs.setUsername("root");
            crs.setPassword("asnit123");
            crs.setCommand("SELECT * FROM employee");
            crs.execute();

            System.out.println("Employees using CachedRowSet (offline):");
            while (crs.next()) {
                System.out.println(crs.getInt("emp_id") + " " +
                        crs.getString("emp_name") + " " +
                        crs.getDouble("emp_salary"));
            }
            crs.beforeFirst();
            while (crs.next()) {
                if (crs.getInt("emp_id") == 1) {
                    crs.updateDouble("emp_salary", 95000.00);
                    crs.updateRow();
                }
            }
            crs.acceptChanges();
            crs.close();
        } catch (SQLException e) {e.printStackTrace();}
    }
}
