package WindowManager;


import ConfigManager.ConfigManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class WindowManager extends Application {
    private final static int windowWidth = 600;
    private final static int windowHeight = 450;
    private final static String title = "Roll_18_23_Assignment_3";




    @Override
    public void start(Stage stage) throws Exception {
        ConfigManager configManager = ConfigManager.getInstance();
        Pane pane = new Pane();
        configManager.readFile();
        while(configManager.hasMoreItems()){
            Control element = configManager.nextItem();
            pane.getChildren().add(element);
        }
        Scene scene=new Scene(pane,windowWidth,windowHeight);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public void run(String[] args){
        launch(args);
    }
}