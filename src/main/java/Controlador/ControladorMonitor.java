package Controlador;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class ControladorMonitor {

    private final SessionFactory sessionFactory;
    private final MonitorDAO monitorDAO;

    public ControladorMonitor(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.monitorDAO = new MonitorDAO();
    }

    public ArrayList<Monitor> listaMonitor() {
        ArrayList<Monitor> monitores = null;
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        //Lee la lista de monitores
        try {
            monitores = monitorDAO.listaMonitor(sesion);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
//            VistaMensaje.mensajeConsola("Error en Monitor: " + e.getMessage());
        } 
        return monitores;
    }
    
}
