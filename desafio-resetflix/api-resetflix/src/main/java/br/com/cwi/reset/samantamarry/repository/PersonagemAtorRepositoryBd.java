package br.com.cwi.reset.samantamarry.repository;

import br.com.cwi.reset.samantamarry.model.PersonagemAtor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonagemAtorRepositoryBd extends CrudRepository<PersonagemAtor, Integer> {
    List<PersonagemAtor> findAll();
}
