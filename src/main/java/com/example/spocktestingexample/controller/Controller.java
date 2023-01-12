package com.example.spocktestingexample.controller;

import com.example.spocktestingexample.entity.Book;
import com.example.spocktestingexample.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class Controller {

    private BookService bookService;

    @RequestMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }
    @RequestMapping("/book/{id}")
    public ResponseEntity<?> getBookBy(@PathVariable(name = "id") UUID id){
        return ResponseEntity.ok(bookService.getBookByID(id).get());
    }
}
