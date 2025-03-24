package com.library.exception;

import com.library.model.Book;

public class BookNotFoundException extends RuntimeException
{
    public BookNotFoundException(Book book) 
    {
        super("Book not found: " + book);
    }

    public BookNotFoundException(String message) 
    {
        super(message);
    }
    
}
