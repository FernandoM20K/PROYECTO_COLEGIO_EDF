package Entidades;

public class Salon {
    private int idSalon;
    private int id_Sede;
    private String grado;
    private String seccion;
    private int nroMaxEstudiantes;

    public Salon() {
    
    }

    public Salon(int idSalon) {
        this.idSalon = idSalon;
    }

    public Salon(int id_Sede, String grado, String seccion, int nroMaxEstudiantes) {
        this.id_Sede = id_Sede;
        this.grado = grado;
        this.seccion = seccion;
        this.nroMaxEstudiantes = nroMaxEstudiantes;
    }

    public Salon(int idSalon, int id_Sede, String grado, String seccion, int nroMaxEstudiantes) {
        this.idSalon = idSalon;
        this.id_Sede = id_Sede;
        this.grado = grado;
        this.seccion = seccion;
        this.nroMaxEstudiantes = nroMaxEstudiantes;
    }

    public int getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(int idSalon) {
        this.idSalon = idSalon;
    }

    public int getId_Sede() {
        return id_Sede;
    }

    public void setId_Sede(int id_Sede) {
        this.id_Sede = id_Sede;
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

    public int getNroMaxEstudiantes() {
        return nroMaxEstudiantes;
    }

    public void setNroMaxEstudiantes(int nroMaxEstudiantes) {
        this.nroMaxEstudiantes = nroMaxEstudiantes;
    }

    @Override
    public String toString() {
        return "Salon [idSalon=" + idSalon + ", id_Sede=" + id_Sede + ", grado=" + grado + ", seccion=" + seccion
                + ", nroMaxEstudiantes=" + nroMaxEstudiantes + "]";
    }
}
