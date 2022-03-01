/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author alumno1
 */
public interface EmpleadoDAO {
      
    public void create(Empleado e);

    
    public Empleado getEmpleado(String DNI);

  
    public List<Empleado> listEmpleado();

   
    public void delete(Empleado e);

   
    public void update(Empleado e);
}
