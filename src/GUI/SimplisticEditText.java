package GUI;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class SimplisticEditText implements UIElement {
    private final TextField editText;

    // Default values for simplistic design style
    private int layoutX = 300;
    private int layoutY = 20;

    public SimplisticEditText() {
        editText = new TextField();
        editText.setLayoutX(layoutX);
        editText.setLayoutY(layoutY);
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
    public void setXCoordinate(int layoutX) {
        editText.setLayoutX(layoutX);
    }

    @Override
    public void setYCoordinate(int layoutY) {
        editText.setLayoutY(layoutY);
    }

    @Override
    public void setColor(String color) {
        editText.setStyle("-fx-background-color: " + color + ";");
    }

    @Override
    public void setFont(String font) {
        editText.setFont(Font.font(font, 10));
    }
    @Override
    public void setHeight(Double height) {
        editText.setPrefHeight(20);
    }
    public void setWidth(Double width) {
        editText.setPrefWidth(60);
    }
}
