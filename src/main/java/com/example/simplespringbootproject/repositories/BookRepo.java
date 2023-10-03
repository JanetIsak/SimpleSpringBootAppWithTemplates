package com.example.simplespringbootproject.repositories;

import com.example.simplespringbootproject.domain.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRepo {
    static List<Book> books;

    static{
        books = new ArrayList<>();
        books.add(
                Book.builder()
                        .id(1)
                        .title("The Great Gatsby")
                        .isbn("SS12345")
                        .author("F. Scott Fitzgerald")
                        .publishedDate(LocalDate.of(1925, 11, 3))
                        .build()

        );

        books.add(
                Book.builder()
                        .id(2)
                        .title("The Grapes of Wrath")
                        .isbn("SS13456")
                        .author("John Steinbeck")
                        .publishedDate(LocalDate.of(1939, 1, 19))
                        .build()

        );

        books.add(
                Book.builder()
                        .id(3)
                        .title("Ulysses")
                        .isbn("SS09876")
                        .author("James Joyce")
                        .publishedDate(LocalDate.of(1918, 2, 28))
                        .build()

        );

        books.add(
                Book.builder()
                        .id(2)
                        .title("Beloved")
                        .isbn("SS56789")
                        .author("Toni Morrison")
                        .publishedDate(LocalDate.of(1987, 3, 21))
                        .build()

        );
    }

    public static List<Book> getBooks(){
        return books;
    }
}
