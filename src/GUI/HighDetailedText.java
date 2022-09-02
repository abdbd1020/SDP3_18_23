package GUI;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class HighDetailedText implements UIElement {
    private TextField textField;

    // Default values for simplistic design style
    private String value = "High Detailed Text";
    private int x = 200;
    private int y = 150;

    public HighDetailedText() {
        textField = new TextField();
        textField.setText(value);
        textField.setLayoutX(x);
        textField.setLayoutY(y);
        textField.setText(value);
        textField.setEditable(false);
        textField.setStyle("-fx-background-color: \n" +
                "        #090a0c,\n" +
                "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" +
                "        linear-gradient(#20262b, #191d22),\n" +
                "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" +
                "    -fx-background-radius: 5,4,3,5;\n" +
                "    -fx-background-insets: 0,1,2,0;\n" +
                "    -fx-text-fill: white;\n" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" +
                "    -fx-font-family: \"Arial\";\n" +
                "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" +
                "    -fx-font-size: 12px;\n" +
                "    -fx-padding: 10 20 10 20;");
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

//        textField.setStyle("-fx-background-color: " + color + ";");
        textField.setStyle("-fx-background-color: \n" +
                "        " + color + ";\n" +
                "    -fx-background-radius: 30;\n" +
                "    -fx-background-insets: 0;\n" +
                "    -fx-text-fill: white;" +
                "    -fx-text-fill: black;\n" +
                "    -fx-font-size: 10px;" +
                "    -fx-border-color:black; -fx-border-width: 1; -fx-border-style: solid; -fx-border-radius: 30;" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
    }

    @Override
    public void setFont(String font) {
        textField.setFont(Font.font(font));
    }
}
