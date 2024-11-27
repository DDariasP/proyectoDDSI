package Vista;

import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class VistaSocio {

    public void muestraSocios_Numero_Nombre(ArrayList<Socio> lSocios) {
        System.out.println("#Socio" + "\t" + "Nombre");
        for (Socio s : lSocios) {
            System.out.println(s.getNumeroSocio() + "\t" + s.getNombre());
        }

    }
    
}
