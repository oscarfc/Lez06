/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez06;

import java.util.List;

/**
 *
 * @author tss
 */
public class Libro {

    private int codiceLibro;
    private Locazione ubicazioneLibro;
    private String titolo;
    private List<Autore> autori;
    private String genere;
    private String codice_ISBN_13;
    private String edizione;
    private String editore;
    private float prezzo;

    public int getCodiceLibro() {
        return codiceLibro;
    }

    public Locazione getUbicazioneLibro() {
        return ubicazioneLibro;
    }

    public String getTitolo() {
        return titolo;
    }

    public List<Autore> getAutori() {
        return autori;
    }

    public String getGenere() {
        return genere;
    }

    public String getCodice_ISBN_13() {
        return codice_ISBN_13;
    }

    public String getEdizione() {
        return edizione;
    }

    public String getEditore() {
        return editore;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setUbicazioneLibro(Locazione ubicazioneLibro) {
        this.ubicazioneLibro = ubicazioneLibro;
    }

    public Libro(int codiceLibro, String titolo, List<Autore> autori, String genere, String codice_ISBN_13, String edizione, String editore, float prezzo) {
        this.codiceLibro = codiceLibro;
        this.titolo = titolo;
        this.autori = autori;
        this.genere = genere;
        this.codice_ISBN_13 = codice_ISBN_13;
        this.edizione = edizione;
        this.editore = editore;
        this.prezzo = prezzo;
    }

    public Libro(int codiceLibro, Locazione ubicazioneLibro, String titolo, List<Autore> autori, String genere, String codice_ISBN_13, String edizione, String editore, float prezzo) {
        this.codiceLibro = codiceLibro;
        this.ubicazioneLibro = ubicazioneLibro;
        this.titolo = titolo;
        this.autori = autori;
        this.genere = genere;
        this.codice_ISBN_13 = codice_ISBN_13;
        this.edizione = edizione;
        this.editore = editore;
        this.prezzo = prezzo;
    }
}
