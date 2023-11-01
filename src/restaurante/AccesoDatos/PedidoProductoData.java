
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.PedidoProducto;
import restaurante.Entidades.Producto;



public class PedidoProductoData {
    
    private Connection wifi = null;
     private PedidoData pd = new PedidoData();
     private ProductoData prd = new ProductoData();
     
    
    public PedidoProductoData(){
        
        wifi = Conexion.getConexion();
        

    }
   
    
    public void guardarPedidoProducto(int pedi, int pro, int cantidad){
        
         String sql = "INSERT INTO pedidoproducto(idPedido ,codigoProducto ,cantidad) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = wifi.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, pedi);
            ps.setInt(2, pro);
            ps.setInt(3, cantidad);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Pedido encargado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Pedido Producto");
        }
          
    }
    
////   
    
   
   public void elimanrpedido(int idPedido){
       
       String sql = "DELETE FROM pedidoproducto WHERE idPedido = ?";
       
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            
            ps.setInt(1, idPedido);
            
            int exito = ps.executeUpdate();
            
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Pedido cancelado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Pedido Producto");
        }
       
   }
 
    
}
