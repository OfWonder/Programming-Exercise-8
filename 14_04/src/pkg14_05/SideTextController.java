//My name is Joseph Psoey and this is my work.
package pkg14_05;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;


public class SideTextController implements Initializable 
{

    @FXML Text t1, t2, t3, t4, t5;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        RandButton();
    }    
    
    @FXML public void RandButton()
    {
        rando(1);
        rando(2);
        rando(3);
        rando(4);
        rando(5);
    }
    
    @FXML
    public void rando(int i)
    {
        int p1 = (int) (Math.random() * (255 - 1));
        int p2 = (int) (Math.random() * (255 - 1));
        int p3 = (int) (Math.random() * (255 - 1));
        double p4 = (double) (Math.random() * (1 - 0));
        String randomColor = p1 + ", " + p2 + ", " + p3;
        DecimalFormat df = new DecimalFormat("#.##");
        if (i == 1)
        {
            t1.setStyle("-fx-opacity: " + df.format(p4) + "; -fx-rotate: 90; -fx-fill: rgb(" + randomColor +  ")");
        }
        else if (i == 2)
        {
            t2.setStyle("-fx-opacity: " + df.format(p4) + "; -fx-rotate: 90; -fx-fill: rgb(" + randomColor +  ")");
        }
        else if (i == 3)
        {
            t3.setStyle("-fx-opacity: " + df.format(p4) + "; -fx-rotate: 90; -fx-fill: rgb(" + randomColor +  ")");
        }
        else if (i == 4)
        {
            t4.setStyle("-fx-opacity: " + df.format(p4) + "; -fx-rotate: 90; -fx-fill: rgb(" + randomColor +  ")");
        }
        else
        {
            t5.setStyle("-fx-opacity: " + df.format(p4) + "; -fx-rotate: 90; -fx-fill: rgb(" + randomColor +  ")");
        }
    }   
}
