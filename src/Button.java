import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Button {
    //Textless Button
    public static void create(ImageIcon color, int x, int y, int w, int l, String command, ActionListener listener, JPanel panel){
        //Make the button object
        JButton button = new JButton(color);

        //Set the location and size of the button
        button.setBounds(x, y, w, l);

        //Set what key the button will accept
        //In our case, release of left mouse click
        button.setMnemonic(KeyEvent.VK_D);

        //Adds the command string to the button
        //This string will be used when parsing what action to do in out listener
        //Basically, defines its action in the route
        button.setActionCommand(command);

        //Say what listener to use
        //This parses the command and then calls proper function
        button.addActionListener(listener);

        //Adds the button to the panel
        panel.add(button);
    }

    //Button with text
    public static void create(ImageIcon color, int x, int y, int w, int l, String command,
                              ActionListener listener, JPanel f, String buttonname, Color buttonColor){
        //Make the button object
        //Also creates the text in the button
        JButton button = new JButton(buttonname,color);

        //Set the location and size of the button
        button.setBounds(x, y, w, l);

        //Set what key the button will accept
        //In our case, release of left mouse click
        button.setMnemonic(KeyEvent.VK_D);

        //Adds the command string to the button
        //This string will be used when parsing what action to do in out listener
        //Basically, defines its action in the route
        button.setActionCommand(command);

        //Say what listener to use
        //This parses the command and then calls proper function
        button.addActionListener(listener);

        //Say what color of text you want your button to have
        button.setForeground(buttonColor);

        //Says that we want the text in the middle
        button.setHorizontalTextPosition(SwingConstants.CENTER);

        //Adds the button to the panel
        f.add(button);
    }
}
