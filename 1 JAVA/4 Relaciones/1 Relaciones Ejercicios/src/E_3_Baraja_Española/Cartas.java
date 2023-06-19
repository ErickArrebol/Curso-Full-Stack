package E_3_Baraja_Española;

/*@author Erick*/
public class Cartas {
    private int numero;
    private String Palo;

    public Cartas(int numero, String Palo) {
        this.numero = numero;
        this.Palo = Palo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return Palo;
    }

    @Override
    public String toString() {
        return "Carta " + numero + " "+ Palo ;
    }
    
    
}
