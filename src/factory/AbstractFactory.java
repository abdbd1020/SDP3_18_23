package factory;

import GUI.UIElement;

public interface AbstractFactory {
    UIElement createButton();
    UIElement createTextField();
    UIElement createEditText();
}
