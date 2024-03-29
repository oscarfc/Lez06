/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez06;

import java.util.Vector;

/**
 *
 * @author tss
 */
public class JFrameGestioneBiblioteca extends javax.swing.JFrame {

    private Biblioteca myBiblioteca;
    private Bibliotecario mario;

    /**
     * Creates new form JFrameGestioneBiblioteca
     */
    public JFrameGestioneBiblioteca() {
        initComponents();
        myBiblioteca = new Biblioteca("Civica", "via Pinco", "Vistrorio", "0125781111");
        mario = new Bibliotecario("Mario", "Rossi", "via Vattelapesca", "RSSMRO67F23E378T", myBiblioteca);

        initMyDati();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameGestioneBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestioneBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestioneBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestioneBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestioneBiblioteca().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void initMyDati() {
        mario.addUtente("Valerio", "Bianchi", "via Cincinnato", "BCHVLR87R23F211T");
        mario.addUtente("Ottavio", "Camilli", "via Ponzio", "CMLTTV56D11F344S");
        Vector<Autore> listaAutori = new Vector();
        listaAutori.add(new Autore("Arthur Charles", "Clarke"));
        listaAutori.add(new Autore("Giorgio", "MonicellI"));
        mario.addLibro("Le guide del tramonto", listaAutori, "Fantascienza", "978-8804664765", "1", "Mondadori", 11.47f);
        listaAutori = new Vector();
        listaAutori.add(new Autore("Arthur Charles", "Clarke"));
        listaAutori.add(new Autore("Matteo", "Gallone"));
        mario.addLibro("Le sabbie di Marte", listaAutori, "Fantascienza", "978-8804640530", "1", "Mondadori", 8.50f);
    }

}
