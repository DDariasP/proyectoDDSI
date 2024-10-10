package Aplicacion;

import Config.HibernateUtil;
import Modelo.Monitor;
import java.awt.Color;
import javax.swing.JFrame;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProyectoDDSI {

    public static void main(String[] args) {
     
        Menu m = new Menu();
        m.setTitle("DDSI - Práctica 1");
        m.setVisible(true);

        /**
         
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session sesion = sessionFactory.openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            Monitor monitor = sesion.get(Monitor.class, "M001");
            System.out.println(monitor.getNombre());
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Error en la recuperación "
                    + e.getMessage());
        } finally {
            if (sesion != null && sesion.isOpen()) {
                sesion.close();
            }
        }
        
        * **/
    }

}
