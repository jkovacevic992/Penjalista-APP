/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import java.util.List;
import penjalistaapp.model.Sektor;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class ObradaSektor extends Obrada implements ObradaInterface<Sektor> {

    @Override
    public List<Sektor> getEntiteti() {
        return session.createQuery(" from Sektor").list();
    }

    @Override
    public Sektor dodaj(Sektor s) throws MojException {
        kontrola(s);
        spremi(s);

        return s;
    }

    @Override
    public Sektor promjena(Sektor s) throws MojException {
        kontrola(s);
        spremi(s);

        return s;
    }

    private void kontrola(Sektor s) throws MojException {
        if (s.getNaziv().matches("/^[a-zA-Z\\s]*$/")) {
            throw new MojException("Naziv sektora može sadržavati samo slova.");
        }

    }
}
