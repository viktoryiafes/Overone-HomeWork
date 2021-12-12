package lesson31.repository.impl;

import lesson31.entity.Book;
import lesson31.repository.IBookRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    @Override
    public List<Book> readAll() {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/learningwords",
                            "postgres", "12345");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM learningwords_sys.books");
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
    public List<Book> readByAuthor(String authorName) {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/learningwords",
                    "postgres", "12345");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM learningwords_sys.books WHERE author = ?");
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
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/learningwords",
                    "postgres", "12345");

            String sqlString = "UPDATE book_schema.books SET title = ?, author = ?, quantity = ? WHERE id = ?";
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
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/learningwords",
                    "postgres", "12345");

            String sqlString = "DELETE FROM book_schema.books WHERE id=?";
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
