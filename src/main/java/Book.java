import javax.xml.crypto.Data;

public class Book {
    private int id;
    private String title;
    private Data printYear;
    private int authorId;



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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
