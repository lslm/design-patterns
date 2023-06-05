package org.example;

import java.util.List;

public class PalavrasProibidasValidator implements MensagemValidator {
    private final List<String> palavrasProibidas = List.of("idiota", "burro", "canalha");

    @Override
    public boolean mensagemEhValida(String mensagem) {
        for(String palavraProibida : palavrasProibidas) {
            if (mensagem.contains(palavraProibida)) {
                return false;
            }
        }

        return true;
    }
}
