//My name is Joseph Posey and this is my work
package pleasework;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PleaseWork extends Application
{
    public static Stage primaryStage;
    public static Scene SplashScene;
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    public void start(Stage primaryStage) throws Exception
    {
        Parent Splash = FXMLLoader.load(getClass().getResource("Cards.fxml"));
        
        Scene SplashScene = new Scene(Splash, 600, 400);
        
        primaryStage.setTitle("Please Work");
        primaryStage.setScene(SplashScene);
        primaryStage.setResizable(false);
        primaryStage.show();
        
    }
}
