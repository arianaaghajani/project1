import javax.xml.crypto.Data;

public class Book {
    private int id;
    private String title;
    private Data printYear;
    private int authorId;

    public Book(int id, String title, Data printYear, int authorId) {
        this.id = id;
        this.title = title;
        this.printYear = printYear;
        this.authorId = authorId;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
