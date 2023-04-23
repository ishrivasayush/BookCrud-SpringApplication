package com.Narainox.DemoApplication.Service;

import com.Narainox.DemoApplication.Model.Book;
import com.Narainox.DemoApplication.Repository.booksDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    booksDb  booksDb;
    public String insertBook(Book book)
    {
        return booksDb.saveBook(book);
    }

    public List<Book> bookList()
    {
        return booksDb.findBook();
    }

    public Book getBookById(long id) {
        return booksDb.findBookById(id);
    }

    public String updateBookById(long id,Book book) {
        return booksDb.updateBook(id,book);
    }

    public String deleteBookById(long id) {
        return booksDb.deleteBook(id);
    }
}
