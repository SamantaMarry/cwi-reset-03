package br.com.cwi.reset.primeiroprojetospring.service;

import br.com.cwi.reset.primeiroprojetospring.domain.Pet;
import br.com.cwi.reset.primeiroprojetospring.exception.PetExistenteException;
import br.com.cwi.reset.primeiroprojetospring.exception.PetNaoExistenteException;
import br.com.cwi.reset.primeiroprojetospring.repository.PetRepositoryBd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepositoryBd repository;

    public Pet buscarPeloNome(String nome) throws PetNaoExistenteException {
        Pet pet = repository.findByNome(nome);

        if (pet == null) {
            throw new PetNaoExistenteException("Pet com o nome " + nome + " não existe");
        }

        return pet;
    }

    public Pet salvar(Pet pet) throws PetExistenteException {
        Pet petJaCadastrado = repository.findByNome(pet.getNome());

        if (petJaCadastrado != null) {
            throw new PetExistenteException("Pet com o nome " + pet.getNome() + " já existe");
        }

        return repository.save(pet);
    }

    public void delete(String nome) throws PetNaoExistenteException {
        Pet pet = repository.findByNome(nome);

        if (pet == null) {
            throw new PetNaoExistenteException("Pet com o nome " + nome + " não existe");
        }

        repository.delete(pet);
    }

    public Pet atualizar(Pet pet) throws PetNaoExistenteException {
        Pet petJaCadastrado = repository.findByNome(pet.getNome());

        if (petJaCadastrado == null) {
            throw new PetNaoExistenteException("Pet com o nome " + pet.getNome() + " não existe");
        }

        return repository.save(pet);
    }

    public List<Pet> listarTodos() {
        return (List<Pet>) repository.findAll();
    }

}
