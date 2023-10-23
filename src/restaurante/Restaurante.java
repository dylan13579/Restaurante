
package restaurante;



import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import restaurante.AccesoDatos.*;
import restaurante.Entidades.*;


public class Restaurante {

    
    public static void main(String[] args) {
       
        
        //Pruebas de Mesa
        //MesaData me=new MesaData(); //creando instancia data
//        
//        Mesa m=new Mesa(6,"Mesa para 6 personas",true);
//            me.guardarMesa(m);
            //me.modificarMesa(m);
        
            //metodo dar de baja
            //me.darBajaMesaId(4);
            //me.darBajaMesaNumero(1);
         
            //metodo buscar
//        Mesa meEncontrada = me.buscarMesaPorNum(2);
//        if (meEncontrada != null) {
//            System.out.println("Mesas encontrada");
//            System.out.println("numeroMesa: " + meEncontrada.getNumeroMesa());
//            System.out.println("descripcion: " + meEncontrada.getDescripcion());
//            System.out.println("");
//        }
            
            //metodos listar
        MesaData me = new MesaData();
        for (Mesa mesa : me.listarMesasdisponibles()) {
            System.out.println("Mesa disponible");
            System.out.println("numero: "+mesa.getNumeroMesa());
            System.out.println("cantidad: "+mesa.getDescripcion());
            System.out.println("estado: "+mesa.isEstado());
           
        }
//        MesaData me = new MesaData();
//        for (Mesa mesa : me.listarMesasNodisponibles()) {
//            System.out.println("Mesa no disponible");
//            System.out.println("numero: "+mesa.getNumeroMesa());
//            System.out.println("cantidad: "+mesa.getDescripcion());
//            System.out.println("estado: "+mesa.isEstado());
//            System.out.println("");
//        }
         



        //Pruebas de Pedido
//        
        //PedidoData pe = new PedidoData();
//   
//          Mesa mesa = new Mesa();
//          mesa.setNumeroMesa(1);
//            Pedido pedido = new Pedido();
//            pedido.setIdPedido(7);
//            pedido.setNombreMesero("Dylan Jofre Villegas");
//            pedido.setFecha(LocalDate.of(2023, 10, 5));
//            pedido.setHora(LocalTime.of(21, 30)); 
//            pedido.setImporte(2300.99); 
//            pedido.setCobrado(true);

           // pe.guardarPedido(pedido, mesa);
//            pe.modificarPedido(pedido);
              // pe.sumarPedido(mesa);
              
             
//               Pedido pedido = new Pedido();
//               pedido.setNombreMesero("Dylan Jofre Villegas ");
//                  pe.sumarPedidoPorMesero(pedido);
     
        //metodo cancelar
//        PedidoData pe = new PedidoData();
        
//        pe.cancelarPedidoId(8);
//        pe.cancelarPedidoNumeroMesa(9);
         
        
//        PedidoData pe=new PedidoData();
//        for(Pedido pedido : pe.listarPedidos(7)){
//            System.out.println("mesas pagadas= "+pedido);
//            System.out.println("pedido");
//        }

//        PedidoData pedidonuevo = new PedidoData();
//        for(Pedido obetener : pedidonuevo.obtenerPedidoCobrado(1)){
//            System.out.println("Mesero"+obetener.getNombreMesero());
//        }
        
        
        
        
        //Pruebas de Producto
        
        //ProductoData produc = new ProductoData();
        //Producto pro = new Producto(3,"Coca Cola","Gaseosa",900, 50,true); //guardar un producto
          //Producto pro = new Producto(2,"Empanadas","jamon y queso",2600,70,true); //modiifcar producto
        //produc.guardarProducto(pro);
          //produc.modificarProducto(pro);
          
          //produc.darDebajaProducto(1);
          
//          
         //ProductoData pro = new ProductoData();
//         Producto buscar = pro.buscarProductos(4);
//         
//         if(buscar != null){
//             System.out.println("codigo = "+buscar.getCodigoProducto());
//             System.out.println("Nombre del Producto = "+buscar.getNombreProducto());
//             System.out.println("Descripcion = "+buscar.getDescripcion());
//             System.out.println("Precio = "+buscar.getPrecio());
//             System.out.println("stock = "+buscar.getStock());
//             
//         }

            
            
//            ProductoData product = new ProductoData();
//                for (Producto lista : product.listarProductos()) {
//                    System.out.println("codigo = "+lista.getCodigoProducto());
//                    System.out.println("nombre = "+lista.getNombreProducto());
//                    System.out.println("descriocion = "+lista.getDescripcion());
//                    System.out.println("precio = "+lista.getPrecio());
//                    System.out.println("stock = "+lista.getStock());
//                    System.out.println("eatsdo = "+lista.isEstado());
//                    System.out.println("------");
//        }



          //Pruebas de PedidoProducto
          
       //PedidoProductoData pp = new PedidoProductoData();
//      

         //pp.guardarPedidoProducto(4, 4, 3, 2);
         //pp.modificarProducto(3, 2, 3);
         //pp.elimanrpedido(10);
       
        
          
    }
           
}