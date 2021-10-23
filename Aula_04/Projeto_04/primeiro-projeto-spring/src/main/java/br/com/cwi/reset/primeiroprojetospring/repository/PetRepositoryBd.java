package br.com.cwi.reset.primeiroprojetospring.repository;

import br.com.cwi.reset.primeiroprojetospring.domain.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetRepositoryBd extends CrudRepository<Pet, Integer> {

   Pet findByNome(String nome);
    List<Pet> findAll();



}
