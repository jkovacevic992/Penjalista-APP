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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Josip
 */
@Entity
public class Sektor extends Entitet implements Serializable {

    private String naziv;
    private Double lat;
    private Double lon;
    @ManyToOne
    @JoinColumn(name = "penjaliste_sifra")
    private Penjaliste penjaliste;
    @OneToMany(mappedBy = "sektor")
    private List<Smjer> smjerovi = new ArrayList<>();

    public List<Smjer> getSmjerovi() {
        return smjerovi;
    }

    public void setSmjerovi(List<Smjer> smjerovi) {
        this.smjerovi = smjerovi;
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

    public Penjaliste getPenjaliste() {
        return penjaliste;
    }

    public void setPenjaliste(Penjaliste penjaliste) {
        this.penjaliste = penjaliste;
    }

    @Override
    public String getCSV() {
        return getNaziv() + "\t" + getLat() + "\t" + getLon() + "\t" + getPenjaliste() + "\t" + getSmjerovi();
    }

    @Override
    public String toString() {
        return getNaziv();
    }

}
