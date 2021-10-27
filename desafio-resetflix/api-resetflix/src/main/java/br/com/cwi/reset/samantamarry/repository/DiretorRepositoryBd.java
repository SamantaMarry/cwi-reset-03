package br.com.cwi.reset.samantamarry.repository;


import br.com.cwi.reset.samantamarry.model.Diretor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiretorRepositoryBd extends CrudRepository<Diretor, Integer> {
    List<Diretor> findAll();
    Diretor findByNomeEqualsIgnoreCase(String nome);
    List<Diretor> findByNomeContainingIgnoreCase(String nome);

}
