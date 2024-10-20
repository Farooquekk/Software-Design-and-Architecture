
// Concrete Observer
public class UserNotifier extends User {
    public UserNotifier(ChatApplication chatApp) {
        this.chatApp = chatApp;
        this.chatApp.attach(this);
    }

    public void update(String friendName) {
        System.out.println("Notification: " + friendName + " is online.");
    }
}
