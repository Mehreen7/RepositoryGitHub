package com.file.projet.vitrine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.projet.vitrine.modele.Categorie;
import com.file.projet.vitrine.repository.CategorieRepository;

	@Service
	public class CategorieService {

	@Autowired
	private CategorieRepository repo;
	
	public List<Categorie> findAll(){
		return repo.findAll();
	}
	
	public void saveCategorie(Categorie categorie) {
		repo.save(categorie);
	}
	
	public Categorie get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
