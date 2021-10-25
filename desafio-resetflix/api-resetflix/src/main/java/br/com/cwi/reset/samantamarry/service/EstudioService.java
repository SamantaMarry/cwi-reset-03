/*package br.com.cwi.reset.samantamarry.service;

import br.com.cwi.reset.samantamarry.FakeDatabase;
import br.com.cwi.reset.samantamarry.exception.*;
import br.com.cwi.reset.samantamarry.model.Estudio;
import br.com.cwi.reset.samantamarry.repository.EstudioRepositoryBd;
import br.com.cwi.reset.samantamarry.request.EstudioRequest;
import br.com.cwi.reset.samantamarry.validator.EstudioRequestCamposObrigatoriosValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

import static java.util.Objects.isNull;

@Service
public class EstudioService {

    @Autowired
    private EstudioRepositoryBd repository;


    public void criarEstudio(EstudioRequest estudioRequest) throws Exception {
        new EstudioRequestCamposObrigatoriosValidator().accept(estudioRequest);

        List<Estudio> estudiosCadastrados = repository.findAll();

        for (Estudio estudioCadastrado : estudiosCadastrados) {
            if (estudioCadastrado.getNome().equalsIgnoreCase(estudioRequest.getNome())) {
                throw new CadastroDuplicadoException(TipoDominioException.ESTUDIO.getSingular(), estudioRequest.getNome());
            }
        }

        if (LocalDate.now().isBefore(estudioRequest.getDataCriacao())) {
            throw new CanseiDeCriarExceptionCustomizadaException("Não é possível cadastrar estúdios do futuro.");
        }

        final Integer idGerado = estudiosCadastrados.size() + 1;

        repository.save(estudioRequest);
    }

    public List<Estudio> consultarEstudios(String filtroNome) throws Exception {
        List<Estudio> estudiosCadastrados = repository.findAll();
        final List<Estudio> estudios = new ArrayList<>();

        if (estudiosCadastrados.isEmpty()) {
            throw new ListaVaziaException(TipoDominioException.ESTUDIO.getSingular(), TipoDominioException.ESTUDIO.getPlural());
        }

        if (!isNull(filtroNome)) {
            for (Estudio estudio : estudiosCadastrados) {
                if (estudio.getNome().toLowerCase(Locale.ROOT).contains(filtroNome.toLowerCase(Locale.ROOT))) {
                    estudios.add(estudio);
                }
            }
        } else {
            estudios.addAll(estudiosCadastrados);
        }

        if (estudios.isEmpty()) {
            throw new FiltroNomeNaoEncontrado("Estúdio", filtroNome);
        }

        return estudios;
    }

    public Estudio consultarEstudio(Integer id) throws Exception {
        if (isNull(id)) {
            throw new IdNaoInformado();
        }

        return repository.findAll();
    }

}*/
