/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adworkfinal;

import Modelo.Empleado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alumno1
 */
public class ADWorkFinal {

    
    public static void main(String[] args) throws ParseException {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ADWorkFinalPU");
        EntityManager em = factory.createEntityManager();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        
        Empleado em1 = new Empleado("111111E" , "Ossama", "Aouad", 19, sdf.parse("2002-04-01") , 1000.00, true, "eketit");
        
        Query q = em.createQuery("select e from Empleado e");
        List<Empleado> empleados = q.getResultList();
        empleados.forEach((e) -> {
            System.out.println(e);
        });
        
        em.getTransaction().begin();
        
       
        //em.persist(em1);
        //Empleado e = em.find(Empleado.class, "111111E");
        //e.setFechaNacimiento(sdf.parse("2002-04-01"));
        //em.remove(e);
        
        em.getTransaction().commit();

        em.close();
        factory.close();

    }

}
