/*Se crearfan metdos para llenar los atributos de clasa MADRE companiaTurista de las 
clase hijas Hotel y ExtraHotel*/
package E_3_Compañia_Turistica;

/*@author Erick
 */
public class Servicio {

    public String crearNombreHoteles() {
        String nombre[] = {"Paradisus ", "Hilton ",
            "Riu Caribe", "Gran Oasis ",
            "Hard Rock Hotel ", "The Royal Islander"};
        return nombre[(int) (Math.random() * nombre.length)];
    }
    public String crearNombreCamping() {
        String nombre[] = {"Cerro Camp", "AL Campamento",
            "Manto Estrellado", "Zorros & Coyotes",
            "Días Gloriosos", "La Aldea"};
        return nombre[(int) (Math.random() * nombre.length)];          
    }
    public String crearNombreResidencias() {
        String nombre[] = {"San Frnacisco", "La casa de las Lomas",
            "Los angeles azules", "The country",
            "El valle", "Linda vista"};
        return nombre[(int) (Math.random() * nombre.length)]; 
    }
    public String crearDirecionAlojamientos(){
        String nombre[] = {"Cancun", "Acapulco",
            "Puerto Vallarta", "Bsjs Csalifornia",
            "Sinaloa"};
         return nombre[(int) (Math.random() * nombre.length)]; 
    }
    public String crearLocalidadAlojamiento(){
        String nombre[] = {"Playa Norte, Isla Mujeres", "Playa Paraíso",
            "Puerto Escondido", "Puerto Escondido",
            "Loreto", "Mazatlan"};
        return nombre[(int) (Math.random() * nombre.length)]; 
    }
    public String crearNombreGerente(){
        String[] nombres = {
            "Erick", "Pedro", "Juan", "Daisy", "Carolina", "Sofia",
            "Diego", "Jorge", "Sebastian", "Ariel", "Eduardo", "Gilberto",
            "Daniel", "Diana", "Julio", "Adriana", "Alejandro", "Carlos",
            "Gabriela", "Fernando", "Ricardo", "Laura", "Luis", "Maria",
            "Pablo", "Patricia", "Rafael", "Sandra", "Victor", "Yolanda"};
        String nombre = nombres[(int) (Math.random() * nombres.length)];
        String[] apellidos = {
            "Garcia", "Olascuaga", "Flores", "Ribeira", "Lopez", "Ayala",
            "Zaragoza", "Bustos", "Gonzalez", "Perez", "Hernadez", "Smith",
            "Gomez", "Velazquez", "Molina", "Martinez", "Rodriguez", "Torres",
            "Sanchez", "Ramirez", "Castillo", "Ortiz", "Campos", "Vargas",
            "Guerrero", "Navarro", "Rojas", "Morales", "Paredes", "Bravo"};
        String lasName = apellidos[(int) (Math.random() * apellidos.length)];
        String lasName2 = apellidos[(int) (Math.random() * apellidos.length)];
        String gerente = nombre+" "+lasName + " " + lasName2;
        return gerente;
    }
    public int crearCantidadHabitaciones(){
        int num = 10+(int) (Math.random() * 20);
        return num;
    }
    public int crearCantidadCamas(){
        int num = 10+(int) (Math.random() * 20);
        return num;
    }
    public int crearCantidadPisos(){
        int num = 5+(int) (Math.random() * 20);
        return num;
    }
    public String craerGimnasio(){
        String nombreG [] ={"A","B"};
        return nombreG[(int) (Math.random() *nombreG.length )];
    }
    public String crearNombreRestaurantes(){
        String[] nombres = {"El Fogón","Pujol","Quintonil","Rosetta",
                "Sud 777","Máximo Bistrot","Nicos","Biko","Dulce Patria","Contramar"};
        return nombres[(int) (Math.random() * nombres.length)] ;
    }
    public int craerCapacidadRestaunate(){
        return  (10+(int) (Math.random() * 40));
    }
    public int craerCapacidadSalones(){
        return  (2+(int) (Math.random() * 5));
    }
    public int craerCapacidadSuits(){
        return  (5+(int) (Math.random() * 10));
    }
    public int craerCapacidadLimosinas(){
        return  (3+(int) (Math.random() * 10));
    }
    public boolean crearFalsoVerdadero() {
        boolean logica = false;
        int n = (int) (Math.random() * 2);
        if (n == 1) {
            logica = true;
        }
        return logica;
    }
    public int crearMetrosCuadrados() {
        return (40 + (int) (Math.random() * 50));
    }
    public int crearCapacidadMAxima() {
        return (15 + (int) (Math.random() * 40));
    }
    public int crearCantidadBanio() {
        return (5 + (int) (Math.random() * 10));
    }
}
