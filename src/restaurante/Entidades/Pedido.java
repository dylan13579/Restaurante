
package restaurante.Entidades;


public class Pedido {
    
    private int idPedido;
    private Mesa numeroMesa;
    private Mesero numeroMesero;
    private Producto codigoProducto;
    private int cantidadProducto;
    private boolean cobrado;

    public Pedido() {
    }

    public Pedido(int idPedido, Mesa numeroMesa, Mesero numeroMesero, Producto codigoProducto, int cantidadProducto, boolean cobrado) {
        this.idPedido = idPedido;
        this.numeroMesa = numeroMesa;
        this.numeroMesero = numeroMesero;
        this.codigoProducto = codigoProducto;
        this.cantidadProducto = cantidadProducto;
        this.cobrado = cobrado;
    }

    public Pedido(Mesa numeroMesa, Mesero numeroMesero, Producto codigoProducto, int cantidadProducto, boolean cobrado) {
        this.numeroMesa = numeroMesa;
        this.numeroMesero = numeroMesero;
        this.codigoProducto = codigoProducto;
        this.cantidadProducto = cantidadProducto;
        this.cobrado = cobrado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Mesa numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public Mesero getNumeroMesero() {
        return numeroMesero;
    }

    public void setNumeroMesero(Mesero numeroMesero) {
        this.numeroMesero = numeroMesero;
    }

    public Producto getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Producto codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public boolean isCobrado() {
        return cobrado;
    }

    public void setCobrado(boolean cobrado) {
        this.cobrado = cobrado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numeroMesa=" + numeroMesa + ", numeroMesero=" + numeroMesero + ", codigoProducto=" + codigoProducto + ", cantidadProducto=" + cantidadProducto + ", cobrado=" + cobrado + '}';
    }

    
    
}
