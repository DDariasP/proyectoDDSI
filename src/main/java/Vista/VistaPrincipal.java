package Vista;

import Controlador.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private final SessionFactory sf;
    private final JPanel jpO, jpM, jpS, jpA;

    /**
     * Creates new form VistaPrincipal
     *
     * @param sesion
     */
    public VistaPrincipal(SessionFactory sesion) {
        initComponents();
        sf = sesion;
        this.setLayout(new CardLayout());
        jmBar.setBackground(Color.DARK_GRAY);

        jMenu1.setForeground(Color.WHITE);
        jMenu1.setFont(new Font("Monospaced", Font.BOLD, 24));
        jmO.setForeground(Color.WHITE);
        jmO.setFont(new Font("Monospaced", Font.BOLD, 24));
        jmO.setBackground(Color.DARK_GRAY);
        jpO = ControladorPrincipal.getVistaInicio(sf);
        this.add(jpO);
        jpO.setVisible(true);

        jMenu2.setForeground(Color.WHITE);
        jMenu2.setFont(new Font("Monospaced", Font.BOLD, 24));
        jmM.setForeground(Color.WHITE);
        jmM.setFont(new Font("Monospaced", Font.BOLD, 24));
        jmM.setBackground(Color.DARK_GRAY);
        jpM = ControladorPrincipal.getVistaMonitor(sf);
        this.add(jpM);

        jMenu3.setForeground(Color.WHITE);
        jMenu3.setFont(new Font("Monospaced", Font.BOLD, 24));
        jmS.setForeground(Color.WHITE);
        jmS.setFont(new Font("Monospaced", Font.BOLD, 24));
        jmS.setBackground(Color.DARK_GRAY);
        jpS = ControladorPrincipal.getVistaSocio(sf);
        this.add(jpS);

        jMenu4.setForeground(Color.WHITE);
        jMenu4.setFont(new Font("Monospaced", Font.BOLD, 24));
        jmA.setForeground(Color.WHITE);
        jmA.setFont(new Font("Monospaced", Font.BOLD, 24));
        jmA.setBackground(Color.DARK_GRAY);
        jpA = ControladorPrincipal.getVistaActividad(sf);
        this.add(jpA);

        jMenu5.setForeground(Color.WHITE);
        jMenu5.setFont(new Font("Monospaced", Font.BOLD, 24));
        jmX.setForeground(Color.WHITE);
        jmX.setFont(new Font("Monospaced", Font.BOLD, 24));
        jmX.setBackground(Color.DARK_GRAY);

        this.pack();
        this.setTitle("Gestión del gimnasio \"Strength Haven\"");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(0, size.height / 7);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jmBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmO = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmM = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmS = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmA = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmX = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Inicio");

        jmO.setText("Volver a la página principal");
        jmO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmOActionPerformed(evt);
            }
        });
        jMenu1.add(jmO);

        jmBar.add(jMenu1);

        jMenu2.setText("Monitores");

        jmM.setText("Gestión de monitores");
        jmM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMActionPerformed(evt);
            }
        });
        jMenu2.add(jmM);

        jmBar.add(jMenu2);

        jMenu3.setText("Socios");

        jmS.setText("Gestión de socios");
        jmS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSActionPerformed(evt);
            }
        });
        jMenu3.add(jmS);

        jmBar.add(jMenu3);

        jMenu4.setText("Actividades");

        jmA.setText("Gestión de actividades");
        jmA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAActionPerformed(evt);
            }
        });
        jMenu4.add(jmA);

        jmBar.add(jMenu4);

        jMenu5.setText("Salir");

        jmX.setText("Salir de la aplicación");
        jmX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmXActionPerformed(evt);
            }
        });
        jMenu5.add(jmX);

        jmBar.add(jMenu5);

        setJMenuBar(jmBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmOActionPerformed
        jpO.setVisible(true);
        jpM.setVisible(false);
        jpS.setVisible(false);
        jpA.setVisible(false);
    }//GEN-LAST:event_jmOActionPerformed

    private void jmMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMActionPerformed
        jpO.setVisible(false);
        jpM.setVisible(true);
        jpS.setVisible(false);
        jpA.setVisible(false);
    }//GEN-LAST:event_jmMActionPerformed

    private void jmSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSActionPerformed
        jpO.setVisible(false);
        jpM.setVisible(false);
        jpS.setVisible(true);
        jpA.setVisible(false);
    }//GEN-LAST:event_jmSActionPerformed

    private void jmAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAActionPerformed
        jpO.setVisible(false);
        jpM.setVisible(false);
        jpS.setVisible(false);
        jpA.setVisible(true);
    }//GEN-LAST:event_jmAActionPerformed

    private void jmXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmXActionPerformed
        this.dispose();
        try {
            sf.close();
        } catch (HibernateException e) {
        }
        System.exit(0);
    }//GEN-LAST:event_jmXActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jmA;
    private javax.swing.JMenuBar jmBar;
    private javax.swing.JMenuItem jmM;
    private javax.swing.JMenuItem jmO;
    private javax.swing.JMenuItem jmS;
    private javax.swing.JMenuItem jmX;
    // End of variables declaration//GEN-END:variables
}
