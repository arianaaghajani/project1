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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Data getPrintYear() {
        return printYear;
    }

    public void setPrintYear(Data printYear) {
        this.printYear = printYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
