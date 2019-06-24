package com.file.projet.vitrine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.file.projet.vitrine.modele.Effectif;

public interface EffectifRepository extends JpaRepository<Effectif, Long>{

	public Effectif findByUserName(String effMail);
}
