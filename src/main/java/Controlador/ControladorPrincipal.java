package Controlador;

import Aplicacion.*;
import Config.HibernateUtil;
import Vista.*;
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
        VistaPrincipal cc = new VistaPrincipal();
    }

}
