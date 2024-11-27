package Vista;

import Aplicacion.*;
import Modelo.*;
import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class VistaActividad {

    public static void muestraActividades(Set<Actividad> act) {
        JFrame frame = new JFrame("Actividades");
        Output.run(frame, 2160, 480);
        String str = String.format("%-4s %-15s %-9s %-5s %-15s %-30s\n", "ID", "Nombre", "Día", "Hora", "PrecioBaseMes", "MonitorResponsable");
        System.out.println(str);
        for (Actividad a : act) {
            System.out.println(a.mostrar());
        }
    }

}
