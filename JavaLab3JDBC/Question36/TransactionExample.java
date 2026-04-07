package JavaLab3JDBC.Question36;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
    public static void main(String[] args) throws SQLException {
        System.out.println("Author : Asnit Bakhati");
        System.out.println("Transaction Example");
        System.out.println();
        System.out.println();
        String url = "jdbc:mysql://localhost:3306/javabank";
        String user = "root";
        String password = "asnit123";
        Connection connection = null;
        PreparedStatement wSt = null;
        PreparedStatement dSt = null;
        try{
            connection = DriverManager.getConnection(url,user,password);
            connection.setAutoCommit(false);
            String wQuery = "Update accounts set balance = balance - ? where user_id = ? ";
            wSt = connection.prepareStatement(wQuery);
            wSt.setFloat(1,5000);
            wSt.setInt(2,4);
            wSt.executeUpdate();

            String dQuery = "Update accounts set balance = balance + ? where user_id = ? ";
            dSt = connection.prepareStatement(wQuery);
            dSt.setFloat(1,5000);
            dSt.setInt(2,4);
            dSt.executeUpdate();

            connection.commit();
            System.out.println("Transaction Successful");
        } catch (SQLException e) {
            if(connection!=null) connection.rollback();
            System.out.println("Transaction Failed! Rolled back");
        }finally {
            if(wSt!=null) wSt.close();
            if(dSt!=null) dSt.close();
            if(connection!=null) {
                connection.setAutoCommit(false);
                connection.close();
            }
        }
    }
}
