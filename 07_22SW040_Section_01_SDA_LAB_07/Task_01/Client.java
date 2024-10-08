

public class Client {


    private ScrollBar scrollBar;
    private Window window;

    public Client(WidgetFactory factory) {
        scrollBar = factory.createScrollBar();
        window = factory.createWindow();
    }

    public void renderUI() {
        scrollBar.render();
        window.render();
    }

    public static void main(String[] args) {
        // Creating a PM UI
        WidgetFactory pmFactory = new PMWidgetFactory();
        Client pmClient = new Client(pmFactory);
        System.out.println("PM UI:");
        pmClient.renderUI();

        // Creating a Motif UI
        WidgetFactory motifFactory = new MotifWidgetFactory();
        Client motifClient = new Client(motifFactory);
        System.out.println("\nMotif UI:");
        motifClient.renderUI();
    }
}

