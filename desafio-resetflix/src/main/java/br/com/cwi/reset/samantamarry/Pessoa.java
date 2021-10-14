package br.com.cwi.reset.samantamarry;

import java.time.LocalDate;

public class Pessoa{

    private static Integer id = 0;
    private String nome;
    private LocalDate dataNascimento;
    private Integer anoInicioAtividade;

    public Pessoa(String nome, LocalDate dataNascimento, Integer anoInicioAtividade) {
        id++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
