/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.pomocno;

/**
 *
 * @author Josip
 */
public class MojException extends Exception {
    
    
    private String poruka;
    
    public MojException(String poruka){
        super();
        this.poruka=poruka;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }
    
    
}
