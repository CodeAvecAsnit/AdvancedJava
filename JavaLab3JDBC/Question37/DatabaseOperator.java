package JavaLab3JDBC.Question37;

import JavaLab3JDBC.Question37.data.User;
import JavaLab3JDBC.connector.JDBCConnector;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;

public class DatabaseOperator {
    private final Connection connection;

    public DatabaseOperator(JDBCConnector connector) throws SQLException, ClassNotFoundException {
        connection = connector.establishConnection();
    }

    public boolean existsByUserName(String userName){
        String query = "Select 1 from users where user_name = ? ";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1,userName);
            ResultSet set = ps.executeQuery();
            return set.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean createUser(User user){
        String query = "Insert into users(user_name, password) values(?,?)";
        try(PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, user.getUserName());
            ps.setString(2,user.getPassword());
            int rowsUpdated = ps.executeUpdate();
            return rowsUpdated>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean loginUser(User user){
        String query = "SELECT password FROM users WHERE user_name = ?";
        try(PreparedStatement st = connection.prepareStatement(query)){
            st.setString(1, user.getUserName());
            ResultSet resultSet = st.executeQuery();

            if(resultSet.next()) {  // Check if user exists
                String hashedPass = resultSet.getString("password");
                System.out.println(hashedPass);
                return BCrypt.checkpw(user.getPassword(), hashedPass);
            } else {
                return false;  // User not found
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
