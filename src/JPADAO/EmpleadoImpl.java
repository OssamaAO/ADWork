/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPADAO;

import Modelo.Empleado;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 *
 * @author alumno1
 */
public class EmpleadoImpl<Entity, PK extends Serializable> implements GenericoDAO<Entity, PK> {

    private JpaTransactionManager jpaTransactionManager;
    private PlatformTransactionManager jpat;
    private EntityManager entityManager;
    private HibernateJpaVendorAdapter aa;

    public JpaTransactionManager getJpaTransactionManager() {
        return jpaTransactionManager;
    }

    public void setJpaTransactionManager(JpaTransactionManager jpaTransactionManager) {
        this.jpaTransactionManager = jpaTransactionManager;
        entityManager = jpaTransactionManager.getEntityManagerFactory().createEntityManager();
    }

    @Override
    public Object save(Object entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit(); 
        return entity;
    }

    @Override
    public Object update(Object entity) {
        
        return null;
        
    }

    @Override
    public Object find(Serializable id) {
        return entityManager.createQuery("FROM " + Object.class.getName(), Object.class).getResultList();       
    }

    

    @Override
    public Boolean delete(Object entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Boolean deleteById(Serializable id) {

        return null;

    }

    @Override
    public List<Entity> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
