package Controlador;

import Vista.*;
import javax.swing.JPanel;
import org.hibernate.SessionFactory;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class ControladorPrincipal {

    public static SessionFactory sf;
    public static JPanel vi, vm, vs, vac;

    public static JPanel getVistaInicio(SessionFactory sesion) {
        sf = sesion;
        vi = VistaInicio.generar();
        return vi;
    }

    public static JPanel getVistaMonitor(SessionFactory sesion) {
        sf = sesion;
        vm = VistaMonitor.generar(sf);
        return vm;
    }

    public static JPanel getVistaSocio(SessionFactory sesion) {
        sf = sesion;
        vs = VistaSocio.generar(sf);
        return vs;
    }

    public static JPanel getVistaActividad(SessionFactory sesion) {
        sf = sesion;
        vac = VistaActividad.generar(sf);
        return vac;
    }

}
