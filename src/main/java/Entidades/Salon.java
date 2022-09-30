package Entidades;

public class Salon {
    private int idSalon;
    private String codigoSalon;
    private int idSede;
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

    public Salon(String codigoSalon, int idSede, String grado, String seccion, int nroMax) {
        this.codigoSalon = codigoSalon;
        this.idSede = idSede;
        this.grado = grado;
        this.seccion = seccion;
        this.nroMax = nroMax;
    }

    public Salon(int idSalon, String codigoSalon, int idSede, String grado, String seccion, int nroMax) {
        this.idSalon = idSalon;
        this.codigoSalon = codigoSalon;
        this.idSede = idSede;
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

    public String getCodigoSalon() {
        return codigoSalon;
    }

    public void setCodigoSalon(String codigoSalon) {
        this.codigoSalon = codigoSalon;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
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
        return "SalonDAO [idSalon=" + idSalon + ", codigoSalon=" + codigoSalon + ", idSede=" + idSede + ", grado="
                + grado + ", seccion=" + seccion + ", nroMax=" + nroMax + "]";
    }
}
