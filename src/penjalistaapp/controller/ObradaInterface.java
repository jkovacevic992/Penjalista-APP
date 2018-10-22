/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import java.util.List;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public interface ObradaInterface<T> {

    public List<T> getEntiteti();

    public T dodaj(T e) throws MojException;

    public T promjena(T e) throws MojException;
}
