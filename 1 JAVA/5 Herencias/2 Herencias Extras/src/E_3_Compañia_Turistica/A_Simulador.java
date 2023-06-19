/*Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un 
nombre, 
dirección,
localidad 
gerente encargado del lugar. 
La compañía trabaja con dos tipos de alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• subclase Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• sublclase Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

subclase En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.*/
package E_3_Compañia_Turistica;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*@author Erick*/
public class A_Simulador {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ListasDeAlojamiento iniciar = new ListasDeAlojamiento();
        iniciar.crearListas();
        Hotel[] hoteles = iniciar.getHoteles();
        Camping[] campings = iniciar.getCampings();
        Residencia[] residencias = iniciar.getResidencias();
        int opcion;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1.- Todos los alojamientos");
            System.out.println("2.- Hoteles de más caro a más barato");
            System.out.println("3.- Camping con restaurante");
            System.out.println("4.- Residencias que tienen descuento");
            System.out.println("5.- Salir");
            System.out.print("Elige una opcion ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nH O T E L E S");
                    for (Hotel aux : hoteles) {
                        System.out.println(aux.toString());
                    }
                    System.out.println("C A M P I N G");
                    for (Camping aux : campings) {
                        System.out.println(aux.toString());
                    }
                    System.out.println("R E S I D E N C I A S");
                    for (Residencia aux : residencias) {
                        System.out.println(aux.toString());
                    }
                    break;
                case 2:
                    System.out.println("H O T E L E S       del mas Caro al mas Barato");
                    Arrays.sort(hoteles, Comparator.comparingDouble(Hotel::getPrecioHabitacion).reversed());
                    for (Hotel aux : hoteles) {
                        System.out.println(aux.toString());
                    }
                    break;
                case 3:
                    int conteoC = 0;
                    for (Camping aux : campings) {
                        if (aux.isTieneRestaurante()) {
                            if (conteoC == 0) {
                                System.out.println("C A M P I N G S       con restaurantes");
                                conteoC++;
                            }
                            System.out.println(aux.toString());
                        }
                    }
                    if(conteoC==0){
                        System.out.println("No hay Camping con Restaurantes"); 
                    }
                    break;
                case 4:
                    int conteoR = 0;
                    for (Residencia aux : residencias) {
                        if (aux.isDescuentoGremios()) {
                            if (conteoR == 0) {
                                System.out.println("R E S I D E N C I A S       que tienen descuento");
                                conteoR++;
                            }
                            System.out.println(aux.toString());
                        }
                    }
                    if(conteoR==0){
                        System.out.println("No hay Residencias con descuento"); 
                    }
                    break;
                case 5:
                    System.out.println("----- F I N   D E L   P R O G R A M A -----");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("");
            segundo();
        } while (opcion != 5);
        //alojamientos.stream().filter(alojamiento -> (alojamiento instanceof Hotel)).map(alojamiento -> ((Hotel) alojamiento)).peek(Hotel::precioHabitacion).sorted(Comparadores.ordenarPorPrecioDescendente.reversed()).forEach(System.out::println);
        //Collections.sort(alojamientos, (h1, h2) -> (Hotel) h1.getprecio().comparesTo(h2.getPrecio()))
    }
    private static void segundo() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
        }
    }
}
