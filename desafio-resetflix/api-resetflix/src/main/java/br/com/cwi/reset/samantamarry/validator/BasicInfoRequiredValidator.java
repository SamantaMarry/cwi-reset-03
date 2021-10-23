package br.com.cwi.reset.samantamarry.validator;

import br.com.cwi.reset.samantamarry.exception.*;

import java.time.LocalDate;

public class BasicInfoRequiredValidator {

    public void accept(final String nome, final LocalDate dataNascimento, final Integer anoInicioAtividade, final TipoDominioException tipoDominioException) throws Exception {
        if (anoInicioAtividade == null) {
            throw new AnoInicioAtividadeNaoInformadoException();
        }

        if (nome.split(" ").length < 2) {
            throw new NomeSobrenomeObrigatorioException(tipoDominioException.getSingular());
        }

        if (LocalDate.now().isBefore(dataNascimento)) {
            throw new NascidosNoFuturoException(tipoDominioException.getPlural());
        }

        if (anoInicioAtividade <= dataNascimento.getYear()) {
            throw new AnoInicioAtividadeInvalidoException(tipoDominioException.getSingular());
        }
    }
}
