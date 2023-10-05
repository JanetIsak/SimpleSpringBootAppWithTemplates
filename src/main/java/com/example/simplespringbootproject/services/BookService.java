package com.example.simplespringbootproject.services;

import com.example.simplespringbootproject.domain.Book;
import com.example.simplespringbootproject.repositories.BookRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookService implements IBookService {


    @Override
    public List<Book> getAllBooks() {
        return BookRepo.getBooks();
    }

    @Override
    public Book getBookById(int id) {
        for(Book b: BookRepo.getBooks()){
            if(id == b.getId()){
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Book> search(String title) {
        List<Book> books = new ArrayList<>();
        for(Book b: BookRepo.getBooks()){
            if(b.getTitle().contains(title)){
                 books.add(b);
            }
        }
        return books;
    }


}
