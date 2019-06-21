package com.file.projet.vitrine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.projet.vitrine.modele.TypeProduit;
import com.file.projet.vitrine.repository.TypeProduitRepository;


@Service
public class TypeProduitService {
	
	@Autowired
	private TypeProduitRepository repo;
	
	public List<TypeProduit> findAll(){
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
