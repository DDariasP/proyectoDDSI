package Modelo;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class ActividadDAO {

    public ArrayList<Actividad> listaActividad(Session sesion) {
        Query consulta = sesion.createNativeQuery("SELECT * FROM ACTIVIDAD a", Actividad.class);
        ArrayList<Actividad> actividades = (ArrayList<Actividad>) consulta.getResultList();
        return actividades;
    }

}
