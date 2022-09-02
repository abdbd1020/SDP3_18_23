package GUI;

import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.text.Font;

public class SimplisticButton implements UIElement {
    private Button button;


    private final static String name = "Simplistic Button";
    private final static int layoutX = 100;
    private final static int layoutY = 20;

    public SimplisticButton() {
        button = new Button();
        button.setText(name);
        button.setLayoutX(layoutX);
        button.setLayoutY(layoutY);

    }

    @Override
    public Control getElement() {
        return button;
    }

    @Override
    public void setValue(String name) {
        button.setText(name);
    }

    @Override
    public void setXCoordinate(int layoutX) {
        button.setLayoutX(layoutX);
    }

    @Override
    public void setYCoordinate(int layoutY) {
        button.setLayoutY(layoutY);
    }

    @Override
    public void setColor(String color) {
        button.setStyle("-fx-background-color: " + color + ";");
    }

    @Override
    public void setFont(String font) {
        button.setFont(Font.font(font, 10));
    }
    @Override
    public void setHeight(Double height) {
        button.setPrefHeight(20);
    }
    public void setWidth(Double width) {
        button.setPrefWidth(50);
    }
}
