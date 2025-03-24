package com.library.service;

import com.library.exception.BookNotFoundException;
import com.library.model.Book;

import java.math.BigDecimal;
import java.util.List;

public interface IBookService 
{
    Book createBook(Book book);
    Book getBookById(Long id) throws BookNotFoundException;
    void updateBook(Book book, Long id) throws BookNotFoundException;
    List<Book> findBooksByTitle(String titlePart) throws BookNotFoundException;
    List<Book> findBooksByPriceRange(BigDecimal min, BigDecimal max) throws BookNotFoundException;
    List<Book> findBooksByAuthor(String author) throws BookNotFoundException;
    List<Book> getAllBooksSortedByPublicationDate();
    void deleteBook(Long id) throws BookNotFoundException;
}
