/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez06;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Biblioteca {

    private String nome;
    private String indirizzo;
    private String citta;
    private String telefono;
    private ArrayList<Libro> elencoLibri;
    private ArrayList<Utente> elencoUtenti;
    private ArrayList<Prestito> elencoPrestiti;

    public Biblioteca(String nome, String indirizzo, String citta, String telefono) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.telefono = telefono;
        elencoLibri = new ArrayList();
        elencoUtenti = new ArrayList();
        elencoPrestiti = new ArrayList();
    }

    public ArrayList<Utente> getElencoUtenti() {
        return elencoUtenti;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public String getTelefono() {
        return telefono;
    }

    public ArrayList<Libro> getElencoLibri() {
        return elencoLibri;
    }

    public ArrayList<Prestito> getElencoPrestiti() {
        return elencoPrestiti;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodiceUltimoLibro() {
        return elencoLibri.size();
    }

    public int getCodiceUltimoUtente() {
        return elencoUtenti.size();
    }

    public int getUltimoPrestito() {
        return elencoPrestiti.size();
    }
}
