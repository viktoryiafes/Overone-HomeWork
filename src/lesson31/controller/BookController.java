package lesson31.controller;

import lesson31.entity.Book;
import lesson31.exception.BookNotFoundException;
import lesson31.service.IBookService;
import lesson31.service.impl.BookService;

import java.util.List;
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
            System.out.println("3. Add book");
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
                    addBook();
                    break;
                case 4:
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
        
        System.out.println("1. Update book");
        System.out.println("2. Delete book");
        System.out.println("3. Exit");
        boolean flag = true;
        int OptionId = new Scanner(System.in).nextInt();
        while (flag) {
            switch (OptionId) {
                case 1:
                    System.out.println("Select updated book by ID: ");
                    int idBookUpdate = new Scanner(System.in).nextInt();
                    for (Book bookRead : books) {
                        if (idBookUpdate == bookRead.getId()) {
                            updateBook(bookRead);
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

    public void addBook() {
        System.out.println("Please enter title: ");
        String title = new Scanner(System.in).nextLine();
        System.out.println("Please enter author: ");
        String author = new Scanner(System.in).nextLine();
        System.out.println("Please enter quantity: ");
        Long quantity = new Scanner(System.in).nextLong();
        try{
           // bookService.addBook(title,author,quantity);
        } catch (BookNotFoundException exception){
            System.err.println(exception.getMessage());
        }
    }

    public void updateBook(Book bookUpdate) {
        System.out.println("1. Update title");
        System.out.println("2. Update author");
        System.out.println("3. Update quantity");
        System.out.println("4. Main menu");
        boolean flag = true;
        int OptionId = new Scanner(System.in).nextInt();
        while (flag) {
            switch (OptionId) {
                case 1:
                    System.out.print("Are you want to edit title?"+"\n");
                    bookUpdate.setTitle(new Scanner(System.in).nextLine());
                    bookService.updateBook(bookUpdate);
                    break;
                case 2:
                    System.out.print("Are you want to edit author?"+"\n");
                    bookUpdate.setAuthor(new Scanner(System.in).nextLine());
                    bookService.updateBook(bookUpdate);
                    break;
                case 3:
                    System.out.print("Are you want to edit quantity?"+"\n");
                    bookUpdate.setQuantity(new Scanner(System.in).nextLong());
                    bookService.updateBook(bookUpdate);
                    break;
                case 4:
                    mainMenu();
                    break;
                default:
                    flag = false;
                    System.err.println("Something went wrong ..");
            }
        }
    }

    public void deleteBook(int bookId) {
        int idBookDelete = new Scanner(System.in).nextInt();
        try {
            bookService.deleteBook(idBookDelete);
        } catch (BookNotFoundException exception) {
            System.err.println(exception.getMessage());
        }
    }

    public void readByAuthor() {
        System.out.println("Write author: ");
        String authorName = new Scanner(System.in).nextLine();
        List<Book> books = null;
        try {
            books = bookService.readByAuthor(authorName);
        } catch (BookNotFoundException exception) {
            System.err.println(exception.getMessage());
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
