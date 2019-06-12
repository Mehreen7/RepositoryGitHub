package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long>{

}
