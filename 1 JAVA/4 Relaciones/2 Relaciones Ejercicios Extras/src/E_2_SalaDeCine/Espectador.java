package E_2_SalaDeCine;

/*@author Erick*/
public class Espectador {
    private String cliente;
    private int edad;
   
    private String asiento;
     private double dinero;
    public Espectador() {
    }

    public Espectador(String cliente, int edad, String asiento, double dinero) {
        this.cliente = cliente;
        this.edad = edad;
        this.asiento = asiento;
        this.dinero = dinero;
    }

    public String getCliente() {
        return cliente;
    }

    public int getEdad() {
        return edad;
    }

    public String getAsiento() {
        return asiento;
    }

    public double getDinero() {
        return dinero;
    }

    @Override
    public String toString() {
        return  cliente + ", Asiento " + asiento;
    }

    

    
    
    public String creaNombreCliente(){
        String[] nombres = {
            "Erick", "Pedro", "Juan", "Daisy", "Carolina", "Sofia",
            "Diego", "Jorge", "Sebastian", "Ariel", "Eduardo", "Gilberto",
            "Daniel", "Diana", "Julio", "Adriana", "Alejandro", "Carlos",
            "Gabriela", "Fernando", "Ricardo", "Laura", "Luis", "Maria",
            "Pablo", "Patricia", "Rafael", "Sandra", "Victor", "Yolanda"};
        String name = nombres[(int) (Math.random() * nombres.length)];
        String[] apellidos = {
            "Garcia", "Olascuaga", "Flores", "Ribeira", "Lopez", "Ayala",
            "Zaragoza", "Bustos", "Gonzalez", "Perez", "Hernadez", "Smith",
            "Gomez", "Velazquez", "Molina", "Martinez", "Rodriguez", "Torres",
            "Sanchez", "Ramirez", "Castillo", "Ortiz", "Campos", "Vargas",
            "Guerrero", "Navarro", "Rojas", "Morales", "Paredes", "Bravo"};
        String lasName = apellidos[(int) (Math.random() * apellidos.length)];
        String lasName2 = apellidos[(int) (Math.random() * apellidos.length)];
      
        String cliente = name+" "+lasName+" "+lasName2;
        return cliente;
    }
    
    public int crearEdadCliente(){
        int edad = (int) (Math.random() * 70);
        return edad;
    }
    
    public double crearDineroCliente(){
        double dinero = (int) (Math.random() * 100);
        return dinero;
    }
}
