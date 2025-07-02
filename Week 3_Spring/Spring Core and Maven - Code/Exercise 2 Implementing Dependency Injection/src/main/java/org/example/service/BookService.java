package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String name) {
        System.out.println("Adding book: " + name);
        bookRepository.saveBook(name);
    }
}

