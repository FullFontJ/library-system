/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.miempresa.librarysystem;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.miempresa.views.*;
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author FullFontJ
 */
public class Librarysystem extends javax.swing.JFrame {
    
    /**
     * Creates new form Librarysystem
     */
    public Librarysystem() {
        initComponents();
        initStyle();
        extraComponents();
        
        changePanel(new ViewPrincipal());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        MenuSlider = new javax.swing.JPanel();
        titleApp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnDasboard = new javax.swing.JButton();
        btnPrestamo = new javax.swing.JButton();
        btnDevolucion = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnLibro = new javax.swing.JButton();
        headerContent = new javax.swing.JPanel();
        labelFecha = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");
        setMinimumSize(new java.awt.Dimension(905, 520));

        MenuSlider.setBackground(new java.awt.Color(93, 36, 23));

        titleApp.setForeground(new java.awt.Color(255, 255, 255));
        titleApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleApp.setText("Library");

        btnDasboard.setBackground(new java.awt.Color(141, 73, 37));
        btnDasboard.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 13)); // NOI18N
        btnDasboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDasboard.setText("Principal");
        btnDasboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        btnDasboard.setBorderPainted(false);
        btnDasboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDasboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDasboardActionPerformed(evt);
            }
        });

        btnPrestamo.setBackground(new java.awt.Color(141, 73, 37));
        btnPrestamo.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 13)); // NOI18N
        btnPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamo.setText("Préstamos");
        btnPrestamo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        btnPrestamo.setBorderPainted(false);
        btnPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });

        btnDevolucion.setBackground(new java.awt.Color(141, 73, 37));
        btnDevolucion.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 13)); // NOI18N
        btnDevolucion.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolucion.setText("Devoluciones");
        btnDevolucion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        btnDevolucion.setBorderPainted(false);
        btnDevolucion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionActionPerformed(evt);
            }
        });

        btnUsuario.setBackground(new java.awt.Color(141, 73, 37));
        btnUsuario.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 13)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setText("Usuarios");
        btnUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        btnUsuario.setBorderPainted(false);
        btnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnLibro.setBackground(new java.awt.Color(141, 73, 37));
        btnLibro.setFont(new java.awt.Font("Segoe UI SemiLight", 1, 13)); // NOI18N
        btnLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnLibro.setText("Libros");
        btnLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        btnLibro.setBorderPainted(false);
        btnLibro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuSliderLayout = new javax.swing.GroupLayout(MenuSlider);
        MenuSlider.setLayout(MenuSliderLayout);
        MenuSliderLayout.setHorizontalGroup(
            MenuSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuSliderLayout.createSequentialGroup()
                .addGroup(MenuSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDasboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuSliderLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
                    .addComponent(titleApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuSliderLayout.setVerticalGroup(
            MenuSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSliderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titleApp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnDasboard, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        headerContent.setBackground(new java.awt.Color(141, 73, 37));

        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerContentLayout = new javax.swing.GroupLayout(headerContent);
        headerContent.setLayout(headerContentLayout);
        headerContentLayout.setHorizontalGroup(
            headerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerContentLayout.setVerticalGroup(
            headerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerContentLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(MenuSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 692, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(headerContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        changePanel(new ViewPrestamo());
    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void btnDasboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDasboardActionPerformed
         changePanel(new ViewPrincipal());
    }//GEN-LAST:event_btnDasboardActionPerformed

    private void btnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionActionPerformed
        changePanel(new ViewDevolucion());
    }//GEN-LAST:event_btnDevolucionActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
         changePanel(new ViewUsuario());
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibroActionPerformed
         changePanel(new ViewLibro());
    }//GEN-LAST:event_btnLibroActionPerformed
    
    private void initStyle(){
        titleApp.putClientProperty( "FlatLaf.styleClass", "h1" );
        labelFecha.putClientProperty( "FlatLaf.styleClass", "h2" );
    }
    
    private void extraComponents(){
        btnDasboard.setIcon(setIcono("/src/main/java/images/principal.png",24));
        btnPrestamo.setIcon(setIcono("/src/main/java/images/prestamos.png",24));
        btnDevolucion.setIcon(setIcono("/src/main/java/images/devoluciones.png",24));
        btnUsuario.setIcon(setIcono("/src/main/java/images/usuarios.png",24));
        btnLibro.setIcon(setIcono("/src/main/java/images/libros.png",24));
        actualFecha();
    }
    
     public Icon setIcono(String url, int sizeImage){
        File imageFile = new File((System.getProperty("user.dir") +""+ url));
        ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
        Image image = icon.getImage().getScaledInstance(sizeImage, sizeImage, Image.SCALE_SMOOTH);
        icon.setImage(image);
        
        return icon;
    }
     
     private void actualFecha(){
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' yyyy");
        String fechaFormateada = fechaActual.format(formatter);
        String fechaMayusculas = capitalize(fechaFormateada);
        labelFecha.setText(fechaMayusculas);
     }
     
     private static String capitalize(String input) {
        StringBuilder output = new StringBuilder();
        String[] words = input.split(" ");
        
        for (String word : words) {
            if (word.length() > 0) {
                output.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }
        
        return output.toString().trim();
    }
     
    public static void changePanel(JPanel panelChange){
        panelChange.setSize(Content.getSize());
        panelChange.setLocation(0,0); 
        
        Content.removeAll();
        Content.add(panelChange, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Librarysystem().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Content;
    private javax.swing.JPanel MenuSlider;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnDasboard;
    private javax.swing.JButton btnDevolucion;
    private javax.swing.JButton btnLibro;
    private javax.swing.JButton btnPrestamo;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JPanel headerContent;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel titleApp;
    // End of variables declaration//GEN-END:variables
}