package com.livingletters.bookapi.service;

import com.livingletters.bookapi.model.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book createBook(Book book);
    List<Book> findBooksByTitle(String title);
    void deleteBook(Long id);
    Book updateBook(Long id, Book updatedBook);
}
