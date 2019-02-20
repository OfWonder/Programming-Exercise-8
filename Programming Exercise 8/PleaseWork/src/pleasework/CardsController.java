//My name is joseph Posey and this is my work
package pleasework;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class CardsController implements Initializable 
{
    @FXML AnchorPane pane;
    @FXML ImageView Card1, Card2, Card3;
    
    @FXML
    public void cardsIn()
    {
        int p1 = (int) (Math.random() * (52 - 1));
        int p2 = (int) (Math.random() * (52 - 1));
        int p3 = (int) (Math.random() * (52 - 1));
        if (p1 == 0)
        {
            p1++;
        }
        if (p2 == 0)
        {
            p2++;
        }
        if (p3 == 0)
        {
            p3++;
        }
        
        Image c1 = new Image(getClass().getResource("../img/" + p1 +".png").toString(), true);
        Image c2 = new Image(getClass().getResource("../img/" + p2 +".png").toString(), true);
        Image c3 = new Image(getClass().getResource("../img/" + p3 +".png").toString(), true);
        Card1.setImage(c1);
        Card2.setImage(c2);
        Card3.setImage(c3);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        cardsIn();
    }
}
