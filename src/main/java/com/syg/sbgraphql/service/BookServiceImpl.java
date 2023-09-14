package com.syg.sbgraphql.service;

import com.syg.sbgraphql.entity.Book;
import com.syg.sbgraphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book createBook(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book getBookById(int bookId) {
        return this.bookRepository.findById(bookId)
                .orElseThrow(()-> new RuntimeException("Book not found"));
    }
}
