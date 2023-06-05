package org.example;

public class MensagemLongaValidator implements MensagemValidator {
    @Override
    public boolean mensagemEhValida(String mensagem) {
        return mensagem.length() <= 30;
    }
}
