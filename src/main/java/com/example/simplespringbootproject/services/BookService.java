package com.example.simplespringbootproject.services;

import com.example.simplespringbootproject.domain.Book;
import com.example.simplespringbootproject.repositories.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService implements IBookService {


    @Override
    public List<Book> getAllBooks() {
        return BookRepo.getBooks();
    }
}
