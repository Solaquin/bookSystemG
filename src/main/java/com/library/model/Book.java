package com.library.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Book
{
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String category;
    private boolean available;
    private LocalDate publicationDate;
    private BigDecimal price;

    public Book() 
    {
        
    }

    public Book(Long id, String isbn, String title, String author, String category, boolean available, LocalDate publicationDate, BigDecimal price) 
    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.available = available;
        this.publicationDate = publicationDate;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /*public void printInfo()
    {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Available: " + available);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Price: " + price);
    }*/

    @Override
    public String toString() 
    {
        return "Book [id= "+ id + ", author=" + author + ", available=" + available + ", category=" + category + ", isbn=" + isbn
                + ", price=" + price + ", publicationDate=" + publicationDate + ", title=" + title + "]";
    }


}
