package com.example.simplespringbootproject.controllers;


import com.example.simplespringbootproject.domain.Book;
import com.example.simplespringbootproject.services.IBookService;
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


    @RequestMapping(value = "/")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

}
