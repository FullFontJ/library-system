/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.miempresa.interfaz;

import com.miempresa.model.Book;
import java.util.List;

/**
 *
 * @author FullFontJ
 */
public interface BookDAO {
    public void registrar(Book libro);
    public void modificar(Book libro, int id);
    public void eliminar(int idBook);
    public List<Book> listar();
    public Book obtenerBookById(int idBook);
}
