package Entidades;

public class Apoderado {
    private int idApoderado;
    private String nombre;
    private String apellidos;
    private String dni;
    private String genero;
    private String email;
    private String telefono;
    private String celular;
    private String direccion;
    private int idEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    public Apoderado() {
    }

    public Apoderado(int idApoderado) {
        this.idApoderado = idApoderado;
    }

    public Apoderado(String nombre, String apellidos, String dni, String genero, String direccion, String telefono,
            String celular, int idEstudiante) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.idEstudiante = idEstudiante;
    }

    public Apoderado(String nombre, String apellidos, String dni, String genero, String email, String telefono,
            String celular, String direccion, int idEstudiante, String nombreEstudiante, String apellidoEstudiante) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public Apoderado(int idApoderado, String nombre, String apellidos, String dni, String genero, String email,
            String telefono, String celular, String direccion, int idEstudiante, String nombreEstudiante,
            String apellidoEstudiante) {
        this.idApoderado = idApoderado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public int getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(int idApoderado) {
        this.idApoderado = idApoderado;
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

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    @Override
    public String toString() {
        return "Apoderado [idApoderado=" + idApoderado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni="
                + dni + ", genero=" + genero + ", email=" + email + ", telefono=" + telefono + ", celular=" + celular
                + ", direccion=" + direccion + ", idEstudiante=" + idEstudiante + ", nombreEstudiante="
                + nombreEstudiante + ", apellidoEstudiante=" + apellidoEstudiante + "]";
    }
}
