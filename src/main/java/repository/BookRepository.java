package repository;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRepository {
   private final JdbcConnection JdbcConnection=new JdbcConnection();
   private final Connection connection=JdbcConnection.getConnection();

    public BookRepository() throws SQLException {
    }
    public int save (Book book) throws SQLException{
        String addAuthor="INSERT INTO books(title,print_Year,authorId)VALUES(?,?,?);";
        PreparedStatement preparedStatement=connection.prepareStatement(addAuthor);
        preparedStatement.setString(1,book.getTitle());
        preparedStatement.setInt(2,book.getPrintYear());
        preparedStatement.setInt(3,book.getAuthorId);
        return preparedStatement.executeUpdate();


    }
    public Book load(int bookId) throws SQLException{
        String loadBook="SELECT * FROM book WHERE bookId= ? ;";
        PreparedStatement preparedStatement=connection.prepareStatement(loadBook);
        preparedStatement.setInt(1,bookId);
        ResultSet resultSet= preparedStatement.executeQuery();
        if (resultSet.next()){
            int id=resultSet.getInt("id");
            String title=resultSet.getString("title");
            int printYear=resultSet.getInt("printYear");
            int authorId=resultSet.getInt("authorId");
            return new Book(id,title,printYear,authorId);
        }
        else {
            return null;
        }

    }
}
