
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa");
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
                JOptionPane.showMessageDialog(null, "Mesa modificada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa");
        }
        
    }
    
}
