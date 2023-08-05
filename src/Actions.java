import javax.swing.*;
import java.awt.*;

public class Actions {
    public static void GoToBluePage(){
        //Get rid of current panel
        main.frame.getContentPane().removeAll();

        //Add the new, blue panel
        main.frame.getContentPane().add(Panel.create(Color.BLUE, main.SCREEN_WIDTH, main.SCREEN_HEIGHT));

        //Update
        main.frame.repaint();
    }

    public static void GoToHeroSelect(){
        main.frame.getContentPane().removeAll();
        main.prepareScreenTwo();
        main.frame.repaint();
        //main.frame.getContentPane().add(Panel.create(Color.BLUE, main.SCREEN_WIDTH, main.SCREEN_HEIGHT));
    }

    public static void GoToMainMenu(){
        main.frame.getContentPane().removeAll();
        main.prepareScreenOne();
        main.frame.repaint();
    }

    public static void GoToCharacterMenu(){
        main.frame.getContentPane().removeAll();
        main.prepareCharacterSummary();
        main.frame.repaint();
    }
}
