/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.*/
package E_3_Baraja_Española;
import java.util.Scanner;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Baraja a = new Baraja();
        int opcion;
        a.llenarBaraja();
        do {
            System.out.println("------- MENU --------");
            System.out.println("1.- Barajar");
            System.out.println("2.- Siguiente Carta");
            System.out.println("3.- Cartas Disponibles");
            System.out.println("4.- Dar Cartas");
            System.out.println("5.- Mostra Monton");
            System.out.println("6.- Mostrar Baraja");
            System.out.println("7.- Salir");
            System.out.print("Elige una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:a.resolverCartas();
                    break;
                case 2:a.siguienteCarta();
                    break;
                case 3:a.cartasDisponibles();
                    break;
                case 4:a.darCartas();
                    break;
                case 5:a.cartasMonton();
                    break;
                case 6:a.mostrarBaraja();
                    break;
                case 7:System.out.println("Fin de juego");
                    break;
                default: System.out.println("Opcion Invalida");                   
                    break;
            }            
        } while (opcion !=7);
        
    }
    
}
