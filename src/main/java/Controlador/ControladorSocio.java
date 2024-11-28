package Controlador;

import Aplicacion.*;
import Modelo.*;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class ControladorSocio {

    private final SessionFactory sessionFactory;
    private final SocioDAO socioDAO;

    public ControladorSocio(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.socioDAO = new SocioDAO();
    }

    public void altaSocio(ArrayList<Socio> listaS) {
        Socio s = null;
        //Pide los datos
        if (listaS != null) {
            try {
                String num;
                Object input = JOptionPane.showInputDialog(null, "Numero de socio:", "Input", JOptionPane.QUESTION_MESSAGE);
                if (input != null) {
                    String str = String.valueOf(input);
                    str = Filtro.mayus(str);
                    str = Filtro.tildes(str);
                    num = str;
                    boolean encontrado = false;
                    int cont = 0;
                    while (!encontrado && cont < listaS.size()) {
                        String guardado = listaS.get(cont).getNumeroSocio();
                        if (num.equals(guardado)) {
                            encontrado = true;
                        }
                        cont++;
                    }
                    if (encontrado) {
                        throw new Exception("Numero de socio ya existe");
                    }
                } else {
                    throw new Exception();
                }
                String dni;
                input = JOptionPane.showInputDialog(null, "DNI:", "Input", JOptionPane.QUESTION_MESSAGE);
                if (input != null) {
                    String str = String.valueOf(input);
                    str = Filtro.mayus(str);
                    str = Filtro.tildes(str);
                    dni = str;
                    boolean encontrado = false;
                    int cont = 0;
                    while (!encontrado && cont < listaS.size()) {
                        String guardado = listaS.get(cont).getNumeroSocio();
                        if (dni.equals(guardado)) {
                            encontrado = true;
                        }
                        cont++;
                    }
                    if (encontrado) {
                        throw new Exception("DNI ya existe");
                    }
                } else {
                    throw new Exception();
                }
                s = new Socio(num, "Nuevo Socio", dni, "XX/XX/19XX", "123456789", "nombre@gmail.com", "XX/XX/2024", 'A');
            } catch (Exception e) {
//                VistaMensaje.mensajeConsola(e.getMessage());
            }
        }

        //Inserta el socio
        if (s != null) {
            Session sesion = sessionFactory.openSession();
            Transaction tr = sesion.beginTransaction();
            try {
                socioDAO.insertaSocio(sesion, s);
                tr.commit();
//                VistaMensaje.mensajeConsola("Socio insertado correctamente.");
            } catch (Exception e) {
                tr.rollback();
//                VistaMensaje.mensajeConsola("Error en la inserión: " + e.getMessage());
            } finally {
                if (sesion.isOpen()) {
                    sesion.close();
                }
            }
        }
    }

    public ArrayList<Socio> listaSocio() {
        ArrayList<Socio> socios = null;
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        //Lee la lista de socios
        try {
            socios = socioDAO.listaSocio(sesion);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
//            VistaMensaje.mensajeConsola("Error en Socio: " + e.getMessage());
        } 
        return socios;
    }

}
