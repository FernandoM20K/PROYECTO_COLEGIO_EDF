package Entidades;

/**
 *
 * @author FERNANDO
 */
public class Alumnos {
    private int idEstudiante;
    private String nombres;
    private String dni;
    private String genero;
    private String direccionString;
    private String fechaIngreso;
    private String fechaRetiro;
    private int idSalon;

    public Alumnos() {
    
    }

    public Alumnos(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Alumnos(String nombres, String dni, String genero, String direccionString, String fechaIngreso,
            String fechaRetiro, int idSalon) {
        this.nombres = nombres;
        this.dni = dni;
        this.genero = genero;
        this.direccionString = direccionString;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
        this.idSalon = idSalon;
    }

    public Alumnos(int idEstudiante, String nombres, String dni, String genero, String direccionString,
            String fechaIngreso, String fechaRetiro, int idSalon) {
        this.idEstudiante = idEstudiante;
        this.nombres = nombres;
        this.dni = dni;
        this.genero = genero;
        this.direccionString = direccionString;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
        this.idSalon = idSalon;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccionString() {
        return direccionString;
    }

    public void setDireccionString(String direccionString) {
        this.direccionString = direccionString;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public int getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(int idSalon) {
        this.idSalon = idSalon;
    }
}
