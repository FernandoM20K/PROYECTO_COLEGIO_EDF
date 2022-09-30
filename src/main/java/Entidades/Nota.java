package Entidades;

public class Nota {
    private int idNota;
    private int idEstudiante;
    private int idCurso;
    private int nota1A;
    private int nota2A;
    private int nota3A;
    private int nota4A;
    private int promedioA;
    private int nota1B;
    private int nota2B;
    private int nota3B;
    private int nota4B;
    private int promedioB;
    private int nota1C;
    private int nota2C;
    private int nota3C;
    private int nota4C;
    private int promedioC;
    private int promedioBimestre;

    public Nota() {
    
    }

    public Nota(int idNota) {
        this.idNota = idNota;
    }

    public Nota(int idEstudiante, int idCurso, int nota1a, int nota2a, int nota3a, int nota4a, int promedioA,
            int nota1b, int nota2b, int nota3b, int nota4b, int promedioB, int nota1c, int nota2c, int nota3c,
            int nota4c, int promedioC, int promedioBimestre) {
        this.idEstudiante = idEstudiante;
        this.idCurso = idCurso;
        nota1A = nota1a;
        nota2A = nota2a;
        nota3A = nota3a;
        nota4A = nota4a;
        this.promedioA = promedioA;
        nota1B = nota1b;
        nota2B = nota2b;
        nota3B = nota3b;
        nota4B = nota4b;
        this.promedioB = promedioB;
        nota1C = nota1c;
        nota2C = nota2c;
        nota3C = nota3c;
        nota4C = nota4c;
        this.promedioC = promedioC;
        this.promedioBimestre = promedioBimestre;
    }

    public Nota(int idNota, int idEstudiante, int idCurso, int nota1a, int nota2a, int nota3a, int nota4a,
            int promedioA, int nota1b, int nota2b, int nota3b, int nota4b, int promedioB, int nota1c, int nota2c,
            int nota3c, int nota4c, int promedioC, int promedioBimestre) {
        this.idNota = idNota;
        this.idEstudiante = idEstudiante;
        this.idCurso = idCurso;
        nota1A = nota1a;
        nota2A = nota2a;
        nota3A = nota3a;
        nota4A = nota4a;
        this.promedioA = promedioA;
        nota1B = nota1b;
        nota2B = nota2b;
        nota3B = nota3b;
        nota4B = nota4b;
        this.promedioB = promedioB;
        nota1C = nota1c;
        nota2C = nota2c;
        nota3C = nota3c;
        nota4C = nota4c;
        this.promedioC = promedioC;
        this.promedioBimestre = promedioBimestre;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getNota1A() {
        return nota1A;
    }

    public void setNota1A(int nota1a) {
        nota1A = nota1a;
    }

    public int getNota2A() {
        return nota2A;
    }

    public void setNota2A(int nota2a) {
        nota2A = nota2a;
    }

    public int getNota3A() {
        return nota3A;
    }

    public void setNota3A(int nota3a) {
        nota3A = nota3a;
    }

    public int getNota4A() {
        return nota4A;
    }

    public void setNota4A(int nota4a) {
        nota4A = nota4a;
    }

    public int getPromedioA() {
        return promedioA;
    }

    public void setPromedioA(int promedioA) {
        this.promedioA = promedioA;
    }

    public int getNota1B() {
        return nota1B;
    }

    public void setNota1B(int nota1b) {
        nota1B = nota1b;
    }

    public int getNota2B() {
        return nota2B;
    }

    public void setNota2B(int nota2b) {
        nota2B = nota2b;
    }

    public int getNota3B() {
        return nota3B;
    }

    public void setNota3B(int nota3b) {
        nota3B = nota3b;
    }

    public int getNota4B() {
        return nota4B;
    }

    public void setNota4B(int nota4b) {
        nota4B = nota4b;
    }

    public int getPromedioB() {
        return promedioB;
    }

    public void setPromedioB(int promedioB) {
        this.promedioB = promedioB;
    }

    public int getNota1C() {
        return nota1C;
    }

    public void setNota1C(int nota1c) {
        nota1C = nota1c;
    }

    public int getNota2C() {
        return nota2C;
    }

    public void setNota2C(int nota2c) {
        nota2C = nota2c;
    }

    public int getNota3C() {
        return nota3C;
    }

    public void setNota3C(int nota3c) {
        nota3C = nota3c;
    }

    public int getNota4C() {
        return nota4C;
    }

    public void setNota4C(int nota4c) {
        nota4C = nota4c;
    }

    public int getPromedioC() {
        return promedioC;
    }

    public void setPromedioC(int promedioC) {
        this.promedioC = promedioC;
    }

    public int getPromedioBimestre() {
        return promedioBimestre;
    }

    public void setPromedioBimestre(int promedioBimestre) {
        this.promedioBimestre = promedioBimestre;
    }

    @Override
    public String toString() {
        return "Nota [idNota=" + idNota + ", idEstudiante=" + idEstudiante + ", idCurso=" + idCurso + ", nota1A="
                + nota1A + ", nota2A=" + nota2A + ", nota3A=" + nota3A + ", nota4A=" + nota4A + ", promedioA="
                + promedioA + ", nota1B=" + nota1B + ", nota2B=" + nota2B + ", nota3B=" + nota3B + ", nota4B=" + nota4B
                + ", promedioB=" + promedioB + ", nota1C=" + nota1C + ", nota2C=" + nota2C + ", nota3C=" + nota3C
                + ", nota4C=" + nota4C + ", promedioC=" + promedioC + ", promedioBimestre=" + promedioBimestre + "]";
    }
}
