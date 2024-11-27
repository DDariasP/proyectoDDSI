package Aplicacion;

import Controlador.*;
import javax.swing.JFrame;

/**
 * Inicio de la aplicación.
 *
 * @author Diego Francisco Darias Pino
 */
public class ProyectoDDSI {

    public static void main(String[] args) {
        ControladorPrincipal cp = new ControladorPrincipal();

        MenuP1 m = new MenuP1();
        m.setTitle("DDSI - Práctica 1");
        m.setBounds(0, 0, 1920, 1080);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
