package Controlador;

import Modelo.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class ControladorActividad {

    private SessionFactory sessionFactory;
    private ActividadDAO actividadDAO;

    ControladorActividad(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.actividadDAO = new ActividadDAO();

    }
}
