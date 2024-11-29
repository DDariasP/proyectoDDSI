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

    private final SessionFactory sf;
    private final ControladorMonitor cm;
    private final ControladorSocio cs;
    private final ControladorActividad ca;

    ControladorPrincipal(SessionFactory sessionFactory) {
        this.sf = sessionFactory;
        cm = new ControladorMonitor(sf);
        cs = new ControladorSocio(sf);
        ca = new ControladorActividad(sf);
        VistaPrincipal vp = new VistaPrincipal(cm, cs, ca);
        vp.setTitle("Gestión del gimnasio \"Strength Haven\"");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        vp.setLocation(0, size.height / 7);
        vp.setVisible(true);
        vp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
