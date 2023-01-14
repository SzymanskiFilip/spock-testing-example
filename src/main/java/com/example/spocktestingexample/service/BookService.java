package com.example.spocktestingexample.service;

import com.example.spocktestingexample.dto.BookDTO;
import com.example.spocktestingexample.entity.Book;
import com.example.spocktestingexample.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class BookService implements IBookService{

    private BookRepository bookRepository;

    @Override
    public Optional<Book> getBookByID(UUID id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(bookRepository.findAll().iterator(), Spliterator.ORDERED), false)
                .collect(Collectors.toList());
    }

    @Override
    public Book saveBook(BookDTO bookDTO) {
        Book book = new Book();
        book.setAuthor(bookDTO.getAuthor());
        book.setTitle(bookDTO.getTitle());
        book.setDescription(bookDTO.getDescription());
        book.setPages(bookDTO.getPages());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(UUID uuid) {
        bookRepository.deleteById(uuid);
    }
}
