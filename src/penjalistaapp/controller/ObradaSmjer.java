/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import java.util.List;
import penjalistaapp.model.Smjer;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class ObradaSmjer extends Obrada implements ObradaInterface<Smjer>{

    @Override
    public List<Smjer> getEntiteti() {
        return session.createQuery(" from Smjer").list();
    }

    @Override
    public Smjer dodaj(Smjer s) throws MojException {
        kontrola(s);
        spremi(s);
        
        return s;
    }

    @Override
    public Smjer promjena(Smjer s) throws MojException {
        kontrola(s);
        spremi(s);
        
        return s;
    }
     private void kontrola(Smjer s) throws MojException{
        if(s.getNaziv().matches("/^[a-zA-Z\\s]*$/")){
            throw new MojException("Naziv smjera može sadržavati samo slova.");
           
        }
        
        

    
    }
    
}
