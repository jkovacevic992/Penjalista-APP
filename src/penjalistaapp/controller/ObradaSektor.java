/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import java.math.BigInteger;
import java.util.List;
import penjalistaapp.model.Sektor;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class ObradaSektor extends Obrada implements ObradaInterface<Sektor> {

    public List<Sektor> getEntiteti() {
        return session.createQuery(" from Sektor").list();
    }

    public Sektor dodaj(Sektor s) throws MojException {
        kontrola(s);
        BigInteger postojecaLokacija = (BigInteger) session.createSQLQuery("select count(sifra) from sektor where lat=:lat and lon=:lon")
                 .setString("lat", s.getLat().toString())
                 .setString("lon", s.getLon().toString()).uniqueResult();
        if (postojecaLokacija.intValue() == 1) {
                throw new MojException("Taj sektor već postoji.");
            }
        spremi(s);

        return s;
    }

    public Sektor promjena(Sektor s) throws MojException {
        kontrola(s);
        spremi(s);

        return s;
    }

    private void kontrola(Sektor s) throws MojException {
        if (s.getNaziv().matches("/^[a-zA-Z\\s]*$/")) {
            throw new MojException("Naziv sektora može sadržavati samo slova.");
        }
        try {
            BigInteger postojeciNaziv = (BigInteger) session.createSQLQuery("select count(sifra) from sektor where naziv=:naziv and lat=:lat and lon=:lon").
                    setString("naziv", s.getNaziv()).setString("lat", s.getLat().toString()).setString("lon", s.getLon().toString()).uniqueResult();
            
            if (postojeciNaziv.intValue() == 1) {
                throw new MojException("Taj sektor već postoji.");
            }
            
        } catch (NullPointerException e) {
            throw new MojException("Penjalište obavezno.");
        }
        
        Double maxLat = 90.0;
            Double minLat = -90.0;
            Double maxLon = 180.0;
            double minLon = -180.0;
            if(s.getLat().compareTo(maxLat)>0 || s.getLat().compareTo(minLat)<0){
                throw new MojException("Lokacija s tom geografskom širinom ne postoji.");
            }
            if(s.getLon().compareTo(maxLon)>0 || s.getLon().compareTo(minLon)<0){
                throw new MojException("Lokacija s tom geografskom dužinom ne postoji.");
            }

    }
}
