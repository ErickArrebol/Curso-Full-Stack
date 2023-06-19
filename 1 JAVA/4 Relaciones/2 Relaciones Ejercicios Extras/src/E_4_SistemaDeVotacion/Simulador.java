package E_4_SistemaDeVotacion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Simulador {

    private ArrayList<Alumno> listaDeAlumnos = new ArrayList<>();
    private List<Voto> listaDeVotacion = new ArrayList<>();
    private ArrayList<String> listaDeNombre = new ArrayList<>();
    private ArrayList<String> listaDNI = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Simulador() {

    }

    public ArrayList<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }

    public List<Voto> getListaDeVotacion() {
        return listaDeVotacion;
    }

    public ArrayList<String> getListaDeNombre() {
        return listaDeNombre;
    }

    public ArrayList<String> getListaDNI() {
        return listaDNI;
    }

    public Scanner getLeer() {
        return leer;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public ArrayList<String> listaAleatoriaNombre() {
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
        String apellido = apellidos[(int) (Math.random() * apellidos.length)];
        String apellido2 = apellidos[(int) (Math.random() * apellidos.length)];
        listaDeNombre.add(nombre + " " + apellido + " " + apellido2);
        return listaDeNombre;
    }

    public ArrayList<String> listaAleatoriaDNI() {
        int numero;
        String numeroConvertidoLetra = "";
        do {
            numero = (int) (Math.random() * 100000000);
            numeroConvertidoLetra = Integer.toString(numero);
        } while (numeroConvertidoLetra.length() != 8);
        listaDNI.add(numeroConvertidoLetra);
        return listaDNI;
    }
    public ArrayList<Alumno> creacionDeAlumnos() {
        System.out.print("Cuantos alumnos deseas crear: ");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            listaAleatoriaNombre();
            listaAleatoriaDNI();
        }
        for (int i = 0; i < num; i++) {

            String nombreCompleto = listaDeNombre.get(i);
            String DNI = listaDNI.get(i);
            listaDeAlumnos.add(new Alumno(nombreCompleto, DNI));
        }
        return listaDeAlumnos;
    }
    public void imprimirAlumnos() {
        System.out.println("_____ Alumnos");
        for (Alumno aux : listaDeAlumnos) {
            System.out.println(aux.getNombre() + " - DNI: " + aux.getDNI());
        }
    }
    public List<Voto> votacion() {
        for (Alumno votante : listaDeAlumnos) {
            List<Alumno> alumnoVotados = new ArrayList<>();
            while (alumnoVotados.size() < 3) {                                            
                int posicionAleatoria = (int) (Math.random() * listaDeAlumnos.size());                                       
                Alumno aquienVota = listaDeAlumnos.get(posicionAleatoria);  
                if (!alumnoVotados.contains(aquienVota) && !aquienVota.equals(votante)) {
                    alumnoVotados.add(aquienVota);
                    aquienVota.setCantidadVotos(aquienVota.getCantidadVotos() + 1);
                }
            }
            listaDeVotacion.add(new Voto(votante, alumnoVotados));
        }
        return listaDeVotacion;
    }
    public void imprimirVotaciones() {
        System.out.println("");
        System.out.println("_____ Lista de Votaciones");
        for (int i = 0; i < listaDeVotacion.size(); i++) {
            String nombreAlumno = listaDeVotacion.get(i).getVotante().getNombre();
            System.out.print(toUpperCase(nombreAlumno) );
            System.out.print(" Voto Por (" + listaDeVotacion.get(i).getListaQueVoto().get(0).getNombre() + ") (");
            System.out.print(listaDeVotacion.get(i).getListaQueVoto().get(1).getNombre() + ") (");
            System.out.print(listaDeVotacion.get(i).getListaQueVoto().get(2).getNombre() +")" );
            System.out.println("");
        }
    }
    public void listaDeAlumnosPorVotos() {
        Collections.sort(listaDeAlumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno v1, Alumno v2) {
                return Integer.compare(v2.getCantidadVotos(), v1.getCantidadVotos());
            }
        });
    }
    public void crarFacilitadores() {
        System.out.println("");
        System.out.println("_____ FACILITADORES");
        for (int i = 0; i < listaDeAlumnos.size(); i++) {
            if (i < 5) {
                System.out.print(listaDeAlumnos.get(i).toString());
            }
        }
        System.out.println("");
        System.out.println("_____ FACILITADORES SUPLENTES");
        for (int i = 0; i < listaDeAlumnos.size(); i++) {
            if (i > 4 && i < 10) {
                System.out.print(listaDeAlumnos.get(i).toString());
            }
        }
    }

}
