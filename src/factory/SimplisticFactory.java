package factory;

import GUI.SimplisticButton;
import GUI.SimplisticEditText;
import GUI.SimplisticTextField;
import GUI.UIElement;

public class SimplisticFactory implements AbstractFactory {
    @Override
    public UIElement createButton() {
        return  new SimplisticButton();
    }

    @Override
    public UIElement createTextField() {
        return  new SimplisticTextField();
    }

    @Override
    public UIElement createEditText() {
        return  new SimplisticEditText();
    }
}
