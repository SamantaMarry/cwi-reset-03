package br.com.cwi.reset.samantamarry.request;

import br.com.cwi.reset.samantamarry.model.Ator;
import br.com.cwi.reset.samantamarry.model.StatusCarreira;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;


public class AtorRequest {

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Nome.")
    private String nome;


    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Data Nascimento.")
    @Past(message = "Não é possível cadastrar não nascidos.")
    private LocalDate dataNascimento;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Status Carreira.")
    private StatusCarreira statusCarreira;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo Ano Inicio de Atividade.")
    private Integer anoInicioAtividade;

    public AtorRequest(String nome, LocalDate dataNascimento, StatusCarreira statusCarreira, Integer anoInicioAtividade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.statusCarreira = statusCarreira;
        this.anoInicioAtividade = anoInicioAtividade;
    }

    public Ator converterParaObjeto() {
        return new Ator(nome, dataNascimento, statusCarreira, anoInicioAtividade);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public StatusCarreira getStatusCarreira() {
        return statusCarreira;
    }

    public Integer getAnoInicioAtividade() {
        return anoInicioAtividade;
    }


}
