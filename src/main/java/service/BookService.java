package service;

import repository.BookRepository;

import java.awt.print.Book;
import java.sql.SQLException;
import java.util.Scanner;

public class BookService {
    private final BookRepository bookRepository=new BookRepository();
    private final Scanner scanner=new Scanner(System.in);
    public BookService() throws SQLException {
    }
    public void addBook()throws SQLException{
        System.out.println("enter a title of book");
        String title =scanner.nextLine();
        System.out.println("enter a year of book");
        int year=scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter authorId of book");
        int authorId=scanner.nextInt();
        scanner.nextLine();
        Book book=new Book(title,year,authorId);
        int result=bookRepository.save(book);
        if (result==1)
            System.out.println("The book is added");
        else
            System.out.println("not added");

    }
    public void findById() throws SQLException{
        System.out.println("enter book id: ");
        int bookId=scanner.nextLine();
        scanner.nextLine();
        Book book=bookRepository.load(bookId);
        System.out.println(book);
    }
}
