/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPADAO;

import Modelo.Empleado;
import Modelo.Patatas;
import Modelo.PatatasDAO;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 *
 * @author alumno1
 */
public class PatatasImp implements PatatasDAO {

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
    public void create(Patatas p) {
        entityManager.getTransaction().begin();
        entityManager.persist(p);
        entityManager.getTransaction().commit();
    }

    @Override
    public Patatas getPatatas(Integer Id_producto) {
        return entityManager.find(Patatas.class, Id_producto);
    }

    @Override
    public List<Patatas> listPatatas() {
        return entityManager.createQuery("FROM Patatas", Patatas.class).getResultList();
    }

    @Override
    public void delete(Patatas p) {
        entityManager.getTransaction().begin();
        entityManager.remove(p);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(Patatas p) {
        entityManager.getTransaction().begin();
        entityManager.persist(p);
        entityManager.getTransaction().commit();
    }

}
