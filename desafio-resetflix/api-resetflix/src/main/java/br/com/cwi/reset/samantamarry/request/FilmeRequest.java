package br.com.cwi.reset.samantamarry.request;

import br.com.cwi.reset.samantamarry.model.Genero;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.List;

public class FilmeRequest {
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Nome.")
    private String nome;
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Ano lançamento.")
    @Past(message = "Não é possivel cadastrar filmes no futuro")
    private Integer anoLancamento;
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Capa filme.")
    private String capaFilme;
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Genero.")
    private List<Genero> generos;
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Id Diretor .")
    private Integer idDiretor;
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Id Estudio.")
    private Integer idEstudio;
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Resumo.")
    private String resumo;
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo personagens.")
    @Valid
    private List<PersonagemRequest> personagens;

    public FilmeRequest(String nome, Integer anoLancamento, String capaFilme, List<Genero> generos, Integer idDiretor, Integer idEstudio, String resumo, List<PersonagemRequest> personagens) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.capaFilme = capaFilme;
        this.generos = generos;
        this.idDiretor = idDiretor;
        this.idEstudio = idEstudio;
        this.resumo = resumo;
        this.personagens = personagens;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getCapaFilme() {
        return capaFilme;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public Integer getIdDiretor() {
        return idDiretor;
    }

    public Integer getIdEstudio() {
        return idEstudio;
    }

    public String getResumo() {
        return resumo;
    }

    public List<PersonagemRequest> getPersonagens() {
        return personagens;
    }
}
