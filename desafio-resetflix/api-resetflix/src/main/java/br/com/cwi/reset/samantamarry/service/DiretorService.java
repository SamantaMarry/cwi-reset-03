package br.com.cwi.reset.samantamarry.service;

import br.com.cwi.reset.samantamarry.exception.*;
import br.com.cwi.reset.samantamarry.model.Diretor;
import br.com.cwi.reset.samantamarry.repository.DiretorRepositoryBd;
import br.com.cwi.reset.samantamarry.request.DiretorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class DiretorService {

    @Autowired
    private DiretorRepositoryBd repository;


    public void cadastrarDiretor(DiretorRequest diretorRequest) throws Exception {

        final List<Diretor> diretoresCadastrados = repository.findAll();

        for (Diretor diretorCadastrado : diretoresCadastrados) {
            if (diretorCadastrado.getNome().equalsIgnoreCase(diretorRequest.getNome())) {
                throw new CadastroDuplicadoException(TipoDominioException.DIRETOR.getSingular(), diretorRequest.getNome());
            }
        }
        Diretor diretor = new Diretor(diretorRequest.getNome(), diretorRequest.getDataNascimento(), diretorRequest.getAnoInicioAtividade());
        repository.save(diretor);

    }

    public List<Diretor> listarDiretores(final String filtroNome) throws Exception {
        final List<Diretor> diretoresCadastrados =repository.findAll();

        if (diretoresCadastrados.isEmpty()) {
            throw new ListaVaziaException(TipoDominioException.DIRETOR.getSingular(), TipoDominioException.DIRETOR.getPlural());
        }

        final List<Diretor> retorno = new ArrayList<>();

        if (filtroNome != null) {
            for (Diretor diretor : diretoresCadastrados) {
                final boolean containsFilter = diretor.getNome().toLowerCase(Locale.ROOT).contains(filtroNome.toLowerCase(Locale.ROOT));
                if (containsFilter) {
                    retorno.add(diretor);
                }
            }
        } else {
            retorno.addAll(diretoresCadastrados);
        }

        if (retorno.isEmpty()) {
            throw new FiltroNomeNaoEncontrado("Diretor", filtroNome);
        }

        return retorno;
    }

    public Diretor consultarDiretor(final Integer id) throws Exception {
        if (id == null) {
            throw new IdNaoInformado();
        }

        final List<Diretor> diretores = repository.findAll();

        for (Diretor diretor : diretores) {
            if (diretor.getId().equals(id)) {
                return diretor;
            }
        }

        throw new ConsultaIdInvalidoException(TipoDominioException.DIRETOR.getSingular(), id);
    }

}
