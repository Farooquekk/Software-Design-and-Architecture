

import java.util.ArrayList;
import java.util.List;

public class EcommercePlatform implements EcommerceSite {
    private List<Subscriber> subscribers = new ArrayList<>();
    private List<String> products = new ArrayList<>();

    public void addProduct(String product) {
        products.add(product);
        System.out.println("Product added: " + product);
        notifyAllSubscribers();
    }

    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifyAllSubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(products.get(products.size() - 1));
        }
    }
}
