
package restaurante;

import restaurante.AccesoDatos.*;
import restaurante.Entidades.*;


public class Restaurante {

 
    public static void main(String[] args) {
       
        
         MesaData me=new MesaData();
        
        Mesa m=new Mesa(4,"Mesa para 4 personas",true);
             //me.guardarMesa(m);
             me.modificarMesa(m);
             
             
             
    }
}
