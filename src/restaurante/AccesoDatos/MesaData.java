
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;
import restaurante.Entidades.*;


public class MesaData {
    
    private Connection wifi =  null;
    
    public MesaData(){
        wifi = Conexion.getConexion();
        
    }
    
    public void guardarMesa (Mesa mesa){
        
        String sql = "INSERT INTO mesa(numeroMesa, descripcion, estado) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getNumeroMesa());
            ps.setString(2,mesa.getDescripcion());
            ps.setBoolean(3, mesa.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                mesa.setNumeroMesa(1);
                 JOptionPane.showMessageDialog(null, "Mesa agregada");
                 ps.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Mesa");
        }
        
    }
    
    public void modificarMesa(Mesa mesa){
        
        String sql = "UPDATE mesa SET descripcion = ?, estado = ? WHERE numeroMesa = ? ";
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setString(1, mesa.getDescripcion());
            ps.setBoolean(2, mesa.isEstado());
            ps.setInt(3, mesa.getNumeroMesa());
           
          
            
            int mejoras = ps.executeUpdate();
            
            if(mejoras == 1){
                JOptionPane.showMessageDialog(null, "Mesa Reservada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Mesa");
        }
        
    }
    
    public void darBajaMesaId(int id) {

        String sql = "UPDATE mesa SET estado = 0 WHERE idMesa = ? ";

        try {
            PreparedStatement ps = wifi.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Se ha elimnado la Mesa");
            } 

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla mesa");
        }
    }
    
    public void darBajaMesaNumero(int numeroMesa) {

        String sql = "UPDATE mesa SET estado = 0 WHERE numeroMesa = ? ";

        try {
            PreparedStatement ps = wifi.prepareStatement(sql);

            ps.setInt(1, numeroMesa);
            
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Mesa Libre");
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla mesa");
        }
    }

    public Mesa buscarMesaPorNum(int numeroMesa) {

        String sql = "SELECT numeroMesa, descripcion, estado FROM mesa WHERE numeroMesa = ? AND (estado = 1 OR estado = 0)";

        Mesa mesa = null;
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);

            ps.setInt(1, numeroMesa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mesa = new Mesa();
                
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setDescripcion(rs.getString("descripcion"));
                mesa.setEstado(rs.getInt("estado") == 1);
         
            }
//            }else{
//                 JOptionPane.showMessageDialog(null, "Ese Numero de Mesa es invalido y no puede ingresar Caracteres ");
//            
//            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla mesa");
        }

        return mesa;
    }

    public List<Mesa> listarMesasdisponibles() {

        String sql = "SELECT idMesa, numeroMesa, descripcion FROM mesa WHERE estado = 1";

        ArrayList<Mesa> mesas = new ArrayList<>();
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);

            ResultSet rs = ps.executeQuery(); // devuelve mas de una fila
            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setDescripcion(rs.getString("descripcion"));
                mesa.setEstado(true);

                mesas.add(mesa); //agrego a la lista mesas en cada vuelta
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla mesa");
        }

        return mesas;
    }

    public List<Mesa> listarMesasNodisponibles() {

        String sql = "SELECT idMesa, numeroMesa, descripcion FROM mesa WHERE estado = 0";

        ArrayList<Mesa> mesas = new ArrayList<>();
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);

            ResultSet rs = ps.executeQuery(); // devuelve mas de una fila
            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setDescripcion(rs.getString("descripcion"));
                mesa.setEstado(false);

                mesas.add(mesa); //agrego a la lista mesas en cada vuelta
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla mesa");
        }

        return mesas;
    }

    
    
}
