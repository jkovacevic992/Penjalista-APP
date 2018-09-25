/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import penjalistaapp.model.Entitet;
import penjalistaapp.pomocno.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Josip
 */
public abstract class Obrada {
    protected Session session;
    public  Obrada(){
        session=HibernateUtil.getSession();
    }
    
    protected void spremi(Entitet e){
        System.out.println(e.getClass().toString());
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }
    
    public void obrisi(Entitet e){
        session.beginTransaction();
        session.delete(e);
        session.getTransaction().commit();
    }
    
}
