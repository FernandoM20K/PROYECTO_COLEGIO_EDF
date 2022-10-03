package Entidades;

public class Salon {
    private int idSalon;
    private int idSede;
    private String nombreSede;
    private String grado;
    private String seccion;
    private int nroMax;

    public Salon() {
    
    }

    public Salon(int idSalon) {
        this.idSalon = idSalon;
    }

    public Salon(int idSede, String grado, String seccion, int nroMax) {
        this.idSede = idSede;
        this.grado = grado;
        this.seccion = seccion;
        this.nroMax = nroMax;
    }

    public Salon(int idSalon, int idSede, String nombreSede, String grado, String seccion, int nroMax) {
        this.idSalon = idSalon;
        this.idSede = idSede;
        this.nombreSede = nombreSede;
        this.grado = grado;
        this.seccion = seccion;
        this.nroMax = nroMax;
    }

    public int getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(int idSalon) {
        this.idSalon = idSalon;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getNroMax() {
        return nroMax;
    }

    public void setNroMax(int nroMax) {
        this.nroMax = nroMax;
    }

    @Override
    public String toString() {
        return "Salon [idSalon=" + idSalon + ", idSede=" + idSede + ", nombreSede=" + nombreSede + ", grado=" + grado
                + ", seccion=" + seccion + ", nroMax=" + nroMax + "]";
    }
}
