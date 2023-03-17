package Object_Oriented_Program.Data;

import java.util.UUID;

public class Book {
    private String ID;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String title;
    private String author;
    private String category;

    public Book(String title, String author, String category) {
        this.ID = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getID() { return ID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
}
