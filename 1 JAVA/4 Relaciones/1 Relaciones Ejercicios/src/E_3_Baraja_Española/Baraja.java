package E_3_Baraja_Española;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*@author Erick*/
public class Baraja {

    ArrayList<Cartas> laBaraja = new ArrayList<>();
    ArrayList<Cartas> cartasMonton = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Cartas> llenarBaraja() {
        String[] palo = {"Oro", "Copas", "Espadas", "Bastos"};
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < 12; j++) {
                if (j < 7 || j > 8) {
                    laBaraja.add(new Cartas((j + 1), palo[i]));
                }
            }
        }
        
        return laBaraja;
    }

    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public ArrayList<Cartas> resolverCartas() {
        Collections.shuffle(laBaraja);
        return laBaraja;
    }

    //siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.
    public Cartas siguienteCarta() {
        if (laBaraja.isEmpty()) {
            System.out.println("No hay mas cartas");
        }
        Cartas cartaSiguiente = laBaraja.remove(0);
        cartasMonton.add(cartaSiguiente);
        return cartaSiguiente;
    }

    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {
        System.out.println("Hay " + laBaraja.size() + " cartas");
    }

    //darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    //cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    //debemos indicárselo al usuario.
    public void darCartas() {
        System.out.println("Cuantas cartas quieres repartir: ");
        int numero = leer.nextInt();
        if (numero <= laBaraja.size()) {
            for (int i = 0; i < numero; i++) {
                Cartas cartaSiguiente = laBaraja.remove(0);
                cartasMonton.add(cartaSiguiente);
            }
        } else {
            System.out.println("No hay cartas suficientes");
        }
    }
    //cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    //indicárselo al usuario
    public void cartasMonton(){
        if(cartasMonton.isEmpty()){
            System.out.println("No hay cartas");
        }else{
            for (Cartas aux : cartasMonton) {
            System.out.println(aux);
        }
        }
        
    }
    
    //mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    //luego se llama al método, este no mostrara esa primera carta
    public void mostrarBaraja(){
        for (Cartas aux : laBaraja) {
            System.out.println(aux);
        }
    }
}
