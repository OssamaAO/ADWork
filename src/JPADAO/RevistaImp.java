
package JPADAO;

import Modelo.Empleado;
import Modelo.Revista;
import Modelo.RevistaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;


public class RevistaImp implements RevistaDAO{
    
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
    public void create(Revista r) {
        entityManager.getTransaction().begin();
        entityManager.persist(r);
        entityManager.getTransaction().commit();
    }

    @Override
    public Revista getRevista(Integer Id_producto) {
        return entityManager.find(Revista.class, Id_producto);
    }

    @Override
    public List<Revista> listRevista() {
        return entityManager.createQuery("FROM Revista", Revista.class).getResultList();
    }

    @Override
    public void delete(Revista r) {
        entityManager.getTransaction().begin();
        entityManager.remove(r);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(Revista r) {
        entityManager.getTransaction().begin();
        entityManager.persist(r);
        entityManager.getTransaction().commit();
    }
    
    
    
}
