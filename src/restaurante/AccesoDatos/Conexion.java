


package restaurante.AccesoDatos;

import java.sql.*;

import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String BD="restaurante";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection conectar;
    
    
    Conexion(){}
    
    public static Connection getConexion(){
    
          if(conectar==null){
    
              try {
                  Class.forName("org.mariadb.jdbc.Driver");
            
                  conectar = DriverManager.getConnection(URL+BD,USUARIO,PASSWORD);
            
                  JOptionPane.showMessageDialog(null, "Se conecto a la base de datos");
            
               } catch (ClassNotFoundException ex) {
                   JOptionPane.showMessageDialog(null, "Error: Al cargar Drivers");
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "No se pudo cargar Drivers");
               }
                
            }
          return conectar;
    }
    
}

