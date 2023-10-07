
package restaurante;


import java.time.LocalDate;
import java.time.LocalTime;
import restaurante.AccesoDatos.*;
import restaurante.Entidades.*;


public class Restaurante {

    
    public static void main(String[] args) {
       
        /*
        
            //Mesa
         MesaData me=new MesaData();
        
        //Mesa m=new Mesa(1,"Mesa para 2 personas",false);
             //me.guardarMesa(m);
             //me.modificarMesa(m);
             
         */
        
        
        //Pedido
        
    PedidoData pe = new PedidoData();
//    
//    Mesa mesa = new Mesa();
//    mesa.setNumeroMesa(3);
    
    Pedido pedido = new Pedido();
    pedido.setIdPedido(7);
    pedido.setNombreMesero("Dylan Jofre Villegas");
    pedido.setFecha(LocalDate.of(2023, 10, 5));
    pedido.setHora(LocalTime.of(21, 30)); 
    pedido.setImporte(2300.99); 
    pedido.setCobrado(true);

    //pe.guardarPedido(pedido, mesa);
    pe.modificarPedido(pedido);
        
     
    }
             
    
}
