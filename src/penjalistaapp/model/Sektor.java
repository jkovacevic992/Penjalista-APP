/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Josip
 */
@Entity
public class Sektor extends Entitet implements Serializable{
      private String naziv;
    private Double lat;
    private Double lon;
    @ManyToOne
    private Penjaliste penjaliste;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Penjaliste getPenjaliste() {
        return penjaliste;
    }

    public void setPenjaliste(Penjaliste penjaliste) {
        this.penjaliste = penjaliste;
    }

    @Override
    public String getCSV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
