package factory;

import GUI.SimplisticButton;
import GUI.SimplisticEditText;
import GUI.SimplisticTextField;
import GUI.UIElement;

public class SimplisticFactory implements AbstractFactory {
    @Override
    public UIElement createButton() {
        return (UIElement) new SimplisticButton();
    }

    @Override
    public UIElement createTextField() {
        return (UIElement) new SimplisticTextField();
    }

    @Override
    public UIElement createEditText() {
        return (UIElement) new SimplisticEditText();
    }
}
