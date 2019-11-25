/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez06;

import java.time.LocalDate;

/**
 *
 * @author tss
 */
public class Prestito {

    private int codiceLibro;
    private int codiceUtente;
    private LocalDate uscitaPrestito;
    private LocalDate ritornoPrestito;

    public Prestito(int codiceLibro, int codiceUtente) {
        this.codiceLibro = codiceLibro;
        this.codiceUtente = codiceUtente;
        this.uscitaPrestito = LocalDate.now();
    }

    public long getCodiceLibro() {
        return codiceLibro;
    }

    public long getCodiceUtente() {
        return codiceUtente;
    }

    public LocalDate getUscitaPrestito() {
        return uscitaPrestito;
    }

    public LocalDate getRitornoPrestito() {
        return ritornoPrestito;
    }

    public void setRitornoPrestito(LocalDate ritornoPrestito) {
        this.ritornoPrestito = ritornoPrestito;
    }
}
