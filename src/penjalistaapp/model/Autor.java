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
public class Autor extends Entitet implements Serializable{


    private String ime;
    private String prezime;
    @OneToMany(mappedBy = "autor")
    private List<Smjer> smjerovi =  new ArrayList<>();

    public List<Smjer> getSmjerovi() {
        return smjerovi;
    }

    public void setSmjerovi(List<Smjer> smjerovi) {
        this.smjerovi = smjerovi;
    }

 
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    @Override
    public String toString(){
        return (getPrezime() + " " + getIme());
    }

    @Override
    public String getCSV() {
        return getIme()+ "\t" + getPrezime();
    }
}
