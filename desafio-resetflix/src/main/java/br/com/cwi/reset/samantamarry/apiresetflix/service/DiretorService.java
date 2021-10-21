package br.com.cwi.reset.samantamarry.apiresetflix.service;

import br.com.cwi.reset.samantamarry.apiresetflix.FakeDatabase;
import br.com.cwi.reset.samantamarry.apiresetflix.ValidaçãoDeDados;
import br.com.cwi.reset.samantamarry.apiresetflix.exception.*;
import br.com.cwi.reset.samantamarry.apiresetflix.modal.Diretor;
import br.com.cwi.reset.samantamarry.apiresetflix.modal.StatusAtividade;
import br.com.cwi.reset.samantamarry.apiresetflix.view.DiretorRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DiretorService {

    private FakeDatabase fakeDatabase;

    public DiretorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void cadastrarDiretor(DiretorRequest diretorRequest) throws Exception {
        new ValidaçãoDeDados().accept(diretorRequest.getNome(), diretorRequest.getDataNascimento(),diretorRequest.getAnoInicioAtividade(), TipoDominioException.DIRETOR);

        final List<Diretor> diretoresCadastrados = fakeDatabase.recuperaDiretores();

        for (Diretor diretorCadastrado : diretoresCadastrados) {
            if (diretorCadastrado.getNome().equalsIgnoreCase(diretorCadastrado.getNome())) {
                throw new CadastroDuplicadoException(TipoDominioException.DIRETOR.getSingular(), diretorRequest.getNome());
            }
        }
        final Integer idGerado = diretoresCadastrados.size()+1;

        Diretor diretor = new Diretor(idGerado,diretorRequest.getNome(), diretorRequest.getDataNascimento(), diretorRequest.getAnoInicioAtividade());
        fakeDatabase.persisteDiretor(diretor);

    }

    public List<Diretor> listarDiretores(final String filtroNome) throws Exception {
        final List<Diretor> diretoresCadastrados = fakeDatabase.recuperaDiretores();

        if (diretoresCadastrados.isEmpty()){
            throw new ListaVaziaException(TipoDominioException.DIRETOR.getSingular(), TipoDominioException.DIRETOR.getPlural());
        }

        final List<Diretor> retorno = new ArrayList<>();

        if (filtroNome != null){
            for (Diretor diretor : diretoresCadastrados){
                final boolean containsFilter = diretor.getNome().toLowerCase(Locale.ROOT).contains(filtroNome.toLowerCase(Locale.ROOT));
                if (containsFilter){
                    retorno.add(diretor);
                }
            }
        }else {
            retorno.addAll(diretoresCadastrados);
        }

        if (retorno.isEmpty()){
            throw new FiltroNomeNãoEncontradoException("Não encontrado");
        }
        return retorno;
    }

    public Diretor consultarDiretor(final Integer id) throws Exception {
        if (id == null){
            throw new IdNaoInformadoException("Id não encontrado");
        }
        final List<Diretor> diretores = fakeDatabase.recuperaDiretores();

        for (Diretor diretor : diretores){
            if (diretor.getId().equals(id)){
                return diretor;
            }
        }

        throw new ConsultaIdInvalidoException(TipoDominioException.DIRETOR.getSingular(), id);
    }

}
