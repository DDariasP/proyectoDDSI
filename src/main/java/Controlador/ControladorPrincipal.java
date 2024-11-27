package Controlador;

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
    }

}
