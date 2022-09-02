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


    private void loadUI(ConfigManager configManager, Pane pane){
        configManager.execute();
        while(configManager.hasMoreItems()){
            Control element = configManager.nextElement();
            pane.getChildren().add(element);
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        ConfigManager configManager = ConfigManager.getInstance();
        Pane pane = new Pane();
        loadUI(configManager, pane);
        Scene scene=new Scene(pane,windowWidth,windowHeight);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public void execute(String[] args){
        launch(args);
    }
}