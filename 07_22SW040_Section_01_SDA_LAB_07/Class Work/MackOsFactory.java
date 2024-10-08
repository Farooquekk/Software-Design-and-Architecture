

public class MackOsFactory implements GUIFactory {
    public  Button createButton() {
        return new MackOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MackOsCheckBox();
    }
}
