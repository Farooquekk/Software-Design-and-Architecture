

public class PMWidgetFactory implements WidgetFactory {

    @Override
    public ScrollBar createScrollBar() {
        return new PMSScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }
}
