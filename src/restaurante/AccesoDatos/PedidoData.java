
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

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
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido: ");
    }
  }
    
}

    

