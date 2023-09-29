package org.example;


public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        // Send email notification
        notificationService.setSender((recipient, message) ->
                System.out.println("Sending email to " + recipient + ": " + message));
        notificationService.sendNotificationToRecipient("example@example.com", "Hello! This is an email notification.");


        // Send SMS notifications
        notificationService.setSender(((recipient, message) ->
                System.out.println("Sending SMS to " + recipient + ": " + message)));
        notificationService.sendNotificationToRecipient("Damiane", "Hello! This is an Message notification.");



    }
}