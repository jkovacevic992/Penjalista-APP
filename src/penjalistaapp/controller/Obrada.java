/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import java.util.ArrayList;
import java.util.List;
import penjalistaapp.model.Entitet;
import penjalistaapp.pomocno.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Josip
 */
public abstract class Obrada<T extends Entitet> {

    protected Session session;

    public abstract List<T> getEntiteti();

    public Obrada() {
        session = HibernateUtil.getSession();
    }

    public List<Entitet> getListEntitet() {
        List<T> lista = getEntiteti();
        List<Entitet> vrati = new ArrayList<>();
        lista.forEach((l) -> {
            vrati.add((l));
        });
        return vrati;
    }

    protected void spremi(Entitet e) {
        System.out.println(e.getClass().toString());
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
        session.flush();
    }

    public void obrisi(Entitet e) {
        session.beginTransaction();
        session.delete(e);
        session.getTransaction().commit();
        session.flush();
    }

}
