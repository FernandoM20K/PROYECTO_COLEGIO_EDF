package Entidades;

/**
 *
 * @author FERNANDO
 */
public class Estudiante {
    private int idEstudiante;
    private String nombres;
    private String apellidos;
    private String dni;
    private String genero;
    private String direccion;
    private String fechaIngreso;
    private String fechaRetiro;
    private int idSalon;

    public Estudiante() {
    
    }

    public Estudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Estudiante(String nombres, String apellidos, String dni, String genero, String direccion,
            String fechaIngreso, String fechaRetiro, int idSalon) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.genero = genero;
        this.direccion = direccion;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
        this.idSalon = idSalon;
    }

    public Estudiante(int idEstudiante, String nombres, String apellidos, String dni, String genero, String direccion,
            String fechaIngreso, String fechaRetiro, int idSalon) {
        this.idEstudiante = idEstudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.genero = genero;
        this.direccion = direccion;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    @Override
    public String toString() {
        return "Estudiante [idEstudiante=" + idEstudiante + ", nombres=" + nombres + ", apellidos=" + apellidos
                + ", dni=" + dni + ", genero=" + genero + ", direccion=" + direccion + ", fechaIngreso=" + fechaIngreso
                + ", fechaRetiro=" + fechaRetiro + ", idSalon=" + idSalon + "]";
    }
}
