package projectileGame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import projectileGame.engine.Engine;
import projectileGame.gui.GuiGlobals;

public class App extends Application
{
    public static void main(String[] args)
    {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        Scene scene = new Scene(root, GuiGlobals.WINDOW_WIDTH, GuiGlobals.WINDOW_HEIGHT);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Game");
        primaryStage.show();

        Engine.start();
    }
}