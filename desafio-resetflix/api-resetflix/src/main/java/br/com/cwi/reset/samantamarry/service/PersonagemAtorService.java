/*
package br.com.cwi.reset.samantamarry.service;

import br.com.cwi.reset.samantamarry.FakeDatabase;
import br.com.cwi.reset.samantamarry.exception.CanseiDeCriarExceptionCustomizadaException;
import br.com.cwi.reset.samantamarry.model.Ator;
import br.com.cwi.reset.samantamarry.model.PersonagemAtor;
import br.com.cwi.reset.samantamarry.repository.AtorRepositoryBd;
import br.com.cwi.reset.samantamarry.request.PersonagemRequest;
import br.com.cwi.reset.samantamarry.validator.PersonagemRequestCamposObrigatoriosValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonagemAtorService {

    @Autowired
    private AtorRepositoryBd repository;
    private AtorService atorService;



    public PersonagemAtor cadastrarPersonagemAtor(PersonagemRequest personagemRequest) throws Exception {
        new PersonagemRequestCamposObrigatoriosValidator().accept(personagemRequest);

        final Ator ator = atorService.consultarAtor(personagemRequest.getIdAtor());


        repository.save(personagemRequest);

        return personagemAtor;
    }

    public List<PersonagemAtor> consultarPersonagemAtor(String nome) throws Exception {
        return fakeDatabase.recuperaPersonagens();
    }

    private void validarPersonagensAtoresFilme(final List<PersonagemRequest> personagens) throws Exception {
        if (personagens.isEmpty()) {
            throw new CanseiDeCriarExceptionCustomizadaException("Esta validação não estava nas regras.");
        }

        final Set<PersonagemRequest> personagemRequestSet = new HashSet<>();

        for (PersonagemRequest personagemRequest : personagens) {
            new PersonagemRequestCamposObrigatoriosValidator().accept(personagemRequest);

            */
/**
             * A linha: "if (personagemRequestSet.contains(personagemRequest))"
             *
             * Cai na implementação do Set abaixo
             * Implementação macro
             * https://docs.oracle.com/javase/7/docs/api/java/util/Set.html#contains(java.lang.Object)
             *
             * Que por sua vez chama o equals da classe da chave
             * Na prática:
             * PersonagemRequest.equals(PersonagemRequest);
             * {@link br.com.cwi.reset.samantamarry.request.PersonagemRequest#equals(Object)}
             *//*

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
*/
