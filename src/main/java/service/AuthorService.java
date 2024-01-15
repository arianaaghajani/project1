package service;


import repository.AuthorRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class AuthorService {
    private AuthorRepository authorRepository=new AuthorRepository();
    private final Scanner scanner=new Scanner(System.in);

    public AuthorService() throws SQLException {
    }
}
