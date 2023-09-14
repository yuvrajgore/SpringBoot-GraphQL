package com.syg.sbgraphql.service;

import com.syg.sbgraphql.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
public interface BookService {

    Book createBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(int bookId);
}
