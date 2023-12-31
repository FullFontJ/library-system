/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.miempresa.views;

import com.miempresa.db.dbBookDAO;
import com.miempresa.model.Book;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author FullFontJ
 */
public class FormNuevoLibro extends javax.swing.JPanel {
    private  boolean editLibro = false;
    private int  idLibro;
    /**
     * Creates new form FormNuevoLibro
     */
    public FormNuevoLibro() {
        initComponents();
        initStyle();
    }
    
    public FormNuevoLibro(int idLibro) {
        this.idLibro = idLibro;
        editLibro = true;
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
        jLabel2 = new javax.swing.JLabel();
        TextFieldNumSerie = new javax.swing.JTextField();
        TextFieldTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAddNewBook = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR NUEVO LIBRO");

        jLabel2.setText("Numero De Serie");

        jLabel3.setText("Nombre Del Libro");

        btnAddNewBook.setBackground(new java.awt.Color(141, 73, 37));
        btnAddNewBook.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 13)); // NOI18N
        btnAddNewBook.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewBook.setText("AGREGAR LIBRO");
        btnAddNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btnAddNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
    }// </editor-fold>//GEN-END:initComponents
     private void initStyle(){
        jLabel1.putClientProperty( "FlatLaf.styleClass", "h1" );
        jLabel2.putClientProperty( "FlatLaf.styleClass", "h3" );
        jLabel3.putClientProperty("FlatLaf.styleClass", "h3");

        if(editLibro){
            jLabel1.setText("EDITAR LIBRO");
            btnAddNewBook.setText("GUARDAR CAMBIOS");
            dbBookDAO dbLibro = new dbBookDAO();
            Book libro = dbLibro.obtenerBookById(idLibro);
            TextFieldNumSerie.setText(String.valueOf(libro.getId()));
            TextFieldTitle.setText(libro.getTitle());
        }
    }
     
    private void btnAddNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewBookActionPerformed
        
        Book libro = new Book();
        libro.setId(Integer.parseInt(TextFieldNumSerie.getText()));
        libro.setTitle(TextFieldTitle.getText());
        
         
        try {
            dbBookDAO dbBook = new dbBookDAO();
            
            if (editLibro) {
                dbBook.modificar(libro, idLibro);
                JOptionPane.showMessageDialog(null, "Nuevo libro registrado.", "Agregar Libro", JOptionPane.INFORMATION_MESSAGE);
            } else {
                dbBook.registrar(libro);
                JOptionPane.showMessageDialog(null, "Nuevos cambios registrados.", "Actualizar Libro", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Compruebas que los datos ingresado sean corretos.", "Libro", JOptionPane.ERROR_MESSAGE);
        }
         
        
    }//GEN-LAST:event_btnAddNewBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldNumSerie;
    private javax.swing.JTextField TextFieldTitle;
    private javax.swing.JButton btnAddNewBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
