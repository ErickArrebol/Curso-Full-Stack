package E_3_Compañia_Turistica;

/*@author Erick*/
public class Hotel4Estrellas extends Hotel {

    private String Gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String Gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, String nombre, String direcion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, nombre, direcion, localidad, gerente);
        this.Gimnasio = Gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.precioHabitacion = calcularPrecioHabitacion();
    }
    public String getGimnasio() {
        return Gimnasio;
    }
    public String getNombreRestaurante() {
        return nombreRestaurante;
    }
    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "(4*) " + "Gimnasio [" + Gimnasio + "], nombre del Restaurante[" + nombreRestaurante + "], capacidad de Restaurante [" + capacidadRestaurante + "] cantidad de Habitaciones [" + cantidadHabitaciones + "], numero de Camas [" + numeroCamas + "], cantidad de Pisos [" + cantidadPisos + "] -- PRECIO DE HABITACION $" + precioHabitacion;
    }
    
   
////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double calcularPrecioHabitacion() {
        double valorAgregadoR=0;
        if (Gimnasio.equalsIgnoreCase("B")) {
            valorAgregadoR = 30;
        } else if (Gimnasio.equalsIgnoreCase("A")) {
            valorAgregadoR = 50;
        }
        if (capacidadRestaurante < 30) {
            valorAgregadoR = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valorAgregadoR = 30;
        } else if (capacidadRestaurante > 50) {
            valorAgregadoR = 50;
        }
        return 50+(1*cantidadHabitaciones)+valorAgregadoR;
    }

}
