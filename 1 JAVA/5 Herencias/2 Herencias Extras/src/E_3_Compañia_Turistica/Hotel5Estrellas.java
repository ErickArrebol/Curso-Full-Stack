package E_3_Compañia_Turistica;

/* @author Erick*/
public class Hotel5Estrellas extends Hotel {

    private String Gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private int cantidadSalonesConferencia;
    private int cantidadSuit;
    private int cantidadLimonisas;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Hotel5Estrellas() {
    }
    public Hotel5Estrellas(String Gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadSalonesConferencia, int cantidadSuit, int cantidadLimonisas, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, String nombre, String direcion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, nombre, direcion, localidad, gerente);
        this.Gimnasio = Gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuit = cantidadSuit;
        this.cantidadLimonisas = cantidadLimonisas;
        this.precioHabitacion = calcularPrecioHabitacion();
    }
    public String getGimnasio() {
        return Gimnasio;
    }
    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }
    public int getCantidadLimonisas() {
        return cantidadLimonisas;
    }
    @Override
    public String toString() {
        return "(5*) " + "Gimnasio [" + Gimnasio + "], nombres del Restaurante [" + nombreRestaurante + "], capacidad del Restaurante [" + capacidadRestaurante + "], cantidad Salones de Conferencia [" + cantidadSalonesConferencia + "], cantidad Suits [" + cantidadSuit + "], cantidad de Limonisas [" + cantidadLimonisas + "] cantidad de Habitaciones [" + cantidadHabitaciones + "], numero de Camas [" + numeroCamas + "], cantidad de Pisos [" + cantidadPisos + "] -- PRECIO DE HABITACION $"  + precioHabitacion;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double calcularPrecioHabitacion() {
        double valorAgregadoG=0;
        if (getGimnasio().equalsIgnoreCase("B")) {
            valorAgregadoG += 30;
        } else if (getGimnasio().equalsIgnoreCase("A")) {
            valorAgregadoG += 50;
        }
        double valorAgregadoR=0;
        if (getCapacidadRestaurante() < 30) {
            valorAgregadoR += 10;
        } else if (getCapacidadRestaurante() >= 30 && getCapacidadRestaurante() <= 50) {
            valorAgregadoR += 30;
        } else if (getCapacidadRestaurante() > 50) {
            valorAgregadoR += 50;
        }
        double valorAgregadoL = (15 * getCantidadLimonisas());
        return 50+(1*getCantidadHabitaciones())+valorAgregadoR+valorAgregadoG+valorAgregadoL;
    }
}
