package br.com.cwi.reset.primeiroprojetospring.exception;

public class FilmeNaoExistenteException extends Exception {
    public FilmeNaoExistenteException(String message) {
        super(message);
    }
}