package br.com.cwi.reset.samantamarry;

public class NomeDuplicadoException extends Exception{

    public NomeDuplicadoException() {

    super("Já existe um Ator/Diretor cadastrado para o nome"); //+ Pessoa.this.setNome());

    }
}
