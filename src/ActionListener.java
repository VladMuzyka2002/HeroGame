import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionListener implements java.awt.event.ActionListener

{
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "print one":
                System.out.println("Pressed 1");
                break;
            case "blue page":
                Actions.GoToHeroSelect();
                break;
            case "main menu":
                Actions.GoToMainMenu();
                break;
            case "character menu":
                Actions.GoToCharacterMenu();
                break;
        }
    }
}
