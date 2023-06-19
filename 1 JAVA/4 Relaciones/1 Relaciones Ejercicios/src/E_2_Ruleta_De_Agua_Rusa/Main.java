/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:*/
package E_2_Ruleta_De_Agua_Rusa;
import java.util.ArrayList;

/* @author Erick*/
public class Main {

    public static void main(String[] args) {

        RevolverDeAgua a = new RevolverDeAgua();
        a.cantidadDeJugadores();
        ArrayList<Jugador> Jugadores = new ArrayList<>();
        String [] nombres={"Erick","Juan","Daniel","Gil","Pedro","Diana","Lilia"};
        for (int i = 1; i <= a.getNumeroJugadores(); i++) {
            Jugadores.add(new Jugador(nombres[i], i));
        }
        
        RevolverDeAgua pistolas = new RevolverDeAgua();
        Juego play = new Juego();
        play.llenarJuego(Jugadores, pistolas);
 
        play.ronda();
    }
}
