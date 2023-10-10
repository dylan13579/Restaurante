
package restaurante;


import java.time.LocalDate;
import java.time.LocalTime;
import restaurante.AccesoDatos.*;
import restaurante.Entidades.*;


public class Restaurante {

    
    public static void main(String[] args) {
       
        
        //Pruebas de Mesa
        //MesaData me=new MesaData(); //creando instancia data
        
        /*Mesa m=new Mesa(1,"Mesa para 2 personas",false);
            //me.guardarMesa(m);
            //me.modificarMesa(m);
        */
            //metodo dar de baja
            //me.darBajaMesaId(4);
            //me.darBajaMesaNum(5);
         
            //metodo buscar
//        Mesa meEncontrada = me.buscarMesaPorNum(4);
//        if (meEncontrada != null) {
//            System.out.println("------ Mesas ------");
//            System.out.println("numeroMesa: " + meEncontrada.getNumeroMesa());
//            System.out.println("descripcion: " + meEncontrada.getDescripcion());
//            System.out.println("");
//        }
            
            //metodos listar
        //MesaData me = new MesaData();
//        for (Mesa mesa : me.listarMesasdisponibles()) {
//            System.out.println("-----mesa------");
//            System.out.println("numero: "+mesa.getNumeroMesa());
//            System.out.println("cantidad: "+mesa.getDescripcion());
//            System.out.println("estado: "+mesa.isEstado());
//            System.out.println("");
//        }
        //MesaData me = new MesaData();
//        for (Mesa mesa : me.listarMesasNodisponibles()) {
//            System.out.println("-----mesa------");
//            System.out.println("numero: "+mesa.getNumeroMesa());
//            System.out.println("cantidad: "+mesa.getDescripcion());
//            System.out.println("estado: "+mesa.isEstado());
//            System.out.println("");
//        }
         



        //Pruebas de Pedido
//        
//        PedidoData pe = new PedidoData();
//   
//          //Mesa mesa = new Mesa();
//          //mesa.setNumeroMesa(1);
//          
//          Pedido pedido = new Pedido();
//          pedido.setNombreMesero("Dylan");
          
          
//    
//            Pedido pedido = new Pedido();
//            pedido.setIdPedido(7);
//            pedido.setNombreMesero("Dylan Jofre Villegas");
//            pedido.setFecha(LocalDate.of(2023, 10, 5));
//            pedido.setHora(LocalTime.of(21, 30)); 
//            pedido.setImporte(2300.99); 
//            pedido.setCobrado(true);
//
//            //pe.guardarPedido(pedido, mesa);
//            pe.modificarPedido(pedido);
              // pe.sumarPedido(mesa);
             //pe.sumarPedidoPorMesero(pedido);
     
        //metodo cancelar
//        PedidoData pe = new PedidoData();
        
//        pe.cancelarPedidoId(8);
//        pe.cancelarPedidoNumeroMesa(9);
         
    
        //Pruebas de Producto
        
        //ProductoData produc = new ProductoData();
//       Producto pro = new Producto(6,"Pizza","Calabresa",46,3645.55,true); //guardar un producto
          //Producto pro = new Producto(6,"Empanadas","jamon y queso",100,2600,true); //modiifcar producto
//        produc.guardarProducto(pro);
          //produc.modificarProducto(pro);
          
         ProductoData pro = new ProductoData();
         Producto buscar = pro.buscarProductos(5);
         
         if(buscar != null){
             System.out.println("codigo = "+buscar.getCodigoProducto());
             System.out.println("Nombre del Producto = "+buscar.getNombreProducto());
             System.out.println("Descripcion = "+buscar.getDescripcion());
             System.out.println("Stock = "+buscar.getStock());
             System.out.println("Precio = "+buscar.getPrecio());
             
             
             
         }
         




    }
             
 //gustavo comenta   
}
