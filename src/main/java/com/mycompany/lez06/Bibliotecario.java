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
public class Bibliotecario {

    private String nome;
    private String cognome;
    private String indirizzo;
    private String codiceFiscale;
    private Biblioteca biblioteca;

    public Bibliotecario(String nome, String cognome, String indirizzo, String codiceFiscale, Biblioteca biblioteca) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.codiceFiscale = codiceFiscale;
        this.biblioteca = biblioteca;
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

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void changeBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void addLibro(String titolo, List<Autore> autori, String genere, String codice_ISBN, String edizione, String editore, float prezzo) {
        biblioteca.getElencoLibri().add(new Libro((biblioteca.getCodiceUltimoLibro() + 1), titolo, autori, genere, codice_ISBN, edizione, editore, prezzo));
    }

    public void addUtente(String nome, String cognome, String indirizzo, String codiceFiscale) {
        biblioteca.getElencoUtenti().add(new Utente((biblioteca.getCodiceUltimoUtente() + 1), nome, cognome, indirizzo, codiceFiscale));
    }

    public void newPrestito(int idUtente, int idLibro) {
        biblioteca.getElencoPrestiti().add(new Prestito(idUtente, idLibro));
    }

}
