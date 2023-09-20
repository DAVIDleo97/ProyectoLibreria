/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis.dao;

import java.util.List;
import sis.modelo.Producto;

/**
 *
 * @author T A Z
 */
public interface ProductoDAO {
    
    public List<Producto> select();
    public void insert(Producto producto);
    public void update(Producto producto);
    public void delete(Producto producto);
    
}
