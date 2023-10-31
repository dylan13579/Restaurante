
package restaurante.Entidades;


public class PedidoProducto {
    
    private int idPedido_Producto;
    private Pedido pedido;
    private  Producto insumos;
    private int cantidad;

    public PedidoProducto() {
    }

    public PedidoProducto(int idPedido_Producto, Pedido pedido, Producto insumos, int cantidad) {
        this.idPedido_Producto = idPedido_Producto;
        this.pedido = pedido;
        this.insumos = insumos;
        this.cantidad = cantidad;
    }

    public PedidoProducto(Pedido pedido, Producto insumos, int cantidad) {
        this.pedido = pedido;
        this.insumos = insumos;
        this.cantidad = cantidad;
    }

    public int getIdPedido_Producto() {
        return idPedido_Producto;
    }

    public void setIdPedido_Producto(int idPedido_Producto) {
        this.idPedido_Producto = idPedido_Producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getInsumos() {
        return insumos;
    }

    public void setInsumos(Producto insumos) {
        this.insumos = insumos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "PedidoProducto{" + "idPedido_Producto=" + idPedido_Producto + ", pedido=" + pedido + ", insumos=" + insumos + ", cantidad=" + cantidad + '}';
    }

}
