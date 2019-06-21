package com.file.projet.vitrine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.projet.vitrine.modele.Avis;
import com.file.projet.vitrine.repository.AvisRepository;



@Service
public class AvisService {
	
	@Autowired
	private AvisRepository repo;
	
	public List<Avis> findAll(){
		return repo.findAll();
	}
	
	public void saveAvis(Avis avis) {
		repo.save(avis);
	}
	
	public Avis get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
