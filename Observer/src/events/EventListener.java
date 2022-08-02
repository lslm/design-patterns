package events;

import models.User;

public interface EventListener {
    void notify(User user);
}
