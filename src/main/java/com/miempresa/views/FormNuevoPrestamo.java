/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.miempresa.views;

import com.miempresa.db.dbPrestamoDAO;
import com.miempresa.librarysystem.Librarysystem;
import com.miempresa.model.Prestamo;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author FullFontJ
 */
public class FormNuevoPrestamo extends javax.swing.JPanel {

    /**
     * Creates new form Prestamo
     */
    public FormNuevoPrestamo() {
        initComponents();
        initStyle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPrestamo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TextFieldLibro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextFieldUsuario = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(649, 455));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRETAMOS");

        btnPrestamo.setBackground(new java.awt.Color(141, 73, 37));
        btnPrestamo.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 13)); // NOI18N
        btnPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamo.setText("PROCESAR PRESTAMO");
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero De Serie Del Libro");

        TextFieldLibro.setToolTipText("Numero De Serie Del Libro");
        TextFieldLibro.setFocusCycleRoot(true);

        jLabel3.setText("ID Del Usuario");

        TextFieldUsuario.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(TextFieldLibro)
                            .addComponent(jLabel3)
                            .addComponent(TextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnPrestamo)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(TextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        int serieLibro = Integer.parseInt(TextFieldLibro.getText());
        int idUsuario = Integer.parseInt(TextFieldUsuario.getText());
        Prestamo agregarPrestamo = new Prestamo();
        agregarPrestamo.setIdBook(serieLibro);
        agregarPrestamo.setIdUser(idUsuario);
        
        try {
            dbPrestamoDAO prestamo = new dbPrestamoDAO();
            prestamo.registrar(agregarPrestamo);
            JOptionPane.showMessageDialog(null, "Nuevo prestamo registrado.", "Prestamo De Libro", JOptionPane.INFORMATION_MESSAGE);
            Librarysystem.changePanel(new ViewPrestamo());
        } catch (HeadlessException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Compruebas que los datos ingresado sean corretos.", "Agregar Prestamo", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnPrestamoActionPerformed
    
    private void initStyle(){
        jLabel1.putClientProperty( "FlatLaf.styleClass", "h1" );
        jLabel2.putClientProperty( "FlatLaf.styleClass", "h3" );
        jLabel3.putClientProperty( "FlatLaf.styleClass", "h3" ); 
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldLibro;
    private javax.swing.JTextField TextFieldUsuario;
    private javax.swing.JButton btnPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}