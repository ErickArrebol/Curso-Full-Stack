/*3.- Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
package E_2_Ruleta_De_Agua_Rusa;
import java.util.ArrayList;

/*@author Erick*/
public class Juego {
    private ArrayList<Jugador> listaJugadores;
    private RevolverDeAgua pistola;
    public void llenarJuego(ArrayList<Jugador> listaJugadores, RevolverDeAgua pistola){
        this.listaJugadores = listaJugadores;
        this.pistola = pistola;
    }
    
    public void ronda(){
        pistola.llenarRevolver();
        
        for (Jugador ronda : listaJugadores) {
            System.out.println("Jugador "+ronda);
            if(ronda.disparo(pistola)){
                System.out.println("Se mojo "+ronda);
                
                return;//finaliza el curso de proceso
            }
        }
    }
}
