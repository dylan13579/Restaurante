
package restaurante.Entidades;


public class Producto {
    
    private int idProducto;
    private int codigoProducto;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private boolean estado;

    public Producto() {
    }   

    public Producto(int idProducto, int codigoProducto, String nombreProducto, String descripcion, double precio, boolean estado) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public Producto(int codigoProducto, String nombreProducto, String descripcion, double precio, boolean estado) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", precio=" + precio + ", estado=" + estado + '}';
    }


}
