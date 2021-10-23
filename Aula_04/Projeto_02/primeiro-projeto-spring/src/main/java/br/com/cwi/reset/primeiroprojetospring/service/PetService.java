package br.com.cwi.reset.primeiroprojetospring.service;

import br.com.cwi.reset.primeiroprojetospring.domain.Pet;
import br.com.cwi.reset.primeiroprojetospring.exception.PetExistenteException;
import br.com.cwi.reset.primeiroprojetospring.exception.PetNaoExistenteException;
import br.com.cwi.reset.primeiroprojetospring.repository.PetRepository;

import java.util.List;

public class PetService {

    private PetRepository repository =new PetRepository();

    public Pet salvarPet(Pet pet) throws PetNaoExistenteException {
        Pet petCadastrado = repository.findByName(pet.getNome());

        if (petCadastrado != null) {
            throw new PetNaoExistenteException("Pet com nome" + pet.getNome() + " não existe");
        }
        repository.save(pet);
        return pet;
    }


    public Pet buscarPorNome(String nome) throws PetNaoExistenteException{
        Pet pet = repository.findByName(nome);
        if (pet == null){
            throw  new PetNaoExistenteException("Pet com nome" +nome + " não existe");
        }
        return pet;
    }

    public void deletar(String nome) throws PetNaoExistenteException {
        Pet pet = repository.findByName(nome);
        if (pet == null){
            throw  new PetNaoExistenteException("Pet com nome" + nome + " não existe");
        }

        repository.delete(pet);
    }

    public Pet atualizar(Pet pet) throws PetNaoExistenteException {
        Pet petCadastrado = repository.findByName(pet.getNome());

        if (petCadastrado == null){
            throw  new PetNaoExistenteException("Pet com nome" +pet.getNome() + " não existe");
        }
        return  repository.atualizarPet(pet);
    }

    public List<Pet> listarTodos(){
        return repository.listarTodos();
    }

}
