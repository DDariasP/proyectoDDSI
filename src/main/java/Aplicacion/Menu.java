package Aplicacion;

import Config.HibernateUtil;
import Modelo.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.util.ArrayList;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Crea el menú.
 *
 * @author Diego Francisco Darias Pino
 */
public class Menu extends javax.swing.JFrame {

    private static SessionFactory sessionFactory;

    public Menu() {
        sessionFactory = HibernateUtil.getSessionFactory();
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        jb01.setFont(new Font("Monospaced", Font.BOLD, 24));
        jb01.setBackground(Color.LIGHT_GRAY);
        jb02.setFont(new Font("Monospaced", Font.BOLD, 24));
        jb02.setBackground(Color.LIGHT_GRAY);
        jb03.setFont(new Font("Monospaced", Font.BOLD, 24));
        jb03.setBackground(Color.LIGHT_GRAY);
        jb04.setFont(new Font("Monospaced", Font.BOLD, 24));
        jb04.setBackground(Color.LIGHT_GRAY);
        jb05.setFont(new Font("Monospaced", Font.BOLD, 24));
        jb05.setBackground(Color.LIGHT_GRAY);
        jb06.setFont(new Font("Monospaced", Font.BOLD, 24));
        jb06.setBackground(Color.LIGHT_GRAY);
        jb07.setFont(new Font("Monospaced", Font.BOLD, 24));
        jb07.setBackground(Color.LIGHT_GRAY);
        jb08.setFont(new Font("Monospaced", Font.BOLD, 24));
        jb08.setBackground(Color.LIGHT_GRAY);
        jb09.setFont(new Font("Monospaced", Font.BOLD, 24));
        jb09.setBackground(Color.LIGHT_GRAY);
        jb10.setFont(new Font("Monospaced", Font.BOLD, 24));
        jb10.setBackground(Color.LIGHT_GRAY);
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

        jb01 = new javax.swing.JButton();
        jb02 = new javax.swing.JButton();
        jb03 = new javax.swing.JButton();
        jb04 = new javax.swing.JButton();
        jb05 = new javax.swing.JButton();
        jb06 = new javax.swing.JButton();
        jb07 = new javax.swing.JButton();
        jb08 = new javax.swing.JButton();
        jb09 = new javax.swing.JButton();
        jb10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb01.setText("1. Información de los socios (HQL)");
        jb01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb01ActionPerformed(evt);
            }
        });

        jb02.setText("2. Información de los socios (SQL Nativo)");
        jb02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb02ActionPerformed(evt);
            }
        });

        jb03.setText("3. Información de los socios (Consulta nombrada)");
        jb03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb03ActionPerformed(evt);
            }
        });

        jb04.setText("4. Nombre y teléfono de los socios");
        jb04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb04ActionPerformed(evt);
            }
        });

        jb05.setText("5. Nombre y categoría de los socios");
        jb05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb05ActionPerformed(evt);
            }
        });

        jb06.setText("6. Nombre de monitor por nick");
        jb06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb06ActionPerformed(evt);
            }
        });

        jb07.setText("7. Información de socio por nombre");
        jb07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb07ActionPerformed(evt);
            }
        });

        jb08.setText("8. Información de actividades por día y cuota");
        jb08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb08ActionPerformed(evt);
            }
        });

        jb09.setText("9. Información de socios por categoría (HQL)");
        jb09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb09ActionPerformed(evt);
            }
        });

        jb10.setText("10. Información de socios por categoría (SQL nativo)");
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(479, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jb01)
                .addGap(18, 18, 18)
                .addComponent(jb02)
                .addGap(18, 18, 18)
                .addComponent(jb03)
                .addGap(18, 18, 18)
                .addComponent(jb04)
                .addGap(18, 18, 18)
                .addComponent(jb05)
                .addGap(18, 18, 18)
                .addComponent(jb06)
                .addGap(18, 18, 18)
                .addComponent(jb07)
                .addGap(18, 18, 18)
                .addComponent(jb08)
                .addGap(18, 18, 18)
                .addComponent(jb09)
                .addGap(18, 18, 18)
                .addComponent(jb10)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb01ActionPerformed
        JFrame frame = new JFrame("1. Información de los socios (HQL)");
        Output.run(frame, 2160, 480);
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Query consulta = sesion.createQuery("FROM Socio s", Socio.class);
            ArrayList<Socio> socios = (ArrayList<Socio>) consulta.getResultList();
            String str = String.format("%-6s %-30s %-9s %-10s %-9s %-32s %-10s %8s\n", "Número", "Nombre", "DNI", "FechaNac", "Teléfono", "Correo", "FechaEnt", "Categoría");
            System.out.println(str);
            for (Socio s : socios) {
                System.out.println(s.mostrar());
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación " + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }
    }//GEN-LAST:event_jb01ActionPerformed

    private void jb02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb02ActionPerformed
        JFrame frame = new JFrame("2. Información de los socios (SQL Nativo)");
        Output.run(frame, 2160, 480);
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Query consulta = sesion.createNativeQuery("SELECT * FROM SOCIO s", Socio.class);
            ArrayList<Socio> socios = (ArrayList<Socio>) consulta.getResultList();
            String str = String.format("%-6s %-30s %-9s %-10s %-9s %-32s %-10s %8s\n", "Número", "Nombre", "DNI", "FechaNac", "Teléfono", "Correo", "FechaEnt", "Categoría");
            System.out.println(str);
            for (Socio s : socios) {
                System.out.println(s.mostrar());
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación " + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }
    }//GEN-LAST:event_jb02ActionPerformed

    private void jb03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb03ActionPerformed
        JFrame frame = new JFrame("3. Información de los socios (Consulta nombrada)");
        Output.run(frame, 2160, 480);
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Query consulta = sesion.createNamedQuery("Socio.findAll", Socio.class);
            ArrayList<Socio> socios = (ArrayList<Socio>) consulta.getResultList();
            String str = String.format("%-6s %-30s %-9s %-10s %-9s %-32s %-10s %8s\n", "Número", "Nombre", "DNI", "FechaNac", "Teléfono", "Correo", "FechaEnt", "Categoría");
            System.out.println(str);
            for (Socio s : socios) {
                System.out.println(s.mostrar());
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación " + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }
    }//GEN-LAST:event_jb03ActionPerformed

    private void jb04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb04ActionPerformed
        JFrame frame = new JFrame("4. Nombre y teléfono de los socios");
        Output.run(frame, 720, 480);
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Query consulta = sesion.createQuery("SELECT s.nombre, s.telefono FROM Socio s");
            ArrayList<Object[]> socios = (ArrayList<Object[]>) consulta.list();
            String str = String.format("%-30s %-9s\n", "Nombre", "Teléfono");
            System.out.println(str);
            for (Object[] s : socios) {
                str = String.format("%-30s %-9s", s[0].toString(), s[1].toString());
                System.out.println(str);
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación " + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }
    }//GEN-LAST:event_jb04ActionPerformed

    private void jb05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb05ActionPerformed
        ArrayList<Character> categorias = new ArrayList<>();
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Query consulta = sesion.createQuery("SELECT DISTINCT s.categoria FROM Socio s");
            categorias = (ArrayList<Character>) consulta.list();
            for (char c : categorias) {
                System.out.println(c);
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación " + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }

        char cat = '-';
        try {
            Object input = JOptionPane.showInputDialog(this, "Categoría:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                String str = String.valueOf(input);
                if (str.length() != 1) {
                    throw new Exception();
                } else {
                    str = str.toUpperCase();
                    cat = str.charAt(0);
                    if (!categorias.contains(cat)) {
                        throw new Exception();
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Categoría no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (categorias.contains(cat)) {
            JFrame frame = new JFrame("5. Nombre y categoría de los socios");
            Output.run(frame, 720, 240);
            sesion = sessionFactory.openSession();
            tr = sesion.beginTransaction();
            try {
                Query consulta = sesion.createQuery("SELECT s.nombre, s.categoria FROM Socio s WHERE s.categoria = '" + cat + "'");
                ArrayList<Object[]> socios = (ArrayList<Object[]>) consulta.list();
                String str = String.format("%-30s %8s\n", "Nombre", "Categoría");
                System.out.println(str);
                for (Object[] s : socios) {
                    str = String.format("%-30s %9s", s[0].toString(), s[1].toString());
                    System.out.println(str);
                }
                tr.commit();
            } catch (Exception e) {
                tr.rollback();
                System.out.println("Error en la recuperación " + e.getMessage());
            } finally {
                if (sesion != null && sesion.isOpen()) {
                    sesion.close();
                }
            }
        }
     }//GEN-LAST:event_jb05ActionPerformed

    private void jb06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb06ActionPerformed
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> nicks = new ArrayList<>();
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Query consulta = sesion.createQuery("SELECT m.nick FROM Monitor m");
            lista = (ArrayList<String>) consulta.list();
            for (String n : lista) {
                System.out.println(n);
                nicks.add(n.toUpperCase());
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación " + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }

        String nick = "";
        try {
            Object input = JOptionPane.showInputDialog(this, "Nick:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                String str = String.valueOf(input).toUpperCase();
                if (!nicks.contains(str)) {
                    throw new Exception();
                } else {
                    nick = str;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nick no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (nicks.contains(nick)) {
            JFrame frame = new JFrame("6. Nombre de monitor por nick");
            Output.run(frame, 720, 240);
            sesion = sessionFactory.openSession();
            tr = sesion.beginTransaction();
            try {
                Query consulta = sesion.createQuery("SELECT m.nombre, m.nick FROM Monitor m WHERE m.nick = '" + nick + "'");
                Object[] m = (Object[]) consulta.getSingleResult();
                String str = String.format("%-30s %-8s\n", "Nombre", "Nick");
                System.out.println(str);
                str = String.format("%-35s %-8s", m[0].toString(), m[1].toString());
                System.out.println(str);
                tr.commit();
            } catch (Exception e) {
                tr.rollback();
                System.out.println("Error en la recuperación " + e.getMessage());
            } finally {
                if (sesion != null && sesion.isOpen()) {
                    sesion.close();
                }
            }
        }
    }//GEN-LAST:event_jb06ActionPerformed

    private void jb07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb07ActionPerformed
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Query consulta = sesion.createQuery("SELECT s.nombre FROM Socio s");
            lista = (ArrayList<String>) consulta.list();
            for (String n : lista) {
                System.out.println(n);
                nombres.add(n.toUpperCase());
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación " + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }

        String nombre = "";
        try {
            Object input = JOptionPane.showInputDialog(this, "Nombre:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                String str = String.valueOf(input).toUpperCase();
                if (!nombres.contains(str)) {
                    throw new Exception();
                } else {
                    nombre = str;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nombre no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (nombres.contains(nombre)) {
            JFrame frame = new JFrame("7. Información de socio por nombre");
            Output.run(frame, 2160, 240);
            sesion = sessionFactory.openSession();
            tr = sesion.beginTransaction();
            try {
                Query consulta = sesion.createQuery("FROM Socio s WHERE s.nombre = '" + nombre + "'");
                Socio s = (Socio) consulta.getSingleResult();
                String str = String.format("%-6s %-30s %-9s %-10s %-9s %-32s %-10s %8s\n", "Número", "Nombre", "DNI", "FechaNac", "Teléfono", "Correo", "FechaEnt", "Categoría");
                System.out.println(str);
                System.out.println(s.mostrar());
                tr.commit();
            } catch (Exception e) {
                tr.rollback();
                System.out.println("Error en la recuperación " + e.getMessage());
            } finally {
                if (sesion != null && sesion.isOpen()) {
                    sesion.close();
                }
            }
        }
    }//GEN-LAST:event_jb07ActionPerformed

    private void jb08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb08ActionPerformed
        ArrayList<String> dias = new ArrayList<>();
        ArrayList<String> listaD = new ArrayList<>();
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Query consulta = sesion.createQuery("SELECT DISTINCT a.dia FROM Actividad a");
            listaD = (ArrayList<String>) consulta.getResultList();
            for (String d : listaD) {
                System.out.println(d);
                dias.add(d.toUpperCase());
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación " + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }

        String dia = "";
        try {
            Object input = JOptionPane.showInputDialog(this, "Día:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                String str = String.valueOf(input).toUpperCase();
                if (!dias.contains(str)) {
                    throw new Exception();
                } else {
                    dia = str;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Día no válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int cuota = 0;
        try {
            Object input = JOptionPane.showInputDialog(this, "Cuota:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                String str = String.valueOf(input);
                int ct = Integer.parseInt(str);
                cuota = ct;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cuota no válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        ArrayList<Actividad> actividades = new ArrayList<>();
        if (dias.contains(dia)) {
            JFrame frame = new JFrame("8. Información de actividades por día y cuota");
            Output.run(frame, 1200, 240);
            sesion = sessionFactory.openSession();
            tr = sesion.beginTransaction();
            try {
                Query consulta = sesion.createQuery("FROM Actividad a WHERE a.dia = '" + dia + "' AND a.precioBaseMes > " + cuota);
                actividades = (ArrayList<Actividad>) consulta.getResultList();
                String str = String.format("%-4s %-15s %-9s %-4s %-15s %-30s\n", "ID", "Nombre", "Día", "Hora", "PrecioBaseMes", "MonitorResponsable");
                System.out.println(str);
                for (Actividad a : actividades) {
                    System.out.println(a.mostrar());
                }
                tr.commit();
            } catch (Exception e) {
                tr.rollback();
                System.out.println("Error en la recuperación " + e.getMessage());
            } finally {
                if (sesion != null && sesion.isOpen()) {
                    sesion.close();
                }
            }
        }
    }//GEN-LAST:event_jb08ActionPerformed

    private void jb09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb09ActionPerformed
        ArrayList<Character> categorias = new ArrayList<>();
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Query consulta = sesion.createQuery("SELECT DISTINCT s.categoria FROM Socio s");
            categorias = (ArrayList<Character>) consulta.list();
            for (char c : categorias) {
                System.out.println(c);
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación " + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }

        char cat = '-';
        try {
            Object input = JOptionPane.showInputDialog(this, "Categoría:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                String str = String.valueOf(input);
                if (str.length() != 1) {
                    throw new Exception();
                } else {
                    str = str.toUpperCase();
                    cat = str.charAt(0);
                    if (!categorias.contains(cat)) {
                        throw new Exception();
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Categoría no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (categorias.contains(cat)) {
            JFrame frame = new JFrame("9. Información de socios por categoría (HQL)");
            Output.run(frame, 2160, 240);
            sesion = sessionFactory.openSession();
            tr = sesion.beginTransaction();
            try {
                Query consulta = sesion.createNamedQuery("Socio.findByCategoria", Socio.class);
                ArrayList<Socio> socios = (ArrayList<Socio>) consulta.getResultList();
                String str = String.format("%-6s %-30s %-9s %-10s %-9s %-32s %-10s %8s\n", "Número", "Nombre", "DNI", "FechaNac", "Teléfono", "Correo", "FechaEnt", "Categoría");
                System.out.println(str);
                for (Socio s : socios) {
                    System.out.println(s.mostrar());
                }
                tr.commit();
            } catch (Exception e) {
                tr.rollback();
                System.out.println("Error en la recuperación " + e.getMessage());
            } finally {
                if (sesion != null && sesion.isOpen()) {
                    sesion.close();
                }
            }
        }
    }//GEN-LAST:event_jb09ActionPerformed

    private void jb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb10ActionPerformed
        ArrayList<Character> categorias = new ArrayList<>();
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Query consulta = sesion.createQuery("SELECT DISTINCT s.categoria FROM Socio s");
            categorias = (ArrayList<Character>) consulta.list();
            for (char c : categorias) {
                System.out.println(c);
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación " + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }

        char cat = '-';
        try {
            Object input = JOptionPane.showInputDialog(this, "Categoría:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                String str = String.valueOf(input);
                if (str.length() != 1) {
                    throw new Exception();
                } else {
                    str = str.toUpperCase();
                    cat = str.charAt(0);
                    if (!categorias.contains(cat)) {
                        throw new Exception();
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Categoría no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (categorias.contains(cat)) {
            JFrame frame = new JFrame("10. Información de socios por categoría (SQL nativo)");
            Output.run(frame, 2160, 240);
            sesion = sessionFactory.openSession();
            tr = sesion.beginTransaction();
            try {
                Query consulta = sesion.createNamedQuery("Socio.PorCategoria", Socio.class);
                consulta.setParameter("categoria", cat);
                ArrayList<Socio> socios = (ArrayList<Socio>) consulta.getResultList();
                String str = String.format("%-6s %-30s %-9s %-10s %-9s %-32s %-10s %8s\n", "Número", "Nombre", "DNI", "FechaNac", "Teléfono", "Correo", "FechaEnt", "Categoría");
                System.out.println(str);
                for (Socio s : socios) {
                    System.out.println(s.mostrar());
                }
                tr.commit();
            } catch (Exception e) {
                tr.rollback();
                System.out.println("Error en la recuperación " + e.getMessage());
            } finally {
                if (sesion != null && sesion.isOpen()) {
                    sesion.close();
                }
            }
        }
    }//GEN-LAST:event_jb10ActionPerformed

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb01;
    private javax.swing.JButton jb02;
    private javax.swing.JButton jb03;
    private javax.swing.JButton jb04;
    private javax.swing.JButton jb05;
    private javax.swing.JButton jb06;
    private javax.swing.JButton jb07;
    private javax.swing.JButton jb08;
    private javax.swing.JButton jb09;
    private javax.swing.JButton jb10;
    // End of variables declaration//GEN-END:variables
}
