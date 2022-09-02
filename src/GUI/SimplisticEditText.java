package GUI;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class SimplisticEditText implements UIElement {
    private final TextField editText;

    // Default values for simplistic design style
    private int x = 100;
    private int y = 100;

    public SimplisticEditText() {
        editText = new TextField();
        editText.setLayoutX(x);
        editText.setLayoutY(y);
    }

    @Override
    public Control getElement() {
        return editText;
    }

    @Override
    public void setValue(String value) {
        editText.setText(value);
    }

    @Override
    public void setXCoordinate(int x) {
        editText.setLayoutX(x);
    }

    @Override
    public void setYCoordinate(int y) {
        editText.setLayoutY(y);
    }

    @Override
    public void setColor(String color) {
        editText.setStyle("-fx-background-color: " + color + ";");
    }

    @Override
    public void setFont(String font) {
        editText.setFont(Font.font(font, 10));
    }
}
