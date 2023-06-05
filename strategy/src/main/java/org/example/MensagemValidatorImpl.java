package org.example;

import java.util.Set;

public class MensagemValidatorImpl implements MensagemValidator {
    Set<MensagemValidator> validators;

    public MensagemValidatorImpl() {
        validators = Set.of(
                new CaracterProibidoValidator(),
                new MensagemCurtaValidator(),
                new MensagemLongaValidator(),
                new PalavrasProibidasValidator()
        );
    }

    @Override
    public boolean mensagemEhValida(String mensagem) {
        for(MensagemValidator validator : validators) {
            if (!validator.mensagemEhValida(mensagem)) {
                return false;
            }
        }

        return true;
    }
}
