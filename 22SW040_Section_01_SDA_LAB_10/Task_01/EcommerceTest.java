


// Testing
public class EcommerceTest {
    public static void main(String[] args) {
        EcommerceSite site = new EcommercePlatform();
        new EmailSubscriber(site);

        site.addProduct("Smartphone");
        site.addProduct("Laptop");
    }
}

