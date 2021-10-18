package br.com.cwi.reset.samantamarry.apiresetflix.service;

import br.com.cwi.reset.samantamarry.apiresetflix.FakeDatabase;
import br.com.cwi.reset.samantamarry.apiresetflix.modal.Diretor;
import br.com.cwi.reset.samantamarry.apiresetflix.modal.StatusAtividade;
import br.com.cwi.reset.samantamarry.apiresetflix.view.DiretorRequest;

import java.util.List;

public class DiretorService {

    private FakeDatabase fakeDatabase;

    public DiretorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void cadastrarDiretor(DiretorRequest diretorRequest) {

        final List<Diretor> diretoresCadastrados = fakeDatabase.recuperaDiretores();
        final Integer idGerado = diretoresCadastrados.size()+1;
        Diretor diretor = new Diretor(idGerado,diretorRequest.getNome(), diretorRequest.getDataNascimento(), diretorRequest.getAnoInicioAtividade());
        fakeDatabase.persisteDiretor(diretor);



    }

    public List<StatusAtividade> listarDiretores(String filtroNome) {

        return listarDiretores(filtroNome);

    }

    public Integer consultarDiretor(Integer id) {

        return consultarDiretor(id);
    }

}
