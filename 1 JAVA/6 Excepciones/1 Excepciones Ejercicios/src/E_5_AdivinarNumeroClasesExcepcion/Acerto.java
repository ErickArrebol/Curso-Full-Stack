package E_5_AdivinarNumeroClasesExcepcion;

public class Acerto extends Exception {

    public Acerto() {
    }

    public Acerto(String msg) {
        super(msg);
    }
}
