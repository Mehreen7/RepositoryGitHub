package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.TypeProduit;

public interface TypeProduitRepository extends JpaRepository<TypeProduit, Long>{

}