package br.com.cwi.reset.samantamarry.apiresetflix.view;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

public class DiretorRequest {

    @NotEmpty
    private String nome;
    @NotEmpty
    private LocalDate dataNascimento;
    @NotEmpty
    private Integer anoInicioAtividade;

    public DiretorRequest(String nome, LocalDate dataNascimento, Integer anoInicioAtividade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Integer getAnoInicioAtividade() {
        return anoInicioAtividade;
    }

}
