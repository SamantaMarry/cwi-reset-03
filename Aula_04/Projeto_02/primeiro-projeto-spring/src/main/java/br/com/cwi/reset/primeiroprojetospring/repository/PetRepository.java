package br.com.cwi.reset.primeiroprojetospring.repository;

import br.com.cwi.reset.primeiroprojetospring.domain.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetRepository {

    public List<Pet> pets = new ArrayList<>();

    public Pet save(Pet pet){
        pets.add(pet);
        return pet;
    }

    public List<Pet> findAll() {
        return pets;
    }

    public Pet findByName(String nome) {
        for (Pet pet : pets){
            if (pet.getNome().equals(nome)){
                return pet;
            }
        }
        return null;
    }

    public void delete(Pet pet){
        pets.remove(pet);
    }

    public Pet atualizarPet(Pet pet){
        Pet petCadastrado = findByName(pet.getNome());
        if (petCadastrado != null){
            pets.remove(petCadastrado);
            pets.add(pet);
            return pet;
        }else {
            return null;
        }
    }

    public  List<Pet> listarTodos(){
        return pets;
    }
}
