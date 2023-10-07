
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;





public class PedidoData {


       
    
    private Connection wifi = null;
    
    private MesaData md = new MesaData();
    
    public PedidoData () {
    
        wifi = Conexion.getConexion();
    
    }
    
   
  public void guardarPedido(Pedido pedido, Mesa mesa) {
    String sql = "INSERT INTO pedido(numeroMesa, nombreMesero, Fecha, Hora, importe, cobrada) VALUES (?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = wifi.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

        ps.setInt(1, mesa.getNumeroMesa());
        ps.setString(2, pedido.getNombreMesero());
        ps.setDate(3, Date.valueOf(pedido.getFecha()));
        ps.setTime(4, Time.valueOf(pedido.getHora()));
        ps.setDouble(5, pedido.getImporte());
        ps.setBoolean(6, pedido.isCobrado());

        int modi = ps.executeUpdate();

        if (modi > 0) {
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int genera = rs.getInt(1);
                pedido.setIdPedido(genera);
                JOptionPane.showMessageDialog(null, "Pedido agregado ");
            }
        } 

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido ");
    }
  }
  
       public void modificarPedido(Pedido pedido){
      
          String sql = "UPDATE pedido SET nombreMesero = ? ,Fecha = ? ,Hora = ? ,importe = ? ,cobrada = ? WHERE idPedido = ?";
          
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setString(1, pedido.getNombreMesero());
            ps.setDate(2,Date.valueOf(pedido.getFecha()));
            ps.setTime(3, Time.valueOf(pedido.getHora()));
            ps.setDouble(4, pedido.getImporte());
            ps.setBoolean(5, pedido.isCobrado());
            ps.setInt(6, pedido.getIdPedido());
            
            int mejor = ps.executeUpdate();
            
            if(mejor == 1){
                JOptionPane.showMessageDialog(null, "Pedido Modificado");
            }
          ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido ");
        }
          
         
      }
       
       
       
    
}

    

