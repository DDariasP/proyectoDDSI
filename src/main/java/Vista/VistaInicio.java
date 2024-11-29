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

    public static JPanel panel;
    public static JLabel label;
    public static Image imagen;

    public static JPanel generar() {
        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        URL imageURL = VistaInicio.class.getResource("/i.png");
        ImageIcon imageIcon;
        try {
            imagen = ImageIO.read(imageURL);
            imageIcon = new ImageIcon(imagen);
        } catch (IOException ex) {
            imageIcon = new ImageIcon("src/main/resources/i.png");
        }
        label = new JLabel(imageIcon);
        panel.add(label);
        return panel;
    }

}
