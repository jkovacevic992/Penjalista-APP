/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Josip
 */
@Entity
public class Penjaliste extends Entitet implements Serializable{


    private String naziv;
    private Double lat;
    private Double lon;

   

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

    @Override
    public String toString() {
        return getNaziv();
    }

    @Override
    public String getCSV() {
        return getNaziv() + "\t" + getLat() + "\t" + getLon();
    }
}
