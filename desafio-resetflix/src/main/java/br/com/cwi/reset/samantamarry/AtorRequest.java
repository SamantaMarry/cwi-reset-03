package br.com.cwi.reset.samantamarry;

import java.time.LocalDate;

public class AtorRequest {

    private String nome;
    private LocalDate dataNasicmento;
    private StatusCarreira statusCarreira;
    private Integer anoInicioAtividade;

    public AtorRequest(String nome, LocalDate dataNasicmento, StatusCarreira statusCarreira, Integer anoInicioAtividade) {

        this.nome = nome;
        this.dataNasicmento = dataNasicmento;
        this.statusCarreira = statusCarreira;
        this.anoInicioAtividade = anoInicioAtividade;

       // criarAtor() // passar objeto ator
    }
}
