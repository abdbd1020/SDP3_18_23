package GUI;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class SimplisticTextField implements UIElement {
    private TextField textField;

    // Default values for simplistic design style
    private String name = "Simple Text";
    private int layoutX = 200;
    private int layoutY = 20;

    public SimplisticTextField() {
        textField = new TextField();
        textField.setText(name);
        textField.setLayoutX(layoutX);
        textField.setLayoutY(layoutX);
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
    public void setXCoordinate(int layoutX) {
        textField.setLayoutX(layoutX);
    }

    @Override
    public void setYCoordinate(int layoutY) {
        textField.setLayoutY(layoutY);
    }

    @Override
    public void setColor(String color) {
        textField.setStyle("-fx-background-color: " + color + ";");
    }

    @Override
    public void setFont(String font) {
        textField.setFont(Font.font(font, 10));
    }
    @Override
    public void setHeight(Double height) {
        textField.setPrefHeight(20);
    }
    public void setWidth(Double width) {
        textField.setPrefWidth(70);
    }
}
