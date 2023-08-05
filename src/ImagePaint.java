import javax.swing.*;

public class ImagePaint {
    public static ImageIcon create(String path) {
        //get the image from the filepath provided and create an image object based on it
        return new ImageIcon(main.class.getResource(path));
    }
}
