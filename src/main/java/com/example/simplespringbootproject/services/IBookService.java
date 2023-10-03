package com.example.simplespringbootproject.services;

import com.example.simplespringbootproject.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBookService {

    List<Book> getAllBooks();
}
