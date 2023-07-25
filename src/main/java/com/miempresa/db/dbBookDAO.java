/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.db;

import static com.miempresa.db.Database.closeConnection;
import static com.miempresa.db.Database.getConnection;
import com.miempresa.interfaz.BookDAO;
import com.miempresa.model.Book; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; 

/**
 *
 * @author FullFontJ
 */
public class dbBookDAO extends Database implements BookDAO {

    @Override
    public void registrar(Book libro) {
        try {
            Connection conexion = getConnection();
            PreparedStatement preparedStatement = conexion.prepareStatement(
                    "INSERT INTO book (id, title) VALUES (?,?);"
            );
            preparedStatement.setInt(1, libro.getId());
            preparedStatement.setString(2, libro.getTitle());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void modificar(Book libro, int id) {
        
        try {
            Connection conexion = getConnection();
            PreparedStatement preparedStatement;
            preparedStatement = conexion.prepareStatement("UPDATE book SET id = ?, title = ? WHERE id = ?");
            preparedStatement.setInt(1, libro.getId());
            preparedStatement.setString(2, libro.getTitle());
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }finally{
            closeConnection();
        }
        
        
    }

     @Override
    public void eliminar(int idBook) {
         try {
             Connection conexion  = getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement("DELETE FROM book WHERE id = ?");
             preparedStatement.setInt(1, idBook);
             preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             System.err.println(ex.getMessage());
         } finally {
             closeConnection();
         }
    }

    @Override
    public List<Book> listar() {
         List<Book> libros = null;
        try{
            Connection conexion = getConnection(); 
            PreparedStatement preparedStatement = conexion.prepareStatement( "SELECT *  FROM book;");
            libros = new ArrayList();
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Book libro = mapResultSetToLibro(resultSet);
                libros.add(libro);
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            closeConnection();
        }
        
        return libros;        
    }

    @Override
    public Book obtenerBookById(int idBook) {
        try {
            Book libro = new Book();
            Connection conexion = getConnection();
            PreparedStatement preparedStatement = conexion.prepareStatement("SELECT * FROM book WHERE id = ? LIMIT 1;");
            preparedStatement.setInt(1, idBook);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                libro.setId(resultSet.getInt("id"));
                libro.setTitle(resultSet.getString("title"));
            }
            return libro;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;

        } finally {
            closeConnection();
        }
    }
    
    
    private Book mapResultSetToLibro(ResultSet resultSet) throws SQLException {
        Book libro = new Book();
        libro.setId(resultSet.getInt("id"));
        libro.setTitle(resultSet.getString("title"));
        return libro;
    }
}



