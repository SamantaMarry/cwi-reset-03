package br.com.cwi.reset.samantamarry.apiresetflix.service;

import br.com.cwi.reset.samantamarry.apiresetflix.AtorEmAtividade;
import br.com.cwi.reset.samantamarry.apiresetflix.FakeDatabase;
import br.com.cwi.reset.samantamarry.apiresetflix.ValidaçãoDeDados;
import br.com.cwi.reset.samantamarry.apiresetflix.exception.*;
import br.com.cwi.reset.samantamarry.apiresetflix.modal.Ator;
import br.com.cwi.reset.samantamarry.apiresetflix.modal.StatusCarreira;
import br.com.cwi.reset.samantamarry.apiresetflix.view.AtorRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AtorService {

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }


    public void criarAtor(AtorRequest atorRequest) throws Exception {

        new ValidaçãoDeDados().accept(atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getAnoInicioAtividade(), TipoDominioException.ATOR);
        if (atorRequest.getStatusCarreira() == null){
            throw new StatusCarreiraNãoInformadoException("Status carreira");
     }
        final List<Ator> atoresCadastrados = fakeDatabase.recuperaAtores();
        for(Ator atorCadastrado : atoresCadastrados){
            if (atorCadastrado.getNome().equalsIgnoreCase(atorRequest.getNome())){
                throw new CadastroDuplicadoException(TipoDominioException.ATOR.getSingular(), atorRequest.getNome());
            }
        }
        final Integer idGerado = atoresCadastrados.size() + 1;
        final Ator ator = new Ator(idGerado, atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getAnoInicioAtividade(), atorRequest.getStatusCarreira());
        fakeDatabase.persisteAtor(ator);

    }

    public List<AtorEmAtividade> listarAtoresEmAtividade(String filtroNome) throws Exception{
        final List<Ator> atoresCadastrados = fakeDatabase.recuperaAtores();
        if(atoresCadastrados.isEmpty()){
            throw new ListaVaziaException(TipoDominioException.ATOR.getSingular(), TipoDominioException.ATOR.getPlural());
        }

        final List<AtorEmAtividade> retorno = new ArrayList<>();

        if(filtroNome != null){
            for(Ator ator : atoresCadastrados) {
                final boolean containsFilter = ator.getNome().toLowerCase(Locale.ROOT).contains(filtroNome.toLowerCase(Locale.ROOT));
                final boolean emAtividade = StatusCarreira.EM_ATIVIDADE.equals(ator.getStatusCarreira());
                if (containsFilter && emAtividade){
                    retorno.add(new AtorEmAtividade(ator.getId(), ator.getNome(), ator.getDataNascimento()));
                }
            }
        }else {
            for (Ator ator : atoresCadastrados){
                final boolean emAtividade = StatusCarreira.EM_ATIVIDADE.equals(ator.getStatusCarreira());
                if (emAtividade){
                    retorno.add(new AtorEmAtividade(ator.getId(),ator.getNome(),ator.getDataNascimento()));
                }
            }
        }

        if (retorno.isEmpty()){
            throw new FiltroNomeNãoEncontradoException("Nome não encontrado");
        }

        return retorno;
    }

    public Ator consultarAtor(Integer id) throws Exception{
        if(id == null){
            throw new IdNaoInformadoException("Id não encontrado");
        }
        final List<Ator> atores = fakeDatabase.recuperaAtores();

        for (Ator ator : atores){
            if (ator.getId().equals(id)){
                return ator;
            }
        }
        throw new ConsultaIdInvalidoException(TipoDominioException.ATOR.getSingular(), id);
    }

    public List<Ator> consultarAtores(){
        final List<Ator> atores = fakeDatabase.recuperaAtores();

        if (atores.isEmpty()){
            throw new ListaVaziaException(TipoDominioException.ATOR.getSingular(), TipoDominioException.ATOR.getPlural());
        }

        return atores;

    }
}
