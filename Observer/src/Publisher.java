import events.EmailNotification;
import events.EventListener;
import events.PushNotification;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<EventListener> subscribers = new ArrayList<>();

    public Publisher() {
        subscribers.add(new EmailNotification());
        subscribers.add(new PushNotification());
    }

    public void subscribe(EventListener subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers(User createdUser) {
        subscribers.forEach(eventListener -> {
            Runnable notifier = () -> eventListener.notify(createdUser);
            new Thread(notifier).start();
        });
    }
}
