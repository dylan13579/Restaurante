
package restaurante;


import java.time.LocalDate;
import java.time.LocalTime;
import restaurante.AccesoDatos.*;
import restaurante.Entidades.*;


public class Restaurante {

    
    public static void main(String[] args) {
       
        /*
         MesaData me=new MesaData();
        
        //Mesa m=new Mesa(1,"Mesa para 2 personas",false);
             //me.guardarMesa(m);
             //me.modificarMesa(m);
             
         */
        
    PedidoData pe = new PedidoData();
    
    Mesa mesa = new Mesa();
    mesa.setNumeroMesa(3);
    
    Pedido pedido = new Pedido();
    pedido.setNombreMesero("Mauricio Tolosa");
    pedido.setFecha(LocalDate.of(2023, 8, 15));
    pedido.setHora(LocalTime.of(18, 15)); 
    pedido.setImporte(0.0); 
    pedido.setCobrado(false);

    pe.guardarPedido(pedido, mesa);
        
     
    }
             
    
}
