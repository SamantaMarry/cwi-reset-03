package br.com.cwi.reset.samantamarry.service;

import br.com.cwi.reset.samantamarry.exception.CanseiDeCriarExceptionCustomizadaException;
import br.com.cwi.reset.samantamarry.model.Ator;
import br.com.cwi.reset.samantamarry.model.PersonagemAtor;
import br.com.cwi.reset.samantamarry.repository.PersonagemAtorRepositoryBd;
import br.com.cwi.reset.samantamarry.request.PersonagemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonagemAtorService {

    @Autowired
    private PersonagemAtorRepositoryBd repository;
    @Autowired
    private AtorService atorService;



    public PersonagemAtor cadastrarPersonagemAtor(PersonagemRequest personagemRequest) throws Exception {
        final Ator ator = atorService.consultarAtor(personagemRequest.getIdAtor());
        PersonagemAtor personagemAtor = new PersonagemAtor(personagemRequest.getIdAtor(), personagemRequest.getNomePersonagem(),personagemRequest.getDescricaoPersonagem(),personagemRequest.getTipoAtuacao());
        repository.save(personagemAtor);

        return personagemAtor;
    }

    public List<PersonagemAtor> consultarPersonagemAtor(String nome) throws Exception {
        return repository.findAll();
    }

    private void validarPersonagensAtoresFilme(final List<PersonagemRequest> personagens) throws Exception {
        if (personagens.isEmpty()) {
            throw new CanseiDeCriarExceptionCustomizadaException("Esta validação não estava nas regras.");
        }

        final Set<PersonagemRequest> personagemRequestSet = new HashSet<>();

        for (PersonagemRequest personagemRequest : personagens) {
            if (personagemRequestSet.contains(personagemRequest)) {
                throw new CanseiDeCriarExceptionCustomizadaException("Não é permitido informar o mesmo ator/personagem mais de uma vez para o mesmo filme.");
            } else {
                personagemRequestSet.add(personagemRequest);
            }
        }
    }

    public List<PersonagemAtor> cadastrarPersonagensFilme(final List<PersonagemRequest> personagens) throws Exception {
        validarPersonagensAtoresFilme(personagens);

        final List<PersonagemAtor> personagensAtores = new ArrayList<>();

        for (PersonagemRequest request : personagens) {
            personagensAtores.add(cadastrarPersonagemAtor(request));
        }

        return personagensAtores;
    }
 }
