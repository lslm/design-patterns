package org.example;

public class MensagemCurtaValidator implements MensagemValidator {

    @Override
    public boolean mensagemEhValida(String mensagem) {
        return mensagem.length() >= 3;
    }
}
