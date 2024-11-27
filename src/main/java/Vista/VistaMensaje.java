package Vista;

import Aplicacion.Output;
import javax.swing.JFrame;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class VistaMensaje {

    public static void mensajeConsola(String texto) {
        JFrame frame = new JFrame("Mensaje");
        Output.run(frame, 720, 480);
        System.out.println("***************************************");
        System.out.println(texto);
        System.out.println("***************************************");
    }

}
