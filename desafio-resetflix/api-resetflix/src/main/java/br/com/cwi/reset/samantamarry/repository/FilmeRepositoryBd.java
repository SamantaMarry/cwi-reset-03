package br.com.cwi.reset.samantamarry.repository;

import br.com.cwi.reset.samantamarry.model.Filme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepositoryBd extends CrudRepository<Filme, Integer> {
    List<Filme> findAll();
}