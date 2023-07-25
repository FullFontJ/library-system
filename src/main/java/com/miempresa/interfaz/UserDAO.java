/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miempresa.interfaz;

import com.miempresa.model.User;
import java.util.List;

/**
 *
 * @author FullFontJ
 */
public interface UserDAO {
    public void registrar(User usuario);
    public void modificar(User usuario);
    public void eliminar(int id);
    public List<User> listar();
    public User getUserById(int id);
}
