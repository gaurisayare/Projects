package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Author;

public interface AuthorService {
    List<Author> getAllAuthors();
    Optional<Author>getAuthorById(Long id);
    Author saveAuthor(Author author);
    void deleteAuthor(Long id);
}
