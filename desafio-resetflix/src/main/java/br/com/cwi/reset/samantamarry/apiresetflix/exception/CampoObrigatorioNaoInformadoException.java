package br.com.cwi.reset.samantamarry.apiresetflix.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CampoObrigatorioNaoInformadoException extends RuntimeException{

    public CampoObrigatorioNaoInformadoException(String message) {
        super(message);
    }
}


