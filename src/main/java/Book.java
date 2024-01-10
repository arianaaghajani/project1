import javax.xml.crypto.Data;

public class Book {
    private String title;
    private Data printYear;
    private String author;

    public Book(String title, Data printYear, String author) {
        this.title = title;
        this.printYear = printYear;
        this.author = author;
    }
}
