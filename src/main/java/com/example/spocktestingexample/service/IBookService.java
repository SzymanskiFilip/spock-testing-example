package com.example.spocktestingexample.service;

import com.example.spocktestingexample.dto.BookDTO;
import com.example.spocktestingexample.entity.Book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IBookService {
    Optional<Book> getBookByID(UUID id);
    List<Book> getAllBooks();
    Book saveBook(BookDTO bookDTO);
    void deleteBook(UUID uuid);
}
