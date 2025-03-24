package com.library;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.library.model.Book;
import com.library.service.BookServiceImpl;

public class Main
{
    public static void main(String[] args)
    {
        BookServiceImpl bookService = new BookServiceImpl();
        List<Book> booksListAux;
        Book bookAux;

        bookService.createBook(new Book(1L, "978-3-16-148410-0", "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", true, LocalDate.of(1954, 06, 29), new BigDecimal("29.99")));
        bookService.createBook(new Book(2L, "978-3-16-148410-1", "The Hobbit", "J.R.R. Tolkien", "Fantasy", true, LocalDate.parse("1937-09-21"), new BigDecimal("19.99")));
        bookService.createBook(new Book(3L, "978-3-16-148410-2", "The Silmarillion", "J.R.R. Tolkien", "Fantasy", true, LocalDate.parse("1977-09-15"), new BigDecimal("24.99")));
        bookService.createBook(new Book(4L, "978-3-16-148410-3", "The Great Gatsby", "F. Scott Fitzgerald", "Novel", true, LocalDate.parse("1925-04-10"), new BigDecimal("14.99")));
        bookService.createBook(new Book(5L, "978-3-16-148410-4", "To Kill a Mockingbird", "Harper Lee", "Novel", true, LocalDate.parse("1960-07-11"), new BigDecimal("12.99")));
        bookService.createBook(new Book(6L, "978-3-16-148410-5", "1984", "George Orwell", "Dystopian", true, LocalDate.parse("1949-06-08"), new BigDecimal("9.99")));
        bookService.createBook(new Book(7L, "978-3-16-148410-6", "Animal Farm", "George Orwell", "Dystopian", true, LocalDate.parse("1945-08-17"), new BigDecimal("7.99")));
        bookService.createBook(new Book(8L, "978-3-16-148410-0", "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", false, LocalDate.of(1954, 06, 29), new BigDecimal("29.99")));


        booksListAux = bookService.findBooksByAuthor("J.R.R. Tolkien");
        booksListAux.forEach(System.out::println);

        bookAux = bookService.getBookById(6L);
        System.out.println(bookAux);

        booksListAux = bookService.findBooksByTitle("");
        System.out.println(booksListAux);

        booksListAux.forEach(System.out::println);

        booksListAux = bookService.findBooksByPriceRange(new BigDecimal("2.99"), new BigDecimal("8.99"));
        System.out.println("By PRICE: " + booksListAux);

        booksListAux.forEach(System.out::println);

        booksListAux = bookService.getAllBooksSortedByPublicationDate();
        System.out.println("Ordered: " + booksListAux);

        booksListAux.forEach(System.out::println);




    }
}