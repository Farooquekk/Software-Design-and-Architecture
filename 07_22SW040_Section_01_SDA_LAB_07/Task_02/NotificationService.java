

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        // Sending an Email notification
        Notification emailNotification = factory.createNotification("EMAIL");
        emailNotification.notifyUser();

        // Sending an SMS notification
        Notification smsNotification = factory.createNotification("SMS");
        smsNotification.notifyUser();

        // Sending a Push notification
        Notification pushNotification = factory.createNotification("PUSH");
        pushNotification.notifyUser();
    }
}
