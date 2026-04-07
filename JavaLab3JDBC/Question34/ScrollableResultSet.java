package JavaLab3JDBC.Question34;
import JavaLab3JDBC.connector.JDBCConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScrollableResultSet {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        List<Dog> dogs = new ArrayList<>();
        JDBCConnector connector = new JDBCConnector();
        Connection connection = connector.establishConnection();

        String query = "SELECT * FROM Dogs";

        PreparedStatement statement = connection.prepareStatement(
                query,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
        );


        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            Dog dog = new Dog();
            dog.id = rs.getInt(1);
            dog.name = rs.getString(2);
            dog.breed = rs.getString(3);
            dogs.add(dog);
        }

        for(Dog d : dogs){
            d.print();
        }
        connection.close();
    }
}
