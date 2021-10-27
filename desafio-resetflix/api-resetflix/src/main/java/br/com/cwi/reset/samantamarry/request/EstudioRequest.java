package br.com.cwi.reset.samantamarry.request;

import br.com.cwi.reset.samantamarry.model.StatusAtividade;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class EstudioRequest {

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Nome")
    private String nome;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Descrição")
    private String descricao;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo data de Criação")
    private LocalDate dataCriacao;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Status Atividade")
    private StatusAtividade statusAtividade;

    public EstudioRequest(String nome, String descricao, LocalDate dataCriacao, StatusAtividade statusAtividade) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.statusAtividade = statusAtividade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public StatusAtividade getStatusAtividade() {
        return statusAtividade;
    }
}
