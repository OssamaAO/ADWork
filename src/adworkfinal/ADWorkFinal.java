/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adworkfinal;

import Modelo.Empleado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alumno1
 */
public class ADWorkFinal {

    
    public static void main(String[] args) throws ParseException {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ADWorkFinalPU");
        EntityManager em = factory.createEntityManager();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ii:ss");

        Empleado em1 = new Empleado("111111E" , "Ossama", "Aouad", 19, sdf.parse("2002-04-01 15:03:23") , 1000.00, true, "eketit");
        
        em.getTransaction().begin();

        
        
        em.getTransaction().commit();

        em.close();
        factory.close();

    }

}
