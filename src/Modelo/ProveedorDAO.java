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
public interface ProveedorDAO {
    
    public void create(Proveedor p);
  
    public Proveedor getProveedor (Integer CIF);

    public List<Proveedor> listProveedor();

    public void delete(Proveedor p);

    public void update(Proveedor p);
    
}
