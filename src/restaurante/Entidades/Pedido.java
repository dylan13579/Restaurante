
package restaurante.Entidades;

import java.time.LocalDateTime;




public class Pedido {
    
    private int idPedido;
    private Mesa numeroMesa;
    private String nombreMesero;
    private LocalDateTime Fecha_Hora;
    private double importe;
    private boolean cobrado;

    public Pedido(int idPedido, Mesa numeroMesa, String nombreMesero, LocalDateTime Fecha_Hora, double importe, boolean cobrado) {
        this.idPedido = idPedido;
        this.numeroMesa = numeroMesa;
        this.nombreMesero = nombreMesero;
        this.Fecha_Hora = Fecha_Hora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public Pedido(Mesa numeroMesa, String nombreMesero, LocalDateTime Fecha_Hora, double importe, boolean cobrado) {
        this.numeroMesa = numeroMesa;
        this.nombreMesero = nombreMesero;
        this.Fecha_Hora = Fecha_Hora;
        this.importe = importe;
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

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public LocalDateTime getFecha_Hora() {
        return Fecha_Hora;
    }

    public void setFecha_Hora(LocalDateTime Fecha_Hora) {
        this.Fecha_Hora = Fecha_Hora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isCobrado() {
        return cobrado;
    }

    public void setCobrado(boolean cobrado) {
        this.cobrado = cobrado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numeroMesa=" + numeroMesa + ", nombreMesero=" + nombreMesero + ", Fecha_Hora=" + Fecha_Hora + ", importe=" + importe + ", cobrado=" + cobrado + '}';
    }
    
    
    
   
    
    
}
