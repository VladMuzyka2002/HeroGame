import javax.swing.*;
import java.awt.*;

public class Frame {
    //Makes our frame
    public static JFrame create(Color color, int w, int h){
        //Create the frame object
        JFrame frame = new JFrame();

        //Sets the window size
        frame.setSize(w,h);

        //returns the frame object
        return frame;
    }
}
