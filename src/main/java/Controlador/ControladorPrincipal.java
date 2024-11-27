package Controlador;

import Aplicacion.*;
import Config.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class ControladorPrincipal {

    private SessionFactory sessionFactory;

    public ControladorPrincipal() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
        MenuP2 m = new MenuP2(sessionFactory);
        m.setTitle("DDSI - Práctica 3");
        m.setBounds(0, 0, 600,450);
        m.setVisible(true);
    }

}
