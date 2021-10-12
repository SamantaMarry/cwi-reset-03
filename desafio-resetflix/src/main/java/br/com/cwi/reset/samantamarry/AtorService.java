package br.com.cwi.reset.samantamarry;

import java.util.List;

public class AtorService {

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }


    public void criarAtor(AtorRequest atorRequest){
        //fakeDatabase.persisteAtor(atorRequest); // passar atorRequest para a função persisteator que vai cuidar de inserir o ator no banco de dados


        // retornar mensagem de ator criado com sucesso

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