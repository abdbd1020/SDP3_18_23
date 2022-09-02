package GUI;

import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.text.Font;

public class HighDetailedButton implements UIElement {
    private Button button;

    private final static String name = "High Detailed Button";
    private final static int layoutX = 100;
    private final static int layOutY = 20;

    public HighDetailedButton() {
        button = new Button();
        button.setLayoutX(layoutX);
        button.setLayoutY(layOutY);
        button.setText(name);
        button.setStyle(
                "-fx-background-color: \n" +
                "        #777700,\n" +

                "        linear-gradient(#fafdfe, #e8f5fc),\n" +
                "        linear-gradient(#eaf6fd 0%, #d9f0fc 49%, #bee6fd 50%, #a7d9f5 100%);\n" +
                "    -fx-background-radius: 3,2,1;\n" +
                "    -fx-padding: 3 30 3 30;\n" +
                "    -fx-font-size: 10px;");
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
    public void setYCoordinate(int layOutY) {
        button.setLayoutY(layOutY);
    }

    @Override
    public void setColor(String color) {
        //-fx-background-color: " + color + ";
        button.setStyle(
                "-fx-background-color: \n" +
                                color+",\n" +
                        "        linear-gradient(#fafdfe, #e8f5fc),\n" +
                        "        linear-gradient(#eaf6fd 0%, #d9f0fc 49%, #bee6fd 50%, #a7d9f5 100%);\n" +
                        "    -fx-background-radius: 5,4,3,5;\n" +
                        "    -fx-background-insets: 0,1,2,0;\n" +
                        "    -fx-text-fill: white;\n" +
                        "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" +
                        "    -fx-font-family: \"calibri\";\n" +
                        "    -fx-text-fill: linear-gradient(black, #d0d0d0);\n" +
                        "    -fx-font-size: 16px;\n" +
                        "    -fx-padding: 4 3 16 5;");
    }

    @Override
    public void setFont(String font) {
        button.setFont(Font.font(font));
    }
    @Override
    public void setHeight(Double height) {
        button.setPrefHeight(height);
    }
    public void setWidth(Double width) {
        button.setPrefWidth(width);
    }



}
