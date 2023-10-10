
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante.Entidades.*;


public class PedidoProductoData {
    
    private Connection wifi = null;
     private PedidoData pd = new PedidoData();
     private ProductoData prd = new ProductoData();
     
    
    public PedidoProductoData(){
        
        wifi = Conexion.getConexion();
        

    }
     
     
    public void guardarPedidoProducto(PedidoProducto pedidoproducto, Pedido pedido, Producto codigoProducto){
        
        String sql = "INSERT INTO pedidoproducto(idPedido, codigoProducto, cantidad) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
         
           ps.setInt(1, pedido.getIdPedido());
           ps.setInt(2, codigoProducto.getCodigoProducto());
           ps.setInt(3,pedidoproducto.getCantidad());
  
            ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();
                
                if(rs.next()){
                    pedidoproducto.setIdPedido_Producto(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Pedido encargado");
                }
           
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Pedido Producto");
        }
          
    }
    

    
}
