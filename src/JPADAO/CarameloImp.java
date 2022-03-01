
package JPADAO;

import Modelo.Caramelo;
import Modelo.CarameloDAO;
import Modelo.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;


public class CarameloImp implements CarameloDAO  {
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
    public void create(Caramelo c) {
        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.getTransaction().commit();
    }

    @Override
    public Caramelo getCaramelo(Integer Id_producto) {
        return entityManager.find(Caramelo.class, Id_producto);
    }

    @Override
    public List<Caramelo> listCaramelo() {
        return entityManager.createQuery("FROM Caramelo", Caramelo.class).getResultList();
        
    }

    @Override
    public void delete(Caramelo c) {
        entityManager.getTransaction().begin();
        entityManager.remove(c);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(Caramelo c) {
        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.getTransaction().commit();
        
    }
    
}
