package factory;

import GUI.HighDetailedButton;
import GUI.HighDetailedEditText;
import GUI.HighDetailedText;
import GUI.UIElement;

public class HighDetailedFactory implements AbstractFactory {
    @Override
    public UIElement createButton() {
        return new HighDetailedButton();
    }

    @Override
    public UIElement createTextField() {
        return  new HighDetailedText();
    }

    @Override
    public UIElement createEditText() {
        return new HighDetailedEditText();
    }
}
