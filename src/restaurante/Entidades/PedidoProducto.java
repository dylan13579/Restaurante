
package restaurante.Entidades;


public class PedidoProducto {
    
    private int idPedido_Producto;
    private Pedido idpedido;
    private  Producto idproducto;
    private int cantidad;

    public PedidoProducto() {
    }

    public PedidoProducto(int idPedido_Producto, Pedido idpedido, Producto idproducto, int cantidad) {
        this.idPedido_Producto = idPedido_Producto;
        this.idpedido = idpedido;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
    }

    public PedidoProducto(Pedido idpedido, Producto idproducto, int cantidad) {
        this.idpedido = idpedido;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
    }

    public int getIdPedido_Producto() {
        return idPedido_Producto;
    }

    public void setIdPedido_Producto(int idPedido_Producto) {
        this.idPedido_Producto = idPedido_Producto;
    }

    public Pedido getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Pedido idpedido) {
        this.idpedido = idpedido;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "PedidoProducto{" + "idPedido_Producto=" + idPedido_Producto + ", idpedido=" + idpedido + ", idproducto=" + idproducto + ", cantidad=" + cantidad + '}';
    }

}
