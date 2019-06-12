package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.TypeEvenement;
import repository.TypeEvenementRepository;

@Service
public class TypeEvenementService {
	@Autowired
	private TypeEvenementRepository repo;
	
	public List<TypeEvenement>listAll(){
		return repo.findAll();
	}
	
	public void saveTypeEvenement(TypeEvenement typeEvenement) {
		repo.save(typeEvenement);
	}
	
	public TypeEvenement get(Long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	

}
