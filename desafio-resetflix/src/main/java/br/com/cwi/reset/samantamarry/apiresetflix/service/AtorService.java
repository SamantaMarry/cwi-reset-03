package br.com.cwi.reset.samantamarry.apiresetflix.service;

import br.com.cwi.reset.samantamarry.apiresetflix.FakeDatabase;
import br.com.cwi.reset.samantamarry.apiresetflix.modal.Ator;
import br.com.cwi.reset.samantamarry.apiresetflix.modal.StatusAtividade;
import br.com.cwi.reset.samantamarry.apiresetflix.view.AtorRequest;

import java.util.List;

public class AtorService {

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }


    public void criarAtor(AtorRequest atorRequest){

         final List<Ator> atoresCadastrados = fakeDatabase.recuperaAtores();
         final Integer idGerado = atoresCadastrados.size() + 1;
         final Ator ator = new Ator(idGerado, atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getAnoInicioAtividade(), atorRequest.getStatusCarreira());
         fakeDatabase.persisteAtor(ator);


    }

    public List<StatusAtividade> listarAtoresEmAtividade(String filtroNome){

        return listarAtoresEmAtividade(filtroNome);

    }

    public Integer consultarAtor(Integer id){

        return consultarAtor(id);

    }

    public List<Ator> consultarAtores(){

        return consultarAtores();

    }
}
