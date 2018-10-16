/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import java.util.List;
import penjalistaapp.model.Penjac;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class ObradaPenjac extends Obrada implements ObradaInterface<Penjac>{


    
    public List<Penjac> getEntiteti() {
        return session.createQuery(" from Penjac").list();
    }

   
    public Penjac dodaj(Penjac p) throws MojException {
        kontrola(p);
        spremi(p);
        
        return p;
    }


    public Penjac promjena(Penjac p) throws MojException {
        kontrola(p);
        spremi(p);
        
        return p;
    }
    
    private void kontrola(Penjac p) throws MojException{
        if(p.getIme().matches("/^[a-zA-Z\\s]*$/") || p.getPrezime().matches("/^[a-zA-Z\\s]*$/")){
            throw new MojException("Ime i prezime penjača mogu sadržavati samo slova.");
           
        }
    }
}
