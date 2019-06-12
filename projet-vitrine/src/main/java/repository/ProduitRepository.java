package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
