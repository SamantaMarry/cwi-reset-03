package br.com.cwi.reset.samantamarry.repository;

import br.com.cwi.reset.samantamarry.model.Ator;
import br.com.cwi.reset.samantamarry.model.StatusCarreira;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AtorRepositoryBd extends CrudRepository<Ator, Integer> {
    Ator findByNome(String nome);
    List<Ator> findAll();

    List<Ator> findByStatusCarreira(StatusCarreira status);
}
