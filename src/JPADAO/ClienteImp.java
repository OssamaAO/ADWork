package JPADAO;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

public class ClienteImp implements ClienteDAO {

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
    public void create(Cliente c) {
        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.getTransaction().commit();
    }

    @Override
    public Cliente getCliente(Integer Id_cliente) {
        return entityManager.find(Cliente.class, Id_cliente);
    }

    @Override
    public List<Cliente> listClientes() {
        return entityManager.createQuery("FROM Cliente", Cliente.class).getResultList();
    }

    @Override
    public void delete(Cliente c) {
        entityManager.getTransaction().begin();
        entityManager.remove(c);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(Cliente c) {
        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.getTransaction().commit();
    }

 

}
