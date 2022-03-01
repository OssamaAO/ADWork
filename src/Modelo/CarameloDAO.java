
package Modelo;

import java.util.List;


public interface CarameloDAO {
    
    public void create(Caramelo c);

    
    public Caramelo getCaramelo(Integer Id_producto);

  
    public List<Caramelo> listCaramelo();

   
    public void delete(Caramelo c);

   
    public void update(Caramelo c);
    
    
}
