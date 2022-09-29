package Entidades;

public class Sede {
    private int idSede;
    private String direccion;
    private String telefono;

    public Sede() {

    }

    public Sede(int idSede) {
        this.idSede = idSede;
    }

    public Sede(int idSede, String direccion, String telefono) {
        this.idSede = idSede;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Sedes [direccion=" + direccion + ", idSede=" + idSede + ", telefono=" + telefono + "]";
    } 
}
