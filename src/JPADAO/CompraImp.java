package JPADAO;

import Modelo.Compra;
import Modelo.CompraDAO;
import Modelo.Empleado;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

public class CompraImp implements CompraDAO {

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
    public void create(Compra c) {
        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.getTransaction().commit();
    }

    @Override
    public Compra getCompra(Integer Id_compra) {
        return entityManager.find(Compra.class, Id_compra);

    }

    @Override
    public List<Compra> listCompra() {
        return entityManager.createQuery("FROM Compra", Compra.class).getResultList();
    }

    @Override
    public void delete(Compra c) {
        entityManager.getTransaction().begin();
        entityManager.remove(c);
        entityManager.getTransaction().commit();

    }

    @Override
    public void update(Compra c) {
        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.getTransaction().commit();
    }

}
