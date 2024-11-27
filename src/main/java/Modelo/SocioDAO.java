package Modelo;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class SocioDAO {

    public void insertaSocio(Session sesion, Socio s) throws Exception {
        sesion.saveOrUpdate(s);
    }

    public ArrayList<Socio> listaSocio(Session sesion) throws Exception {
        Query consulta = sesion.createNativeQuery("SELECT * FROM SOCIO s", Socio.class);
        ArrayList<Socio> socios = (ArrayList<Socio>) consulta.getResultList();
        return socios;
    }

}
