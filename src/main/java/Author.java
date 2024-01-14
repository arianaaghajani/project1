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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public book[] getBooks() {
        return books;
    }

    public void setBooks(book[] books) {
        this.books = books;
    }
}