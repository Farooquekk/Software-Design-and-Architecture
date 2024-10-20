
// Concrete Observers
public class EmailSubscriber extends Subscriber {
    public EmailSubscriber(EcommerceSite ecommerceSite) {
        this.ecommerceSite = ecommerceSite;
        this.ecommerceSite.attach(this);
    }

    public void update(String product) {
        System.out.println("Email sent to subscriber: New product added - " + product);
    }
}
