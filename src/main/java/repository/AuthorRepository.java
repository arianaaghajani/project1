package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public Author load(int authorId) throws SQLException{
        String loadAuthor="SELECT * FROM author where id=?;";
        PreparedStatement preparedStatement =connection.prepareStatement(loadAuthor);
        PreparedStatement.setInt(1,authorId);
        ResultSet resultSet=preparedStatement.executeQuery();
        if(resultSet.next()){
            int id=resultSet.getInt("id");
            String name=resultSet.getString("name");
            String lastName=resultSet.getString("lastName");
            int age=resultSet.getInt("age");
            return new Author(id,name,lastName,age);
        }
        else {
            return null;
        }

    }


}
