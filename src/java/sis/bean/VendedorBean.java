/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import sis.dao.VendedorDAO;
import sis.impl.VendedorDAOImpl;
import sis.modelo.Vendedor;

/**
 *
 * @author T A Z
 */
@ManagedBean
@Named(value = "vendedorBean")
@ViewScoped
public class VendedorBean {

    private Vendedor vendedor=null;
    private List<Vendedor> vendedores=null;
    
    public VendedorBean() {
    }
    
    
    public List<Vendedor> getVendedores() {
        VendedorDAO datos=new VendedorDAOImpl();
        this.vendedores=datos.select();
        return vendedores;
    }
    
    public void prepareVendedor() {
        vendedor = new Vendedor(); 
    }
    
    public void insertVendedor() {
        VendedorDAO datos = new VendedorDAOImpl();
        datos.insert(vendedor);
    }

    public void updateVendedor() {
        VendedorDAO datos = new VendedorDAOImpl();
        datos.update(vendedor);
        vendedor = new Vendedor();
    }

    public void deleteVendedor() {
        VendedorDAO datos = new VendedorDAOImpl();
        datos.delete(vendedor);
        vendedor = new Vendedor();
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
      
}
