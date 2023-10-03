package com.example.simplespringbootproject.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Book {
    private int id;
    private String title;
    private String isbn;
    private String author;
    private LocalDate publishedDate;

}
