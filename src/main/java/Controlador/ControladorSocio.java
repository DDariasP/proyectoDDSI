package Controlador;

import Modelo.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class ControladorSocio {

    private SessionFactory sessionFactory;
    private SocioDAO socioDAO;

    ControladorSocio(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.socioDAO = new SocioDAO();

    }
}
