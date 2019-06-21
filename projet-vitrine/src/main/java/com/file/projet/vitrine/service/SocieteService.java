package com.file.projet.vitrine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.projet.vitrine.modele.Societe;
import com.file.projet.vitrine.repository.SocieteRepository;

@Service
public class SocieteService {
	@Autowired
	private SocieteRepository repo;
	
	public List<Societe> findAll(){
		return repo.findAll();
	}
	
	public void saveSociete(Societe societe) {
		repo.save(societe);
	}
	
	public Societe get(Long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
