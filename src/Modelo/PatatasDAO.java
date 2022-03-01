
package Modelo;

import java.util.List;


public interface PatatasDAO {
    
    public void create(Patatas p);

    
    public Patatas getPatatas(Integer Id_producto);

  
    public List<Patatas> listPatatas();

   
    public void delete(Patatas p);

   
    public void update(Patatas p);
    
}
