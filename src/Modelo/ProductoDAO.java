/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;


public interface ProductoDAO {
    
    public void create(Producto p);

    
    public Producto getProducto(Integer Id_producto);

  
    public List<Producto> listProducto();

   
    public void delete(Producto p);

   
    public void update(Producto p);
    
}
