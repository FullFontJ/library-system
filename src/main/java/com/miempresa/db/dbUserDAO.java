/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.db;

import com.miempresa.interfaz.UserDAO;
import com.miempresa.model.User;
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
public class dbUserDAO extends Database implements UserDAO{

    @Override
    public void registrar(User usuario) {
        try{
            Connection conexion = getConnection();
            PreparedStatement preparedStatement = conexion.prepareStatement(
                     "INSERT INTO user (nombre) VALUES (?);"
             );
            preparedStatement.setString(1, usuario.getName());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
           System.out.println(e.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public void modificar(User usuario) {
        try{
            Connection conexion = Database.getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement(
                     "UPDATE user SET nombre = ? WHERE id = ?"
             );
            preparedStatement.setString(1, usuario.getName()); 
            preparedStatement.setInt(2, usuario.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }finally{
            System.out.println("Se cerro conexion correctamente");
            closeConnection();
        }
    }

    @Override
    public void eliminar(int id) {
        try{
            Connection conexion =  getConnection();

            PreparedStatement preparedStatement = conexion.prepareStatement("DELETE FROM user WHERE id = ?;");
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }finally{
            System.out.println("Se cerro conexion para borrar el dato user id=" + id);
            closeConnection();
        }
    }

    @Override
    public List<User> listar() {
        List<User> usuarios = null;
        try{
            Connection conexion = getConnection(); 
            PreparedStatement preparedStatement = conexion.prepareStatement( "SELECT *  FROM user;");
            usuarios = new ArrayList();
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User usuario = mapResultSetToUsuario(resultSet);
                usuarios.add(usuario);
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            closeConnection();
        }
        
        return usuarios;
    }
        
        
    private User mapResultSetToUsuario(ResultSet resultSet) throws SQLException{
        User usuario = new User();
        usuario.setId(resultSet.getInt("id"));
        usuario.setName(resultSet.getString("nombre"));
        return usuario;
    }

    @Override
    public User getUserById(int id) {
        
        try {
            User usuario = new User();
            Connection conexion = getConnection();
            PreparedStatement preparedStatement = conexion.prepareStatement("SELECT *  FROM user WHERE id = ? LIMIT 1;");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                usuario.setId(resultSet.getInt("id"));
                usuario.setName(resultSet.getString("nombre"));
            }
             return usuario;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;

        } finally {
            closeConnection();
        }
        
       
    }
    
}
