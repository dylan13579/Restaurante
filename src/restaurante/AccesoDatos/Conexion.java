


package restaurante.AccesoDatos;

import java.sql.*;

import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String BD="restaurante";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection conectar;
    
    
    private Conexion(){}
    
    public static Connection getConexion(){
    
          if(conectar==null){
    
              try {
                  Class.forName("org.mariadb.jdbc.Driver");
            
                  conectar = DriverManager.getConnection(URL+BD,USUARIO,PASSWORD);
            
                  JOptionPane.showMessageDialog(null, "SE HA CONECTADO A LA BASE DE DATOS");
            
               } catch (ClassNotFoundException ex) {
                   JOptionPane.showMessageDialog(null, "ERROR AL CARGAR DRIVER");
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "NO SE PUDO CONECTAR AL DRIVER");
               }
                
            }
          return conectar;
    }
    
}

