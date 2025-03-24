package com.library.dao;

import com.library.model.Book;

import java.util.List;
import java.util.Optional;

//Interfaz para definir las operaciones CRUD de libros en el sistema.

public interface IBookDAO
{
    /**
     * Guarda un libro en el almacenamiento.
     * @param book el libro a guardar.
     * @return el libro guardado.
     */
    Book save(Book book);

    /**
     * Actualiza un libro en el almacenamiento.
     * @param book el libro con los datos actualizados.
     */
    void update(Book book);

    /**
     * Busca un libro por su ID.
     * @param id el ID del libro.
     * @return un Optional que contiene el libro si se encuentra.
     */
    Optional<Book> findById(Long id);

    /**
     * Elimina un libro por su ID.
     * @param id el ID del libro a eliminar.
     */
    void delete(Long id);

    /**
     * Recupera todos los libros almacenados.
     * @return una lista de libros.
     */
    List<Book> findAll();
}
