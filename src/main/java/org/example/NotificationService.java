package org.example;

public class NotificationService {
    private NotificationSender sender;

    public void setSender(NotificationSender sender) {
        this.sender = sender;
    }

    public void sendNotificationToRecipient(String recipient, String message) {
        if (sender != null) {
            sender.sendNotification(recipient, message);
        } else {
            System.out.println("No notification sender set");
        }
    }
}
