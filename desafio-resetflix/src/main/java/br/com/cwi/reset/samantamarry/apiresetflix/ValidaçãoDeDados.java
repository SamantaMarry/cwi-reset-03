package br.com.cwi.reset.samantamarry.apiresetflix;

import br.com.cwi.reset.samantamarry.apiresetflix.exception.*;

import java.time.LocalDate;

public class ValidaçãoDeDados {

    public void accept (final String nome, final LocalDate dataNasicmento, final Integer anoInicioAtividade, final TipoDominioException tipoDominioException) throws Exception{
        if (nome == null){
            throw new NomeNãoInformadoException("Campo obrigatório não informado. Favor informar o campo Nome");
        }

        if(dataNasicmento == null){
            throw new DataNascimentoNãoInformadaException("Campo obrigatório não informado. Favor informar o campo Data de nascimento");
        }

        if(anoInicioAtividade == null){
            throw new AnoInicioAtividadeNaoInformadoException("Campo obrigatório não informado. Favor informar o campo com o Ano Inicio da Atividade");
        }

        if (nome.split(" ").length<2){
            throw new NomeSobrenomeObrigatórioException("Deve ser informado no mínimo nome e sobrenome");
        }

        if (LocalDate.now().isBefore(dataNasicmento)){
            throw new DataNascimentoMaiorDataAtualException(tipoDominioException.getPlural());
        }

        if (anoInicioAtividade <= dataNasicmento.getYear()){
            throw new AnoInicioAtividadeNaoInformadoException("Ano início da atividade não pode ser menor ou igual a data de nascimento informada");


        }

    }

}
