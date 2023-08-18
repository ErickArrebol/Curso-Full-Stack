package estancias;

import java.util.Calendar;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        // Obtener la instancia actual del calendario
        Calendar calendarioActual = Calendar.getInstance();
        
        // Obtener el año actual
        int anioActual = calendarioActual.get(Calendar.YEAR);
        System.out.println("Año actual: " + anioActual);
        
        // Agregar 1 mes a la fecha actual
        calendarioActual.add(Calendar.MONTH, 1);
        
        // Obtener el mes después de sumar 1 mes
        int mesDespuesSumar1Mes = calendarioActual.get(Calendar.MONTH);
        System.out.println("Mes después de sumar 1 mes: " + mesDespuesSumar1Mes);
    
    }
    
}
