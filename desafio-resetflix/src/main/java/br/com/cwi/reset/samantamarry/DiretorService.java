package br.com.cwi.reset.samantamarry;

import java.util.List;

public class DiretorService {

    private FakeDatabase fakeDatabase;

    public DiretorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void cadastrarDiretor(DiretorRequest diretorRequest) {


    }

    public List<StatusAtividade> listarDiretores(String filtroNome) {

        return listarDiretores(filtroNome);

    }

    public Integer consultarDiretor(Integer id) {

        return consultarDiretor(id);
    }

}