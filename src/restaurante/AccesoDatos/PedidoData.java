
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
                    JOptionPane.showMessageDialog(null, "se he reservado esta Mesa");
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

    public List<Pedido> obtenerPedidoCobrado(int numeroMesa){
    
        List<Pedido> encargo = new ArrayList<>();
        String sql = "SELECT idPedido, numeroMesa, Fecha, Hora, importe, cobrada FROM pedido WHERE cobrada = 1 AND numeroMesa = ?";

    try{
        PreparedStatement ps = wifi.prepareStatement(sql);
        ps.setInt(1, numeroMesa);

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setFecha(rs.getDate("Fecha").toLocalDate());
                pedido.setHora(rs.getTime("Hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrada"));
                encargo.add(pedido);
            }
        }
    } catch (SQLException ex) {        
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido");
    }
    return encargo;
   }
   
    public List<Pedido>obtenerPedidosNoCobrados(int idPedido){
    
        List<Pedido> encargo = new ArrayList<>();
        String sql = "SELECT idPedido, nombreMesero, Fecha, Hora, importe, cobrada FROM pedido WHERE cobrada = 0";//saque numeroMesa
        
    
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setInt(1, idPedido);
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    Pedido pedido = new Pedido();
                    pedido.setIdPedido(rs.getInt("idPedido"));//saque numero mesa                    
                    pedido.setNombreMesero(rs.getString("nombreMesero"));
                    pedido.setFecha(rs.getDate("Fecha").toLocalDate());
                    pedido.setHora(rs.getTime("Hora").toLocalTime());
                    pedido.setImporte(rs.getInt("importe"));
                    pedido.setCobrado(rs.getBoolean("Cobrada"));
                    encargo.add(pedido);                                
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido");
        }
        return encargo;
    }
    public List<Pedido> listarPedidos(int numeroMesa){
    
        String sql = "SELECT p.idPedido, p.numeroMesa, p.nombreMesero, p.Fecha, p.Hora, p.importe, p.cobrada "
                + "FROM pedido p "
                + "JOIN mesa m "
                + "ON p.numeroMesa = m.numeroMesa "
                + "WHERE p.cobrada = 1 "
                + "AND m.numeroMesa = ?";
        
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            
            ps.setInt(1, numeroMesa);
                        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
                Pedido pedido= new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setNombreMesero(rs.getString("nombreMesero"));
                pedido.setFecha(rs.getDate("Fecha").toLocalDate());
                pedido.setHora(rs.getTime("Hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrada"));
                
                pedidos.add(pedido);              
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido");
            
        }
        return pedidos;
    }
    
    

   public Pedido BuscarPedidoPorNum(int numeroMesa) {
    Pedido pedido = null;

    String sql = "SELECT idPedido, numeroMesa, nombreMesero, Fecha, Hora, importe, cobrada "
                + "FROM pedido "
                + "WHERE cobrada = 0 "
                + "AND numeroMesa = ?";

    try {
        PreparedStatement ps = wifi.prepareStatement(sql);
        ps.setInt(1, numeroMesa);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            pedido = new Pedido();

            pedido.setNombreMesero(rs.getString("nombreMesero"));
            pedido.setFecha(rs.getDate("Fecha").toLocalDate());
            pedido.setHora(rs.getTime("Hora").toLocalTime());
            pedido.setImporte(rs.getDouble("importe"));
            pedido.isCobrado();
        } else {
            JOptionPane.showMessageDialog(null, "El numero de ese pedido no se encuentra");
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
    }

    return pedido;
    }
   
   public List<Pedido> listasMeseros(){
      
        String sql = "SELECT DISTINCT nombreMesero FROM pedido";
    List<Pedido> listaMeseros = new ArrayList<>();

    try {
        PreparedStatement ps = wifi.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
         Pedido lista = new Pedido();
         lista.setNombreMesero(rs.getString("nombreMesero"));
         
         listaMeseros.add(lista);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
    }

    return listaMeseros;
   }
   
    public List<Pedido> pedidoCobrados(int mesa){
        String sql = "SELECT p.idPedido, p.numeroMesa, p.nombreMesero, p.Fecha, p.Hora, p.importe, p.cobrada "
                + "FROM pedido p "
                + "JOIN mesa m "
                + "ON p.numeroMesa = m.numeroMesa WHERE p.cobrada = 1";
        
          List<Pedido> cobrados = new ArrayList<>();
                    
      try {
        PreparedStatement ps = wifi.prepareStatement(sql);
        
        ps.setInt(1, mesa);
        
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pedido p = new Pedido();
           
            p.setNombreMesero(rs.getString("nombreMesero"));
            p.setFecha(rs.getDate("Fecha").toLocalDate());
            p.setHora(rs.getTime("Hora").toLocalTime());
            p.setImporte(rs.getDouble("importe"));
            p.setCobrado(true);
            

            cobrados.add(p);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido: " + ex.getMessage());
    }

    return cobrados;
          
    }
    
    public List<Pedido> pedidoNoCobrados(int mesa){
        String sql = "SELECT p.idPedido, p.numeroMesa, p.nombreMesero, p.Fecha, p.Hora, p.importe, p.cobrada "
                + "FROM pedido p "
                + "JOIN mesa m "
                + "ON p.numeroMesa = m.numeroMesa WHERE p.cobrada = 0";
        
          List<Pedido> cobrados = new ArrayList<>();
                    
      try {
        PreparedStatement ps = wifi.prepareStatement(sql);
        
        ps.setInt(1, mesa);
        
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pedido p = new Pedido();
           
            p.setNombreMesero(rs.getString("nombreMesero"));
            p.setFecha(rs.getDate("Fecha").toLocalDate());
            p.setHora(rs.getTime("Hora").toLocalTime());
            p.setImporte(rs.getDouble("importe"));
            

            cobrados.add(p);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido: " + ex.getMessage());
    }

    return cobrados;
          
    }
}    
      
