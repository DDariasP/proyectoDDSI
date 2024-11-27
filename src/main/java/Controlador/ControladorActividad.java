package Controlador;

import Aplicacion.*;
import Modelo.*;
import Vista.*;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class ControladorActividad {

    private final SessionFactory sessionFactory;
    private final ActividadDAO actividadDAO;

    public ControladorActividad(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.actividadDAO = new ActividadDAO();
    }

    public void actividadMonitor(ArrayList<Monitor> listaM) {
        //Pide el dni
        String dni;
        try {
            Object input = JOptionPane.showInputDialog(null, "DNI de monitor:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                String str = String.valueOf(input);
                str = Filtro.mayus(str);
                str = Filtro.tildes(str);
                dni = str;
                Set<Actividad> act = null;
                boolean encontrado = false;
                int cont = 0;
                while (!encontrado && cont < listaM.size()) {
                    String guardado = listaM.get(cont).getDni();
                    if (dni.equals(guardado)) {
                        encontrado = true;
                        act = listaM.get(cont).getActividades();
                    }
                    cont++;
                }
                //Muestra actividades
                if (!encontrado) {
                    throw new Exception("DNI no existe");
                } else {
                    VistaActividad.muestraActividades(act);
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            VistaMensaje.mensajeConsola(e.getMessage());
        }
    }

    public void actividadSocio(ArrayList<Socio> listaS) {
        //Pide el numSocio
        String num;
        try {
            Object input = JOptionPane.showInputDialog(null, "Numero de socio:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                String str = String.valueOf(input);
                str = Filtro.mayus(str);
                str = Filtro.tildes(str);
                num = str;
                Set<Actividad> act = null;
                boolean encontrado = false;
                int cont = 0;
                while (!encontrado && cont < listaS.size()) {
                    String guardado = listaS.get(cont).getNumeroSocio();
                    if (num.equals(guardado)) {
                        encontrado = true;
                        act = listaS.get(cont).getActividades();
                    }
                    cont++;
                }
                //Muestra actividades
                if (!encontrado) {
                    throw new Exception("Numero de socio no existe");
                } else {
                    VistaActividad.muestraActividades(act);
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            VistaMensaje.mensajeConsola(e.getMessage());
        }
    }

    public ArrayList<Actividad> listaActividad() {
        ArrayList<Actividad> actividades = null;
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        //Lee la lista de socios
        try {
            actividades = actividadDAO.listaActividad(sesion);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            VistaMensaje.mensajeConsola("Error en Actividad: " + e.getMessage());
        } 
        return actividades;
    }

}
