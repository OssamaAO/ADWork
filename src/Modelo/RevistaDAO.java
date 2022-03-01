
package Modelo;

import java.util.List;


public interface RevistaDAO {
    
    public void create(Revista r);

    
    public Revista getRevista(Integer Id_producto);

  
    public List<Revista> listRevista();

   
    public void delete(Revista r);

   
    public void update(Revista r);
}
