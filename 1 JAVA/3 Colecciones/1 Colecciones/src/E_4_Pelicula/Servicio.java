package E_4_Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Servicio {
    
    private List<Pelicula> peliculas = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarPelicula() {
        String titulo,director,opcion="";
        double duracion;
        do {
            System.out.print("Ingrese el título de la película: ");
            titulo= leer.next();
            System.out.print("Ingrese el director de la película: ");
            director = leer.next();
            System.out.print("Ingrese la duración de la película (en horas):");
            duracion = leer.nextDouble();
            Pelicula cartelera = new Pelicula(titulo, director, duracion); //<---->Lista cartelera ()
            peliculas.add(cartelera);
            
                System.out.println("Si deseas agregar otra pelicula si(s) o No(n)");
                opcion = leer.next();
                switch (toUpperCase(opcion)) {
                    case "S":
                    case "N":
                    default:
                }
        } while (!opcion.equalsIgnoreCase("n"));
        
        int menu;
        do {
            System.out.println("-----MENU DE CARTELERA-----"
                    + "\n" + "(1) Peliculas"
                    + "\n" + "(2) Peliculas Mayores a 1 hora"
                    + "\n" + "(3) Peliculas duración (de mayor a menor)"
                    + "\n" + "(4) Peliculas duración (de menor a mayor)"
                    + "\n" + "(5) Peliculas ordenadas por titulos"
                    + "\n" + "(6) Peliculas ordenadas por director"
                    + "\n" + "(7) Salir");
            System.out.print("Elige una opcion ");
            menu =  leer.nextInt();
            switch (menu) {
                case 1:
                    mostrarPeliculas();
                    segundo();
                    break;
                case 2:
                    mostrasPeliculasMayorA1Hora();
                    segundo();
                    break;
                case 3:
                    peliDuracionOrdenadasMayor();
                    segundo();
                    break;
                case 4:
                    peliDuracionOrdenadasMenor();
                    segundo();
                    break;
                case 5:
                    titulosAlfabeticamente();
                    segundo();
                    break;
                case 6:
                    directoresAlfabeticamente();
                    segundo();
                    break;
                case 7:
                    System.out.println("Cerra cartelera");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        } while (menu != 7);
    }

    public void mostrarPeliculas() {
        System.out.println("------CARTELERA-----");
        System.out.println("Todas las películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion() + " horas");
        }
    }
    public void mostrasPeliculasMayorA1Hora(){
        System.out.println("Peliculas con duracion mayor a 1 hora");
        for (Pelicula movie : peliculas) {
            if(movie.getDuracion()>1){
                System.out.println(movie.getTitulo()+"-"+movie.getDirector()+"-"+movie.getDuracion());
            }
        }
    }
    public void peliDuracionOrdenadasMayor(){
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            public int compare(Pelicula p1, Pelicula p2) {
                if (p1.getDuracion()< p2.getDuracion()){
                    return 1;
                }else if (p1.getDuracion()>p2.getDuracion()){
                    return -1;
                }else{
                  return 0;  
                }  
            }   
        });
        System.out.println("Peliculas Ordenadas por duracion de MAYOR a MENOR");
        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo()+" - "+peli.getDirector()+" - "+ peli.getDuracion());
        }
    }
    public void peliDuracionOrdenadasMenor(){
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            public int compare(Pelicula p1, Pelicula p2) {
                if (p1.getDuracion()> p2.getDuracion()){
                    return 1;
                }else if (p1.getDuracion() < p2.getDuracion()){
                    return -1;
                }else{
                  return 0;  
                }  
            }   
        });
        System.out.println("Peliculas Ordenadas por duracion de MENOR a MAYOR ");
        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo()+" - "+peli.getDirector()+" - "+ peli.getDuracion());
        }
    }
    //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void titulosAlfabeticamente(){
        
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p_a, Pelicula p_z) {
 
                return p_a.getTitulo().compareTo(p_z.getTitulo());
            }
        });
        System.out.println("Peliculas ordenadas por titulos, alfabéticamente");
        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo()+" - "+peli.getDirector()+" - "+ peli.getDuracion());
        }
    }
    public void directoresAlfabeticamente(){
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p_a, Pelicula p_z) {
 
                return p_a.getDirector().compareTo(p_z.getDirector());
            }
        });
        System.out.println("Peliculas ordenadas por director, alfabéticamente");
        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo()+" - "+peli.getDirector()+" - "+ peli.getDuracion());
        }
    }
    private static void segundo(){
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){}        
    }
}


