/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import java.util.List;
import penjalistaapp.model.Penjaliste;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class ObradaPenjaliste extends Obrada implements ObradaInterface<Penjaliste> {

    @Override
    public List<Penjaliste> getEntiteti() {
        return session.createQuery(" from Penjaliste").list();
    }

    @Override
    public Penjaliste dodaj(Penjaliste e) throws MojException {
        kontrola(e);
        spremi(e);

        return e;
    }

    @Override
    public Penjaliste promjena(Penjaliste e) throws MojException {
        kontrola(e);
        spremi(e);

        return e;
    }

    private void kontrola(Penjaliste e) throws MojException {
        if (e.getNaziv().matches("/^[a-zA-Z\\s]*$/")) {
            throw new MojException("Naziv može sadržavati samo slova.");
        }

    }
}
