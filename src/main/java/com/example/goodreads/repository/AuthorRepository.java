package com.example.goodreads.repository;

import com.example.goodreads.model.Author;

import java.util.ArrayList;

public interface AuthorRepository {
    ArrayList<Author> getAuthors();

    Author getAuthorById(int authorId);

    Author addAuthor(Author author);

    Author updateAuthor(int authorId, Author author);

    void deleteAuthor(int authorId);
}
