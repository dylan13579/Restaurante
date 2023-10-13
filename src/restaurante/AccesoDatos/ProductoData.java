
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante.Entidades.Producto;


public class ProductoData {
    
    
    private Connection wifi = null;
    
    
    public ProductoData(){
        
        wifi = Conexion.getConexion();
        
    }
    
    
    public void guardarProducto(Producto producto){
        
        String sql = "INSERT INTO producto(codigoProducto, nombreProducto, descripcion, precio, estado) VALUES (?, ?, ?, ?, ?)";
        
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, producto.getCodigoProducto());
            ps.setString(2, producto.getNombreProducto());
            ps.setString(3, producto.getDescripcion());
            ps.setDouble(4, producto.getPrecio());
            ps.setBoolean(5, producto.isEstado());
            
            int mercaderia = ps.executeUpdate();
            
            if(mercaderia > 0){
               ResultSet rs = ps.getGeneratedKeys();
               if(rs.next()){
                   int genera = rs.getInt(1);
                   producto.setCodigoProducto(genera);
                   
                   JOptionPane.showMessageDialog(null, "Producto agreddo");
               }
            }
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Producto");
        }
           
    }  
    
    
    public void modificarProducto(Producto producto){
        
        String sql = "UPDATE producto SET nombreProducto = ?,descripcion = ?,precio = ?,estado = ? WHERE codigoProducto = ?";
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.isEstado());
            ps.setInt(5, producto.getCodigoProducto());
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                    JOptionPane.showMessageDialog(null, "Se ha modificado el producto");
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Producto");
        }

    }
    
    public void darDebajaProducto(int producto){
        
        
        String sql = "UPDATE producto SET estado = 0 WHERE codigoProducto = ?";
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setInt(1, producto);
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                 JOptionPane.showMessageDialog(null, "Producto ha eliminada con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Producto");
        }
        
    }
    
    public Producto buscarProductos(int codigoProducto){
     
        String sql = "SELECT codigoProducto, nombreProducto, descripcion, precio FROM producto WHERE codigoProducto = ? AND estado = 1";
        
        Producto producto = null;
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            
            ps.setInt(1, codigoProducto);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                producto = new Producto();
                producto.setCodigoProducto(rs.getInt("codigoProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setEstado(true);
                
                
            }else{
            
            JOptionPane.showMessageDialog(null, "El codigo de ese producto no existe");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Producto");
        }
        
        return producto;
    }
         
            
}
