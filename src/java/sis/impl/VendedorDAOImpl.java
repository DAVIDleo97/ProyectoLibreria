/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sis.dao.VendedorDAO;
import sis.modelo.Vendedor;
import sis.util.HibernateUtil;

/**
 *
 * @author T A Z
 */
public class VendedorDAOImpl implements VendedorDAO{

    @Override
    public List<Vendedor> select() {
        List<Vendedor> vendedores=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction trans=session.beginTransaction();
        String hql= "FROM Vendedor";
        try{
            vendedores=session.createQuery(hql).list();
            trans.commit();
        }catch (Exception ex){
            ex.printStackTrace();
            trans.rollback();
        } finally {
            session.close();
        }
        return vendedores;
    }

    @Override
    public void insert(Vendedor vendedor) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(vendedor);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void update(Vendedor vendedor) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(vendedor);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Vendedor vendedor) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(vendedor);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
    
    
    
}
