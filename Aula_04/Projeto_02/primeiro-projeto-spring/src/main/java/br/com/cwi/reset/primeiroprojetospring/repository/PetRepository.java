package br.com.cwi.reset.primeiroprojetospring.repository;

import br.com.cwi.reset.primeiroprojetospring.domain.Pet;

import java.util.List;

public interface PetRepository {

    Pet findByName(String nome);
    void delete(Pet pet);
    Pet save(Pet pet);
    List<Pet> findAll();
    Pet atualizarPet(Pet pet);
    List<Pet> listarTodos();


}
