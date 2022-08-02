package events;

import models.User;

public class PushNotification implements EventListener {

    @Override
    public void notify(User user) {
        sendPushNotificationTo(user);
    }

    private void sendPushNotificationTo(User user) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Sending push to " + user.getName());
    }
}
