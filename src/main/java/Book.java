import javax.xml.crypto.Data;

public class Book {
    private int id;
    private String title;
    private int printYear;
    private int authorId;

    public Book(int id, String title, int printYear, int authorId) {
        this.id = id;
        this.title = title;
        this.printYear = printYear;
        this.authorId = authorId;
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

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", printYear=" + printYear +
                ", authorId=" + authorId +
                '}';
    }
}
