# Sistema de Gestión de Libros 📚

Este proyecto es un sistema de gestión de libros desarrollado con funciones de **Java 8** utilizando **Gradle**. Permite realizar operaciones CRUD sobre libros, realizar búsquedas avanzadas y manejar excepciones personalizadas.

---

## 📦 Instalación y Configuración

### 1️⃣ Clonar el repositorio
```sh
git clone https://github.com/Solaquin/bookSystemG.git
cd bookSystemG
```

### 2️⃣ Abrir el proyecto en un IDE o editor de código
Este proyecto es compatible con cualquier IDE o editor de código que soporte Java y Gradle. Para abrirlo en **IntelliJ IDEA**, **Eclipse** o **VS Code**, sigue los siguientes pasos:

- **IntelliJ IDEA**:
  1. Abrir **IntelliJ IDEA**.
  2. Seleccionar `File > Open` y elegir la carpeta del proyecto.
  3. IntelliJ detectará automáticamente el proyecto Gradle y sincronizará las dependencias.

- **Eclipse**:
  1. Abrir **Eclipse** y seleccionar `File > Import`.
  2. Elegir `Existing Gradle Project` y seleccionar la carpeta del proyecto.
  3. Eclipse sincronizará las dependencias automáticamente.

- **VS Code**:
  1. Abrir **VS Code** y seleccionar `File > Open Folder`.
  2. Asegurarse de tener instalada la extensión de Gradle para administrar dependencias.
  3. Ejecutar `./gradlew build` en la terminal integrada para compilar el proyecto.

### 3️⃣ Construir el proyecto
```sh
./gradlew build
```

---

## 🚀 Uso del Sistema

### Crear un libro
```java
BookServiceImpl bookService = new BookServiceImpl();
Book newBook = new Book(1L, "978-3-16-148410-0", "El Quijote", "Miguel de Cervantes", "Ficción", true, LocalDate.of(1605, 1, 1), new BigDecimal("29.99"));
bookService.createBook(newBook);
```

### Buscar un libro por ID
```java
Book book = bookService.getBookById(1L);
System.out.println(book);
```

### Eliminar un libro
```java
bookService.deleteBook(1L);
```

### Buscar libros por autor
```java
List<Book> booksByAuthor = bookService.findBooksByAuthor("Miguel de Cervantes");
```

### Buscar libros por precio
```java
List<Book> booksInRange = bookService.findBooksByPriceRange(new BigDecimal("10.00"), new BigDecimal("30.00"));
```

### Obtener libros ordenados por fecha de publicación
```java
List<Book> sortedBooks = bookService.getAllBooksSortedByPublicationDate();
```

---

## 🎯 Decisiones de Diseño

✅ **DAO en memoria:** Se utiliza un `HashMap` en `BookDAOImpl` como almacenamiento temporal para simplificar la implementación sin depender de una base de datos.

✅ **Uso de `Optional` en consultas:** `findById` devuelve `Optional<Book>` para evitar `NullPointerException` y manejar adecuadamente los casos donde un libro no existe.

✅ **Manejo de excepciones personalizadas:** Se define `BookNotFoundException` para capturar y manejar errores cuando un libro no es encontrado.

✅ **Separación de responsabilidades:** La arquitectura está organizada en **DAO**, **Service** y **Model**, facilitando el mantenimiento y escalabilidad del código.

---

### 📌 Notas finales
Este proyecto es un ejemplo de una arquitectura básica en capas y puede ser extendido para incluir almacenamiento en bases de datos, autenticación de usuarios y más funcionalidades avanzadas.
