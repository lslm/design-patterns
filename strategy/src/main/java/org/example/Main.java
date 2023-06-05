package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a mensagem que você deseja enviar: ");
        String mensagem = scanner.nextLine();

        MensagemValidatorImpl mensagemValidator = new MensagemValidatorImpl();

        if (mensagemValidator.mensagemEhValida(mensagem)) {
            System.out.println("📬 Enviando mensagem: \"" + mensagem + "\"");
        } else {
            System.out.println("Não foi possível enviar a mensagem");
        }
    }
}