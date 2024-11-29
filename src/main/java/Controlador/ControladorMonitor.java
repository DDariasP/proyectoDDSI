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

    private final SessionFactory sf;
    private final MonitorDAO monitorDAO;

    public ControladorMonitor(SessionFactory sesion) {
        sf = sesion;
        monitorDAO = new MonitorDAO();
    }

    public ArrayList<Monitor> listaMonitor() {
        ArrayList<Monitor> monitores = null;
        Session sesion = sf.openSession();
        Transaction tr = sesion.beginTransaction();
        //Lee la lista de monitores
        try {
            monitores = monitorDAO.listaMonitor(sesion);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            VistaMensaje.Consola("Error en Monitor: " + e.getMessage());
        }
        return monitores;
    }

}
