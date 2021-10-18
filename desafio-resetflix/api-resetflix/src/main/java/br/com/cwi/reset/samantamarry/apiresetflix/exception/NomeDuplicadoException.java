package br.com.cwi.reset.samantamarry.apiresetflix.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NomeDuplicadoException extends RuntimeException{

    public NomeDuplicadoException(String message) {
        super(message);
    }
}