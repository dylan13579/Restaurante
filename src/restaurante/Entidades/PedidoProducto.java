
package restaurante.Entidades;


public class PedidoProducto {
    
    private int idPedido_Producto;
    private Pedido idPedido;
    private Producto idProducto;
    private int cantidad;

    public PedidoProducto() {
    }

    public PedidoProducto(int idPedido_Producto, Pedido idPedido, Producto idProducto, int cantidad) {
        this.idPedido_Producto = idPedido_Producto;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public PedidoProducto(Pedido idPedido, Producto idProducto, int cantidad) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
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

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "PedidoProducto{" + "idPedido=" + idPedido + ", idProducto=" + idProducto + ", cantidad=" + cantidad + '}';
    }
    
    
}
