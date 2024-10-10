package Aplicacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.*;

/**
 * Lee informacion de pantalla.
 *
 * @author Diego Francisco Darias Pino
 */
public class Input {

    private JFrame jf;
    private JTextArea ta;
    public String input;

    public Input(String nombre) {
        jf = new JFrame(nombre);
        jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jf.setSize(400, 300);

        ta = new JTextArea(10, 30);
        ta.setBackground(Color.DARK_GRAY);
        ta.setForeground(Color.WHITE);
        ta.setFont(new Font("Monospaced", Font.LAYOUT_LEFT_TO_RIGHT, 24));

        JButton jb = new JButton("Confirmar");
        jb.setFont(new Font("Monospaced", Font.BOLD, 24));
        JLabel output = new JLabel("Valor leido: \"\"");
        output.setFont(new Font("Monospaced", Font.BOLD, 24));

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = ta.getText();
                ta.setText("");
                output.setText("Valor leido: \"" + input + "\"");
                jf.dispose();
            }
        });

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        jp.add(jb, BorderLayout.NORTH);
        jp.add(output, BorderLayout.SOUTH);

        jf.setLayout(new BorderLayout());
        jf.add(ta, BorderLayout.CENTER);
        jf.add(jp, BorderLayout.SOUTH);

        jf.setVisible(true);
    }

}
