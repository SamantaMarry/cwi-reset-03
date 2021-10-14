package br.com.cwi.reset.samantamarry;

public class InformarNomeSobrenomeException extends Exception {

    public InformarNomeSobrenomeException() {
        super("Deve ser informado no mínimo nome e sobrenome para o Ator/Diretor.");
    }
}
