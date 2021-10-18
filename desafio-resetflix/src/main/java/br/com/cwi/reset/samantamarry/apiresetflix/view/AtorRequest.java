package br.com.cwi.reset.samantamarry.apiresetflix.view;

import br.com.cwi.reset.samantamarry.apiresetflix.modal.StatusCarreira;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

public class AtorRequest {


        @NotEmpty
        private String nome;
        @NotEmpty
        private LocalDate dataNascimento;
        @NotEmpty
        private StatusCarreira statusCarreira;
        @NotEmpty
        private Integer anoInicioAtividade;


        public AtorRequest(String nome, LocalDate dataNascimento, StatusCarreira statusCarreira, Integer anoInicioAtividade) {
            this.nome = nome;
            this.dataNascimento = dataNascimento;
            this.statusCarreira = statusCarreira;
            this.anoInicioAtividade = anoInicioAtividade;


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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setStatusCarreira(StatusCarreira statusCarreira) {
        this.statusCarreira = statusCarreira;
    }

    public void setAnoInicioAtividade(Integer anoInicioAtividade) {
        this.anoInicioAtividade = anoInicioAtividade;
    }
}

