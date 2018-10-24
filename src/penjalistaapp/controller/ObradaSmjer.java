/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import com.mysql.jdbc.StringUtils;
import java.math.BigInteger;
import java.util.List;
import org.apache.poi.util.StringUtil;
import penjalistaapp.model.Smjer;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class ObradaSmjer extends Obrada implements ObradaInterface<Smjer> {

    @Override
    public List<Smjer> getEntiteti() {
        return session.createQuery(" from Smjer").list();
    }

    @Override
    public Smjer dodaj(Smjer s) throws MojException {
        kontrola(s);
        spremi(s);

        return s;
    }

    @Override
    public Smjer promjena(Smjer s) throws MojException {
        kontrola(s);
        spremi(s);
        

        return s;
    }

    private void kontrola(Smjer s) throws MojException {
        if (s.getNaziv().matches("/^[a-zA-Z\\s]*$/")) {
            throw new MojException("Naziv smjera može sadržavati samo slova.");

        }
        try {
            BigInteger postojeciNaziv = (BigInteger) session.createSQLQuery("select count(sifra) from smjer where naziv=:naziv and sektor_sifra=:sektor_sifra and autor_sifra=:autor_sifra and ocjena=:ocjena and duzina=:duzina").
                    setString("naziv", s.getNaziv())
                    .setString("sektor_sifra", s.getSektor().getSifra().toString())
                    .setString("autor_sifra", s.getAutor().getSifra().toString())
                    .setString("ocjena", s.getOcjena())
                    .setString("duzina", Integer.toString(s.getDuzina())).uniqueResult();

            if (postojeciNaziv.intValue() == 1) {
                throw new MojException("Taj smjer već postoji.");
            }
        } catch (NullPointerException e) {
            throw new MojException("Sektor obavezan.");
        }

        try {
            if (s.getAutor().equals(null)) {
                return;
            }
        } catch (NullPointerException e) {
            throw new MojException("Autor obavezan.");
        }

    }

}
