package GUI;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class SimplisticTextField implements UIElement {
    private TextField textField;

    // Default values for simplistic design style
    private String value = "Simple Text";
    private int x = 200;
    private int y = 200;

    public SimplisticTextField() {
        textField = new TextField();
        textField.setText(value);
        textField.setLayoutX(x);
        textField.setLayoutY(y);
        textField.setText(value);
        textField.setEditable(false);
    }

    @Override
    public Control getElement() {
        return textField;
    }

    @Override
    public void setValue(String value) {
        textField.setText(value);
    }

    @Override
    public void setXCoordinate(int x) {
        textField.setLayoutX(x);
    }

    @Override
    public void setYCoordinate(int y) {
        textField.setLayoutY(y);
    }

    @Override
    public void setColor(String color) {
        textField.setStyle("-fx-background-color: " + color + ";");
    }

    @Override
    public void setFont(String font) {
        textField.setFont(Font.font(font, 10));
    }
}
