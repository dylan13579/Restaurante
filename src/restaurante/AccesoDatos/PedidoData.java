
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
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
    private int numeroMesa;

    
    public PedidoData () {
    
        wifi = Conexion.getConexion();
    
    }
    
    public void guardarPedido(Pedido pedido, Mesa mesa) {
        String sql = "INSERT INTO idPedido(idMesa, nombreMesero, Fecha, Hora, importe, cobrada) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = wifi.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, mesa.getIdMesa());
            ps.setString(2, pedido.getNombreMesero());
            ps.setDate(3, Date.valueOf(pedido.getFecha()));
            ps.setTime(4, Time.valueOf(pedido.getHora()));
            ps.setDouble(5, pedido.getImporte());
            ps.setBoolean(6, pedido.isCobrada());

            int modi = ps.executeUpdate();

            if (modi > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int genera = rs.getInt(1);
                    pedido.setIdPedido(genera);
                        JOptionPane.showMessageDialog(null, "Mesa reservado");
                }
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido ");
        }
    }
    
        public void guardarReserva(Pedido pedido, Mesa mesa) {
        String sql = "INSERT INTO idPedido(idMesa, nombreMesero, Fecha, Hora, importe, cobrada) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = wifi.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, mesa.getIdMesa());
            ps.setString(2, pedido.getNombreMesero());
            ps.setDate(3, Date.valueOf(pedido.getFecha()));
            ps.setTime(4, Time.valueOf(pedido.getHora()));

            int modi = ps.executeUpdate();

            if (modi > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int genera = rs.getInt(1);
                    pedido.setIdPedido(genera);
                    JOptionPane.showMessageDialog(null, "Mesa reservada");
                }
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido ");
        }
    }
  
    public void modificarPedido(Pedido pedido){
      
          String sql = "UPDATE idPedido SET nombreMesero = ? ,Fecha = ? ,Hora = ? ,importe = ? ,cobrada = ? WHERE idPedido = ?";
          
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setString(1, pedido.getNombreMesero());
            ps.setDate(2,Date.valueOf(pedido.getFecha()));
            ps.setTime(3, Time.valueOf(pedido.getHora()));
            ps.setDouble(4, pedido.getImporte());
            ps.setBoolean(5, pedido.isCobrada());
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
    
     public void modificarComanda(Pedido pedido){//usada en comanda
      
          String sql = "UPDATE idPedido SET nombreMesero = ? ,Fecha = ? ,Hora = ? ,importe = ? , cobrada = ? WHERE idPedido = ? ";
        
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            
            ps.setString(1, pedido.getNombreMesero());
            ps.setDate(2,Date.valueOf(pedido.getFecha()));
            ps.setTime(3, Time.valueOf(pedido.getHora()));
            ps.setDouble(4, pedido.getImporte());
            ps.setBoolean(5, pedido.isCobrada());
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
   
     public void modificaFinalizar(Pedido pedido, Mesa m) {
        String sql = "UPDATE pedido SET importe = ?, cobrada = ? WHERE numeroMesa = ?";
    
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setDouble(1, pedido.getImporte());
            ps.setBoolean(2, true); // Supongo que siempre quieres establecer 'cobrada' en 'true'
            ps.setInt(3, m.getNumeroMesa());
        
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Importe agregado con éxito");
        }         
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Pedido: " + ex.getMessage());
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
       
    public void cancelarPedidoNumeroMesa(int idMesa) {

        String sql = "UPDATE idPedido SET cobrada = 0 WHERE idMesa = ? ";

        try {
            PreparedStatement ps = wifi.prepareStatement(sql);

            ps.setInt(1, idMesa);
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Pedido cancelado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "El pedido esta vigente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
        }
    }
    
    public void sumarPedido(Mesa mesa){
           
           String sql = "SELECT SUM(importe) FROM pedido WHERE idMesa = ?";
           
        try {
            
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setInt(1, mesa.getIdMesa());
            
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

    public List<Pedido> obtenerPedidoCobrado(int idMesa){
    
        List<Pedido> encargo = new ArrayList<>();
        String sql = "SELECT idPedido, idMesa, Fecha, Hora, importe, cobrada FROM pedido WHERE cobrada = 1 AND idMesa = ?";

    try{
        PreparedStatement ps = wifi.prepareStatement(sql);
        ps.setInt(1, idMesa);

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setFecha(rs.getDate("Fecha").toLocalDate());
                pedido.setHora(rs.getTime("Hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrada(rs.getBoolean("cobrada"));
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
                    pedido.setCobrada(rs.getBoolean("Cobrada"));
                    encargo.add(pedido);                                
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido");
        }
        return encargo;
    }
    public List<Pedido> listarPedidos(int idMesa){
    
        String sql = "SELECT p.idPedido, p.idMesa, p.nombreMesero, p.Fecha, p.Hora, p.importe, p.cobrada "
                + "FROM pedido p "
                + "JOIN mesa m "
                + "ON p.idMesa = m.idMesa "
                + "WHERE p.cobrada = 1 "
                + "AND m.idMesa = ?";
        
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            
            ps.setInt(1, idMesa);
                        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
                Pedido pedido= new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setNombreMesero(rs.getString("nombreMesero"));
                pedido.setFecha(rs.getDate("Fecha").toLocalDate());
                pedido.setHora(rs.getTime("Hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrada(rs.getBoolean("cobrada"));
                
                pedidos.add(pedido);              
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido");
            
        }
        return pedidos;
    }
    
    

   public Pedido BuscarPedidoPorNum(int idMesa) {
    Pedido pedido = null;

    String sql = "SELECT idPedido, idMesa, nombreMesero, Fecha, Hora, importe, cobrada "
                + "FROM pedido "
                + "WHERE cobrada = 0 "
                + "AND idMesa = ? ";

    try {
        PreparedStatement ps = wifi.prepareStatement(sql);
        ps.setInt(1, idMesa);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            pedido = new Pedido();
            
            pedido.setIdPedido(rs.getInt("idPedido"));
            pedido.setNombreMesero(rs.getString("nombreMesero"));
            pedido.setFecha(rs.getDate("Fecha").toLocalDate());
            pedido.setHora(rs.getTime("Hora").toLocalTime());
            pedido.setImporte(rs.getDouble("importe"));
            pedido.setCobrada(rs.getBoolean("cobrada"));
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
   
   public List<Pedido> pedidoCobrados(String nombreMesero) {
    String sql = "SELECT * FROM pedido WHERE cobrada = 1 AND nombreMesero = ?";

    List<Pedido> cobrados = new ArrayList<>();

    try {
        PreparedStatement ps = wifi.prepareStatement(sql);

        ps.setString(1, nombreMesero);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pedido p = new Pedido();
            p.setIdPedido(rs.getInt("idPedido"));
            p.setNombreMesero(rs.getString("nombreMesero"));
            p.setFecha(rs.getDate("Fecha").toLocalDate());
            p.setHora(rs.getTime("Hora").toLocalTime());
            p.setImporte(rs.getDouble("importe"));
            p.setCobrada(true);

            cobrados.add(p);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
    }

    return cobrados;
}

    
public List<Pedido> pedidoNoCobrados(String nombreMesero) {
    String sql = "SELECT * FROM pedido WHERE cobrada = 0 AND nombreMesero = ?";

    List<Pedido> cobrados = new ArrayList<>();

    try {
        PreparedStatement ps = wifi.prepareStatement(sql);

        ps.setString(1, nombreMesero);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pedido p = new Pedido();
            p.setIdPedido(rs.getInt("idPedido"));
            p.setNombreMesero(rs.getString("nombreMesero"));
            p.setFecha(rs.getDate("Fecha").toLocalDate());
            p.setHora(rs.getTime("Hora").toLocalTime());
            p.setImporte(rs.getDouble("importe"));
            p.setCobrada(false);

            cobrados.add(p);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
    }

    return cobrados;
}
    
    
    public List<Pedido>Meseros(){
        
        String sql = "SELECT idPedido ,nombreMesero ,Fecha ,Hora ,importe ,cobrada FROM pedido WHERE cobrada = 1 OR cobrada = 0";
        
        ArrayList<Pedido> listar= new ArrayList<>();
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Pedido pedir = new Pedido();
                
                pedir.setIdPedido(rs.getInt("idPedido"));
                pedir.setNombreMesero(rs.getString("nombreMesero"));
                pedir.setFecha(rs.getDate("Fecha").toLocalDate());
                pedir.setHora(rs.getTime("Hora").toLocalTime());
                pedir.setCobrada(rs.getInt("cobrada") == 1);
                
                listar.add(pedir);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
        }
        return listar;
    }
    
    public void BuscarPedidoPorNumeroMesa(int idMesa) {
        

        String sql = "SELECT idMesa,nombreMesero, Fecha, Hora FROM pedido WHERE cobrada = 1 ";
        Pedido pedido = null;
    try {
        PreparedStatement ps = wifi.prepareStatement(sql);
        
        ps.setInt(1, idMesa);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            pedido = new Pedido();

            pedido.setNombreMesero(rs.getString("nombreMesero"));
            pedido.setFecha(rs.getDate("Fecha").toLocalDate());
            pedido.setHora(rs.getTime("Hora").toLocalTime());       

        }        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
    }
    }
    
    public void BuscarPedidoPorMesa(int idMesa) {
        

        String sql = "SELECT idMesa, nombreMesero, Fecha, Hora FROM pedido WHERE cobrada = 0 ";
        Pedido pedido = null;
    try {
        PreparedStatement ps = wifi.prepareStatement(sql);
        
        ps.setInt(1, idMesa);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            pedido = new Pedido();
            
            
            pedido.setNombreMesero(rs.getString("nombreMesero"));
            pedido.setFecha(rs.getDate("Fecha").toLocalDate());
            pedido.setHora(rs.getTime("Hora").toLocalTime());       

        }        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
    }
    }    
    
    
    
   public List<Pedido> buscarFechas(LocalDate fecha) {
    List<Pedido> listaDeFechas = new ArrayList<>();
    String sql = "SELECT nombreMesero, Fecha, Hora, importe, cobrada FROM pedido WHERE cobrada = 1 AND Fecha = ?";

    try {
        PreparedStatement ps = wifi.prepareStatement(sql);
        ps.setDate(1, java.sql.Date.valueOf(fecha));
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pedido pedido = new Pedido();
            pedido.setNombreMesero(rs.getString("nombreMesero"));
            pedido.setFecha(rs.getDate("Fecha").toLocalDate());
            pedido.setHora(rs.getTime("Hora").toLocalTime());
            pedido.setImporte(rs.getDouble("importe"));
            pedido.setCobrada(rs.getBoolean("cobrada"));
            listaDeFechas.add(pedido);
        }
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
    }
    return listaDeFechas;
}

    
    public List<Pedido> obtenerTodosLosPedidos() {
    List<Pedido> pedidos = new ArrayList<>();
    String sql = "SELECT nombreMesero, Fecha, Hora, importe, cobrada FROM pedido";

    try (
         PreparedStatement ps = wifi.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Pedido pedido = new Pedido();
            pedido.setNombreMesero(rs.getString("nombreMesero"));
            pedido.setFecha(rs.getDate("Fecha").toLocalDate());
            pedido.setHora(rs.getTime("Hora").toLocalTime());
            pedido.setImporte(rs.getDouble("importe"));
            pedido.setCobrada(rs.getBoolean("cobrada"));
            pedidos.add(pedido);
        }

    } catch (SQLException ex) {
        ex.printStackTrace(); // Manejo básico de errores, puedes personalizarlo según tus necesidades.
    }

    return pedidos;
}

    
    public void BuscarPedidoPorid(int idPedido) {
        

        String sql = "SELECT idMesa, nombreMesero, Fecha, Hora FROM pedido WHERE idPedido = ? ";
        Pedido pedido = null;
    try {
        PreparedStatement ps = wifi.prepareStatement(sql);        
            ps.setInt(1, numeroMesa);
        
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            pedido = new Pedido();

            pedido.setNombreMesero(rs.getString("nombreMesero"));
            pedido.setFecha(rs.getDate("Fecha").toLocalDate());
            pedido.setHora(rs.getTime("Hora").toLocalTime());       

        }        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla pedido");
    }
    }    
}    
      
