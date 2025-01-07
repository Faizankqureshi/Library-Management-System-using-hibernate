package BOOKDAO.java;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titel;
    private String author;
    private String isbn;
    public   boolean avilable;
    private boolean available;

    // Constructor
    public Book() {}

    // Getters and Setters
    public String getTitle() {
        String title = null;
        return title;
    }

    public void setTitle(String title) {
        this.titel = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        boolean available = false;
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}