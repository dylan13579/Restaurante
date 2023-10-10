
package restaurante.Entidades;


import java.time.LocalDate;

import java.time.LocalTime;




public class Pedido {
    
    private int idPedido;
    private Mesa mesa;
    private String nombreMesero;
    private LocalDate fecha;
    private LocalTime hora;
    private double importe;
    private boolean cobrado;

    public Pedido() {
    }

    public Pedido(int idPedido, Mesa mesa, String nombreMesero, LocalDate fecha, LocalTime hora, double importe, boolean cobrado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public Pedido(Mesa mesa, String nombreMesero, LocalDate fecha, LocalTime hora, double importe, boolean cobrado) {
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

  
   
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
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
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", nombreMesero=" + nombreMesero + ", fecha=" + fecha + ", hora=" + hora + ", importe=" + importe + ", cobrado=" + cobrado + '}';
    }

   
   
    
}
