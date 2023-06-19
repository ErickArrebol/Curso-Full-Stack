package E_4_SistemaDeVotacion;
import java.util.List;

public class Voto {
    private Alumno votante;
    private List<Alumno> listaDeVotacion;

    public Voto(Alumno votante, List<Alumno> listaDeVotacion) {
        this.votante = votante;
        this.listaDeVotacion = listaDeVotacion;
    }

    public Alumno getVotante() {
        return votante;
    }
    public List<Alumno> getListaQueVoto() {
        return listaDeVotacion;
    }
    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public void setListaQueVoto(List<Alumno> listaDeVotacion) {
        this.listaDeVotacion = listaDeVotacion;
    }

    @Override
    public String toString() {
        return votante + "" + listaDeVotacion  ;
    } 
    
}
