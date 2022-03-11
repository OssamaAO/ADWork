/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adworkfinal;

import Modelo.Empleado;
import JPADAO.EmpleadoImp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author alumno1
 */
public class ADWorkFinal {

    public static void main(String[] args) throws ParseException {
        //ApplicationContext context = new ClassPathXmlApplicationContext("Spring/ADWorkSpringXMLConfig.xml");
        //EmpleadoImp empleadoImpl = (EmpleadoImp) context.getBean("EmpleadoJPATemplate");
        
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //Empleado em1 = new Empleado("111111E", "Ossama", "Aouad", 19, sdf.parse("2002-04-01"), 1000.00, true, "eketit");
        
        
        //empleadoImpl.create(em1);
        
        //System.out.println(empleadoImpl.getEmpleado(em1.getDni()));
        
        //Empleado e = empleadoImpl.getEmpleado(em1.getDni());
        //e.setNombre("Ossamaa");
        //System.out.println(empleadoImpl.getEmpleado(em1.getDni()));
        
        //Empleado e = empleadoImpl.getEmpleado(em1.getDni());
        //empleadoImpl.delete(e);
        

    }

}
