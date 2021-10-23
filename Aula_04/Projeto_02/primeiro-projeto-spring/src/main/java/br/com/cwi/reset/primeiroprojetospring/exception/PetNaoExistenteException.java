package br.com.cwi.reset.primeiroprojetospring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PetNaoExistenteException extends Exception{
    public PetNaoExistenteException(String message) {
        super(message);
    }

}
