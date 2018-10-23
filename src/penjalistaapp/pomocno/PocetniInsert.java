/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.pomocno;

import java.util.ArrayList;
import java.util.List;
import penjalistaapp.model.Operater;
import org.hibernate.Session;
import penjalistaapp.model.Penjaliste;

/**
 *
 * @author Josip
 */
public class PocetniInsert {

    public static void izvedi() {
        Session session = HibernateUtil.getSession();

        session.beginTransaction();
        kreirajOperatera(session);
        List<Penjaliste> lista1 = kreirajPenjalista(session, 50);

        session.getTransaction().commit();
    }
    
     private static void kreirajOperatera(Session session) {
        Operater o = new Operater();
        o.setIme("Josip");
        o.setPrezime("Kovačević");
        o.setEmail("jkovacevic@gmail.com");
        o.setLozinka(Autorizacija.getHash("j"));
        session.save(o);

        session.save(o);
    }
     
     private static List<Penjaliste> kreirajPenjalista(Session session, int broj){
         Penjaliste p;
        List<Penjaliste> l1 = new ArrayList<>();
        for (int i = 0; i < broj; i++) {
            p = new Penjaliste();
            p.setNaziv("Penjalište "+i);
            p.setLat(0.0 + i);
            p.setLon(0.0 + i);
            session.save(p);
            
            l1.add(p);
            
        }
        return l1;
     }

  
}
