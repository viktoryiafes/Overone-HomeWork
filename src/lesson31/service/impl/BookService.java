package lesson31.service.impl;

import lesson31.entity.Book;
import lesson31.exception.BookNotFoundException;
import lesson31.repository.IBookRepository;
import lesson31.repository.impl.BookRepository;
import lesson31.service.IBookService;

import java.util.List;

public class BookService implements IBookService {

    private static final IBookRepository bookRepository = new BookRepository();

    @Override
    public List<Book> readAll() {
        return bookRepository.readAll();
    }

    @Override
    public List<Book> readByAuthor(String authorName) {
        List<Book> books = bookRepository.readByAuthor(authorName);
        if (books.size() == 0) {
            throw new BookNotFoundException("Invalid author");
        }
        return books;
    }
}
