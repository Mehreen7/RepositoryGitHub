package com.file.projet.vitrine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.projet.vitrine.modele.TypeEvenement;
import com.file.projet.vitrine.repository.TypeEvenementRepository;

@Service
public class TypeEvenementService {
	@Autowired
	private TypeEvenementRepository repo;
	
	public List<TypeEvenement>findAll(){
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
