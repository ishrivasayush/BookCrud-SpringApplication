package com.Narainox.DemoApplication.Controller;

import com.Narainox.DemoApplication.Model.Book;
import com.Narainox.DemoApplication.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BooksService booksService;

    @PostMapping("/insertBook")
    public String insertBook(@RequestBody Book book) {
        return booksService.insertBook(book);
    }

    @GetMapping("/getBook")
    public List<Book> getBook() {
        return booksService.bookList();
    }

    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable long id) {
        return booksService.getBookById(id);
    }

    @DeleteMapping("/deleteBookById/{id}")
    public String deleteBookById(@PathVariable long id) {
        return booksService.deleteBookById(id);
    }

    @PutMapping("/updateBookById/{id}")
    public String updateBook(@RequestBody Book book,@PathVariable long id)
    {
        return booksService.updateBookById(id,book);
    }
}

