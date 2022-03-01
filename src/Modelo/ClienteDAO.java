
package Modelo;

import java.util.List;


public interface ClienteDAO {
    
    public void create(Cliente c);

    
    public Cliente getCliente(Integer Id_cliente);

  
    public List<Cliente> listClientes();

   
    public void delete(Cliente c);

   
    public void update(Cliente c);
    
}
