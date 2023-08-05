import java.awt.*;
import java.sql.SQLException;
import javax.swing.*;
public class main extends Canvas {

    //colors and icons
    static ImageIcon gray = ImagePaint.create("images/gray.png");
    static ImageIcon longgray = ImagePaint.create("images/longgray.png");
    static ImageIcon white = ImagePaint.create("images/white.png");
    static ImageIcon tallwhite = ImagePaint.create("images/tallwhite.png");
    static Color yellowish = Color.decode("#d7a928");

    //SQL database
    //static Connection conn = Db.conn();
    static SQLDatabase sqldb;

    static {
        sqldb = SQLDatabase.getInstance();
    }

    //Configurations
    static config config;

    static {
        try {
            config = new config(1, 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //processes the commands, router of sorts
    static ActionListener listener = new ActionListener();

    //Resolution
    static final int SCREEN_WIDTH = config.resolution.width;
    static final int SCREEN_HEIGHT = config.resolution.length;

    //Our frame
    static JFrame frame = Frame.create(yellowish, SCREEN_WIDTH, SCREEN_HEIGHT);

    //Font object that we will use for our text, we may use more later
    static Font font = new Font(config.font.name, config.font.style, config.font.size);

    //runs starting script
    public static void main(String[] args) {
        //does what the function says
        prepareScreenOne();

        //show our frame, and with it our screen
        frame.setVisible(true);
    }

    public static void prepareScreenOne() {
        //create our main screen
        JPanel panel_one = Panel.create(yellowish, SCREEN_WIDTH, SCREEN_HEIGHT);

        //create the buttons we want for screen one
        Button.create(longgray, centerWidth(600), 400, 600, 75, "print one", listener, panel_one, "Print message", Color.white);
        Button.create(longgray, centerWidth(600), 500, 600, 75, "blue page", listener, panel_one, "Move to next page", Color.white);

        String text = "Welcome to Hero Game";
        //Title for our screen
        Text.create(text, panel_one, font, Text.centerTextWidth(text), 100, 900, 100);

        //Adds the screen to our frame
        frame.getContentPane().add(panel_one);

    }

    public static void prepareScreenTwo(){
        JPanel panelHeroSelect = Panel.create(main.yellowish, main.SCREEN_WIDTH, main.SCREEN_HEIGHT);

        Button.create(longgray,  centerWidth(600), 400, 600, 75, "character menu", listener, panelHeroSelect, "Paladin",  Color.white);
        Button.create(longgray,  50, 650, 200, 75, "main menu", listener, panelHeroSelect, "Main menu",  Color.white);
        String text = "Select Your Class";
        Text.create(text, panelHeroSelect, font, Text.centerTextWidth(text), 100, 900, 100);
        frame.getContentPane().add(panelHeroSelect);
    }

    public static void prepareCharacterSummary(){
        JPanel panelHeroSummary = Panel.create(main.yellowish, main.SCREEN_WIDTH, main.SCREEN_HEIGHT);
        JLabel pic1 = new JLabel(white);
        pic1.setBounds(0,0,1560, 100);
        //JLabel text = Text.create("Select Your Class", pic, font, 0, 0, 100, 100);
        panelHeroSummary.add(pic1);
        JLabel pic2 = new JLabel(tallwhite);
        pic2.setBounds(0,0,150, 800);
        //JLabel text = Text.create("Select Your Class", pic, font, 0, 0, 100, 100);
        panelHeroSummary.add(pic2);
        //Text.create(text, panelHeroSummary, font, Text.centerTextWidth(text), 0, 900, 100);
        frame.getContentPane().add(panelHeroSummary);
    }

    //Returns the location where the button should be placed
    //In the middle, that is
    public static int centerWidth(int width) {
        return (SCREEN_WIDTH - width) / 2;
    }


}
