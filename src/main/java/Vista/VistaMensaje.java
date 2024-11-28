package Vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class VistaMensaje {

    public static void Mensaje(Component c, String e, String tipo) {
        UIManager.put("OptionPane.messageFont", new Font("Monospaced", Font.BOLD, 24));
        UIManager.put("OptionPane.messageForeground", Color.LIGHT_GRAY);
        UIManager.put("OptionPane.buttonFont", new Font("Monospaced", Font.BOLD, 24));
        UIManager.put("Button.background", Color.LIGHT_GRAY);
        UIManager.put("OptionPane.background", Color.DARK_GRAY);
        UIManager.put("Panel.background", Color.DARK_GRAY);
        UIManager.put("TextField.font", new Font("Monospaced", Font.BOLD, 24));
        UIManager.put("TextField.background", Color.LIGHT_GRAY);
        switch (tipo) {
            case "Error":
                JOptionPane.showMessageDialog(c, e, tipo, JOptionPane.ERROR_MESSAGE);
                break;
            case "Info":
                JOptionPane.showMessageDialog(c, e, tipo, JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(c, e, tipo, JOptionPane.WARNING_MESSAGE);
                break;
        }
    }

}
