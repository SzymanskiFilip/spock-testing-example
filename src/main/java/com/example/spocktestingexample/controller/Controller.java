package com.example.spocktestingexample.controller;

import com.example.spocktestingexample.dto.BookDTO;
import com.example.spocktestingexample.entity.Book;
import com.example.spocktestingexample.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class Controller {

    private BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }
    @GetMapping("/book/{id}")
    public ResponseEntity<?> getBookBy(@PathVariable(name = "id") UUID id){
        return ResponseEntity.ok(bookService.getBookByID(id).get());
    }
    @PostMapping("/books")
    public ResponseEntity<Book> postBook(@RequestBody BookDTO book){
        Book created = bookService.saveBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
    @DeleteMapping("/books/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(name = "id") UUID id){
        bookService.deleteBook(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
