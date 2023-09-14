package com.syg.sbgraphql.controller;

import com.syg.sbgraphql.entity.Book;
import com.syg.sbgraphql.service.BookService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*@RestController
@RequestMapping("book")*/
@Controller
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    //@GetMapping("all")
    @QueryMapping("allBooks")
    public List<Book> getAllBooks(){
        return this.bookService.getAllBooks();
    }

    //@PostMapping
    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setPrice(book.getPrice());
        b.setDescription(book.getDescription());
        b.setPages(book.getPages());
        b.setAuthor(book.getAuthor());
        return this.bookService.createBook(b);
    }

    //@GetMapping("{id}")
    @QueryMapping("getBook")
    public Book getBookById(@Argument int bookId){
        return this.bookService.getBookById(bookId);
    }
}

@Data
class BookInput{
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;
}