package GUI;

import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.text.Font;

public class SimplisticButton implements UIElement {
    private Button button;

    // Default values for simplistic design style
    private final static String value = "Simple Button";
    private final static int x = 100;
    private final static int y = 200;

    public SimplisticButton() {
        button = new Button();
        button.setText(value);
        button.setLayoutX(x);
        button.setLayoutY(y);
        button.setText(value);
    }

    @Override
    public Control getElement() {
        return button;
    }

    @Override
    public void setValue(String value) {
        button.setText(value);
    }

    @Override
    public void setXCoordinate(int x) {
        button.setLayoutX(x);
    }

    @Override
    public void setYCoordinate(int y) {
        button.setLayoutY(y);
    }

    @Override
    public void setColor(String color) {
        button.setStyle("-fx-background-color: " + color + ";");
    }

    @Override
    public void setFont(String font) {
        button.setFont(Font.font(font, 10));
    }
}
