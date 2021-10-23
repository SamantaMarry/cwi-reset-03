package br.com.cwi.reset.primeiroprojetospring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PetExistenteException extends Exception{
    public PetExistenteException(String message) {
        super(message);
    }
}
