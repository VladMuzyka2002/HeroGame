import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;

public class Text {
    public static void create(String text, JPanel panel, Font font, int x, int y, int w, int h){
        //Makes the label object with given text
        JLabel label = new JLabel(text);

        //Chooses font for the text
        label.setFont(font);

        //Sets the text size and location
        //Note that we first get the pixel width of the text
        label.setBounds(x, y, w, h);
        panel.add(label);
    }

    //finds pixel length of the text and centers it
    public static int centerTextWidth(String text){
        //christ help me explain what this is
        AffineTransform affinetransform = new AffineTransform();
        FontRenderContext frc = new FontRenderContext(affinetransform,true,true);

        //calculates the location where the text should start being printed
        double strlen = (main.SCREEN_WIDTH - main.font.getStringBounds(text, frc).getWidth()) / 2;

        //converts the value into an int
        return Math.toIntExact(Math.round(strlen));


    }


}
