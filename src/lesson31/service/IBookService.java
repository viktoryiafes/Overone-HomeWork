package lesson31.service;

import lesson31.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> readAll();

    List<Book> readByAuthor(String authorName);

    boolean addBook(Book book);

    void updateBook(Book bookToUpdate);

    void deleteBook(int idFromDelete);
}
