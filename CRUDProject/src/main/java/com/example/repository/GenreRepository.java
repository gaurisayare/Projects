package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
