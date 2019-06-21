package com.file.projet.vitrine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.projet.vitrine.modele.Evenement;
import com.file.projet.vitrine.repository.EvenementRepository;


@Service
public class EvenementService {
	
	@Autowired
	private EvenementRepository repo;
	
	public List<Evenement> findAll(){
		return repo.findAll();
	}
	
	public void saveEvenement (Evenement evenement) {
		repo.save(evenement);
	}
	
	public Evenement get(Long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}

}
