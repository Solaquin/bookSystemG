package com.library.service;

import com.library.dao.BookDAOImpl;
import com.library.exception.BookNotFoundException;
import com.library.model.Book;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookServiceImpl implements IBookService
{
    private final BookDAOImpl bookDAO = new BookDAOImpl();

    @Override
    public Book createBook(Book book)
    {
        bookDAO.save(book);
        return book;
    }

    @Override
    public Book getBookById(Long id) throws BookNotFoundException
    {
        return bookDAO.findById(id).orElseThrow(() -> new BookNotFoundException("Book with ID " + id + " not found"));
    }

    @Override
    public void deleteBook(Long id) throws BookNotFoundException
    {
        bookDAO.findById(id).orElseThrow(() -> new BookNotFoundException("Book with ID " + id + " not found"));
        bookDAO.delete(id);
    }

    @Override
    public List<Book> findBooksByAuthor(String author) throws BookNotFoundException
    {
        List<Book> books = bookDAO.findAll().stream()
                            .filter(book -> book.getAuthor().equals(author))
                            .collect(Collectors.toList());

        if (books.isEmpty())
        {
            throw new BookNotFoundException("Books by author " + author + " not found");
        }

        return books;
    }

    @Override
    public void updateBook(Book book, Long id) throws BookNotFoundException 
    {
        bookDAO.findById(id).orElseThrow(() -> new BookNotFoundException("Book with ID " + id + " not found"));
        bookDAO.update(book);
    }

    @Override
    public List<Book> findBooksByPriceRange(BigDecimal min, BigDecimal max) throws BookNotFoundException
    {
        
        List<Book> books = bookDAO.findAll().stream()
                            .filter(book -> book.getPrice().compareTo(min) >= 0 && book.getPrice().compareTo(max) <= 0)
                            .collect(Collectors.toList());

        if (books.isEmpty())
        {
            throw new BookNotFoundException("Books with price between " + min + " and " + max + " not found");
        }

        return books;
    }

    @Override
    public List<Book> findBooksByTitle(String titlePart) throws BookNotFoundException
    {
        
        List<Book> books = bookDAO.findAll().stream()
                            .filter(book -> book.getTitle().toLowerCase().contains(titlePart.toLowerCase()))
                            .collect(Collectors.toList());

        if (books.isEmpty())
        {
            throw new BookNotFoundException("Books with title containing " + titlePart + " not found");
        }

        return books;
    }

    @Override
    public List<Book> getAllBooksSortedByPublicationDate() 
    {
        
        List<Book> books = bookDAO.findAll().stream()
                            .sorted(Comparator.comparing(Book::getPublicationDate))
                            .collect(Collectors.toList());

        return books;
    }

    
}
