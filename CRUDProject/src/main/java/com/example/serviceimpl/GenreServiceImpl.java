package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Genre;
import com.example.repository.GenreRepository;
import com.example.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

	@Override
	public List<Genre> getAllGenres() {
		// TODO Auto-generated method stub
		return genreRepository.findAll();
	}

	@Override
	public Optional<Genre> getGenreById(Long id) {
		// TODO Auto-generated method stub
		return genreRepository.findById(id);
	}

	@Override
	public Genre saveGenre(Genre genre) {
		return genreRepository.save(genre);
	}

	@Override
	public void deleteGenre(Long id) {
		// TODO Auto-generated method stub
		genreRepository.deleteById(id);
	}

    // Implement methods
}