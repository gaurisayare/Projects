package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Genre;

public interface GenreService {
    List<Genre> getAllGenres();
    Optional<Genre> getGenreById(Long id);
    Genre saveGenre(Genre genre);
    void deleteGenre(Long id);
}