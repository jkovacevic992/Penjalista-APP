/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Josip
 */
@Entity
public class Smjer extends Entitet implements Serializable{

    private String naziv;
    private String ocjena;
    private int duzina;
    
    @ManyToOne
    @JoinColumn(name="sektor_sifra")
    private Sektor sektor;
    @ManyToOne
    @JoinColumn(name="autor_sifra")
    private Autor autor;
    @ManyToMany(mappedBy = "smjerovi")
    private transient List<Penjac> penjaci;

    public String getNaziv() {
        return naziv;
    }

    public List<Penjac> getPenjaci() {
        return penjaci;
    }

    public void setPenjaci(List<Penjac> penjaci) {
        this.penjaci = penjaci;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOcjena() {
        return ocjena;
    }

    public void setOcjena(String ocjena) {
        this.ocjena = ocjena;
    }

    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public Sektor getSektor() {
        return sektor;
    }

    public void setSektor(Sektor sektor) {
        this.sektor = sektor;
    }



    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    @Override
    public String getCSV() {
        return getNaziv()+ "\t" + getOcjena()+ "\t" + getDuzina() + "\t" + getSektor() + "\t" + getAutor();
    }

    @Override
    public String toString() {
        return getNaziv();
    }
    
    
}
