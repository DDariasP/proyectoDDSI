package Vista;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class VistaInicio {

    public static JPanel generar() {
        JPanel jp = new JPanel();
        jp.setBackground(Color.DARK_GRAY);
        URL imageURL = VistaInicio.class.getResource("/i.png");
        ImageIcon imageIcon;
        try {
            Image im = ImageIO.read(imageURL);
            imageIcon = new ImageIcon(im);
        } catch (IOException ex) {
            imageIcon = new ImageIcon("src/main/resources/i.png");
        }
        JLabel label = new JLabel(imageIcon);
        jp.add(label);
        return jp;
    }

}
