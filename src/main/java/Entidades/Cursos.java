package Entidades;

public class Cursos {
    private int idCurso;
    private String nombreCurso;
    private String horasAcademicas;

    public Cursos() {

    }

    public Cursos(int idCurso) {
        this.idCurso = idCurso;
    }

    public Cursos(String nombreCurso, String horasAcademicas) {
        this.nombreCurso = nombreCurso;
        this.horasAcademicas = horasAcademicas;
    }

    public Cursos(int idCurso, String nombreCurso, String horasAcademicas) {
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

    public String getHorasAcademicas() {
        return horasAcademicas;
    }

    public void setHorasAcademicas(String horasAcademicas) {
        this.horasAcademicas = horasAcademicas;
    }
}
