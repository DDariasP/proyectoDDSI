package Controlador;

import Vista.*;
import Config.HibernateUtil;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import org.hibernate.SessionFactory;

/**
 *
 * @author diego
 */
public class ControladorConexion {

    public static String user;
    public static String pass;
    public static SessionFactory sessionFactory;
    public static ControladorPrincipal cp;

    public ControladorConexion() {
        VistaConexion vc = new VistaConexion();
        vc.setTitle("Acceso a la Aplicación");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        vc.setLocation(size.width / 3, size.height / 3);
        vc.setVisible(true);
        vc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void nuevaSesion(VistaConexion vc, String u, String p) {
        user = "DDSI_055";
        pass = "capybara";
//        user = u;
//        pass = p;
        sessionFactory = HibernateUtil.buildSessionFactory();
        if (sessionFactory == null) {
            VistaMensaje.Mensaje(vc, "Error al introducir las credenciales.", "Error");
            vc = new VistaConexion();
            vc.setTitle("Acceso a la Aplicación");
            Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
            vc.setLocation(size.width / 3, size.height / 3);
            vc.setVisible(true);
            vc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else {
            VistaMensaje.Mensaje(vc, "Conexión correcta con Hibernate.\nVa a acceder a la Aplicación.", "Info");
            cp = new ControladorPrincipal(sessionFactory);
        }
    }

}
