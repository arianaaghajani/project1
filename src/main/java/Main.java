import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException{
    Connection connection=
    DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1399ar");
        System.out.println(connection);
        String createTable ="CREATE TABLE users (ID serial PRIMARY KEY,username VARCHAR(50) UNIQUE NOT NULL);";
        PreparedStatement preparedStatement= connection.prepareStatement(createTable);
        System.out.println(preparedStatement.execute());

    }

}
