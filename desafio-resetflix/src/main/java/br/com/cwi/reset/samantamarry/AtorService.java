package br.com.cwi.reset.samantamarry;

import java.util.List;

public class AtorService {

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }


    public void criarAtor(AtorRequest atorRequest){
        Ator ator = new Ator(atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getAnoInicioAtividade(), atorRequest.getStatusCarreira());
        this.fakeDatabase.persisteAtor(ator);


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