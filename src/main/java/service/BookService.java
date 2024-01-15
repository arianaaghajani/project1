package service;

import repository.BookRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class BookService {
    private final BookRepository bookRepository=new BookRepository();
    private final Scanner scanner=new Scanner(System.in);
    public BookService() throws SQLException {
    }
}
