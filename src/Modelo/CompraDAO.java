
package Modelo;

import java.util.List;


public interface CompraDAO {
    
    public void create(Compra c);

    
    public Compra getCompra(Integer Id_compra);

  
    public List<Compra> listCompra();

   
    public void delete(Compra c);

   
    public void update(Compra c);
    
}
