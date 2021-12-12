package by.overone.lesson31.entity;

import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private String author;
    private Long quantity;

    public Book(Long id, String title, String author, Long quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(quantity, book.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, quantity);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
