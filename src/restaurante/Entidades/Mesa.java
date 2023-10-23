
package restaurante.Entidades;


public class Mesa {
    
    private int idMesa;
    private int numeroMesa;
    private String descripcion;
    private boolean estado;

    public Mesa() {
    }

    public Mesa(int idMesa, int numeroMesa, String descripcion, boolean estado) {
        this.idMesa = idMesa;
        this.numeroMesa = numeroMesa;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Mesa(int numeroMesa, String descripcion, boolean estado) {
        this.numeroMesa = numeroMesa;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return numeroMesa+ ", " +descripcion;
    }
    
    
            
}
