
package restaurante.Entidades;


public class PedidoProducto {
    
    private int idPedido_Producto;
    private Pedido idPedido;
    private  Producto codigoProducto;
    private int cantidad;

    public PedidoProducto() {
    }

    public PedidoProducto(int idPedido_Producto, Pedido idPedido, Producto codigoProducto, int cantidad) {
        this.idPedido_Producto = idPedido_Producto;
        this.idPedido = idPedido;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
    }

    public PedidoProducto(Pedido idPedido, Producto codigoProducto, int cantidad) {
        this.idPedido = idPedido;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
    }

    public int getIdPedido_Producto() {
        return idPedido_Producto;
    }

    public void setIdPedido_Producto(int idPedido_Producto) {
        this.idPedido_Producto = idPedido_Producto;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public Producto getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Producto codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "PedidoProducto{" + "idPedido_Producto=" + idPedido_Producto + ", idPedido=" + idPedido + ", codigoProducto=" + codigoProducto + ", cantidad=" + cantidad + '}';
    }

   
   
    
}
