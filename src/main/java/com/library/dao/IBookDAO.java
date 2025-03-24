package com.library.dao;

import com.library.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookDAO
{
    Book save(Book book);
    void update(Book book);
    Optional<Book> findById(Long id);
    void delete(Long id);
    List<Book> findAll();
    // Otros métodos necesarios
}
