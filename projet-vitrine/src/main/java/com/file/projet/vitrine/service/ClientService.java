package com.file.projet.vitrine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.projet.vitrine.modele.Client;
import com.file.projet.vitrine.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repo;
	
	public List<Client> findAll(){
		return repo.findAll();
	}
	
	public void saveClient (Client client) {
		repo.save(client);
	}
	
	public Client get(Long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
