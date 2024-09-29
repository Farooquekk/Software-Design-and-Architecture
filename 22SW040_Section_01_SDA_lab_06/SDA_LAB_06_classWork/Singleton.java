package SDA_LAB_06_classWork;

public class Singleton {

    // Step 1: A private static instance of the same class (initially null)
    private static Singleton uniqueInstance;

    // Step 2: Private constructor to restrict instantiation
    private Singleton() {
        // Initialize singletonData or other resources
    }

    // Step 3: Public static method to get the single instance
    public static Singleton instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();  // Lazy initialization
        }
        return uniqueInstance;
    }

    // Example of singleton operations (method on Singleton object)
    public void singletonOperation() {
        // Perform some operation using singletonData
        System.out.println("Performing operation on Singleton instance.");
    }

    // Example of singletonData
    private String singletonData = "Example data";

    public String getSingletonData() {
        return singletonData;
    }

    public void setSingletonData(String data) {
        this.singletonData = data;
    }
}


