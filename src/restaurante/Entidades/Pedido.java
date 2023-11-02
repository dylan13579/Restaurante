
package restaurante.Entidades;


import java.time.LocalDate;

import java.time.LocalTime;




public class Pedido {
    
    private int idPedido;
    private Mesa idMesa;
    private String nombreMesero;
    private LocalDate fecha;
    private LocalTime hora;
    private double importe;
    private boolean cobrada;

    public Pedido() {
    }

    public Pedido(Mesa idMesa, String nombreMesero, LocalDate fecha, LocalTime hora, double importe, boolean cobrada) {
        this.idMesa = idMesa;
        this.nombreMesero = nombreMesero;
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
        this.cobrada = cobrada;
    }

    public Pedido(int idPedido, Mesa idMesa, String nombreMesero, LocalDate fecha, LocalTime hora, double importe, boolean cobrada) {
        this.idPedido = idPedido;
        this.idMesa = idMesa;
        this.nombreMesero = nombreMesero;
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
        this.cobrada = cobrada;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Mesa idMesa) {
        this.idMesa = idMesa;
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

    public boolean isCobrada() {
        return cobrada;
    }

    public void setCobrada(boolean cobrada) {
        this.cobrada = cobrada;
    }

    @Override
    public String toString() {
        return nombreMesero;
    }

  
}
