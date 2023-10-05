package com.example.simplespringbootproject.controllers.api;


import com.example.simplespringbootproject.domain.Book;
import com.example.simplespringbootproject.services.BookService;
import com.example.simplespringbootproject.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private IBookService bookService;

    public BookController(IBookService bookService){
        this.bookService = bookService;
    }

//    @Autowired
//    public void setBookService(IBookService bookService){
//        this.bookService = bookService;
//    }

    @GetMapping (value = "/")
    public List<Book> getAllBooks(){
//        IBookService b = new BookService();
//        setBookService(b);
        return bookService.getAllBooks();
    }

}
