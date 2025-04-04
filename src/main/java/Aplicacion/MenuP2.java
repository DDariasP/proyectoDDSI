package Aplicacion;

import Controlador.*;
import Modelo.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.UIManager;
import org.hibernate.SessionFactory;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class MenuP2 extends javax.swing.JFrame {

    private static SessionFactory sessionFactory;

    /**
     * Creates new form MenuP2
     *
     * @param sf
     */
    public MenuP2(SessionFactory sf) {
        sessionFactory = sf;
        initComponents();
        jb11.setName("11");
        jb12.setName("12");
        jb13.setName("13");
        for (Component comp : this.getContentPane().getComponents()) {
            String nom = comp.getName();
            if (comp instanceof JButton && nom != null) {
                JButton jb = (JButton) comp;
                int num = Integer.parseInt(nom);
                if (num % 2 == 0) {
                    jb.setForeground(Color.BLACK);
                    jb.setBackground(Color.LIGHT_GRAY);
                } else {
                    jb.setForeground(Color.WHITE);
                    jb.setBackground(Color.DARK_GRAY);
                }
                jb.setFont(new Font("Monospaced", Font.BOLD, 24));
            }
        }
        getContentPane().setBackground(Color.BLACK);
        UIManager.put("OptionPane.messageFont", new Font("Monospaced", Font.BOLD, 24));
        UIManager.put("OptionPane.messageForeground", Color.LIGHT_GRAY);
        UIManager.put("OptionPane.buttonFont", new Font("Monospaced", Font.BOLD, 24));
        UIManager.put("Button.background", Color.LIGHT_GRAY);
        UIManager.put("OptionPane.background", Color.DARK_GRAY);
        UIManager.put("Panel.background", Color.DARK_GRAY);
        UIManager.put("TextField.font", new Font("Monospaced", Font.BOLD, 24));
        UIManager.put("TextField.background", Color.LIGHT_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb11 = new javax.swing.JButton();
        jb12 = new javax.swing.JButton();
        jb13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb11.setText("1. Alta de un socio");
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });

        jb12.setText("2. Información de actividad");
        jb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb12ActionPerformed(evt);
            }
        });

        jb13.setText("3. Actividades de un socio");
        jb13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb12, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(jb11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jb11)
                .addGap(52, 52, 52)
                .addComponent(jb12)
                .addGap(52, 52, 52)
                .addComponent(jb13)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //1. Alta de un socio
    private void jb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb11ActionPerformed
        ControladorSocio cs = new ControladorSocio(sessionFactory);
        ArrayList<Socio> listaS = cs.listaSocio();
        cs.altaSocio(listaS);
    }//GEN-LAST:event_jb11ActionPerformed

    //2. Información de actividad
    private void jb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb12ActionPerformed
        ControladorMonitor cm = new ControladorMonitor(sessionFactory);
        ArrayList<Monitor> listaM = cm.listaMonitor();
        ControladorActividad ca = new ControladorActividad(sessionFactory);
        ca.actividadMonitor(listaM);
    }//GEN-LAST:event_jb12ActionPerformed

    //3. Actividades de un socio
    private void jb13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb13ActionPerformed
        ControladorSocio cs = new ControladorSocio(sessionFactory);
        ArrayList<Socio> listaS = cs.listaSocio();
        ControladorActividad ca = new ControladorActividad(sessionFactory);
        ca.actividadSocio(listaS);
    }//GEN-LAST:event_jb13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb11;
    private javax.swing.JButton jb12;
    private javax.swing.JButton jb13;
    // End of variables declaration//GEN-END:variables
}
