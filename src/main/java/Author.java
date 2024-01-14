import java.util.Arrays;

public class Author{
    private int id;
    private String name;
    private String lastName;
    private int age;
    private book[] books;

    public Author() {
    }

    public Author(String name, String lastName, int age, book[] books) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }

    public Author(int id, String name, String lastName, int age, book[] books) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }


}