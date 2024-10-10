package Aplicacion;

import javax.swing.*;
import java.awt.*;
import java.io.PrintStream;
import static javax.swing.WindowConstants.*;

/**
 * Redirige la salida en consola a pantalla.
 *
 * @author Diego Francisco Darias Pino
 */
public class Output {

    private static JTextArea ta;

    public static void run(JFrame jf, int ancho, int alto) {

        jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jf.setSize(ancho, alto);

        ta = new JTextArea();
        ta.setEditable(false);

        ta.setBackground(Color.DARK_GRAY);
        ta.setForeground(Color.WHITE);
        ta.setFont(new Font("Monospaced", Font.LAYOUT_LEFT_TO_RIGHT, 24));

        JScrollPane jsp = new JScrollPane(ta);
        jf.add(jsp, BorderLayout.CENTER);

        PrintStream ps = new PrintStream(new MyOutputStream(ta));
        System.setOut(ps);
        System.setErr(ps);

        jf.setVisible(true);
    }

    public static void clear() {
        ta.setText("");
    }
}
