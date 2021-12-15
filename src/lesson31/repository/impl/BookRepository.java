package lesson31.repository.impl;

import lesson31.entity.Book;
import lesson31.repository.IBookRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    String driverSQL = "com.mysql.cj.jdbc.Driver";
    @Override
    public List<Book> readAll() {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName(driverSQL);
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/book",
                            "root", "65456545");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM book.book_list");
            while (resultSet.next()) {
                Long bookId = Long.valueOf(resultSet.getString(1));
                String title = resultSet.getString(2);
                String author = resultSet.getString(3);
                Long quantity = Long.valueOf(resultSet.getString(4));
                books.add(new Book(bookId, title, author, quantity));
            }
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public boolean addBook(Book bookToAdd) {
        try {
            Class.forName(driverSQL);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book",
                    "root", "65456545");

            String sqlString = "INSERT INTO book.book_list (id, title, author, quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement =
                    connection.prepareStatement(sqlString);
            preparedStatement.setInt(1, bookToAdd.getId().intValue());
            preparedStatement.setString(2, bookToAdd.getTitle());
            preparedStatement.setString(3, bookToAdd.getAuthor());
            preparedStatement.setInt(4, bookToAdd.getQuantity().intValue());
            preparedStatement.execute();
            connection.close();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Book> readByAuthor(String authorName) {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName(driverSQL);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book",
                    "root", "65456545");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM book.book_list WHERE author = ?");
            preparedStatement.setString(1, authorName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Long bookId = Long.valueOf(resultSet.getString(1));
                String title = resultSet.getString(2);
                String author = resultSet.getString(3);
                Long quantity = Long.valueOf(resultSet.getString(4));
                books.add(new Book(bookId, title, author, quantity));
            }
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public void updateBook(Book bookToUpdate) {
        try {
            Class.forName(driverSQL);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book",
                    "root", "65456545");

            String sqlString = "UPDATE book.book_list SET title = ?, author = ?, quantity = ? ";
            PreparedStatement preparedStatement =
                    connection.prepareStatement(sqlString);
            preparedStatement.setString(1, bookToUpdate.getTitle());
            preparedStatement.setString(2, bookToUpdate.getAuthor());
            preparedStatement.setInt(3, bookToUpdate.getQuantity().intValue());
            preparedStatement.setInt(4, bookToUpdate.getId().intValue());
            preparedStatement.execute();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBook(int idFromDelete) {
        try {
            Class.forName(driverSQL);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book",
                    "root", "65456545");

            String sqlString = "DELETE FROM book.book_list WHERE id=?";
            PreparedStatement preparedStatement =
                    connection.prepareStatement(sqlString);
            preparedStatement.setInt(1, idFromDelete);
            preparedStatement.execute();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
