package E_2_CantanteFamoso;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {
    
    ArrayList <CantanteFamoso> lista = new ArrayList<>(); 
    
    public ArrayList crearCantante(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre del cantante ");
            String nombre = leer.next();
            System.out.print("Disco mas vendido ");
            String disco = leer.next();
            lista.add(new CantanteFamoso(nombre,disco));
        }
        return lista;
        
    }
    
    public ArrayList agregarCantante(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Agregar Cantante");
        System.out.print("Nombre ");
        String nombre = leer.next();
        System.out.print("Disco mas vendido ");
        String disco = leer.next();
        lista.add(new CantanteFamoso(nombre,disco));
        System.out.println("Se agrego correctamente");
        return lista;
    }
    
    public void mostrarTodosLosCantantes(){
        System.out.println("Lista de Cantantes Famosos");
        for (CantanteFamoso aux : lista) {
            System.out.println(aux.toString());
        }
    }
    
    public void eliminarCantante(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el nombre del cantante a eliminar ");
        String nombre = leer.next();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNombre().equalsIgnoreCase(nombre)){
                CantanteFamoso  eliminado = lista.remove(i);
                System.out.println("Se ha elimidado al cantante "+ eliminado.getNombre());
            }
        }
    }
}
