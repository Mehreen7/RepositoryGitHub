package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
