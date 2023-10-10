
package restaurante.AccesoDatos;

import java.sql.Connection;


public class PedidoProductoData {
    
    private Connection wifi = null;
    
     public PedidoProductoData(){
        
        wifi = Conexion.getConexion();
        
    }

    
}
