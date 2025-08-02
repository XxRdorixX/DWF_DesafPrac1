# Book API - Living Letters

A RESTful web service built with Spring Boot to manage books for the fictional publishing house **"Letras Vivas"**.  
This API allows clients to perform basic operations such as listing, adding, searching, and deleting books.  
The project follows a layered architecture and professional coding practices.

---

## Features

- Retrieve all books
- Add a new book
- Search books by title
- Delete a book by its ID

---

## Technologies Used

- Java Zulu 17
- Spring Boot 
- Lombok
- Spring Data JPA
- H2 in-memory database
- Maven

---

## Project Structure

- `model` – Book entity class
- `repository` – Interface extending JpaRepository
- `service` – Business logic (interface + implementation)
- `controller` – REST endpoints
- `resources` – Contains configuration files like `application.properties`

---

## How to Run the Project

1. Download or clone the repository from GitHub:
   ```
   git clone https://github.com/your-username/book-api.git
   ```
2. Open the project using **IntelliJ IDEA**.
3. Make sure you have Java 17 (Zulu) installed.
4. Build the project using Maven:
   ```
   mvn clean install
   ```
5. Run the application by executing the `BookApiApplication.java` file.
6. Once the application is running, you can access the endpoints:
   - API Base URL: `http://localhost:8081/api/books`
   - H2 Console : `http://localhost:8081/h2-console`
     or
   - Postman: Create a folder named BOOK. Inside, we'll create several 
   requests of type:
   List
   GET http://localhost:8081/api/books

   Create
   POST http://localhost:8081/api/books -> Body -> raw -> JSON ->
   {
    "title": "'BOOK_TITLE'",
    "author": "'AUTHOR_NAME'",
    "publicationYear": 'YEAR'
   }

   Search
   GET http://localhost:8081/api/books/search?title='Book_Name'

   Delete
   DELETE http://localhost:8081/api/books/'Book_ID'

   Modify
   PUT http://localhost:8081/api/books/'Book_ID' -> Body -> raw -> JSON ->
   {
    "title": "'BOOK_TITLE'",
    "author": "'AUTHOR_NAME'",
    "publicationYear": 'YEAR'
   }

---
