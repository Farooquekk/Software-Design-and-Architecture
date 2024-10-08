

public class Demo {

    public static void main(String[] args) {

        GUIFactory factory;
        String osType = "WindowOS";

        if(osType.equals("MackOS")) {
            factory=new MackOsFactory();
        }
        else {
            factory=new WindowFactory();
        }

        Application app = new Application(factory);;
        app.run();

    }

}
