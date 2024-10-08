

public class NotificationFactory {


    // Factory method to create a notification based on the given type
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        if ("EMAIL".equalsIgnoreCase(channel)) {
            return new EmailNotification();
        } else if ("SMS".equalsIgnoreCase(channel)) {
            return new SMSNotification();
        } else if ("PUSH".equalsIgnoreCase(channel)) {
            return new PushNotification();
        }
        return null;
    }
}
