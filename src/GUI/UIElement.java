package GUI;

import javafx.scene.control.Control;

public interface UIElement {
    Control getElement();
    void setValue(String value);
    void setXCoordinate(int x);
    void setYCoordinate(int y);
    void setColor(String color);
    void setFont(String font);
}