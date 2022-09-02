package GUI;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class HighDetailedEditText implements UIElement {
    private final TextField editText;

    // Default values for simplistic design style
    private int layoutX = 250;
    private int layoutY = 20;

    public HighDetailedEditText() {

        editText = new TextField();
        editText.setLayoutX(layoutX);
        editText.setLayoutY(layoutY);
        editText.setStyle(
                "-fx-background-color: \n" +
                        "        #777700,\n" +

                        "        linear-gradient(#ff00fe, #00f5fc),\n" +
                        "        linear-gradient(#eaf6fd 0%, #d9f0fc 49%, #bee6fd 50%, #a7d9f5 100%);\n" +
                        "    -fx-background-radius: 4,3,1;\n" +
                        "    -fx-padding: 3 30 3 30;\n" +
                        "    -fx-font-size: 12px;");
    }

    @Override
    public Control getElement() {
        return editText;
    }

    @Override
    public void setValue(String name) {
        editText.setText(name);
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

//        editText.setStyle("-fx-background-color: " + color + ";");
        editText.setStyle(
                "-fx-background-color: \n" +
                        color+",\n" +
                        "        linear-gradient(#ff00fe, #00f5fc),\n" +
                        "        linear-gradient(#eaf6fd 0%, #d9f0fc 49%, #bee6fd 50%, #a7d9f5 100%);\n" +
                        "    -fx-background-radius: 4,3,1;\n" +
                        "    -fx-padding: 3 30 30 30;\n" +
                        "    -fx-font-size: 16px;");
    }

    @Override
    public void setFont(String font) {
        editText.setFont(Font.font(font));
    }

    @Override
    public void setHeight(Double height) {
        editText.setPrefHeight(height);
    }
    public void setWidth(Double width) {
        editText.setPrefWidth(width);
    }
}
