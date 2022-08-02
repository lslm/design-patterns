import events.EmailNotification;
import events.PushNotification;
import models.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do novo usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o email do novo usuário: ");
        String email = scanner.nextLine();

        User user = new User(nome, email);

        Publisher publisher = new Publisher();

        publisher.notifySubscribers(user);
    }
}
