package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Genre;
import repository.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository repo;
	
	public List<Genre> listAll(){
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
