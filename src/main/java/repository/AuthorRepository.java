package repository;

import java.sql.Connection;
import java.sql.SQLException;

public class AuthorRepository {
    private final JdbcConnection JdbcConnection= new JdbcConnection();
    private final Connection connection=JdbcConnection.getConnection();

    public AuthorRepository() throws SQLException{

    }
}
