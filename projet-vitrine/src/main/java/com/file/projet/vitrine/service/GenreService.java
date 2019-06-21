package com.file.projet.vitrine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.projet.vitrine.modele.Genre;
import com.file.projet.vitrine.repository.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository repo;
	
	public List<Genre> findAll(){
		return repo.findAll();
	}
	
	public void saveGenre(Genre genre) {
		repo.save(genre);
	}
	
	public Genre get(Long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
