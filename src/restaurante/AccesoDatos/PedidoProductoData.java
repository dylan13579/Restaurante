
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class PedidoProductoData {
    
    private Connection wifi = null;
     private PedidoData pd = new PedidoData();
     private ProductoData prd = new ProductoData();
     
    
    public PedidoProductoData(){
        
        wifi = Conexion.getConexion();
        

    }
   
     
    public void guardarPedidoProducto(int numeroPedido, int pedido, int codigoProducto, int cantidad){
        
         String sql = "INSERT INTO pedidoproducto(numeroPedido, idPedido, codigoProducto, cantidad) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = wifi.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, numeroPedido);
            ps.setInt(2, pedido);
            ps.setInt(3, codigoProducto);
            ps.setInt(4, cantidad);

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
    
   public void modificarProducto(int numeroPedido, int codigoProducto, int cantidad, int pedido) {
    
      String sql = "UPDATE pedidoproducto SET idPedido = ?, codigoProducto = ?, cantidad = ? WHERE numeroPedido = ?";

    try {
        PreparedStatement ps = wifi.prepareStatement(sql);
        ps.setInt(1, pedido);
        ps.setInt(2, codigoProducto);
        ps.setInt(3, cantidad);
        ps.setInt(4, numeroPedido); // Specify the 'numeroPedido' for the WHERE clause

        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "El pedido se ha cambiado");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un pedido con el número proporcionado.");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Pedido Producto");
    } 
   }
    
   
   public void elimanrpedido(int idPedido){
       
       String sql = "DELETE FROM pedidoproducto WHERE idPedido = ?";
       
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            
            ps.setInt(1, idPedido);
            
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "se ha cancelado el pedido");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Pedido Producto");
        }
       
   }
 
    
}
