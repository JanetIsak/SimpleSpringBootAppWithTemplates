package com.example.simplespringbootproject.controllers;


import com.example.simplespringbootproject.domain.Book;
import com.example.simplespringbootproject.services.IBookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/books")
public class HomeController {

    private IBookService bookService;

    @GetMapping(value = "/book-list")
    public String getBookList(Model model){
        model.addAttribute("listOfBooks", bookService.getAllBooks());
        return "books/list";
    }

    @GetMapping(value = "/{id}")
    public String getBookById(@PathVariable(name = "id") int id, Model model){
        model.addAttribute("Book", bookService.getBookById(id));
        return "books/singleBook";
    }

    @GetMapping(value = "/search")
    public String search(@RequestParam String title, Model model){
        System.out.println("title is " + title);
        model.addAttribute("books", bookService.search(title));
        return "books/search";
    }






}
