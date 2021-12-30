/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import bazaPodataka.konekcija;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Džejlana Ščulić
 */
public class glavniProzor extends javax.swing.JFrame {

    /**
     * Creates new form glavniProzor
     */
    public glavniProzor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnUnosVozaca = new javax.swing.JButton();
        bttnUnosVozila = new javax.swing.JButton();
        bttnIspis = new javax.swing.JButton();
        bttnPretraga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evidencija o pjevačima i njihovim pjesmama");

        bttnUnosVozaca.setText("Unos vozača");
        bttnUnosVozaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnUnosVozacaActionPerformed(evt);
            }
        });

        bttnUnosVozila.setText("Unos vozila");
        bttnUnosVozila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnUnosVozilaActionPerformed(evt);
            }
        });

        bttnIspis.setText("Ispis vozača");
        bttnIspis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnIspisActionPerformed(evt);
            }
        });

        bttnPretraga.setText("Pretraga vozača");
        bttnPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnPretragaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttnPretraga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnUnosVozila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnIspis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnUnosVozaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(bttnUnosVozila)
                .addGap(30, 30, 30)
                .addComponent(bttnUnosVozaca)
                .addGap(34, 34, 34)
                .addComponent(bttnIspis)
                .addGap(27, 27, 27)
                .addComponent(bttnPretraga)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnUnosVozilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnUnosVozilaActionPerformed
        this.dispose();
        unosVozila vozilo=new unosVozila();
        vozilo.setVisible(true);
    }//GEN-LAST:event_bttnUnosVozilaActionPerformed

    private void bttnUnosVozacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnUnosVozacaActionPerformed
        this.dispose();
        unosVozaca vozac=new unosVozaca();
        vozac.setVisible(true);
    }//GEN-LAST:event_bttnUnosVozacaActionPerformed

    private void bttnIspisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnIspisActionPerformed
        this.dispose();
        ispisVozaca ispis=new ispisVozaca();
        ispis.setVisible(true);
    }//GEN-LAST:event_bttnIspisActionPerformed

    private void bttnPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnPretragaActionPerformed
        this.dispose();
        pretragaVozaca pretraga=new pretragaVozaca();
        pretraga.setVisible(true);
    }//GEN-LAST:event_bttnPretragaActionPerformed
     
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
            java.util.logging.Logger.getLogger(glavniProzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(glavniProzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(glavniProzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(glavniProzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new glavniProzor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnIspis;
    private javax.swing.JButton bttnPretraga;
    private javax.swing.JButton bttnUnosVozaca;
    private javax.swing.JButton bttnUnosVozila;
    // End of variables declaration//GEN-END:variables
}
