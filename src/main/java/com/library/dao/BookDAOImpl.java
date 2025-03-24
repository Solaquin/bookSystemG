package com.library.dao;

import com.library.model.Book;

import java.util.*;

/**
 * Implementación de IBookDAO que utiliza un HashMap como almacenamiento en memoria.
 */
public class BookDAOImpl implements IBookDAO
{
    private Map<Long, Book> bookStorage = new HashMap<>();

    @Override
    public Book save(Book book) 
    {
        return bookStorage.put(book.getId(), book);
    }

    @Override
    public void delete(Long id) 
    {
        bookStorage.remove(id);
    }

    @Override
    public void update(Book book) 
    {
        bookStorage.put(book.getId(), book);
    }

    @Override
    public List<Book> findAll() 
    {
        return new ArrayList<>(bookStorage.values());
    }

    @Override
    public Optional<Book> findById(Long id) 
    {
        return Optional.ofNullable(bookStorage.get(id));
    }

}
