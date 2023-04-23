package com.Narainox.DemoApplication.Repository;

import com.Narainox.DemoApplication.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class booksDb {
    ArrayList<Book> books = new ArrayList<>();

    public String saveBook(Book book) {
        for (Book bookd : books) {
            if (bookd.getId() == book.getId()) {
                return "Not able to Store book";
            }
        }
        books.add(book);
        return "Able to Store the book.";
    }

    public List<Book> findBook() {
        List<Book> lb = new ArrayList<>();
        for (Book b : books) {
            lb.add(b);
        }
        return lb;
    }

    public Book findBookById(long id) {
        Book newBook = new Book();
        for (Book b : books) {
            if (b.getId() == id) {
                newBook = b;
            }
        }
        return newBook;
    }

    public String deleteBook(long id) {
        for (Book bookd : books) {
            if (bookd.getId()==id) {
                books.remove(bookd);
                return "Book is Deleted.";
            }
        }
        return "Book Not found!";
    }

    public String updateBook(long id, Book book) {
        for (Book bookd : books) {
            if (bookd.getId()==id) {
               bookd.setAuthorName(book.getAuthorName());
               bookd.setCost(book.getCost());
               return "Book is Updated SuccessFully.";
            }
        }
        return "Book Not found!";
    }
}
