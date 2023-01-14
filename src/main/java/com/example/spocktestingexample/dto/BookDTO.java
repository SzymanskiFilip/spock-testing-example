package com.example.spocktestingexample.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookDTO {
    private String title;
    private String author;
    private String description;
    private int pages;
}
