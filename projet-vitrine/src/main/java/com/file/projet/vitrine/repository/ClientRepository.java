package com.file.projet.vitrine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.file.projet.vitrine.modele.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
