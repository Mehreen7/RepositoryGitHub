package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Adresse;
import repository.AdresseRepository;

@Service
public class AdresseService {
	
	@Autowired
	private AdresseRepository repo;

	public List<Adresse> listAll(){
		return repo.findAll();
	}
	
	public void saveAdresse(Adresse adresse) {
		repo.save(adresse);
	}
	
	public Adresse get(Long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
