package Controlador;

import Modelo.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class ControladorMonitor {

    private SessionFactory sessionFactory;
    private MonitorDAO monitorDAO;

    ControladorMonitor(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.monitorDAO = new MonitorDAO();

    }
}
