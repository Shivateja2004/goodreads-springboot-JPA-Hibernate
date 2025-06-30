package com.example.goodreads.repository;

import com.example.goodreads.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorJpaRepository extends JpaRepository<Author,Integer> {
}