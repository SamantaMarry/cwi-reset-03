package br.com.cwi.reset.samantamarry.repository;

import br.com.cwi.reset.samantamarry.model.Ator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AtorRepositoryBd extends CrudRepository<Ator, Integer> {

    Optional<Ator> findById(Integer id);
    List<Ator> findAll();
}
