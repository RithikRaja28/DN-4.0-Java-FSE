package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
    private String ServiceName;
    private BookRepository bookRepository;

    public BookService(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook(){
        System.out.println("------------------Constructor Injection------------------");
        System.out.println("Service: " + ServiceName);
        System.out.println("------------------- Setter Injection -------------------");
        System.out.println("Fetching books from repository:");
        bookRepository.getBooks();
    }
}
