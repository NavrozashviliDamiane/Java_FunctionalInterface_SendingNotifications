package org.example;

@FunctionalInterface
public interface NotificationSender {
    void sendNotification(String recipient, String message);
}
