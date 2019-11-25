/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez06;

/**
 *
 * @author tss
 */
public class Utente {

    private int codiceUtente;
    private String nome;
    private String cognome;
    private String indirizzo;
    private String codiceFiscale;

    public long getCodiceUtente() {
        return codiceUtente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceUtente(int codiceUtente) {
        this.codiceUtente = codiceUtente;
    }

    public Utente(int codiceUtente, String nome, String cognome, String indirizzo, String codiceFiscale) {
        this.codiceUtente = codiceUtente;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.codiceFiscale = codiceFiscale;
    }

}
