package service;


import repository.AuthorRepository;

import java.awt.print.Book;
import java.sql.SQLException;
import java.util.Scanner;

public class AuthorService {
    private AuthorRepository authorRepository=new AuthorRepository();
    private final Scanner scanner=new Scanner(System.in);

    public AuthorService() throws SQLException {
    }
    public void register()throws SQLException{
        System.out.println("Enter an author name: ");
        String name=scanner.nextLine();
        System.out.println("Enter a lastName of author: ");
        String lastName=scanner.nextLine();
        System.out.println("Enter an Age: ");
        String age=scanner.nextLine();
        scanner.nextInt();
        Author author=new Author(name,lastName,age);
        int result=AuthorRepository.save(author);
        if (result==1)
            System.out.println("The author is register");
        else
            System.out.println("error");
    }

    public void findById() throws SQLException{
        System.out.println("enter authorId: ");
        int authorId=scanner.nextLine();
        scanner.nextLine();
        Author author=authorRepository.load(authorId);
        Book[] books=AuthorRepository.get

    }
}
