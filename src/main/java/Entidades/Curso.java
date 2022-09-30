package Entidades;

public class Curso {
    private int idCurso;
    private String nombreCurso;
    private int horasAcademicas;

    public Curso() {

    }

    public Curso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Curso(String nombreCurso, int horasAcademicas) {
        this.nombreCurso = nombreCurso;
        this.horasAcademicas = horasAcademicas;
    }

    public Curso(int idCurso, String nombreCurso, int horasAcademicas) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.horasAcademicas = horasAcademicas;
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

    public int getHorasAcademicas() {
        return horasAcademicas;
    }

    public void setHorasAcademicas(int horasAcademicas) {
        this.horasAcademicas = horasAcademicas;
    }

    @Override
    public String toString() {
        return "Curso [horasAcademicas=" + horasAcademicas + ", idCurso=" + idCurso + ", nombreCurso=" + nombreCurso
                + "]";
    }
}
