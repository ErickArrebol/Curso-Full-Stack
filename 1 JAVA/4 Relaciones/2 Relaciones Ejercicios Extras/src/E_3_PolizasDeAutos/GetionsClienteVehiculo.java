package E_3_PolizasDeAutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* @author Erick
 */
public class GetionsClienteVehiculo {

    Scanner leer = new Scanner(System.in);
    private List<Clientes> cliente = new ArrayList<>();
    private List<Vehiculo> vehiculo = new ArrayList<>();

    public GetionsClienteVehiculo() {
    }

    public GetionsClienteVehiculo(List<Clientes> cliente, List<Vehiculo> vehiculo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public List<Clientes> getCliente() {
        return cliente;
    }

    public List<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "GetionsClienteVehiculo{" + "leer=" + leer + ", cliente=" + cliente + ", vehiculo=" + vehiculo + '}';
    }
    

    public String creanombres() {
        String[] nombres = {
            "Erick", "Pedro", "Juan", "Daisy", "Carolina", "Sofia",
            "Diego", "Jorge", "Sebastian", "Ariel", "Eduardo", "Gilberto",
            "Daniel", "Diana", "Julio", "Adriana", "Alejandro", "Carlos",
            "Gabriela", "Fernando", "Ricardo", "Laura", "Luis", "Maria",
            "Pablo", "Patricia", "Rafael", "Sandra", "Victor", "Yolanda"};
        String name = nombres[(int) (Math.random() * nombres.length)];

        return name;
    }

    public String crearApellidos() {
        String[] apellidos = {
            "Garcia", "Olascuaga", "Flores", "Ribeira", "Lopez", "Ayala",
            "Zaragoza", "Bustos", "Gonzalez", "Perez", "Hernadez", "Smith",
            "Gomez", "Velazquez", "Molina", "Martinez", "Rodriguez", "Torres",
            "Sanchez", "Ramirez", "Castillo", "Ortiz", "Campos", "Vargas",
            "Guerrero", "Navarro", "Rojas", "Morales", "Paredes", "Bravo"};
        String lasName = apellidos[(int) (Math.random() * apellidos.length)];
        String lasName2 = apellidos[(int) (Math.random() * apellidos.length)];
        String apellido = lasName + " " + lasName2;
        return apellido;
    }

    public String documentos() {
        String[] documento = {"AE50199", "AB40220", "FG30294", "TG40954", "ER64821", "MA31234", "DT74312",
            "AE50199", "AB40220", "FG30294", "TG40954", "ER64821", "MA31234", "DT74312",
            "PR50986", "LQ20562", "VC40875", "NK74251", "BX15268", "ZY30247", "JP40629"};
        return documento[(int) (Math.random() * documento.length)];

    }

    public int craerTelefono() {
        int telefono = 0;
        boolean validar = false;
        do {
            telefono =5570012 +(int) (Math.random() * 1000000000) ;
            String numeroAletra = Integer.toString(telefono);
            if (numeroAletra.length() == 10) {
                validar = true;
            }
        } while (validar != true);
        return telefono;
    }

    public String crearMail() {
        String nombreEmail = creanombres();
        int numero = (int) (Math.random() * 10000);
        String mail = nombreEmail.substring(0) + numero + "@gmail.com";
        return mail;
    }

    public String creadomicilio() {
        int numeroCalle = (int) (Math.random() * 200);
        String[] nombreCalle = {"Lago Alberto", "Lago Xochimilco", "Lago sur", "Corona", "Lago Muritz", "Bahia", "Los Santos", "Renan",
            "victoria", "Ayuntamiento", "Luis Moya", "Calle Lerdo", "Boulevard Adolfo López Mateos", "Avenida Cuauhtémoc", "Calle Madero",
            "Boulevard Benito Juárez", "Avenida Zaragoza", "Calle Victoria", "Avenida Morelos", "Boulevard Manuel Ávila Camacho",
            "Calle Allende", "Avenida Xicoténcatl", "Calle Miguel Hidalgo", "Boulevard Emiliano Zapata", "Avenida López Portillo", "Calle Colón",
            "Avenida 20 de Noviembre", "Boulevard Francisco Villa", "Calle González Ortega", "Calle Héroes"};
        int posicion = (int) (Math.random() * nombreCalle.length);
        String docimilio = "C. " + nombreCalle[posicion] + " N. " + numeroCalle + ", CDMX";
        return docimilio;
    }

    //Clientes(String nombre, String apellido, String documento, String mail, String domicilio, int teléfono) {
    public void Persona() {
        
            String nombre = creanombres();
            String apellido = crearApellidos();
            String documento = documentos();
            String email = crearMail();
            String domicilio = creadomicilio();
            int telefono = craerTelefono();
            cliente.add(new Clientes(nombre, apellido, documento, email, domicilio, telefono));
        

    }

    //Vehiculo(*String marcaYmodelo, *int anio, *int númeroDeMotor, *String chasis,+ *String color, String tipo) {
    public void Vehiculo() {
        
            String marcaYmodelo = marcaYmodelo();
            int anio = crearAño();
            int númeroDeMotor = creaNumeroDeMotor();
            String chasis = crearChasis();
            String color = crearColores();
            String tipo = tipo();
            vehiculo.add(new Vehiculo(marcaYmodelo, anio, númeroDeMotor, chasis, color, tipo));
       

    }

    public String crearColores() {
        String[] colores = {"Blanco", "Negro", "Azul", "Verde", "Rojo", "Amarillo", "Rosa",
            "Cafe", "Gris", "Naranja", "Morado", "Gris Osculo", "Azul cielo"};
        int posicion = (int) (Math.random() * colores.length);
        return colores[posicion];
    }

    public String crearChasis() {
        String n = "";
        int opcion = (int) (Math.random() * 2) + 1;

        if (opcion == 1) {
            n = "Si";
        } else {
            n = "No";
        }
        return n;
    }

    public int creaNumeroDeMotor() {
        int numero,n=55100000;
        String numALetra = "";
        do {
            numero = +(int) (Math.random() * 1000) ;
            numALetra = Integer.toString(numero);
        } while (numALetra.length() != 3);
        numero= n+numero;
        return numero;
    }

    public int crearAño() {
        int carroAnio = 2010 + (int) (Math.random() * 14);
        return carroAnio;
    }

    public String marcaYmodelo() {
        String[] marcaYModelo = {"Toyota Camry", "Honda Civic", "Ford Mustang", "Chrevrolet Silverado",
            "BMW Serie 3", "Mercedez-Benz", "Volkswagen Golf", "Audio A4","Nissan Altima", 
            "Hyundai Elantra","Tesla Model S","Subaru Impreza","Lexus RX", "Mazda CX-5",
            "Jeep Wrangler","Kia Sportage","GMC Sierra","Volvo XC90","Land Rover Range Rover",
            "Jaguar F-Pace","Porsche 911","Ferrari 488 GTB","Lamborghini Huracán","Maserati GranTurismo",
            "Bugatti Chiron","McLaren 720S","Rolls-Royce Phantom","Bentley Continental GT",
            "Aston Martin DB11","Lotus Evora"};
        int posicion = (int) (Math.random() * marcaYModelo.length);
        return marcaYModelo[posicion];
    }

    public String tipo() {
        String[] tipo = {"SUV", "Hatchback", "Crossover", "Convertible", "Sedan", "Sports", "Coupe", "Minivan"};
        int posicion = (int) (Math.random() * tipo.length);
        return tipo[posicion];
    }
}
