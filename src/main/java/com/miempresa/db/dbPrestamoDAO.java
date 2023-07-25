/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.db;

import com.miempresa.interfaz.PrestamoDAO;
import com.miempresa.model.Prestamo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FullFontJ
 */
public class dbPrestamoDAO extends Database implements PrestamoDAO{

    @Override
    public void registrar(Prestamo prestamo) {
        try {
            Connection conexion = getConnection();
            PreparedStatement prepareStatement = conexion.prepareStatement("INSERT INTO prestamo (user, book, fecha_prestamo) VALUES (?,?,?)");
            LocalDate fechaActual = LocalDate.now();
            
            prepareStatement.setInt(1, prestamo.getIdUser());
            prepareStatement.setInt(2, prestamo.getIdBook());
            prepareStatement.setDate(3, Date.valueOf(fechaActual));
            
            prepareStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void modificar(Prestamo prestamo) {
        try {
            Connection conexion = getConnection();
            PreparedStatement preparedStatement = conexion.prepareStatement("UPDATE prestamo SET fecha_entrega = ? WHERE user = ? AND book = ? AND fecha_entrega IS NULL ORDER BY id DESC LIMIT 1");
            LocalDate fechaActual = LocalDate.now();

            preparedStatement.setDate(1, Date.valueOf(fechaActual));
            preparedStatement.setInt(2, prestamo.getIdUser());
            preparedStatement.setInt(3, prestamo.getIdBook());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public List<Prestamo> listar(){
        List<Prestamo> prestamos = null;
        try{
            Connection conexion = getConnection(); 
            PreparedStatement preparedStatement = conexion.prepareStatement( 
                    "SELECT p.id, p.fecha_prestamo, u.nombre AS usuario, b.title AS libro FROM prestamo p"
                            + " JOIN user u ON p.user = u.id "
                            + " JOIN book b ON p.book = b.id WHERE fecha_entrega IS NULL;"
            );
            prestamos = new ArrayList();
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Prestamo prestamo = mapResultSetToPrestamo(resultSet);
                prestamos.add(prestamo);
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            closeConnection();
        }
        
        return prestamos; 
    }
    
    
    private Prestamo mapResultSetToPrestamo(ResultSet resultSet) throws SQLException {
        Prestamo prestamo = new Prestamo();
        prestamo.setId(resultSet.getInt("id"));
        prestamo.setFechaPrestamo(resultSet.getString("fecha_prestamo"));
        prestamo.setNombreUsuario(resultSet.getString("usuario"));
        prestamo.setTituloLibro(resultSet.getString("libro"));

        return prestamo;
    }
    
}
