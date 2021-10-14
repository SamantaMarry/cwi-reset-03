package br.com.cwi.reset.samantamarry;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private StatusCarreira statusCarreira;


    public Ator(String nome, LocalDate dataNascimento, Integer anoInicioAtividade, StatusCarreira statusCarreira) {
        super(nome, dataNascimento, anoInicioAtividade);
        this.statusCarreira = statusCarreira;
    }
}
