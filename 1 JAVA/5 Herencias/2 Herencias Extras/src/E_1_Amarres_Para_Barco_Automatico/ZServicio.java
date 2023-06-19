/*Estos metdos se utilizara para llenar los atributos de las demas clases
de manera automatica*/
package E_1_Amarres_Para_Barco_Automatico;

import java.time.LocalDate;

/*@author Erick*/
public class ZServicio {
//////////////////////////////////////////////////////////////////////////////////////////////////////////
    //METDOS PARA TIENDA
    public String crearNombreCliente(){
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
        String cliente = nombre+" "+lasName + " " + lasName2;
        return cliente;
    }
    public int crearDocumento (){
        int num = 50000000+(int) (Math.random() * 100000000);
        return num;
    }
    public LocalDate crearFechaAlquiler(){
        LocalDate fechaActual = LocalDate.now();
        return fechaActual;
    }
    public LocalDate craerFechaDevolucion(){
        LocalDate fechaActual = LocalDate.now();
        int dia = (int) (Math.random() * 28)+1;
        int mes = fechaActual.getMonthValue()+(int) (Math.random() * (12-fechaActual.getMonthValue()))+1;
        int anio= 2023;
        LocalDate fechaDevolucion = LocalDate.of(anio, mes, dia);
        return fechaDevolucion;
    }
    public int crearPosicionDeAmarre(){
        int posicion = (int) (Math.random() * 5)+1;
        return posicion;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
    //METODOS DE BARCO (GENERALES)
    public String crearMatricula(){
        int lista = (int) (Math.random() * 9)+1;
        char[] provincia = new char[26];
        for (int i = 0; i < provincia.length; i++) {
            provincia[i] = (char) ('A' + i);
        }
        int letra1 = (int) (Math.random() * provincia.length);
        int letra2 = (int) (Math.random() * provincia.length);
        int distrito =(int) (Math.random() * 128)+1;
        int folio = (int) (Math.random() * 999)+1;
        String matricula =lista+"-"+provincia[letra1]+provincia[letra2]+"-"+distrito+"-"+folio;
        return matricula;
    }
    public double crearElora(){
        double eslora= (int) (Math.random() * 10)+1;
        return eslora;
    }
    public int crearAño(){
        int anio =2000+ (int) (Math.random() * 23)+1;
        return anio;
    }
 ///////////////////////////////////////////////////////////////////////////////////////////
    //METODOS ESPESIFICO DE BARCOS
    public int crearMastiles(){
        int mastiles = (int) (Math.random() * 6)+1;
        return mastiles;
    }
    public int crearPotenciaCV(){
        int potencia = 100+(int) (Math.random() * 1000);
        return potencia;
    }
    public int crearCamarotes(){
        int camarotes = (int) (Math.random() * 10)+1;
        return camarotes;
    }
}
