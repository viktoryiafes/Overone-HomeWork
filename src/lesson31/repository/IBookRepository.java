package lesson31.repository;

import lesson31.entity.Book;

import java.util.List;

public interface IBookRepository {
    List<Book> readAll();

    List<Book> readByAuthor(String authorName);

    boolean addBook(Book book);

    void updateBook(Book bookToUpdate);

    void deleteBook(int idBookDelete);
}
