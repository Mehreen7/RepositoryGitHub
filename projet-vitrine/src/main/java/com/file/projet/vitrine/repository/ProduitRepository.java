package com.file.projet.vitrine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.file.projet.vitrine.modele.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
