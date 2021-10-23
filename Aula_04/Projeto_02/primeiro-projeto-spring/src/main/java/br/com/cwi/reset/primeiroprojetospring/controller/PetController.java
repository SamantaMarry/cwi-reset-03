package br.com.cwi.reset.primeiroprojetospring.controller;
import br.com.cwi.reset.primeiroprojetospring.domain.Pet;
import br.com.cwi.reset.primeiroprojetospring.exception.PetExistenteException;
import br.com.cwi.reset.primeiroprojetospring.exception.PetNaoExistenteException;
import br.com.cwi.reset.primeiroprojetospring.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService service;


    @GetMapping
    public List<Pet> getPet() {
        return service.listarTodos();
    }

    @GetMapping("/{nome}")
    public Pet getByNome(@PathVariable String nome) throws PetNaoExistenteException {
        return (service.buscarPeloNome(nome));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pet cadastrarPet(@RequestBody Pet pet) throws PetExistenteException{
        return service.salvar(pet);
    }

    @PutMapping
    public Pet atualizarPet(@RequestBody Pet pet) throws PetNaoExistenteException {
       return service.atualizar(pet);


    }

    @DeleteMapping("/{nome}")
    public void deletarPet(@PathVariable String nome) throws PetNaoExistenteException{
        service.delete(nome);

        }
 }

