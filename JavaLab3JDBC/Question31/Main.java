package JavaLab3JDBC.Question31;
import JavaLab3JDBC.connector.JDBCConnector;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCConnector connector = new JDBCConnector();
        Connection conn = connector.establishConnection();
        if(insertData("Health",86,conn)) System.out.println("Successfully Inserted");
        if(updateData("Computer",76,conn)) System.out.println("Successfully Updated");
         seeData(conn);
        if(deleteData("Health",conn)) System.out.println("Successfully Deleted");
        seeData(conn);
    }

    public static void seeData(Connection conn) throws SQLException {
        String query = "Select *from result";
        PreparedStatement selectSt = conn.prepareStatement(query);
        ResultSet rs = selectSt.executeQuery();
        System.out.println();
        while(rs.next()){
            System.out.println(rs.getInt("roll_no")+". "+rs.getString("course_name")+"     "+rs.getInt("marks_obtained"));
        }
    }

    public static boolean insertData(String name,int marks,Connection conn) throws SQLException{
        String query = "Insert into result(course_name,marks_obtained) values(?,?)";
        PreparedStatement insertSt = conn.prepareStatement(query);
        insertSt.setString(1,name);
        insertSt.setInt(2,marks);
        int rows =insertSt.executeUpdate();
        return rows>0;
    }

    public static boolean updateData(String name,int marks,Connection conn) throws SQLException{
        String query = "UPDATE result set marks_obtained = ? where course_name = ?";
        PreparedStatement insertSt = conn.prepareStatement(query);
        insertSt.setInt(1,marks);
        insertSt.setString(2,name);
        int rows =insertSt.executeUpdate();
        return rows>0;
    }

    public static boolean deleteData(String name,Connection conn) throws SQLException{
        String query = "Delete from result where course_name = ? ";
        PreparedStatement insertSt = conn.prepareStatement(query);
        insertSt.setString(1,name);
        int rows =insertSt.executeUpdate();
        return rows>0;
    }
}
