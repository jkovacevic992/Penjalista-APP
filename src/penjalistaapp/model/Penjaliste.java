/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Josip
 */
@Entity
public class Penjaliste extends Entitet implements Serializable{


    private String naziv;
    private Double lat;
    private Double lon;
    @OneToMany(mappedBy = "penjaliste")
    private List<Sektor> sektori =  new ArrayList<>();

    public List<Sektor> getSektori() {
        return sektori;
    }

    public void setSektori(List<Sektor> sektori) {
        this.sektori = sektori;
    }
   

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
        return getNaziv() + "\t" + getLat() + "\t" + getLon() + "\t" + getSektori();
    }
}
