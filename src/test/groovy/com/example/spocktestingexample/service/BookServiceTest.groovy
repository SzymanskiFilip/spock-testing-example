package com.example.spocktestingexample.service

import com.example.spocktestingexample.dto.BookDTO
import com.example.spocktestingexample.entity.Book
import com.example.spocktestingexample.repository.BookRepository
import spock.lang.Specification


class BookServiceTest extends Specification{

    def "The bookService.getAllBooks() return value isn't a null"() {
        given:
        def bookRepository = Stub(BookRepository)
        BookService bookService = new BookService(bookRepository)

        when: "When the method is called"
        def result = bookService.getAllBooks()

        then:
        result != null
    }

    def "The bookService.getAllBooks() invokes the bookRepository.findAll()"(){
        given:
        def bookRepository = Mock(BookRepository)
        BookService bookService = new BookService(bookRepository)

        when: "Service looks for all books"
        bookService.getAllBooks()

        then:
        1 * bookRepository.findAll() >> [new Book(), new Book()]
    }

    def "The getBookById should fire up findById once" () {
        given:
        def bookRepository = Mock(BookRepository)
        BookService bookService = new BookService(bookRepository)

        def expectedBook = new Book()
        expectedBook.id = UUID.randomUUID()
        expectedBook.title = "Title"
        expectedBook.author = "Dave"
        expectedBook.description = "Some Description"
        expectedBook.pages = 123
        bookRepository.save(_ as Book) >> expectedBook

        when: "method fires up"
        bookService.getBookByID(expectedBook.id)

        then:
        1 * bookRepository.findById(_ as UUID)
    }
}
