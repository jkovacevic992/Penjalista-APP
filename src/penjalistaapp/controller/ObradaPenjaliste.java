/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import java.math.BigInteger;
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
        
         BigInteger postojeciNaziv = (BigInteger) session.createSQLQuery("select count(sifra) from penjaliste where naziv=:naziv and lat=:lat and lon=:lon").
                    setString("naziv", e.getNaziv()).setString("lat", e.getLat().toString()).setString("lon", e.getLon().toString()).uniqueResult();
         BigInteger postojecaLokacija = (BigInteger) session.createSQLQuery("select count(sifra) from penjaliste where lat=:lat and lon=:lon")
                 .setString("lat", e.getLat().toString())
                 .setString("lon", e.getLon().toString()).uniqueResult();
     
            if (postojeciNaziv.intValue() == 1 || postojecaLokacija.intValue()==1) {
                throw new MojException("To penjalište već postoji.");
            }
            
            Double maxLat = 90.0;
            Double minLat = -90.0;
            Double maxLon = 180.0;
            double minLon = -180.0;
            if(e.getLat().compareTo(maxLat)>0 || e.getLat().compareTo(minLat)<0){
                throw new MojException("Lokacija s tom geografskom širinom ne postoji.");
            }
            if(e.getLon().compareTo(maxLon)>0 || e.getLon().compareTo(minLon)<0){
                throw new MojException("Lokacija s tom geografskom dužinom ne postoji.");
            }
            

    }
}
