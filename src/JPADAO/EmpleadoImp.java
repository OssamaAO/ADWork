
package JPADAO;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import static org.springframework.web.servlet.function.RequestPredicates.param;

public class EmpleadoImp implements EmpleadoDAO{
    
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
    public void create(Empleado e) {
        entityManager.getTransaction().begin();
        entityManager.persist(e);
        entityManager.getTransaction().commit();
    }

    @Override
    public Empleado getEmpleado(String DNI) {
        return entityManager.find(Empleado.class, DNI);
    }

    @Override
    public List<Empleado> listEmpleado() {
         return entityManager.createQuery("FROM Empleado", Empleado.class).getResultList();
    }

    @Override
    public void delete(Empleado e) {
        entityManager.getTransaction().begin();
        entityManager.remove(e);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(Empleado e) {
        entityManager.getTransaction().begin();
        entityManager.persist(e);
        entityManager.getTransaction().commit();
    }

}
