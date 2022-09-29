package Entidades;

public class TutorEstudiante {
    private int idTutor;
    private String nombre;
    private String apellidos;
    private String dni;
    private String genero;
    private String direccion;
    private String telefono;
    private String celular;
    private int idEstudiante;
    public TutorEstudiante() {
    }

    public TutorEstudiante(int idTutor) {
        this.idTutor = idTutor;
    }

    public TutorEstudiante(String nombre, String apellidos, String dni, String genero, String direccion,
            String telefono, String celular, int idEstudiante) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.idEstudiante = idEstudiante;
    }
    
    public TutorEstudiante(int idTutor, String nombre, String apellidos, String dni, String genero, String direccion,
            String telefono, String celular, int idEstudiante) {
        this.idTutor = idTutor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.idEstudiante = idEstudiante;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
}
