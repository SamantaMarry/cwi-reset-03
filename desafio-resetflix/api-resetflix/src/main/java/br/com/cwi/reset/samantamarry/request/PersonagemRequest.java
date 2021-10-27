package br.com.cwi.reset.samantamarry.request;

import br.com.cwi.reset.samantamarry.model.TipoAtuacao;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class PersonagemRequest {
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o id do Ator")
    private Integer idAtor;
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o Nome do Personagem")
    private String nomePersonagem;
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar a Descrição do Personagem")
    private String descricaoPersonagem;
    @NotEmpty
    @NotNull(message = "Campo obrigatório não informado. Favor informar o Tipo de Atuação")
    private TipoAtuacao tipoAtuacao;

    public PersonagemRequest(Integer idAtor, String nomePersonagem, String descricaoPersonagem, TipoAtuacao tipoAtuacao) {
        this.idAtor = idAtor;
        this.nomePersonagem = nomePersonagem;
        this.descricaoPersonagem = descricaoPersonagem;
        this.tipoAtuacao = tipoAtuacao;
    }

    public Integer getIdAtor() {
        return idAtor;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public String getDescricaoPersonagem() {
        return descricaoPersonagem;
    }

    public TipoAtuacao getTipoAtuacao() {
        return tipoAtuacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonagemRequest that = (PersonagemRequest) o;
        return Objects.equals(idAtor, that.idAtor) && Objects.equals(nomePersonagem, that.nomePersonagem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAtor, nomePersonagem);
    }
}
