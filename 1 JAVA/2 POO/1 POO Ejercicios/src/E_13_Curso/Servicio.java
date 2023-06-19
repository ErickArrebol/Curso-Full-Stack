package E_13_Curso;
import java.util.Scanner;

public class Servicio {
    
    public String[] crearVector(){
        
        Curso iniciarC = new Curso();
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        System.out.print("Cuantos alumnos estaran en el curso ");
        int num = leer.nextInt();
        String vector[]= new String [num];
        for (int i = 0; i < vector.length; i++) {
            System.out.print((i+1)+"° Alumno ");
            vector[i]= leer.next();
        }
        return vector;
    }
    
    public void crearCurso(Curso iniciarC){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        System.out.print ("Por favor ingrese el nombre del curso. ");
        iniciarC.setNombreCurso(leer.next());
        System.out.print("Por favor ingrese la cantidad de horas impartidas por día ");
        iniciarC.setCantidadHorasPorDia(leer.nextInt());
        System.out.print("Por favor ingrese la candidad de dias por semana en que se imparte el curso ");
        iniciarC.setCantidadDiasPorSemana(leer.nextInt());
        System.out.print("Por favor ingrese el turno: 1 -> Mañana | 2 -> Tarde ");
        iniciarC.setTurno((leer.nextInt() == 1));
        System.out.print("Por favor ingrese el precio por hora ");
        iniciarC.setPrecioPorHora(leer.nextDouble());
        iniciarC.setAlumnos(crearVector());
    }
    
    public void calcularGananciaSemanal (Curso iniciarC){
        int cantidadHorasPorDia = iniciarC.getCantidadHorasPorDia();
        int cantidadDiasPorSemana = iniciarC.getCantidadDiasPorSemana();
        double precioPorHora = iniciarC.getPrecioPorHora();
        int alumnos = iniciarC.getAlumnos().length;
        double ganancias =( precioPorHora * cantidadDiasPorSemana  * cantidadHorasPorDia)* alumnos;
        System.out.println("Ganancia semanal $" +  ganancias);
    }
}
