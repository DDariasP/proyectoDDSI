package Controlador;

import Vista.*;
import Config.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 *
 * @author diego
 */
public class ControladorConexion {

    public static String user;
    public static String pass;
    public static SessionFactory sf;
    public static VistaConexion vc;
    public static VistaPrincipal vp;

    public static void nuevaSesion(VistaConexion vista, String u, String p) {
        vc = vista;
        user = "DDSI_055";
        pass = "capybara";
//        user = u;
//        pass = p;
        sf = HibernateUtil.buildSessionFactory();
        if (sf == null) {
            VistaMensaje.Mensaje(vc, "Error al introducir las credenciales.", "Error");
            vc = new VistaConexion();
        } else {
            VistaMensaje.Mensaje(vc, "Conexión correcta con Hibernate.\nVa a acceder a la Aplicación.", "Info");
            vp = new VistaPrincipal(sf);
        }
    }

}
