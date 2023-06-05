package org.example;

public class CaracterProibidoValidator implements MensagemValidator {
    @Override
    public boolean mensagemEhValida(String mensagem) {
        return !mensagem.contains("#");
    }
}
