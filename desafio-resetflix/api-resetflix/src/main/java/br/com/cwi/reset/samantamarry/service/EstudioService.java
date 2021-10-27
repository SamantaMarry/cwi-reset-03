
package br.com.cwi.reset.samantamarry.service;
import br.com.cwi.reset.samantamarry.exception.*;
import br.com.cwi.reset.samantamarry.model.Estudio;
import br.com.cwi.reset.samantamarry.repository.EstudioRepositoryBd;
import br.com.cwi.reset.samantamarry.request.EstudioRequest;
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
        final List<Estudio> estudiosCadastrados = repository.findAll();

        for (Estudio estudioCadastrado : estudiosCadastrados) {
            if (estudioCadastrado.getNome().equalsIgnoreCase(estudioRequest.getNome())) {
                throw new CadastroDuplicadoException(TipoDominioException.ESTUDIO.getSingular(), estudioRequest.getNome());
            }
        }

        if (LocalDate.now().isBefore(estudioRequest.getDataCriacao())) {
            throw new CanseiDeCriarExceptionCustomizadaException("Não é possível cadastrar estúdios do futuro.");
        }
        Estudio estudio = new Estudio(estudioRequest.getNome(), estudioRequest.getDescricao(), estudioRequest.getDataCriacao(), estudioRequest.getStatusAtividade());

        repository.save(estudio);
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
        final List<Estudio> estudios = repository.findAll();
        for(Estudio estudio : estudios){
            if (estudio.getId().equals(id)){
                return estudio;
            }
        }
        throw new ConsultaIdInvalidoException(TipoDominioException.ESTUDIO.getSingular(), id);
    }

}
