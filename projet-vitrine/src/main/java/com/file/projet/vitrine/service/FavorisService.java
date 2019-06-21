package com.file.projet.vitrine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.projet.vitrine.modele.Favoris;
import com.file.projet.vitrine.repository.FavorisRepository;


@Service
public class FavorisService {

	
	@Autowired
	private FavorisRepository repo;
	
	public List<Favoris> findAll(){
		return repo.findAll();
	}
	
	public void saveFavoris(Favoris favoris) {
		repo.save(favoris);
	}
	
	public Favoris get(Long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
