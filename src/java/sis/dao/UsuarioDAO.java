/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis.dao;

import sis.modelo.Usuario;

/**
 *
 * @author T A Z
 */
public interface UsuarioDAO {
    
    public Usuario search(Usuario usuario);

    public Usuario login(Usuario usuario);
    
}
