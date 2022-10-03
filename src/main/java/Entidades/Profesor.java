package Entidades;

public class Profesor {
    private int idProfesor;
    private String nombre;
    private String apellido;
    private String dni;
    private String genero;
    private String email;
    private String telefono;
    private String celular;
    private String direccion;
    private double sueldo;
    private int idSede;
    private String nombreSede;
    private int idCurso;
    private String nombreCurso;

    public Profesor() {
    
    }

    public Profesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Profesor(String nombre, String apellido, String dni, String genero, String email, String telefono,
            String celular, String direccion, double sueldo, int idSede, int idCurso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.sueldo = sueldo;
        this.idSede = idSede;
        this.idCurso = idCurso;
    }

    

    public Profesor(int idProfesor, String nombre, String apellido, String dni, String genero, String email,
            String telefono, String celular, String direccion, double sueldo, int idSede, int idCurso) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.sueldo = sueldo;
        this.idSede = idSede;
        this.idCurso = idCurso;
    }

    public Profesor(String nombre, String apellido, String dni, String genero, String email, String telefono,
            String celular, String direccion, double sueldo, int idSede, String nombreSede, int idCurso,
            String nombreCurso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.sueldo = sueldo;
        this.idSede = idSede;
        this.nombreSede = nombreSede;
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
    }

    public Profesor(int idProfesor, String nombre, String apellido, String dni, String genero, String email,
            String telefono, String celular, String direccion, double sueldo, int idSede, String nombreSede,
            int idCurso, String nombreCurso) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.sueldo = sueldo;
        this.idSede = idSede;
        this.nombreSede = nombreSede;
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    @Override
    public String toString() {
        return "Profesor [idProfesor=" + idProfesor + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
                + ", genero=" + genero + ", email=" + email + ", telefono=" + telefono + ", celular=" + celular
                + ", direccion=" + direccion + ", sueldo=" + sueldo + ", idSede=" + idSede + ", nombreSede="
                + nombreSede + ", idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + "]";
    }
}
