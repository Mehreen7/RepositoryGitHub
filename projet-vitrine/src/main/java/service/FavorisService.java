package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Favoris;
import repository.FavorisRepository;

@Service
public class FavorisService {

	
	@Autowired
	private FavorisRepository repo;
	
	public List<Favoris> listAl(){
		return repo.findAll();
	}
	
	public void saveFavoris(Favoris favoris) {
		repo.save(favoris);
	}
	
	public Favoris get(Long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
