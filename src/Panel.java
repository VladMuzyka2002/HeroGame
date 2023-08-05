import javax.swing.*;
import java.awt.*;

public class Panel {
    //Makes our panels
    public static JPanel create(Color color, int w, int h){
        //Makes the panel object
        JPanel panel = new JPanel();

        //Honestly I am not too sure what this does, but without it the UI is a mess
        panel.setLayout(null);

        //Sets the size of the panel
        panel.setSize(w,h);

        //Sets the background to the color given
        panel.setBackground(color);

        //Returns the panel object
        return panel;
    }
}
