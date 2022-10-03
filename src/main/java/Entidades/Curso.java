package Entidades;

public class Curso {
    private int idCurso;
    private String nombre;
    private int horasAcademicas;

    public Curso() {

    }

    public Curso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Curso(String nombre, int horasAcademicas) {
        this.nombre = nombre;
        this.horasAcademicas = horasAcademicas;
    }

    public Curso(int idCurso, String nombre, int horasAcademicas) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.horasAcademicas = horasAcademicas;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasAcademicas() {
        return horasAcademicas;
    }

    public void setHorasAcademicas(int horasAcademicas) {
        this.horasAcademicas = horasAcademicas;
    }

    @Override
    public String toString() {
        return "Curso [horasAcademicas=" + horasAcademicas + ", idCurso=" + idCurso + ", nombre=" + nombre
                + "]";
    }
}
