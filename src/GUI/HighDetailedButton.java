package GUI;

import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.text.Font;

public class HighDetailedButton implements UIElement {
    private Button button;

    // Default values for simplistic design style
    private final static String value = "High Detailed Button";
    private final static int x = 100;
    private final static int y = 200;

    public HighDetailedButton() {
        button = new Button();
        button.setLayoutX(x);
        button.setLayoutY(y);
        button.setText(value);
        button.setStyle(
                "-fx-background-color: \n" +
                "        #3c7fb1,\n" +
                "        linear-gradient(#fafdfe, #e8f5fc),\n" +
                "        linear-gradient(#eaf6fd 0%, #d9f0fc 49%, #bee6fd 50%, #a7d9f5 100%);\n" +
                "    -fx-background-insets: 0,1,2;\n" +
                "    -fx-background-radius: 3,2,1;\n" +
                "    -fx-padding: 3 30 3 30;\n" +
                "    -fx-text-fill: black;\n" +
                "    -fx-font-size: 10px;");
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
        //-fx-background-color: " + color + ";
        button.setStyle(
                "-fx-background-color: \n" +
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
        button.setFont(Font.font(font));
    }
}
