
import java.util.ArrayList;
import java.util.List;


// Concrete Subject


public class ChatApp implements ChatApplication {
    private List<User> users = new ArrayList<>();
    private String friendName;

    public void friendOnline(String friendName) {
        this.friendName = friendName;
        System.out.println(friendName + " is now online.");
        notifyAllUsers();
    }

    public void attach(User user) {
        users.add(user);
    }

    public void notifyAllUsers() {
        for (User user : users) {
            user.update(friendName);
        }
    }
}
