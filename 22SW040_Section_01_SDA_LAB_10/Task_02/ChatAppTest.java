
// Testing
public class ChatAppTest {
    public static void main(String[] args) {
        ChatApplication chatApp = new ChatApp();
        new UserNotifier(chatApp);

        chatApp.friendOnline("Farooque Sajjad");
        chatApp.friendOnline("Pikachu");
    }
}

