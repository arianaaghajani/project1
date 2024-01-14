package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuthorRepository {
    private final JdbcConnection JdbcConnection = new JdbcConnection();
    private final Connection connection = JdbcConnection.getConnection();

    public AuthorRepository() throws SQLException {

    }

    public int save(Author author) throws SQLException {
        String addAuthor = "INSERT INTO author(name,lastName,age)VALUES(?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addAuthor);
        preparedStatement.setString(1, author.getName());
        preparedStatement.setString(2, author.getLastName());
        preparedStatement.setInt(3, author.getAge());
        return preparedStatement.executeUpdate();
    }
}
