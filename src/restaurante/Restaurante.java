
package restaurante;

import restaurante.AccesoDatos.*;
import restaurante.Entidades.*;


public class Restaurante {

 
    public static void main(String[] args) {
       
        
         MesaData me=new MesaData();
        
        Mesa m=new Mesa(1,"Mesa para 5 personas",true);
             //me.guardarMesa(m);
             me.modificarMesa(m);
             
             
             
    }
}
