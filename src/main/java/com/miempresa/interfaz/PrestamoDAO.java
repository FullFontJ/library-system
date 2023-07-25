/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miempresa.interfaz;

import java.util.List;
import com.miempresa.model.Prestamo;


/**
 *
 * @author FullFontJ
 */
public interface PrestamoDAO {
    public void registrar(Prestamo prestamo);
    public void modificar(Prestamo prestamo);
    public List<Prestamo> listar();
}
