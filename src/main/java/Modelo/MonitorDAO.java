package Modelo;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class MonitorDAO {

    public ArrayList<Monitor> listaMonitor(Session sesion) {
        Query consulta = sesion.createNativeQuery("SELECT * FROM MONITOR m", Monitor.class);
        ArrayList<Monitor> lista = (ArrayList<Monitor>) consulta.getResultList();
        return lista;
    }

    public Monitor getMonitor(Session sesion, String cod) {
        Query consulta = sesion.createNamedQuery("Monitor.findByDni", Monitor.class);
        Monitor m = (Monitor) consulta.getSingleResult();
        return m;
    }

}
