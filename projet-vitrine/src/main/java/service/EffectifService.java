package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Effectif;
import repository.EffectifRepository;

@Service
public class EffectifService {
	
	@Autowired
	private EffectifRepository repo;
	
	public List<Effectif> listAll(){
		return repo.findAll();
	}

	public void saveEffectif(Effectif effectif) {
		repo.save(effectif);
	}
	
	public Effectif get(Long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}

}
