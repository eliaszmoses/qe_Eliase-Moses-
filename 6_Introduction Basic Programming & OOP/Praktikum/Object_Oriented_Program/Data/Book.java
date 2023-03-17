package Object_Oriented_Program.Data;

import java.util.UUID;

public class Book {
    private static UUID id;
    private static String title;
    private static String author;
    private static String category;

    public Book(String title, String author, String category) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public UUID getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public String getCategory() {
        return category;
    }
}
