
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
        
        String sql = "INSERT INTO producto(codigoProducto, nombreProducto, descripcion, precio, stock, estado) VALUES (?, ?, ?, ?, ?, ?)";
        
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, producto.getCodigoProducto());
            ps.setString(2, producto.getNombreProducto());
            ps.setString(3, producto.getDescripcion());
            ps.setDouble(4, producto.getPrecio());
            ps.setInt(5, producto.getStock());
            ps.setBoolean(6, producto.isEstado());
            
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
        
        String sql = "UPDATE producto SET nombreProducto = ?,descripcion = ?,precio = ?,stock = ?,estado = ? WHERE codigoProducto = ?";
        
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getCodigoProducto());
            
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
     
        String sql = "SELECT codigoProducto, nombreProducto, descripcion, precio, stock, estado FROM producto WHERE codigoProducto = ? AND (estado = 1 OR estado = 0)";
        
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
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getInt("estado") == 1);
                
                
            }else{
            
            JOptionPane.showMessageDialog(null, "El codigo de ese producto no existe");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Producto");
        }
        
        return producto;
    }
        
    
    public List<Producto> listarProductos(){
        
        String sql = "SELECT codigoProducto, nombreProducto, descripcion, precio, stock, estado FROM producto WHERE estado = 1";
        
        ArrayList<Producto> listar = new ArrayList<>();
        try {
            PreparedStatement ps = wifi.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                Producto pn = new Producto();
                
                pn.setCodigoProducto(rs.getInt("codigoProducto"));
                pn.setNombreProducto(rs.getString("nombreProducto"));
                pn.setDescripcion(rs.getString("descripcion"));
                pn.setPrecio(rs.getDouble("precio"));
                pn.setStock(rs.getInt("stock"));
                pn.setEstado(true);
                
                listar.add(pn);
                
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error intentando acceder a la tabla Producto");
        }
        
      return listar;  
    }
            
}
