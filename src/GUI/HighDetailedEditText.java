package GUI;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class HighDetailedEditText implements UIElement {
    private final TextField editText;

    // Default values for simplistic design style
    private int x = 100;
    private int y = 100;

    public HighDetailedEditText() {

        editText = new TextField();
        editText.setLayoutX(x);
        editText.setLayoutY(y);
        editText.setStyle("-fx-background-color: \n" +
                "        linear-gradient(#f2f2f2, #d6d6d6),\n" +
                "        linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%),\n" +
                "        linear-gradient(#dddddd 0%, #f6f6f6 50%);\n" +
                "    -fx-background-radius: 8,7,6;\n" +
                "    -fx-background-insets: 0,1,2;\n" +
                "    -fx-text-fill: black;\n" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
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

//        editText.setStyle("-fx-background-color: " + color + ";");
        editText.setStyle("-fx-background-color: \n" +
                "        " + color + ";\n" +
                "    -fx-background-radius: 30;\n" +
                "    -fx-background-insets: 0;\n" +
                "    -fx-background-radius: 50;\n" +
                "    -fx-padding: 15 30 15 30;" +
                "    -fx-text-fill: black;\n" +
                "    -fx-font-size: 10px;" +
                "    -fx-border-color:black; -fx-border-width: 1; -fx-border-style: solid; -fx-border-radius: 30;" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
    }

    @Override
    public void setFont(String font) {
        editText.setFont(Font.font(font));
    }
}
