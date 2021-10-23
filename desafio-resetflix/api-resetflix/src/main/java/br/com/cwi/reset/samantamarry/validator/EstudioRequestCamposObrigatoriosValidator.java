package br.com.cwi.reset.samantamarry.validator;

import br.com.cwi.reset.samantamarry.exception.DataCriacaoNaoInformadaException;
import br.com.cwi.reset.samantamarry.exception.DescricaoNaoInformadaException;
import br.com.cwi.reset.samantamarry.exception.NomeNaoInformadoException;
import br.com.cwi.reset.samantamarry.exception.StatusAtividadeNaoInformadoException;
import br.com.cwi.reset.samantamarry.request.EstudioRequest;

import static java.util.Objects.isNull;

public class EstudioRequestCamposObrigatoriosValidator {

    public void accept(EstudioRequest estudioRequest) throws Exception {
        if (isNull(estudioRequest.getNome())) {
            throw new NomeNaoInformadoException();
        }

        if (isNull(estudioRequest.getDataCriacao())) {
            throw new DataCriacaoNaoInformadaException();
        }

        if (isNull(estudioRequest.getDescricao())) {
            throw new DescricaoNaoInformadaException();
        }

        if (isNull(estudioRequest.getStatusAtividade())) {
            throw new StatusAtividadeNaoInformadoException();
        }
    }
}
