package Entidades;

public class Mensaje {
    private int idMensaje;
    private int idProfesor;
    private String nombresProfesor;
    private String apellidosProfesor;
    private int idApoderado;
    private String nombresApoderado;
    private String apellidoApoderado;
    private String mensaje;
    private String archivo;
    
    public Mensaje() {
    
    }

    public Mensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public Mensaje(int idProfesor, String nombresProfesor, String apellidosProfesor, int idApoderado,
            String nombresApoderado, String apellidoApoderado, String mensaje, String archivo) {
        this.idProfesor = idProfesor;
        this.nombresProfesor = nombresProfesor;
        this.apellidosProfesor = apellidosProfesor;
        this.idApoderado = idApoderado;
        this.nombresApoderado = nombresApoderado;
        this.apellidoApoderado = apellidoApoderado;
        this.mensaje = mensaje;
        this.archivo = archivo;
    }

    public Mensaje(int idMensaje, int idProfesor, String nombresProfesor, String apellidosProfesor, int idApoderado,
            String nombresApoderado, String apellidoApoderado, String mensaje, String archivo) {
        this.idMensaje = idMensaje;
        this.idProfesor = idProfesor;
        this.nombresProfesor = nombresProfesor;
        this.apellidosProfesor = apellidosProfesor;
        this.idApoderado = idApoderado;
        this.nombresApoderado = nombresApoderado;
        this.apellidoApoderado = apellidoApoderado;
        this.mensaje = mensaje;
        this.archivo = archivo;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombresProfesor() {
        return nombresProfesor;
    }

    public void setNombresProfesor(String nombresProfesor) {
        this.nombresProfesor = nombresProfesor;
    }

    public String getApellidosProfesor() {
        return apellidosProfesor;
    }

    public void setApellidosProfesor(String apellidosProfesor) {
        this.apellidosProfesor = apellidosProfesor;
    }

    public int getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(int idApoderado) {
        this.idApoderado = idApoderado;
    }

    public String getNombresApoderado() {
        return nombresApoderado;
    }

    public void setNombresApoderado(String nombresApoderado) {
        this.nombresApoderado = nombresApoderado;
    }

    public String getApellidoApoderado() {
        return apellidoApoderado;
    }

    public void setApellidoApoderado(String apellidoApoderado) {
        this.apellidoApoderado = apellidoApoderado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Mensaje [idMensaje=" + idMensaje + ", idProfesor=" + idProfesor + ", nombresProfesor=" + nombresProfesor
                + ", apellidosProfesor=" + apellidosProfesor + ", idApoderado=" + idApoderado + ", nombresApoderado="
                + nombresApoderado + ", apellidoApoderado=" + apellidoApoderado + ", mensaje=" + mensaje + ", archivo="
                + archivo + "]";
    }
}
