package lesson31.controller;

import lesson31.entity.Book;
import lesson31.exception.BookNotFoundException;
import lesson31.service.IBookService;
import lesson31.service.impl.BookService;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BookController {

    private static final IBookService bookService = new BookService();

    public void mainMenu() {
        System.out.println("Hello my dear friend!\n");
        boolean flag = true;

        while (flag) {
            System.out.println("Select one of the following option:\n");
            System.out.println("1. Get all books");
            System.out.println("2. Get book by author");
            System.out.println("3. Add book"); // TODO
            System.out.println("4. Exit");
            int result = new Scanner(System.in).nextInt();
            switch (result) {
                case 1:
                    readAll();
                    break;
                case 2:
                    readByAuthor();
                    break;
                case 3:
                    System.out.println("Bye-bye my dear friend");
                    flag = false;
                    break;
                default:
                    System.err.println("Something went wrong ..");
            }
        }
    }

    public void readAll() {
        List<Book> books = bookService.readAll();
        viewBooks(books);
        System.out.println("Select one of the following book:");
        
        System.out.println("1. Update book");
        System.out.println("2. Delete book");
        System.out.println("3. Exit");
        boolean flag = true;
        int bookId = new Scanner(System.in).nextInt();
        while (flag) {
            switch (bookId) {
                case 1:
                    System.out.println("Select updated book by ID: ");
                    int idBookUpdate = new Scanner(System.in).nextInt();
                    for (Book book : books) {
                        if (idBookUpdate == book.getId()) {
                            updateBook(book);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Select deleted book by ID: ");
                    int idBookDelete = new Scanner(System.in).nextInt();
                    deleteBook(idBookDelete);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    flag = false;
                    System.err.println("Something went wrong ..");
            }
        }
    }

    public void updateBook(Book book) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a book to edit");
        System.out.print("Are you want to edit title? (1 or 2)");
        char choice = scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0);
        if (choice == '1') {
            book.setTitle(scanner.nextLine());
        }else {
            mainMenu();
        }

        System.out.print("Are you want to edit author? (1 or 2)");
        choice = scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0);
        if (choice == '1') {
            book.setAuthor(scanner.nextLine());
        }else {
            mainMenu();
        }

        System.out.print("Are you want to edit author? (1 or 2)");
        choice = scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0);
        if (choice == '1') {
            book.setQuantity(scanner.nextLong());
        }else{
            mainMenu();
        }
        bookService.updateBook(book);
    }

    public void deleteBook(int bookId) {
        bookService.deleteBook(bookId);
    }

    public void readByAuthor() {
        System.out.println("Write author: ");
        String authorName = new Scanner(System.in).nextLine();
        List<Book> books = null;
        try {
            books = bookService.readByAuthor(authorName);
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
        viewBooks(books);
    }

    private void viewBooks(List<Book> books) {
        if (books != null) {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + ". " + book);
                counter++;
            }
        }
    }
}
