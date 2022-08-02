package events;

import models.User;

public class EmailNotification implements EventListener {

    @Override
    public void notify(User user) {
        sendEmailTo(user);
    }

    private void sendEmailTo(User user) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Sending email to " + user.getEmail());
    }
}
