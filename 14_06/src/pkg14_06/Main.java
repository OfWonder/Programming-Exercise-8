//My name is Joseph Posey and this is my work.
package pkg14_06;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args) 
    {
      launch(args);
    }
    
    public void start(Stage primaryStage) throws Exception
    {
        Parent Splash = FXMLLoader.load(getClass().getResource("CheckBoard.fxml"));
        
        Scene SplashScene = new Scene(Splash, 600, 400);
        
        primaryStage.setTitle("Checkerboard");
        primaryStage.setScene(SplashScene);
        primaryStage.setResizable(false);
        primaryStage.show();
        
    }   
}
