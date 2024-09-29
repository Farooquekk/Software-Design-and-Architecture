package SDA_LAB_06_classWork;

public class Main {
    public static void main(String[] args) {
        // Accessing the Singleton instance
        Singleton single = Singleton.instance();

        // Using singletonOperation
        single.singletonOperation();

        // Setting data
        single.setSingletonData("New data");

        // Retrieving the singletonData
        System.out.println(single.getSingletonData());
    }
}