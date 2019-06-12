package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.TypeProduit;
import repository.TypeProduitRepository;

@Service
public class TypeProduitService {
	
	@Autowired
	private TypeProduitRepository repo;
	
	public List<TypeProduit> listAll(){
		return repo.findAll();	
		}
	
	public void saveTypeProduit(TypeProduit typeProduit) {
		repo.save(typeProduit);
	}
	
	public TypeProduit get(Long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
