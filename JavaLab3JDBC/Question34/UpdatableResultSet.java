package JavaLab3JDBC.Question34;

import JavaLab3JDBC.connector.JDBCConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatableResultSet {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCConnector connector = new JDBCConnector();
        Connection connection = connector.establishConnection();

        String query = "Select * from Dogs";
        PreparedStatement st = connection.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = st.executeQuery();

        while(rs.next()){
            if((rs.getInt(1))==1){
                rs.updateString(2,"ranaDawg") ;
                rs.updateRow();
                System.out.println("Id with 1 updated.");
            }
        }
        connection.close();
    }
}
