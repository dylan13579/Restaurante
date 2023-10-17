
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;


public class PedidoData {

    private Connection wifi = null;
    
    private MesaData md = new MesaData();
    private int idPedido;
    
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
                JOptionPane.showMessageDialog(null, "Pedido Modificado con exito");
            }
          ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Pedido");
        }
          
         
      }
       
    public void cancelarPedidoId(int id) {

        String sql = "UPDATE pedido SET cobrada = 0 WHERE idPedido = ? ";

        try {
            PreparedStatement ps = wifi.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Pedido cancelado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "El pedido no ha sido cancelado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
        }
    }
       
    public void cancelarPedidoNumeroMesa(int numeroMesa) {

        String sql = "UPDATE pedido SET cobrada = 0 WHERE numeroMesa = ? ";

        try {
            PreparedStatement ps = wifi.prepareStatement(sql);

            ps.setInt(1, numeroMesa);
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Pedido cancelado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "El pedido no ha sido cancelado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
        }
    }
    
    public void sumarPedido(Mesa mesa){
           
           String sql = "SELECT SUM(importe) FROM pedido WHERE numeroMesa = ?";
           
        try {
            
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setInt(1, mesa.getNumeroMesa());
            
              ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                double resultado = rs.getDouble(1);
                JOptionPane.showMessageDialog(null, "Total de la cuenta es = " + resultado);
               
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido ");
        }
           
           
       }
    
    public void sumarPedidoPorMesero(Pedido pedido){
        
        String sql = "SELECT SUM(importe) FROM pedido WHERE nombreMesero = ?";
          
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setString(1, pedido.getNombreMesero());
            
            ResultSet rs = ps.executeQuery();
             if(rs.next()){
                double resultado = rs.getDouble(1);
                JOptionPane.showMessageDialog(null, "Total de la cuenta es = " + resultado);
               
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido ");
        }
        
    }

    public List<Pedido> listarPedidos(){
        
        String sql = "SELECT idPedido, nombreMesero, Fecha, Hora, importe, stock, cobrada FROM pedido WHERE cobrada = 1";
        
        ArrayList<Pedido> encargos = new ArrayList<>();
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                Pedido pedidos= new Pedido();
                pedidos.setIdPedido(rs.getInt("idPedido"));
                pedidos.setNombreMesero(rs.getString("nombreMesero"));
                pedidos.setFecha(rs.getDate("Fecha").toLocalDate());
                pedidos.setImporte(rs.getDouble("importe"));
                
                pedidos.setCobrado(true);
                
                encargos.add(pedidos);

        }
        
        ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido ");
        }
        return encargos;
    }
    public List<Pedido> listarPedidoPendiente(){
    
        
            String sql = "SELECT idPedido, nombreMesero, Fecha, Hora, importe, cobrada FROM pedido WHERE cobrada = 0";
            
            ArrayList<Pedido> encargos = new ArrayList<>();
        try {    
            PreparedStatement ps = wifi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Pedido pedidos = new Pedido();
               // pedidos.setIdPedido(rs.getString(idPedido));
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    return encargos;
}
    
    public void borrarCobrada(int idPedido){
    
        String sql = "UPDATE pedido SET cobrada = 1 WHERE  idPedido = ?";
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ps.setInt(2, idPedido);
            
            int filas=ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Cobrada borrada con exito");            
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

}

