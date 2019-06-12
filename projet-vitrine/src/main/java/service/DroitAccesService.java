package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.DroitAcces;
import repository.DroitAccesRepository;

@Service
public class DroitAccesService {
	
	@Autowired
	private DroitAccesRepository repo;

	public List<DroitAcces> listAll(){
		return repo.findAll();	
	}
	
	public void saveDroitAcces(DroitAcces droitAcces) {
		repo.save(droitAcces);
	}
	
	public DroitAcces get(Long id) {
		return repo.findById(id).get();
		}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
