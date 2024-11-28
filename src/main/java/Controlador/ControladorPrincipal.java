package Controlador;

import Vista.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import org.hibernate.SessionFactory;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class ControladorPrincipal {

    private final SessionFactory sessionFactory;

    ControladorPrincipal(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        VistaPrincipal vp = new VistaPrincipal(this.sessionFactory);
        vp.setTitle("Gestión del gimnasio \"Strength Haven\"");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        vp.setLocation(size.width / 3, size.height / 3);
        vp.setVisible(true);
        vp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
