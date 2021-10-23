package br.com.cwi.reset.josealencar.validator;

import br.com.cwi.reset.josealencar.exception.DescricaoPersonagemNaoInformadaException;
import br.com.cwi.reset.josealencar.exception.IdAtorNaoInformadoException;
import br.com.cwi.reset.josealencar.exception.NomeNaoInformadoException;
import br.com.cwi.reset.josealencar.exception.TipoAtuacaoNaoInformadoException;
import br.com.cwi.reset.josealencar.request.PersonagemRequest;

import static java.util.Objects.isNull;

public class PersonagemRequestCamposObrigatoriosValidator {

    public void accept(final PersonagemRequest personagemRequest) throws Exception {
        if (isNull(personagemRequest.getNomePersonagem())) {
            throw new NomeNaoInformadoException();
        }

        if (isNull(personagemRequest.getDescricaoPersonagem())) {
            throw new DescricaoPersonagemNaoInformadaException();
        }

        if (isNull(personagemRequest.getIdAtor())) {
            throw new IdAtorNaoInformadoException();
        }

        if (isNull(personagemRequest.getTipoAtuacao())) {
            throw new TipoAtuacaoNaoInformadoException();
        }
    }
}
