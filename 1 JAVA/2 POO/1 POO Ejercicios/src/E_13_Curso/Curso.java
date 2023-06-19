package E_13_Curso;

public class Curso {
    
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private boolean turno; //True, mañana. False, tarde.
    private double precioPorHora;
    private String [] alumnos;

    public Curso() {
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }
    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }
    public boolean isTurno() {
        return turno;
    }
    public double getPrecioPorHora() {
        return precioPorHora;
    }
    public String[] getAlumnos() {
        return alumnos;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }
    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }
    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
}
