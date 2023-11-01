
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
    
   public void guardarMesa(Mesa mesa) {
    String sql = "INSERT INTO mesa(numeroMesa, descripcion, estado) VALUES (?, ?, ?)";

    try {
        PreparedStatement ps = wifi.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, mesa.getNumeroMesa());
        ps.setString(2, mesa.getDescripcion());
        ps.setBoolean(3, mesa.isEstado());
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            mesa.setIdMesa(1);
            JOptionPane.showMessageDialog(null, "Mesa agregada");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Mesa");
    }
}
    
   public void modificarMesa(Mesa mesa) {
    String sql = "UPDATE mesa SET numeroMesa = ?, descripcion = ?, estado = ? WHERE idMesa = ?";

    try {
        PreparedStatement ps = wifi.prepareStatement(sql);
        ps.setInt(1, mesa.getNumeroMesa());
        ps.setString(2, mesa.getDescripcion());
        ps.setBoolean(3, true);
        ps.setInt(4, mesa.getIdMesa());
           
        int mejor = ps.executeUpdate();
            
        if (mejor == 1) {
            JOptionPane.showMessageDialog(null, "Mesa modificada");
        }
        
        ps.close();
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
    

    public Mesa buscarMesaPorNum(int idMesa) {

        String sql = "SELECT idMesa, numeroMesa ,descripcion, estado FROM mesa WHERE idMesa = ? AND (estado = 1 OR estado = 0)";

        Mesa mesa = null;
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);

            ps.setInt(1, idMesa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mesa = new Mesa();
                
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setDescripcion(rs.getString("descripcion"));
                mesa.setEstado(rs.getInt("estado") == 1);
         
            
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla mesa");
        }

        return mesa;
    }

    public List<Mesa> listarMesasdisponibles() {

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

    public List<Mesa> listarMesasNodisponibles() {

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

    
    
}
