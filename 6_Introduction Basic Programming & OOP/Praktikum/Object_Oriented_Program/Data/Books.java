package Object_Oriented_Program.Data;

import java.util.ArrayList;
import java.util.Scanner;
public class Books {
    private ArrayList<Book> books;

    public Books() {
        this.books = new ArrayList<>();
    }

    public void setBooks(Scanner input) {

        System.out.print("Enter title: ");
        String title = input.nextLine();
        System.out.print("Enter author: ");
        String author = input.nextLine();
        System.out.print("Enter category: ");
        String category = input.nextLine();

        books.add(new Book(title, author, category));

        System.out.println("book created:");
        System.out.println("===");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Category: " +category);
        System.out.println("===");
    }

    public void getBooks() {
        System.out.println("===ALL BOOKS===");
        for (Book buk : books) {
            System.out.println("===");
            System.out.println("ID: " + buk.getID());
            System.out.println("Title: " + buk.getTitle());
            System.out.println("Author: " + buk.getAuthor());
            System.out.println("Category: " + buk.getCategory());
            System.out.println("===");
        }
    }
}
