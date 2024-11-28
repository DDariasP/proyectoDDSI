package Vista;

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
        ImageIcon imageIcon = new ImageIcon("src/images/i.png");
        JLabel label = new JLabel(imageIcon);
        jp.add(label);
        return jp;
    }

}
